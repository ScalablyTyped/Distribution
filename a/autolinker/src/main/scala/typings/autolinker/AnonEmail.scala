package typings.autolinker

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

trait AnonEmail extends js.Object {
  var Email: Instantiable0[EmailMatcher]
  var Hashtag: Instantiable1[/* cfg */ HashtagMatcherConfig, HashtagMatcher]
  var Matcher: Instantiable1[/* cfg */ MatcherConfig, typings.autolinker.matcherMatcherMod.Matcher]
  var Mention: Instantiable1[/* cfg */ MentionMatcherConfig, MentionMatcher]
  var Phone: Instantiable0[PhoneMatcher]
  var Url: Instantiable1[/* cfg */ UrlMatcherConfig, UrlMatcher]
}

object AnonEmail {
  @scala.inline
  def apply(
    Email: Instantiable0[EmailMatcher],
    Hashtag: Instantiable1[/* cfg */ HashtagMatcherConfig, HashtagMatcher],
    Matcher: Instantiable1[/* cfg */ MatcherConfig, Matcher],
    Mention: Instantiable1[/* cfg */ MentionMatcherConfig, MentionMatcher],
    Phone: Instantiable0[PhoneMatcher],
    Url: Instantiable1[/* cfg */ UrlMatcherConfig, UrlMatcher]
  ): AnonEmail = {
    val __obj = js.Dynamic.literal(Email = Email.asInstanceOf[js.Any], Hashtag = Hashtag.asInstanceOf[js.Any], Matcher = Matcher.asInstanceOf[js.Any], Mention = Mention.asInstanceOf[js.Any], Phone = Phone.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEmail]
  }
}

