package typings.antd

import typings.antd.responsiveObserveMod.BreakpointMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonScreens extends js.Object {
  var screens: BreakpointMap
}

object AnonScreens {
  @scala.inline
  def apply(screens: BreakpointMap): AnonScreens = {
    val __obj = js.Dynamic.literal(screens = screens.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonScreens]
  }
}

