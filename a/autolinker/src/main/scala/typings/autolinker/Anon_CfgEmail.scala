package typings.autolinker

import org.scalablytyped.runtime.Instantiable1
import typings.autolinker.distCommonjsMatchEmailDashMatchMod.EmailMatch
import typings.autolinker.distCommonjsMatchEmailDashMatchMod.EmailMatchConfig
import typings.autolinker.distCommonjsMatchHashtagDashMatchMod.HashtagMatch
import typings.autolinker.distCommonjsMatchHashtagDashMatchMod.HashtagMatchConfig
import typings.autolinker.distCommonjsMatchMatchMod.Match
import typings.autolinker.distCommonjsMatchMatchMod.MatchConfig
import typings.autolinker.distCommonjsMatchMentionDashMatchMod.MentionMatch
import typings.autolinker.distCommonjsMatchMentionDashMatchMod.MentionMatchConfig
import typings.autolinker.distCommonjsMatchPhoneDashMatchMod.PhoneMatch
import typings.autolinker.distCommonjsMatchPhoneDashMatchMod.PhoneMatchConfig
import typings.autolinker.distCommonjsMatchUrlDashMatchMod.UrlMatch
import typings.autolinker.distCommonjsMatchUrlDashMatchMod.UrlMatchConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CfgEmail extends js.Object {
  var Email: Instantiable1[/* cfg */ EmailMatchConfig, EmailMatch]
  var Hashtag: Instantiable1[/* cfg */ HashtagMatchConfig, HashtagMatch]
  var Match: Instantiable1[/* cfg */ MatchConfig, typings.autolinker.distCommonjsMatchMatchMod.Match]
  var Mention: Instantiable1[/* cfg */ MentionMatchConfig, MentionMatch]
  var Phone: Instantiable1[/* cfg */ PhoneMatchConfig, PhoneMatch]
  var Url: Instantiable1[/* cfg */ UrlMatchConfig, UrlMatch]
}

object Anon_CfgEmail {
  @scala.inline
  def apply(
    Email: Instantiable1[/* cfg */ EmailMatchConfig, EmailMatch],
    Hashtag: Instantiable1[/* cfg */ HashtagMatchConfig, HashtagMatch],
    Match: Instantiable1[/* cfg */ MatchConfig, Match],
    Mention: Instantiable1[/* cfg */ MentionMatchConfig, MentionMatch],
    Phone: Instantiable1[/* cfg */ PhoneMatchConfig, PhoneMatch],
    Url: Instantiable1[/* cfg */ UrlMatchConfig, UrlMatch]
  ): Anon_CfgEmail = {
    val __obj = js.Dynamic.literal(Email = Email, Hashtag = Hashtag, Match = Match, Mention = Mention, Phone = Phone, Url = Url)
  
    __obj.asInstanceOf[Anon_CfgEmail]
  }
}

