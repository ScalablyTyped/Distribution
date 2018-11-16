package typings
package androiduixLib.androidNs.utilNs

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
  def add(items: T*): scala.Unit = js.native
  def addAll(array: CopyOnWriteArray[T]): scala.Unit = js.native
  def end(): scala.Unit = js.native
  /* private */ def getArray(): js.Any = js.native
  def remove(item: T): scala.Unit = js.native
  def size(): scala.Double = js.native
  def start(): js.Array[T] = js.native
}

