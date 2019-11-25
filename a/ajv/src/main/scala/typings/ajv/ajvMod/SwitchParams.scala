package typings.ajv.ajvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchParams extends ErrorParameters {
  var caseIndex: Double
}

object SwitchParams {
  @scala.inline
  def apply(caseIndex: Double): SwitchParams = {
    val __obj = js.Dynamic.literal(caseIndex = caseIndex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SwitchParams]
  }
}

