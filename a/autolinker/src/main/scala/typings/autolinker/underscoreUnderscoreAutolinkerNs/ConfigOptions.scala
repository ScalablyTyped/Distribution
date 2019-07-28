package typings.autolinker.underscoreUnderscoreAutolinkerNs

import typings.autolinker.Anon_Length
import typings.autolinker.Anon_SchemeMatches
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigOptions extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var email: js.UndefOr[Boolean] = js.undefined
  var hashtag: js.UndefOr[Boolean | String] = js.undefined
  var newWindow: js.UndefOr[Boolean] = js.undefined
  var phone: js.UndefOr[Boolean] = js.undefined
  var replaceFn: js.UndefOr[
    js.Function2[
      /* autolinker */ typings.autolinker.underscoreUnderscoreAutolinkerNs.Autolinker, 
      /* match */ js.Any, 
      String
    ]
  ] = js.undefined
  var stripPrefix: js.UndefOr[Boolean] = js.undefined
  var truncate: js.UndefOr[Double | Anon_Length] = js.undefined
  var twitter: js.UndefOr[Boolean] = js.undefined
  var urls: js.UndefOr[Boolean | Anon_SchemeMatches] = js.undefined
}

object ConfigOptions {
  @scala.inline
  def apply(
    className: String = null,
    email: js.UndefOr[Boolean] = js.undefined,
    hashtag: Boolean | String = null,
    newWindow: js.UndefOr[Boolean] = js.undefined,
    phone: js.UndefOr[Boolean] = js.undefined,
    replaceFn: (/* autolinker */ typings.autolinker.underscoreUnderscoreAutolinkerNs.Autolinker, /* match */ js.Any) => String = null,
    stripPrefix: js.UndefOr[Boolean] = js.undefined,
    truncate: Double | Anon_Length = null,
    twitter: js.UndefOr[Boolean] = js.undefined,
    urls: Boolean | Anon_SchemeMatches = null
  ): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(email)) __obj.updateDynamic("email")(email)
    if (hashtag != null) __obj.updateDynamic("hashtag")(hashtag.asInstanceOf[js.Any])
    if (!js.isUndefined(newWindow)) __obj.updateDynamic("newWindow")(newWindow)
    if (!js.isUndefined(phone)) __obj.updateDynamic("phone")(phone)
    if (replaceFn != null) __obj.updateDynamic("replaceFn")(js.Any.fromFunction2(replaceFn))
    if (!js.isUndefined(stripPrefix)) __obj.updateDynamic("stripPrefix")(stripPrefix)
    if (truncate != null) __obj.updateDynamic("truncate")(truncate.asInstanceOf[js.Any])
    if (!js.isUndefined(twitter)) __obj.updateDynamic("twitter")(twitter)
    if (urls != null) __obj.updateDynamic("urls")(urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigOptions]
  }
}

