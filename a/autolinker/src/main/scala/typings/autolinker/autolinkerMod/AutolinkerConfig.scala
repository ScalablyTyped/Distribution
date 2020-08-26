package typings.autolinker.autolinkerMod

import typings.autolinker.matchMatchMod.Match
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutolinkerConfig extends js.Object {
  var className: js.UndefOr[String] = js.native
  var context: js.UndefOr[js.Any] = js.native
  var decodePercentEncoding: js.UndefOr[Boolean] = js.native
  var email: js.UndefOr[Boolean] = js.native
  var hashtag: js.UndefOr[HashtagConfig] = js.native
  var mention: js.UndefOr[MentionConfig] = js.native
  var newWindow: js.UndefOr[Boolean] = js.native
  var phone: js.UndefOr[Boolean] = js.native
  var replaceFn: js.UndefOr[ReplaceFn | Null] = js.native
  var sanitizeHtml: js.UndefOr[Boolean] = js.native
  var stripPrefix: js.UndefOr[StripPrefixConfig] = js.native
  var stripTrailingSlash: js.UndefOr[Boolean] = js.native
  var truncate: js.UndefOr[TruncateConfig] = js.native
  var urls: js.UndefOr[UrlsConfig] = js.native
}

object AutolinkerConfig {
  @scala.inline
  def apply(): AutolinkerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutolinkerConfig]
  }
  @scala.inline
  implicit class AutolinkerConfigOps[Self <: AutolinkerConfig] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setDecodePercentEncoding(value: Boolean): Self = this.set("decodePercentEncoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecodePercentEncoding: Self = this.set("decodePercentEncoding", js.undefined)
    @scala.inline
    def setEmail(value: Boolean): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setHashtag(value: HashtagConfig): Self = this.set("hashtag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHashtag: Self = this.set("hashtag", js.undefined)
    @scala.inline
    def setMention(value: MentionConfig): Self = this.set("mention", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMention: Self = this.set("mention", js.undefined)
    @scala.inline
    def setNewWindow(value: Boolean): Self = this.set("newWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewWindow: Self = this.set("newWindow", js.undefined)
    @scala.inline
    def setPhone(value: Boolean): Self = this.set("phone", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhone: Self = this.set("phone", js.undefined)
    @scala.inline
    def setReplaceFn(value: /* match */ Match => ReplaceFnReturn): Self = this.set("replaceFn", js.Any.fromFunction1(value))
    @scala.inline
    def deleteReplaceFn: Self = this.set("replaceFn", js.undefined)
    @scala.inline
    def setReplaceFnNull: Self = this.set("replaceFn", null)
    @scala.inline
    def setSanitizeHtml(value: Boolean): Self = this.set("sanitizeHtml", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSanitizeHtml: Self = this.set("sanitizeHtml", js.undefined)
    @scala.inline
    def setStripPrefix(value: StripPrefixConfig): Self = this.set("stripPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStripPrefix: Self = this.set("stripPrefix", js.undefined)
    @scala.inline
    def setStripTrailingSlash(value: Boolean): Self = this.set("stripTrailingSlash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStripTrailingSlash: Self = this.set("stripTrailingSlash", js.undefined)
    @scala.inline
    def setTruncate(value: TruncateConfig): Self = this.set("truncate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTruncate: Self = this.set("truncate", js.undefined)
    @scala.inline
    def setUrls(value: UrlsConfig): Self = this.set("urls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrls: Self = this.set("urls", js.undefined)
  }
  
}

