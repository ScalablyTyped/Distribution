package typings.acl.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// For internal use
//
@js.native
trait Backend[T] extends js.Object {
  def add(transaction: T, bucket: String, key: Value, values: Values): Unit = js.native
  def begin(): T = js.native
  def clean(): Unit = js.native
  def clean(cb: Action): Unit = js.native
  def cleanAsync(): typings.bluebird.mod.^[Unit] = js.native
  def cleanAsync(cb: js.Function1[/* error */ js.UndefOr[Error], Unit]): typings.bluebird.mod.^[Unit] = js.native
  def del(transaction: T, bucket: String, keys: js.Array[Value]): Unit = js.native
  def end(transaction: T): Unit = js.native
  def end(transaction: T, cb: Action): Unit = js.native
  def endAsync(transaction: T): typings.bluebird.mod.^[Unit] = js.native
  def endAsync(transaction: T, cb: js.Function1[/* err */ Error | Null, Unit]): typings.bluebird.mod.^[Unit] = js.native
  def get(bucket: String, key: Value): Unit = js.native
  def get(bucket: String, key: Value, cb: Action): Unit = js.native
  def getAsync(bucket: String, key: Value): typings.bluebird.mod.^[_] = js.native
  def getAsync(bucket: String, key: Value, cb: js.Function2[/* err */ Error | Null, /* value */ js.Any, Unit]): typings.bluebird.mod.^[_] = js.native
  def remove(transaction: T, bucket: String, key: Value, values: Values): Unit = js.native
  def union(bucket: String, keys: js.Array[Value]): Unit = js.native
  def union(bucket: String, keys: js.Array[Value], cb: Action): Unit = js.native
  def unionAsync(bucket: String, keys: js.Array[Value]): typings.bluebird.mod.^[js.Array[_]] = js.native
  def unionAsync(
    bucket: String,
    keys: js.Array[Value],
    cb: js.Function2[/* error */ js.UndefOr[Error], /* results */ js.Array[_], Unit]
  ): typings.bluebird.mod.^[js.Array[_]] = js.native
}

