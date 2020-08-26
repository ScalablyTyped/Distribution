package typings.ajv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwitchParams extends ErrorParameters {
  var caseIndex: Double = js.native
}

object SwitchParams {
  @scala.inline
  def apply(caseIndex: Double): SwitchParams = {
    val __obj = js.Dynamic.literal(caseIndex = caseIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchParams]
  }
  @scala.inline
  implicit class SwitchParamsOps[Self <: SwitchParams] (val x: Self) extends AnyVal {
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
    def setCaseIndex(value: Double): Self = this.set("caseIndex", value.asInstanceOf[js.Any])
  }
  
}

