package typings.activexMsforms.MSForms.EventHelperTypes

import typings.activexMsforms.MSForms.ReturnSingle
import typings.activexMsforms.MSForms.fmScrollAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerScrollParameter extends js.Object {
  val ActionX: fmScrollAction = js.native
  val ActionY: fmScrollAction = js.native
  val ActualDx: ReturnSingle = js.native
  val ActualDy: ReturnSingle = js.native
  val RequestDx: Double = js.native
  val RequestDy: Double = js.native
}

object ContainerScrollParameter {
  @scala.inline
  def apply(
    ActionX: fmScrollAction,
    ActionY: fmScrollAction,
    ActualDx: ReturnSingle,
    ActualDy: ReturnSingle,
    RequestDx: Double,
    RequestDy: Double
  ): ContainerScrollParameter = {
    val __obj = js.Dynamic.literal(ActionX = ActionX.asInstanceOf[js.Any], ActionY = ActionY.asInstanceOf[js.Any], ActualDx = ActualDx.asInstanceOf[js.Any], ActualDy = ActualDy.asInstanceOf[js.Any], RequestDx = RequestDx.asInstanceOf[js.Any], RequestDy = RequestDy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerScrollParameter]
  }
  @scala.inline
  implicit class ContainerScrollParameterOps[Self <: ContainerScrollParameter] (val x: Self) extends AnyVal {
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
    def setActionX(value: fmScrollAction): Self = this.set("ActionX", value.asInstanceOf[js.Any])
    @scala.inline
    def setActionY(value: fmScrollAction): Self = this.set("ActionY", value.asInstanceOf[js.Any])
    @scala.inline
    def setActualDx(value: ReturnSingle): Self = this.set("ActualDx", value.asInstanceOf[js.Any])
    @scala.inline
    def setActualDy(value: ReturnSingle): Self = this.set("ActualDy", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestDx(value: Double): Self = this.set("RequestDx", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestDy(value: Double): Self = this.set("RequestDy", value.asInstanceOf[js.Any])
  }
  
}

