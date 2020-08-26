package typings.androiduix.java_.lang

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StringBuilder extends js.Object {
  var array: js.Array[String] = js.native
  def append(a: js.Any): StringBuilder = js.native
  def deleteCharAt(index: Double): StringBuilder = js.native
  def length(): Double = js.native
  def replace(start: Double, end: Double, str: String): StringBuilder = js.native
  def setLength(length: Double): Unit = js.native
}

object StringBuilder {
  @scala.inline
  def apply(
    append: js.Any => StringBuilder,
    array: js.Array[String],
    deleteCharAt: Double => StringBuilder,
    length: () => Double,
    replace: (Double, Double, String) => StringBuilder,
    setLength: Double => Unit
  ): StringBuilder = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), array = array.asInstanceOf[js.Any], deleteCharAt = js.Any.fromFunction1(deleteCharAt), length = js.Any.fromFunction0(length), replace = js.Any.fromFunction3(replace), setLength = js.Any.fromFunction1(setLength))
    __obj.asInstanceOf[StringBuilder]
  }
  @scala.inline
  implicit class StringBuilderOps[Self <: StringBuilder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAppend(value: js.Any => StringBuilder): Self = this.set("append", js.Any.fromFunction1(value))
    @scala.inline
    def setArrayVarargs(value: String*): Self = this.set("array", js.Array(value :_*))
    @scala.inline
    def setArray(value: js.Array[String]): Self = this.set("array", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleteCharAt(value: Double => StringBuilder): Self = this.set("deleteCharAt", js.Any.fromFunction1(value))
    @scala.inline
    def setLength(value: () => Double): Self = this.set("length", js.Any.fromFunction0(value))
    @scala.inline
    def setReplace(value: (Double, Double, String) => StringBuilder): Self = this.set("replace", js.Any.fromFunction3(value))
    @scala.inline
    def setSetLength(value: Double => Unit): Self = this.set("setLength", js.Any.fromFunction1(value))
  }
  
}

