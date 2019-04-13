package typings
package ajvLib.ajvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchParams extends ErrorParameters {
  var caseIndex: scala.Double
}

object SwitchParams {
  @scala.inline
  def apply(caseIndex: scala.Double): SwitchParams = {
    val __obj = js.Dynamic.literal(caseIndex = caseIndex)
  
    __obj.asInstanceOf[SwitchParams]
  }
}

