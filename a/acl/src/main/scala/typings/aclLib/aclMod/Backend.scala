package typings
package aclLib.aclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// For internal use
//
@js.native
trait Backend[T] extends js.Object {
  var cleanAsync: js.Function = js.native
  var endAsync: js.Function = js.native
   //TODO: Give more specific function signature
  var getAsync: js.Function = js.native
  var unionAsync: js.Function = js.native
  def add(transaction: T, bucket: java.lang.String, key: aclLib.Value, values: aclLib.Values): scala.Unit = js.native
  def begin(): T = js.native
  def clean(): scala.Unit = js.native
  def clean(cb: aclLib.Action): scala.Unit = js.native
  def del(transaction: T, bucket: java.lang.String, keys: js.Array[aclLib.Value]): scala.Unit = js.native
  def end(transaction: T): scala.Unit = js.native
  def end(transaction: T, cb: aclLib.Action): scala.Unit = js.native
  def get(bucket: java.lang.String, key: aclLib.Value): scala.Unit = js.native
  def get(bucket: java.lang.String, key: aclLib.Value, cb: aclLib.Action): scala.Unit = js.native
  def remove(transaction: T, bucket: java.lang.String, key: aclLib.Value, values: aclLib.Values): scala.Unit = js.native
  def union(bucket: java.lang.String, keys: js.Array[aclLib.Value]): scala.Unit = js.native
  def union(bucket: java.lang.String, keys: js.Array[aclLib.Value], cb: aclLib.Action): scala.Unit = js.native
}

