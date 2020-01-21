package typings.activexMsforms.MSForms.EventHelperTypes

import typings.activexMsforms.MSForms.ReturnSingle
import typings.activexMsforms.MSForms.fmScrollAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerScrollParameter extends js.Object {
  val ActionX: fmScrollAction
  val ActionY: fmScrollAction
  val ActualDx: ReturnSingle
  val ActualDy: ReturnSingle
  val RequestDx: Double
  val RequestDy: Double
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
}

