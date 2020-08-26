package typings.androiduix.java_.lang

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Class extends js.Object {
  var clazz: js.Function = js.native
  def getName(): String = js.native
  def getSimpleName(): String = js.native
}

object Class {
  @scala.inline
  def apply(clazz: js.Function, getName: () => String, getSimpleName: () => String): Class = {
    val __obj = js.Dynamic.literal(clazz = clazz.asInstanceOf[js.Any], getName = js.Any.fromFunction0(getName), getSimpleName = js.Any.fromFunction0(getSimpleName))
    __obj.asInstanceOf[Class]
  }
  @scala.inline
  implicit class ClassOps[Self <: Class] (val x: Self) extends AnyVal {
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
    def setClazz(value: js.Function): Self = this.set("clazz", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetName(value: () => String): Self = this.set("getName", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSimpleName(value: () => String): Self = this.set("getSimpleName", js.Any.fromFunction0(value))
  }
  
}

