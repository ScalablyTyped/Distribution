package typings
package autoprefixerLib.autoprefixerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var add: js.UndefOr[scala.Boolean] = js.undefined
  var browsers: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.undefined
  var cascade: js.UndefOr[scala.Boolean] = js.undefined
  var env: js.UndefOr[java.lang.String] = js.undefined
  var flexbox: js.UndefOr[scala.Boolean | autoprefixerLib.autoprefixerLibStrings.`no-2009`] = js.undefined
  var grid: js.UndefOr[
    scala.Boolean | autoprefixerLib.autoprefixerLibStrings.autoplace | autoprefixerLib.autoprefixerLibStrings.`no-autoplace`
  ] = js.undefined
  var ignoreUnknownVersions: js.UndefOr[scala.Boolean] = js.undefined
  var remove: js.UndefOr[scala.Boolean] = js.undefined
  var stats: js.UndefOr[js.Any] = js.undefined
  var supports: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    add: js.UndefOr[scala.Boolean] = js.undefined,
    browsers: js.Array[java.lang.String] | java.lang.String = null,
    cascade: js.UndefOr[scala.Boolean] = js.undefined,
    env: java.lang.String = null,
    flexbox: scala.Boolean | autoprefixerLib.autoprefixerLibStrings.`no-2009` = null,
    grid: scala.Boolean | autoprefixerLib.autoprefixerLibStrings.autoplace | autoprefixerLib.autoprefixerLibStrings.`no-autoplace` = null,
    ignoreUnknownVersions: js.UndefOr[scala.Boolean] = js.undefined,
    remove: js.UndefOr[scala.Boolean] = js.undefined,
    stats: js.Any = null,
    supports: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(add)) __obj.updateDynamic("add")(add)
    if (browsers != null) __obj.updateDynamic("browsers")(browsers.asInstanceOf[js.Any])
    if (!js.isUndefined(cascade)) __obj.updateDynamic("cascade")(cascade)
    if (env != null) __obj.updateDynamic("env")(env)
    if (flexbox != null) __obj.updateDynamic("flexbox")(flexbox.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreUnknownVersions)) __obj.updateDynamic("ignoreUnknownVersions")(ignoreUnknownVersions)
    if (!js.isUndefined(remove)) __obj.updateDynamic("remove")(remove)
    if (stats != null) __obj.updateDynamic("stats")(stats)
    if (!js.isUndefined(supports)) __obj.updateDynamic("supports")(supports)
    __obj.asInstanceOf[Options]
  }
}

