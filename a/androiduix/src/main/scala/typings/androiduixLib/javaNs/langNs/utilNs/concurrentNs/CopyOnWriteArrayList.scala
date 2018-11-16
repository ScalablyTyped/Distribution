package typings
package androiduixLib.javaNs.langNs.utilNs.concurrentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("java.lang.util.concurrent.CopyOnWriteArrayList")
@js.native
class CopyOnWriteArrayList[T] () extends js.Object {
  var isDataNew: js.Any = js.native
  @JSName(ScalablyTyped.runtime.Symbol.iterator)
  var iterator_FCopyOnWriteArrayList: js.Function0[stdLib.IterableIterator[T]] = js.native
  var mData: js.Any = js.native
  def add(items: T*): scala.Unit = js.native
  def addAll(array: CopyOnWriteArrayList[T]): scala.Unit = js.native
  /* private */ def checkNewData(): js.Any = js.native
  def iterator(): js.Array[T] = js.native
  def remove(item: T): scala.Unit = js.native
  def size(): scala.Double = js.native
}

