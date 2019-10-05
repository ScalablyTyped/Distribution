package typings.androiduix.java.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait List[T] extends js.Object {
  def add(index: Double, t: T): js.Any = js.native
  def add(t: T): js.Any = js.native
  def addAll(index: Double, list: List[T]): js.Any = js.native
  def addAll(list: List[T]): js.Any = js.native
  def clear(): js.Any = js.native
  def contains(o: T): js.Any = js.native
  def get(index: Double): T = js.native
  def getArray(): js.Array[T] = js.native
  def indexOf(o: T): js.Any = js.native
  def isEmpty(): Boolean = js.native
  def lastIndexOf(o: T): js.Any = js.native
  def remove(o: T): js.Any = js.native
  def remove(o: Double): js.Any = js.native
  def removeAll(list: List[T]): Boolean = js.native
  def set(index: Double, element: T): T = js.native
  def size(): Double = js.native
  def sort(): js.Any = js.native
  def sort(compareFn: js.Function2[/* a */ T, /* b */ T, Double]): js.Any = js.native
  def subList(fromIndex: Double, toIndex: Double): List[T] = js.native
  def toArray(a: js.Array[T]): js.Array[T] = js.native
}

