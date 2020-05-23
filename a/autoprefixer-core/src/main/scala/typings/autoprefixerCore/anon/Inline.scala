package typings.autoprefixerCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Inline extends js.Object {
  var `inline`: js.UndefOr[Boolean] = js.undefined
  var prev: js.UndefOr[String | js.Object] = js.undefined
}

object Inline {
  @scala.inline
  def apply(`inline`: js.UndefOr[Boolean] = js.undefined, prev: String | js.Object = null): Inline = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.get.asInstanceOf[js.Any])
    if (prev != null) __obj.updateDynamic("prev")(prev.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inline]
  }
}

