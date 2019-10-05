package typings.androiduix.java.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("java.util.Collections")
@js.native
class Collections () extends js.Object

/* static members */
@JSGlobal("java.util.Collections")
@js.native
object Collections extends js.Object {
  var EMPTY_LIST: js.Any = js.native
  def emptyList(): List[_] = js.native
  def sort[T](list: List[T]): Unit = js.native
  def sort[T](list: List[T], c: Comparator[T]): Unit = js.native
}

