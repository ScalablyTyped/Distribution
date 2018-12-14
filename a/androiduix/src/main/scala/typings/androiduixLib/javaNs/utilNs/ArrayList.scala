package typings
package androiduixLib.javaNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("java.util.ArrayList")
@js.native
class ArrayList[T] () extends List[T] {
  def this(initialCapacity: scala.Double) = this()
  var array: js.Array[T] = js.native
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  var iterator: js.Function0[js.Function0[stdLib.IterableIterator[T]]] = js.native
  def addAll(index: scala.Double, list: ArrayList[T]): js.Any = js.native
  def addAll(list: ArrayList[T]): js.Any = js.native
  def removeAll(list: ArrayList[T]): scala.Boolean = js.native
  def toArray(): js.Array[T] = js.native
}

