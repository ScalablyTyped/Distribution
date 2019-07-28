package typings.androiduix.javaNs.utilNs

import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("java.util.ArrayList")
@js.native
class ArrayList[T] () extends List[T] {
  def this(initialCapacity: Double) = this()
  var array: js.Array[T] = js.native
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[js.Function0[IterableIterator[T]]] = js.native
  def addAll(index: Double, list: ArrayList[T]): js.Any = js.native
  def addAll(list: ArrayList[T]): js.Any = js.native
  def removeAll(list: ArrayList[T]): Boolean = js.native
  def toArray(): js.Array[T] = js.native
}

