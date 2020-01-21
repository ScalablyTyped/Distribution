package typings.autoprefixerCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInline extends js.Object {
  var `inline`: js.UndefOr[Boolean] = js.undefined
  var prev: js.UndefOr[String | js.Object] = js.undefined
}

object AnonInline {
  @scala.inline
  def apply(`inline`: js.UndefOr[Boolean] = js.undefined, prev: String | js.Object = null): AnonInline = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (prev != null) __obj.updateDynamic("prev")(prev.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInline]
  }
}

