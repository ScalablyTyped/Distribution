package typings.antdMobile.stepperMod

import typings.antdMobile.stepperPropsTypeMod.StepPropsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StepProps extends StepPropsType {
  var className: js.UndefOr[String] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var showNumber: js.UndefOr[Boolean] = js.native
}

object StepProps {
  @scala.inline
  def apply(): StepProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StepProps]
  }
  @scala.inline
  implicit class StepPropsOps[Self <: StepProps] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setShowNumber(value: Boolean): Self = this.set("showNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowNumber: Self = this.set("showNumber", js.undefined)
  }
  
}

