package typings
package aclLib.aclMod.AclStaticNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// For internal use
//
@js.native
trait Backend[T] extends js.Object {
  def add(transaction: T, bucket: java.lang.String, key: aclLib.Value, values: aclLib.Values): scala.Unit = js.native
  def begin(): T = js.native
  def clean(): scala.Unit = js.native
  def clean(cb: aclLib.Action): scala.Unit = js.native
  def cleanAsync(): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def cleanAsync(cb: js.Function1[/* error */ js.UndefOr[nodeLib.Error], scala.Unit]): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def del(transaction: T, bucket: java.lang.String, keys: js.Array[aclLib.Value]): scala.Unit = js.native
  def end(transaction: T): scala.Unit = js.native
  def end(transaction: T, cb: aclLib.Action): scala.Unit = js.native
  def endAsync(transaction: T): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def endAsync(transaction: T, cb: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def get(bucket: java.lang.String, key: aclLib.Value): scala.Unit = js.native
  def get(bucket: java.lang.String, key: aclLib.Value, cb: aclLib.Action): scala.Unit = js.native
  def getAsync(bucket: java.lang.String, key: aclLib.Value): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def getAsync(
    bucket: java.lang.String,
    key: aclLib.Value,
    cb: js.Function2[/* err */ nodeLib.Error | scala.Null, /* value */ js.Any, scala.Unit]
  ): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def remove(transaction: T, bucket: java.lang.String, key: aclLib.Value, values: aclLib.Values): scala.Unit = js.native
  def union(bucket: java.lang.String, keys: js.Array[aclLib.Value]): scala.Unit = js.native
  def union(bucket: java.lang.String, keys: js.Array[aclLib.Value], cb: aclLib.Action): scala.Unit = js.native
  def unionAsync(bucket: java.lang.String, keys: js.Array[aclLib.Value]): bluebirdLib.bluebirdMod.namespaced[js.Array[_]] = js.native
  def unionAsync(
    bucket: java.lang.String,
    keys: js.Array[aclLib.Value],
    cb: js.Function2[/* error */ js.UndefOr[nodeLib.Error], /* results */ js.Array[_], scala.Unit]
  ): bluebirdLib.bluebirdMod.namespaced[js.Array[_]] = js.native
}

