package typings.avoscloudDashSdk.leanengineMod

import typings.avoscloudDashSdk.avoscloudDashSdkMod.Collection.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a new instance with the given models and options.  Typically, you
  * will not call this method directly, but will instead make a subclass using
  * <code>AV.Collection.extend</code>.
  *
  * @param {Array} models An array of instances of <code>AV.Object</code>.
  *
  * @param {Object} options An optional object with Backbone-style options.
  * Valid options are:<ul>
  *   <li>model: The AV.Object subclass that this collection contains.
  *   <li>query: An instance of AV.Query to use when fetching items.
  *   <li>comparator: A string property name or function to sort by.
  * </ul>
  *
  * @see AV.Collection.extend
  *
  * @class
  *
  * <p>Provides a standard collection class for our sets of models, ordered
  * or unordered.  For more information, see the
  * <a href="http://documentcloud.github.com/backbone/#Collection">Backbone
  * documentation</a>.</p>
  */
@JSImport("leanengine", "Collection")
@js.native
class Collection[T] ()
  extends typings.avoscloudDashSdk.avoscloudDashSdkMod.Collection[T] {
  def this(models: js.Array[typings.avoscloudDashSdk.avoscloudDashSdkMod.Object]) = this()
  def this(models: js.Array[typings.avoscloudDashSdk.avoscloudDashSdkMod.Object], options: Options) = this()
}

/* static members */
@JSImport("leanengine", "Collection")
@js.native
object Collection extends js.Object {
  def extend(instanceProps: js.Any, classProps: js.Any): js.Any = js.native
}

