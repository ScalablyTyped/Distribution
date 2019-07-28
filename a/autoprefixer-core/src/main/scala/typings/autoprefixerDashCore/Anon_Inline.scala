package typings.autoprefixerDashCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Inline extends js.Object {
  var `inline`: js.UndefOr[Boolean] = js.undefined
  var prev: js.UndefOr[String | js.Object] = js.undefined
}

object Anon_Inline {
  @scala.inline
  def apply(`inline`: js.UndefOr[Boolean] = js.undefined, prev: String | js.Object = null): Anon_Inline = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (prev != null) __obj.updateDynamic("prev")(prev.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Inline]
  }
}

