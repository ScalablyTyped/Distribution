package typings.autolinker

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.autolinker.distCommonjsMatcherEmailDashMatcherMod.EmailMatcher
import typings.autolinker.distCommonjsMatcherHashtagDashMatcherMod.HashtagMatcher
import typings.autolinker.distCommonjsMatcherHashtagDashMatcherMod.HashtagMatcherConfig
import typings.autolinker.distCommonjsMatcherMatcherMod.Matcher
import typings.autolinker.distCommonjsMatcherMatcherMod.MatcherConfig
import typings.autolinker.distCommonjsMatcherMentionDashMatcherMod.MentionMatcher
import typings.autolinker.distCommonjsMatcherMentionDashMatcherMod.MentionMatcherConfig
import typings.autolinker.distCommonjsMatcherPhoneDashMatcherMod.PhoneMatcher
import typings.autolinker.distCommonjsMatcherUrlDashMatcherMod.UrlMatcher
import typings.autolinker.distCommonjsMatcherUrlDashMatcherMod.UrlMatcherConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cfg extends js.Object {
  var Email: Instantiable0[EmailMatcher]
  var Hashtag: Instantiable1[/* cfg */ HashtagMatcherConfig, HashtagMatcher]
  var Matcher: Instantiable1[/* cfg */ MatcherConfig, typings.autolinker.distCommonjsMatcherMatcherMod.Matcher]
  var Mention: Instantiable1[/* cfg */ MentionMatcherConfig, MentionMatcher]
  var Phone: Instantiable0[PhoneMatcher]
  var Url: Instantiable1[/* cfg */ UrlMatcherConfig, UrlMatcher]
}

object Anon_Cfg {
  @scala.inline
  def apply(
    Email: Instantiable0[EmailMatcher],
    Hashtag: Instantiable1[/* cfg */ HashtagMatcherConfig, HashtagMatcher],
    Matcher: Instantiable1[/* cfg */ MatcherConfig, Matcher],
    Mention: Instantiable1[/* cfg */ MentionMatcherConfig, MentionMatcher],
    Phone: Instantiable0[PhoneMatcher],
    Url: Instantiable1[/* cfg */ UrlMatcherConfig, UrlMatcher]
  ): Anon_Cfg = {
    val __obj = js.Dynamic.literal(Email = Email, Hashtag = Hashtag, Matcher = Matcher, Mention = Mention, Phone = Phone, Url = Url)
  
    __obj.asInstanceOf[Anon_Cfg]
  }
}

