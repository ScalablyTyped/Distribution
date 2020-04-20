package typings.antd.gridRowMod

import typings.antd.responsiveObserveMod.ScreenMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowState extends js.Object {
  var screens: ScreenMap
}

object RowState {
  @scala.inline
  def apply(screens: ScreenMap): RowState = {
    val __obj = js.Dynamic.literal(screens = screens.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowState]
  }
}

