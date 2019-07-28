package typings.antd.libGridRowMod

import typings.antd.libUnderscoreUtilResponsiveObserveMod.BreakpointMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowState extends js.Object {
  var screens: BreakpointMap
}

object RowState {
  @scala.inline
  def apply(screens: BreakpointMap): RowState = {
    val __obj = js.Dynamic.literal(screens = screens)
  
    __obj.asInstanceOf[RowState]
  }
}

