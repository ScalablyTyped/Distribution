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
  def add(transaction: T, bucket: java.lang.String, key: Value, values: Values): scala.Unit = js.native
  def begin(): T = js.native
  def clean(): scala.Unit = js.native
  def clean(cb: Action): scala.Unit = js.native
  def cleanAsync(): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def cleanAsync(cb: js.Function1[/* error */ js.UndefOr[stdLib.Error], scala.Unit]): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def del(transaction: T, bucket: java.lang.String, keys: js.Array[Value]): scala.Unit = js.native
  def end(transaction: T): scala.Unit = js.native
  def end(transaction: T, cb: Action): scala.Unit = js.native
  def endAsync(transaction: T): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def endAsync(transaction: T, cb: js.Function1[/* err */ stdLib.Error | scala.Null, scala.Unit]): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def get(bucket: java.lang.String, key: Value): scala.Unit = js.native
  def get(bucket: java.lang.String, key: Value, cb: Action): scala.Unit = js.native
  def getAsync(bucket: java.lang.String, key: Value): bluebirdLib.bluebirdMod.^[_] = js.native
  def getAsync(
    bucket: java.lang.String,
    key: Value,
    cb: js.Function2[/* err */ stdLib.Error | scala.Null, /* value */ js.Any, scala.Unit]
  ): bluebirdLib.bluebirdMod.^[_] = js.native
  def remove(transaction: T, bucket: java.lang.String, key: Value, values: Values): scala.Unit = js.native
  def union(bucket: java.lang.String, keys: js.Array[Value]): scala.Unit = js.native
  def union(bucket: java.lang.String, keys: js.Array[Value], cb: Action): scala.Unit = js.native
  def unionAsync(bucket: java.lang.String, keys: js.Array[Value]): bluebirdLib.bluebirdMod.^[js.Array[_]] = js.native
  def unionAsync(
    bucket: java.lang.String,
    keys: js.Array[Value],
    cb: js.Function2[/* error */ js.UndefOr[stdLib.Error], /* results */ js.Array[_], scala.Unit]
  ): bluebirdLib.bluebirdMod.^[js.Array[_]] = js.native
}

