package typings.avoscloudSdk.leanengineMod

import typings.avoscloudSdk.mod.Object.DestroyAllOptions
import typings.avoscloudSdk.mod.Object.SaveAllOptions
import typings.avoscloudSdk.mod.SuccessFailureOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a new model with defined attributes. A client id (cid) is
  * automatically generated and assigned for you.
  *
  * <p>You won't normally call this method directly.  It is recommended that
  * you use a subclass of <code>AV.Object</code> instead, created by calling
  * <code>extend</code>.</p>
  *
  * <p>However, if you don't want to use a subclass, or aren't sure which
  * subclass is appropriate, you can use this form:<pre>
  *     var object = new AV.Object("ClassName");
  * </pre>
  * That is basically equivalent to:<pre>
  *     var MyClass = AV.Object.extend("ClassName");
  *     var object = new MyClass();
  * </pre></p>
  *
  * @param {Object} attributes The initial set of data to store in the object.
  * @param {Object} options A set of Backbone-like options for creating the
  *     object.  The only option currently supported is "collection".
  * @see AV.Object.extend
  *
  * @class
  *
  * <p>The fundamental unit of AV data, which implements the Backbone Model
  * interface.</p>
  */
@JSImport("leanengine", "Object")
@js.native
class Object ()
  extends typings.avoscloudSdk.mod.Object {
  def this(attributes: js.Array[String]) = this()
  def this(className: String) = this()
  def this(attributes: js.Array[String], options: js.Any) = this()
  def this(className: js.UndefOr[scala.Nothing], options: js.Any) = this()
  def this(className: String, options: js.Any) = this()
}

/* static members */
@JSImport("leanengine", "Object")
@js.native
object Object extends js.Object {
  def destroyAll[T](list: js.Array[typings.avoscloudSdk.mod.Object]): typings.avoscloudSdk.mod.Promise[T] = js.native
  def destroyAll[T](list: js.Array[typings.avoscloudSdk.mod.Object], options: DestroyAllOptions): typings.avoscloudSdk.mod.Promise[T] = js.native
  def extend(className: String): js.Any = js.native
  def extend(className: String, protoProps: js.UndefOr[scala.Nothing], classProps: js.Any): js.Any = js.native
  def extend(className: String, protoProps: js.Any): js.Any = js.native
  def extend(className: String, protoProps: js.Any, classProps: js.Any): js.Any = js.native
  def fetchAll[T](list: js.Array[typings.avoscloudSdk.mod.Object], options: SuccessFailureOptions): typings.avoscloudSdk.mod.Promise[T] = js.native
  def fetchAllIfNeeded[T](list: js.Array[typings.avoscloudSdk.mod.Object], options: SuccessFailureOptions): typings.avoscloudSdk.mod.Promise[T] = js.native
  def saveAll[T](list: js.Array[typings.avoscloudSdk.mod.Object]): typings.avoscloudSdk.mod.Promise[T] = js.native
  def saveAll[T](list: js.Array[typings.avoscloudSdk.mod.Object], options: SaveAllOptions): typings.avoscloudSdk.mod.Promise[T] = js.native
}

