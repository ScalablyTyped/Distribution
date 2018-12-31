package typings
package avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs

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
@js.native
trait Collection[T]
  extends Events
     with IBaseObject {
  var model: Object = js.native
  var models: js.Array[Object] = js.native
  var query: Query = js.native
  def add(models: js.Array[_]): Collection[T] = js.native
  def add(models: js.Array[_], options: avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.CollectionNs.AddOptions): Collection[T] = js.native
  def at(index: scala.Double): Object = js.native
  def comparator(`object`: Object): js.Any = js.native
  def create(model: Object): Object = js.native
  def create(model: Object, options: avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.CollectionNs.CreateOptions): Object = js.native
  def fetch(): Promise[T] = js.native
  def fetch(options: avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.CollectionNs.FetchOptions): Promise[T] = js.native
  def get(id: java.lang.String): Object = js.native
  def getByCid(cid: js.Any): js.Any = js.native
  def initialize(): scala.Unit = js.native
  def pluck(attr: java.lang.String): js.Array[_] = js.native
  def remove(model: js.Any): Collection[T] = js.native
  def remove(model: js.Any, options: avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.CollectionNs.RemoveOptions): Collection[T] = js.native
  def remove(models: js.Array[_]): Collection[T] = js.native
  def remove(
    models: js.Array[_],
    options: avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.CollectionNs.RemoveOptions
  ): Collection[T] = js.native
  def reset(models: js.Array[_]): Collection[T] = js.native
  def reset(
    models: js.Array[_],
    options: avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.CollectionNs.ResetOptions
  ): Collection[T] = js.native
  def sort(): Collection[T] = js.native
  def sort(options: avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.CollectionNs.SortOptions): Collection[T] = js.native
}

