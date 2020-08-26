package typings.activexMsforms.MSForms.EventHelperTypes

import typings.activexMsforms.MSForms.ReturnSingle
import typings.activexMsforms.MSForms.fmScrollAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiPageScrollParameter extends js.Object {
  val ActionX: fmScrollAction = js.native
  val ActionY: fmScrollAction = js.native
  val ActualDx: ReturnSingle = js.native
  val ActualDy: ReturnSingle = js.native
  val Index: Double = js.native
  val RequestDx: Double = js.native
  val RequestDy: Double = js.native
}

object MultiPageScrollParameter {
  @scala.inline
  def apply(
    ActionX: fmScrollAction,
    ActionY: fmScrollAction,
    ActualDx: ReturnSingle,
    ActualDy: ReturnSingle,
    Index: Double,
    RequestDx: Double,
    RequestDy: Double
  ): MultiPageScrollParameter = {
    val __obj = js.Dynamic.literal(ActionX = ActionX.asInstanceOf[js.Any], ActionY = ActionY.asInstanceOf[js.Any], ActualDx = ActualDx.asInstanceOf[js.Any], ActualDy = ActualDy.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], RequestDx = RequestDx.asInstanceOf[js.Any], RequestDy = RequestDy.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiPageScrollParameter]
  }
  @scala.inline
  implicit class MultiPageScrollParameterOps[Self <: MultiPageScrollParameter] (val x: Self) extends AnyVal {
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
    def setIndex(value: Double): Self = this.set("Index", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestDx(value: Double): Self = this.set("RequestDx", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestDy(value: Double): Self = this.set("RequestDy", value.asInstanceOf[js.Any])
  }
  
}

