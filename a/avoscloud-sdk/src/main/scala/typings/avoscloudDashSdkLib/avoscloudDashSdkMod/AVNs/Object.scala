package typings
package avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs

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
@js.native
trait Object extends BaseObject {
  var attributes: js.Any = js.native
  var changed: scala.Boolean = js.native
  var cid: java.lang.String = js.native
  var className: java.lang.String = js.native
  var createdAt: js.Any = js.native
  var id: js.Any = js.native
  var updatedAt: js.Any = js.native
  def add(attr: java.lang.String, item: js.Any): js.Object = js.native
  def addUnique(attr: java.lang.String, item: js.Any): js.Any = js.native
  def change(options: js.Any): js.Object = js.native
  def changedAttributes(diff: js.Any): scala.Boolean = js.native
  def clear(options: js.Any): js.Any = js.native
  def destroy[T](): Promise[T] = js.native
  def destroy[T](options: avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ObjectNs.DestroyOptions): Promise[T] = js.native
  def dirty(attr: java.lang.String): scala.Boolean = js.native
  def dirtyKeys(): js.Array[java.lang.String] = js.native
  def escape(attr: java.lang.String): java.lang.String = js.native
  def existed(): scala.Boolean = js.native
  def fetch[T](): Promise[T] = js.native
  def fetch[T](options: avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ObjectNs.FetchOptions): Promise[T] = js.native
  def get(attr: java.lang.String): js.Any = js.native
  def getACL(): ACL = js.native
  def getObjectId(): java.lang.String = js.native
  def has(attr: java.lang.String): scala.Boolean = js.native
  def hasChanged(attr: java.lang.String): scala.Boolean = js.native
  def increment(attr: java.lang.String): js.Any = js.native
  def increment(attr: java.lang.String, amount: scala.Double): js.Any = js.native
  def initialize(): scala.Unit = js.native
  def isValid(): scala.Boolean = js.native
  def op(attr: java.lang.String): js.Any = js.native
  def previous(attr: java.lang.String): js.Any = js.native
  def previousAttributes(): js.Any = js.native
  def relation(attr: java.lang.String): Relation = js.native
  def remove(attr: java.lang.String, item: js.Any): js.Any = js.native
  def save[T](): Promise[T] = js.native
  def save[T](options: avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ObjectNs.SaveOptions): Promise[T] = js.native
  def save[T](options: avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ObjectNs.SaveOptions, arg2: js.Any): Promise[T] = js.native
  def save[T](
    options: avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ObjectNs.SaveOptions,
    arg2: js.Any,
    arg3: js.Any
  ): Promise[T] = js.native
  def set(key: java.lang.String, value: js.Any): scala.Boolean = js.native
  def set(
    key: java.lang.String,
    value: js.Any,
    options: avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ObjectNs.SetOptions
  ): scala.Boolean = js.native
  def setACL(acl: ACL): scala.Boolean = js.native
  def setACL(acl: ACL, options: SuccessFailureOptions): scala.Boolean = js.native
  def unset(attr: java.lang.String): js.Any = js.native
  def unset(attr: java.lang.String, options: js.Any): js.Any = js.native
  def validate(attrs: js.Any): scala.Boolean = js.native
  def validate(attrs: js.Any, options: SuccessFailureOptions): scala.Boolean = js.native
}

