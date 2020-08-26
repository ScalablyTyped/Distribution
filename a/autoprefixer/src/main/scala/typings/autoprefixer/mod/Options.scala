package typings.autoprefixer.mod

import typings.autoprefixer.autoprefixerBooleans.`false`
import typings.autoprefixer.autoprefixerStrings.`no-2009`
import typings.autoprefixer.autoprefixerStrings.`no-autoplace`
import typings.autoprefixer.autoprefixerStrings.autoplace
import typings.browserslist.mod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /** should Autoprefixer add prefixes. */
  var add: js.UndefOr[Boolean] = js.native
  /** @deprecated 'Change `browser` option to `overrideBrowserslist` in Autoprefixer */
  var browser: js.UndefOr[String] = js.native
  /**
    * @deprecated Replace Autoprefixer `browsers` option to Browserslist config.
    * Use `browserslist` key in `package.json` or `.browserslistrc` file.
    */
  var browsers: js.UndefOr[js.Array[String] | String] = js.native
  /** @deprecated Change `browserslist` option to `overrideBrowserslist` in Autoprefixer */
  var browserslist: js.UndefOr[js.Array[String] | String] = js.native
  /** should Autoprefixer use Visual Cascade, if CSS is uncompressed */
  var cascade: js.UndefOr[Boolean] = js.native
  /** environment for `Browserslist` */
  var env: js.UndefOr[String] = js.native
  /** should Autoprefixer add prefixes for flexbox properties */
  var flexbox: js.UndefOr[Boolean | `no-2009`] = js.native
  /** should Autoprefixer add IE 10-11 prefixes for Grid Layout properties */
  var grid: js.UndefOr[`false` | autoplace | `no-autoplace`] = js.native
  /** do not raise error on unknown browser version in `Browserslist` config. */
  var ignoreUnknownVersions: js.UndefOr[Boolean] = js.native
  /**
    * list of queries for target browsers.
    * Try to not use it.
    * The best practice is to use `.browserslistrc` config or `browserslist` key in `package.json`
    * to share target browsers with Babel, ESLint and Stylelint
    */
  var overrideBrowserslist: js.UndefOr[BrowserslistTarget] = js.native
  /** should Autoprefixer [remove outdated] prefixes */
  var remove: js.UndefOr[Boolean] = js.native
  /** custom usage statistics for > 10% in my stats browsers query */
  var stats: js.UndefOr[Stats] = js.native
  /** should Autoprefixer add prefixes for @supports parameters. */
  var supports: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdd(value: Boolean): Self = this.set("add", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdd: Self = this.set("add", js.undefined)
    @scala.inline
    def setBrowser(value: String): Self = this.set("browser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowser: Self = this.set("browser", js.undefined)
    @scala.inline
    def setBrowsersVarargs(value: String*): Self = this.set("browsers", js.Array(value :_*))
    @scala.inline
    def setBrowsers(value: js.Array[String] | String): Self = this.set("browsers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowsers: Self = this.set("browsers", js.undefined)
    @scala.inline
    def setBrowserslistVarargs(value: String*): Self = this.set("browserslist", js.Array(value :_*))
    @scala.inline
    def setBrowserslist(value: js.Array[String] | String): Self = this.set("browserslist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowserslist: Self = this.set("browserslist", js.undefined)
    @scala.inline
    def setCascade(value: Boolean): Self = this.set("cascade", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCascade: Self = this.set("cascade", js.undefined)
    @scala.inline
    def setEnv(value: String): Self = this.set("env", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    @scala.inline
    def setFlexbox(value: Boolean | `no-2009`): Self = this.set("flexbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlexbox: Self = this.set("flexbox", js.undefined)
    @scala.inline
    def setGrid(value: `false` | autoplace | `no-autoplace`): Self = this.set("grid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrid: Self = this.set("grid", js.undefined)
    @scala.inline
    def setIgnoreUnknownVersions(value: Boolean): Self = this.set("ignoreUnknownVersions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreUnknownVersions: Self = this.set("ignoreUnknownVersions", js.undefined)
    @scala.inline
    def setOverrideBrowserslistVarargs(value: String*): Self = this.set("overrideBrowserslist", js.Array(value :_*))
    @scala.inline
    def setOverrideBrowserslist(value: BrowserslistTarget): Self = this.set("overrideBrowserslist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrideBrowserslist: Self = this.set("overrideBrowserslist", js.undefined)
    @scala.inline
    def setRemove(value: Boolean): Self = this.set("remove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    @scala.inline
    def setStats(value: Stats): Self = this.set("stats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStats: Self = this.set("stats", js.undefined)
    @scala.inline
    def setSupports(value: Boolean): Self = this.set("supports", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupports: Self = this.set("supports", js.undefined)
  }
  
}

