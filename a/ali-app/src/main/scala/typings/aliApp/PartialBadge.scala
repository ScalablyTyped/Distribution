package typings.aliApp

import typings.aliApp.aliAppStrings.more
import typings.aliApp.aliAppStrings.none
import typings.aliApp.aliAppStrings.num
import typings.aliApp.aliAppStrings.point
import typings.aliApp.aliAppStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ali-app.my.Badge> */
trait PartialBadge extends js.Object {
  var index: js.UndefOr[Double] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[none | point | num | text | more | String] = js.undefined
}

object PartialBadge {
  @scala.inline
  def apply(
    index: Int | Double = null,
    text: String = null,
    `type`: none | point | num | text | more | String = null
  ): PartialBadge = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialBadge]
  }
}

