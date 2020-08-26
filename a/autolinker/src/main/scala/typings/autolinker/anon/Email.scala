package typings.autolinker.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.autolinker.emailMatcherMod.EmailMatcher
import typings.autolinker.hashtagMatcherMod.HashtagMatcher
import typings.autolinker.hashtagMatcherMod.HashtagMatcherConfig
import typings.autolinker.matcherMatcherMod.Matcher
import typings.autolinker.matcherMatcherMod.MatcherConfig
import typings.autolinker.mentionMatcherMod.MentionMatcher
import typings.autolinker.mentionMatcherMod.MentionMatcherConfig
import typings.autolinker.phoneMatcherMod.PhoneMatcher
import typings.autolinker.urlMatcherMod.UrlMatcher
import typings.autolinker.urlMatcherMod.UrlMatcherConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Email extends js.Object {
  var Email: Instantiable0[EmailMatcher] = js.native
  var Hashtag: Instantiable1[/* cfg */ HashtagMatcherConfig, HashtagMatcher] = js.native
  var Matcher: Instantiable1[/* cfg */ MatcherConfig, typings.autolinker.matcherMatcherMod.Matcher] = js.native
  var Mention: Instantiable1[/* cfg */ MentionMatcherConfig, MentionMatcher] = js.native
  var Phone: Instantiable0[PhoneMatcher] = js.native
  var Url: Instantiable1[/* cfg */ UrlMatcherConfig, UrlMatcher] = js.native
}

object Email {
  @scala.inline
  def apply(
    Email: Instantiable0[EmailMatcher],
    Hashtag: Instantiable1[/* cfg */ HashtagMatcherConfig, HashtagMatcher],
    Matcher: Instantiable1[/* cfg */ MatcherConfig, Matcher],
    Mention: Instantiable1[/* cfg */ MentionMatcherConfig, MentionMatcher],
    Phone: Instantiable0[PhoneMatcher],
    Url: Instantiable1[/* cfg */ UrlMatcherConfig, UrlMatcher]
  ): Email = {
    val __obj = js.Dynamic.literal(Email = Email.asInstanceOf[js.Any], Hashtag = Hashtag.asInstanceOf[js.Any], Matcher = Matcher.asInstanceOf[js.Any], Mention = Mention.asInstanceOf[js.Any], Phone = Phone.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Email]
  }
  @scala.inline
  implicit class EmailOps[Self <: Email] (val x: Self) extends AnyVal {
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
    def setEmail(value: Instantiable0[EmailMatcher]): Self = this.set("Email", value.asInstanceOf[js.Any])
    @scala.inline
    def setHashtag(value: Instantiable1[/* cfg */ HashtagMatcherConfig, HashtagMatcher]): Self = this.set("Hashtag", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatcher(value: Instantiable1[/* cfg */ MatcherConfig, Matcher]): Self = this.set("Matcher", value.asInstanceOf[js.Any])
    @scala.inline
    def setMention(value: Instantiable1[/* cfg */ MentionMatcherConfig, MentionMatcher]): Self = this.set("Mention", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhone(value: Instantiable0[PhoneMatcher]): Self = this.set("Phone", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: Instantiable1[/* cfg */ UrlMatcherConfig, UrlMatcher]): Self = this.set("Url", value.asInstanceOf[js.Any])
  }
  
}

