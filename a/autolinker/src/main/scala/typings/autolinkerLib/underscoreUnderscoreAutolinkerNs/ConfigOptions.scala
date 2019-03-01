package typings
package autolinkerLib.underscoreUnderscoreAutolinkerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigOptions extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var email: js.UndefOr[scala.Boolean] = js.undefined
  var hashtag: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var newWindow: js.UndefOr[scala.Boolean] = js.undefined
  var phone: js.UndefOr[scala.Boolean] = js.undefined
  var replaceFn: js.UndefOr[js.Function2[/* autolinker */ Autolinker, /* match */ js.Any, java.lang.String]] = js.undefined
  var stripPrefix: js.UndefOr[scala.Boolean] = js.undefined
  var truncate: js.UndefOr[scala.Double | autolinkerLib.Anon_Length] = js.undefined
  var twitter: js.UndefOr[scala.Boolean] = js.undefined
  var urls: js.UndefOr[scala.Boolean | autolinkerLib.Anon_SchemeMatches] = js.undefined
}

object ConfigOptions {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    email: js.UndefOr[scala.Boolean] = js.undefined,
    hashtag: scala.Boolean | java.lang.String = null,
    newWindow: js.UndefOr[scala.Boolean] = js.undefined,
    phone: js.UndefOr[scala.Boolean] = js.undefined,
    replaceFn: js.Function2[/* autolinker */ Autolinker, /* match */ js.Any, java.lang.String] = null,
    stripPrefix: js.UndefOr[scala.Boolean] = js.undefined,
    truncate: scala.Double | autolinkerLib.Anon_Length = null,
    twitter: js.UndefOr[scala.Boolean] = js.undefined,
    urls: scala.Boolean | autolinkerLib.Anon_SchemeMatches = null
  ): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(email)) __obj.updateDynamic("email")(email)
    if (hashtag != null) __obj.updateDynamic("hashtag")(hashtag.asInstanceOf[js.Any])
    if (!js.isUndefined(newWindow)) __obj.updateDynamic("newWindow")(newWindow)
    if (!js.isUndefined(phone)) __obj.updateDynamic("phone")(phone)
    if (replaceFn != null) __obj.updateDynamic("replaceFn")(replaceFn)
    if (!js.isUndefined(stripPrefix)) __obj.updateDynamic("stripPrefix")(stripPrefix)
    if (truncate != null) __obj.updateDynamic("truncate")(truncate.asInstanceOf[js.Any])
    if (!js.isUndefined(twitter)) __obj.updateDynamic("twitter")(twitter)
    if (urls != null) __obj.updateDynamic("urls")(urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigOptions]
  }
}

