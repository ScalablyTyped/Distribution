package typings.antdMobileRn.stepsPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StepsPropsType extends js.Object {
  var children: js.Array[_] = js.native
  var current: js.UndefOr[Double] = js.native
  var size: js.UndefOr[String] = js.native
}

object StepsPropsType {
  @scala.inline
  def apply(children: js.Array[_]): StepsPropsType = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepsPropsType]
  }
  @scala.inline
  implicit class StepsPropsTypeOps[Self <: StepsPropsType] (val x: Self) extends AnyVal {
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
    def setChildrenVarargs(value: js.Any*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[_]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrent(value: Double): Self = this.set("current", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrent: Self = this.set("current", js.undefined)
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

