package typings.ajv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PatternRequiredParams extends ErrorParameters {
  var missingPattern: String = js.native
}

object PatternRequiredParams {
  @scala.inline
  def apply(missingPattern: String): PatternRequiredParams = {
    val __obj = js.Dynamic.literal(missingPattern = missingPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatternRequiredParams]
  }
  @scala.inline
  implicit class PatternRequiredParamsOps[Self <: PatternRequiredParams] (val x: Self) extends AnyVal {
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
    def setMissingPattern(value: String): Self = this.set("missingPattern", value.asInstanceOf[js.Any])
  }
  
}

