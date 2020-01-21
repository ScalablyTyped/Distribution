package typings.avoscloudSdk.mod

import typings.avoscloudSdk.mod.Object.DestroyOptions
import typings.avoscloudSdk.mod.Object.FetchOptions
import typings.avoscloudSdk.mod.Object.SaveOptions
import typings.avoscloudSdk.mod.Object.SetOptions
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
@JSImport("avoscloud-sdk", "Object")
@js.native
class Object_ () extends BaseObject {
  def this(attributes: js.Array[String]) = this()
  def this(className: String) = this()
  def this(attributes: js.Array[String], options: js.Any) = this()
  def this(className: String, options: js.Any) = this()
  var attributes: js.Any = js.native
  var changed: Boolean = js.native
  var cid: String = js.native
  var className: String = js.native
  var createdAt: js.Any = js.native
  var id: js.Any = js.native
  var updatedAt: js.Any = js.native
  def add(attr: String, item: js.Any): Object = js.native
  def addUnique(attr: String, item: js.Any): js.Any = js.native
  def change(options: js.Any): Object = js.native
  def changedAttributes(diff: js.Any): Boolean = js.native
  def clear(options: js.Any): js.Any = js.native
  def destroy[T](): Promise[T] = js.native
  def destroy[T](options: DestroyOptions): Promise[T] = js.native
  def dirty(attr: String): Boolean = js.native
  def dirtyKeys(): js.Array[String] = js.native
  def escape(attr: String): String = js.native
  def existed(): Boolean = js.native
  def fetch[T](): Promise[T] = js.native
  def fetch[T](options: FetchOptions): Promise[T] = js.native
  def get(attr: String): js.Any = js.native
  def getACL(): ACL = js.native
  def getObjectId(): String = js.native
  def has(attr: String): Boolean = js.native
  def hasChanged(attr: String): Boolean = js.native
  def increment(attr: String): js.Any = js.native
  def increment(attr: String, amount: Double): js.Any = js.native
  def initialize(): Unit = js.native
  def isValid(): Boolean = js.native
  def op(attr: String): js.Any = js.native
  def previous(attr: String): js.Any = js.native
  def previousAttributes(): js.Any = js.native
  def relation(attr: String): Relation = js.native
  def remove(attr: String, item: js.Any): js.Any = js.native
  def save[T](): Promise[T] = js.native
  def save[T](options: SaveOptions): Promise[T] = js.native
  def save[T](options: SaveOptions, arg2: js.Any): Promise[T] = js.native
  def save[T](options: SaveOptions, arg2: js.Any, arg3: js.Any): Promise[T] = js.native
  def set(key: String, value: js.Any): Boolean = js.native
  def set(key: String, value: js.Any, options: SetOptions): Boolean = js.native
  def setACL(acl: ACL): Boolean = js.native
  def setACL(acl: ACL, options: SuccessFailureOptions): Boolean = js.native
  def unset(attr: String): js.Any = js.native
  def unset(attr: String, options: js.Any): js.Any = js.native
  def validate(attrs: js.Any): Boolean = js.native
  def validate(attrs: js.Any, options: SuccessFailureOptions): Boolean = js.native
}

