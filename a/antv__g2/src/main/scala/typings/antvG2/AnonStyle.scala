package typings.antvG2

import typings.antvG2.antvG2Strings.cross
import typings.antvG2.antvG2Strings.rect
import typings.antvG2.antvG2Strings.x
import typings.antvG2.antvG2Strings.y
import typings.antvG2.mod.Styles.background
import typings.antvG2.mod.Styles.line
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStyle extends js.Object {
  var style: js.UndefOr[background | line] = js.undefined
  /**
    * rect 表示矩形框，x 表示水平辅助线，y 表示垂直辅助线，cross 表示十字辅助线
    */
  var `type`: js.UndefOr[rect | x | y | cross | typings.antvG2.antvG2Strings.line] = js.undefined
}

object AnonStyle {
  @scala.inline
  def apply(
    style: background | line = null,
    `type`: rect | x | y | cross | typings.antvG2.antvG2Strings.line = null
  ): AnonStyle = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStyle]
  }
}

