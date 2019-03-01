package typings
package autoprefixerDashCoreLib.autoprefixerDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var from: js.UndefOr[java.lang.String] = js.undefined
  var map: js.UndefOr[autoprefixerDashCoreLib.Anon_Inline] = js.undefined
  var safe: js.UndefOr[scala.Boolean] = js.undefined
  var to: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    from: java.lang.String = null,
    map: autoprefixerDashCoreLib.Anon_Inline = null,
    safe: js.UndefOr[scala.Boolean] = js.undefined,
    to: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from)
    if (map != null) __obj.updateDynamic("map")(map)
    if (!js.isUndefined(safe)) __obj.updateDynamic("safe")(safe)
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[Options]
  }
}

