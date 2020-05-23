package typings.autoprefixerCore.mod

import typings.autoprefixerCore.anon.Inline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var from: js.UndefOr[String] = js.undefined
  var map: js.UndefOr[Inline] = js.undefined
  var safe: js.UndefOr[Boolean] = js.undefined
  var to: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    from: String = null,
    map: Inline = null,
    safe: js.UndefOr[Boolean] = js.undefined,
    to: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (!js.isUndefined(safe)) __obj.updateDynamic("safe")(safe.get.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

