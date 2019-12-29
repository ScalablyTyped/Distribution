package typings.atAntvG2

import typings.atAntvG2.atAntvG2Mod.Styles.background
import typings.atAntvG2.atAntvG2Mod.Styles.line
import typings.atAntvG2.atAntvG2Strings.cross
import typings.atAntvG2.atAntvG2Strings.rect
import typings.atAntvG2.atAntvG2Strings.x
import typings.atAntvG2.atAntvG2Strings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cross extends js.Object {
  var style: js.UndefOr[background | line] = js.undefined
  /**
    * rect 表示矩形框，x 表示水平辅助线，y 表示垂直辅助线，cross 表示十字辅助线
    */
  var `type`: js.UndefOr[rect | x | y | cross | typings.atAntvG2.atAntvG2Strings.line] = js.undefined
}

object Anon_Cross {
  @scala.inline
  def apply(
    style: background | line = null,
    `type`: rect | x | y | cross | typings.atAntvG2.atAntvG2Strings.line = null
  ): Anon_Cross = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Cross]
  }
}

