package typings.androiduix.android.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.util.CopyOnWriteArray")
@js.native
class CopyOnWriteArray[T] () extends js.Object {
  var mAccess: js.Any = js.native
  var mData: js.Any = js.native
  var mDataCopy: js.Any = js.native
  var mStart: js.Any = js.native
  def add(items: T*): Unit = js.native
  def addAll(array: CopyOnWriteArray[T]): Unit = js.native
  def end(): Unit = js.native
  /* private */ def getArray(): js.Any = js.native
  def remove(item: T): Unit = js.native
  def size(): Double = js.native
  def start(): js.Array[T] = js.native
}

