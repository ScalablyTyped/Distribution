package typings
package androiduixLib.javaNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait List[T] extends js.Object {
  def add(index: scala.Double, t: T): js.Any = js.native
  def add(t: T): js.Any = js.native
  def addAll(index: scala.Double, list: List[T]): js.Any = js.native
  def addAll(list: List[T]): js.Any = js.native
  def clear(): js.Any = js.native
  def contains(o: T): js.Any = js.native
  def get(index: scala.Double): T = js.native
  def getArray(): js.Array[T] = js.native
  def indexOf(o: T): js.Any = js.native
  def isEmpty(): scala.Boolean = js.native
  def lastIndexOf(o: T): js.Any = js.native
  def remove(o: T): js.Any = js.native
  def remove(o: scala.Double): js.Any = js.native
  def removeAll(list: List[T]): scala.Boolean = js.native
  def set(index: scala.Double, element: T): T = js.native
  def size(): scala.Double = js.native
  def sort(): js.Any = js.native
  def sort(compareFn: js.Function2[/* a */ T, /* b */ T, scala.Double]): js.Any = js.native
  def subList(fromIndex: scala.Double, toIndex: scala.Double): List[T] = js.native
  def toArray(a: js.Array[T]): js.Array[T] = js.native
}

