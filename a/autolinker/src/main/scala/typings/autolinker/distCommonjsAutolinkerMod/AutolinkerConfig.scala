package typings.autolinker.distCommonjsAutolinkerMod

import typings.autolinker.distCommonjsMatchMatchMod.Match
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutolinkerConfig extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var context: js.UndefOr[js.Any] = js.undefined
  var decodePercentEncoding: js.UndefOr[Boolean] = js.undefined
  var email: js.UndefOr[Boolean] = js.undefined
  var hashtag: js.UndefOr[HashtagConfig] = js.undefined
  var mention: js.UndefOr[MentionConfig] = js.undefined
  var newWindow: js.UndefOr[Boolean] = js.undefined
  var phone: js.UndefOr[Boolean] = js.undefined
  var replaceFn: js.UndefOr[ReplaceFn | Null] = js.undefined
  var stripPrefix: js.UndefOr[StripPrefixConfig] = js.undefined
  var stripTrailingSlash: js.UndefOr[Boolean] = js.undefined
  var truncate: js.UndefOr[TruncateConfig] = js.undefined
  var urls: js.UndefOr[UrlsConfig] = js.undefined
}

object AutolinkerConfig {
  @scala.inline
  def apply(
    className: String = null,
    context: js.Any = null,
    decodePercentEncoding: js.UndefOr[Boolean] = js.undefined,
    email: js.UndefOr[Boolean] = js.undefined,
    hashtag: HashtagConfig = null,
    mention: MentionConfig = null,
    newWindow: js.UndefOr[Boolean] = js.undefined,
    phone: js.UndefOr[Boolean] = js.undefined,
    replaceFn: /* match */ Match => ReplaceFnReturn = null,
    stripPrefix: StripPrefixConfig = null,
    stripTrailingSlash: js.UndefOr[Boolean] = js.undefined,
    truncate: TruncateConfig = null,
    urls: UrlsConfig = null
  ): AutolinkerConfig = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(decodePercentEncoding)) __obj.updateDynamic("decodePercentEncoding")(decodePercentEncoding.asInstanceOf[js.Any])
    if (!js.isUndefined(email)) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (hashtag != null) __obj.updateDynamic("hashtag")(hashtag.asInstanceOf[js.Any])
    if (mention != null) __obj.updateDynamic("mention")(mention.asInstanceOf[js.Any])
    if (!js.isUndefined(newWindow)) __obj.updateDynamic("newWindow")(newWindow.asInstanceOf[js.Any])
    if (!js.isUndefined(phone)) __obj.updateDynamic("phone")(phone.asInstanceOf[js.Any])
    if (replaceFn != null) __obj.updateDynamic("replaceFn")(js.Any.fromFunction1(replaceFn))
    if (stripPrefix != null) __obj.updateDynamic("stripPrefix")(stripPrefix.asInstanceOf[js.Any])
    if (!js.isUndefined(stripTrailingSlash)) __obj.updateDynamic("stripTrailingSlash")(stripTrailingSlash.asInstanceOf[js.Any])
    if (truncate != null) __obj.updateDynamic("truncate")(truncate.asInstanceOf[js.Any])
    if (urls != null) __obj.updateDynamic("urls")(urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutolinkerConfig]
  }
}

