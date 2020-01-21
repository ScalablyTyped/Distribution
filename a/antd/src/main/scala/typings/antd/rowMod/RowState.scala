package typings.antd.rowMod

import typings.antd.responsiveObserveMod.BreakpointMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowState extends js.Object {
  var screens: BreakpointMap
}

object RowState {
  @scala.inline
  def apply(screens: BreakpointMap): RowState = {
    val __obj = js.Dynamic.literal(screens = screens.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RowState]
  }
}

