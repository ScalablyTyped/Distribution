package typings.autoprefixer.mod

import typings.autoprefixer.autoprefixerBooleans.`false`
import typings.autoprefixer.autoprefixerStrings.`no-2009`
import typings.autoprefixer.autoprefixerStrings.`no-autoplace`
import typings.autoprefixer.autoprefixerStrings.autoplace
import typings.browserslist.mod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** should Autoprefixer add prefixes. */
  var add: js.UndefOr[Boolean] = js.undefined
  /** @deprecated Replace Autoprefixer `browsers` option to `Browserslist` config */
  var browsers: js.UndefOr[js.Array[String] | String] = js.undefined
  /** should Autoprefixer use Visual Cascade, if CSS is uncompressed */
  var cascade: js.UndefOr[Boolean] = js.undefined
  /** environment for `Browserslist` */
  var env: js.UndefOr[String] = js.undefined
  /** should Autoprefixer add prefixes for flexbox properties */
  var flexbox: js.UndefOr[Boolean | `no-2009`] = js.undefined
  /** should Autoprefixer add IE 10-11 prefixes for Grid Layout properties */
  var grid: js.UndefOr[`false` | autoplace | `no-autoplace`] = js.undefined
  /** do not raise error on unknown browser version in `Browserslist` config. */
  var ignoreUnknownVersions: js.UndefOr[Boolean] = js.undefined
  /** list of queries for target browsers */
  var overrideBrowserslist: js.UndefOr[BrowserslistTarget] = js.undefined
  /** should Autoprefixer [remove outdated] prefixes */
  var remove: js.UndefOr[Boolean] = js.undefined
  /** custom usage statistics for > 10% in my stats browsers query */
  var stats: js.UndefOr[Stats] = js.undefined
  /** should Autoprefixer add prefixes for @supports parameters. */
  var supports: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    add: js.UndefOr[Boolean] = js.undefined,
    browsers: js.Array[String] | String = null,
    cascade: js.UndefOr[Boolean] = js.undefined,
    env: String = null,
    flexbox: Boolean | `no-2009` = null,
    grid: `false` | autoplace | `no-autoplace` = null,
    ignoreUnknownVersions: js.UndefOr[Boolean] = js.undefined,
    overrideBrowserslist: BrowserslistTarget = null,
    remove: js.UndefOr[Boolean] = js.undefined,
    stats: Stats = null,
    supports: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(add)) __obj.updateDynamic("add")(add.asInstanceOf[js.Any])
    if (browsers != null) __obj.updateDynamic("browsers")(browsers.asInstanceOf[js.Any])
    if (!js.isUndefined(cascade)) __obj.updateDynamic("cascade")(cascade.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (flexbox != null) __obj.updateDynamic("flexbox")(flexbox.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreUnknownVersions)) __obj.updateDynamic("ignoreUnknownVersions")(ignoreUnknownVersions.asInstanceOf[js.Any])
    if (overrideBrowserslist != null) __obj.updateDynamic("overrideBrowserslist")(overrideBrowserslist.asInstanceOf[js.Any])
    if (!js.isUndefined(remove)) __obj.updateDynamic("remove")(remove.asInstanceOf[js.Any])
    if (stats != null) __obj.updateDynamic("stats")(stats.asInstanceOf[js.Any])
    if (!js.isUndefined(supports)) __obj.updateDynamic("supports")(supports.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

