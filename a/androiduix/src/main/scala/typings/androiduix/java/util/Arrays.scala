package typings.androiduix.java.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("java.util.Arrays")
@js.native
class Arrays () extends js.Object

/* static members */
@JSGlobal("java.util.Arrays")
@js.native
object Arrays extends js.Object {
  def asList[T](array: js.Array[T]): List[T] = js.native
  def equals(a: js.Array[_], a2: js.Array[_]): Boolean = js.native
  /* private */ def rangeCheck(arrayLength: js.Any, fromIndex: js.Any, toIndex: js.Any): js.Any = js.native
  def sort(a: js.Array[Double], fromIndex: Double, toIndex: Double): Unit = js.native
}

