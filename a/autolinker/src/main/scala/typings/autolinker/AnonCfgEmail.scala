package typings.autolinker

import org.scalablytyped.runtime.Instantiable1
import typings.autolinker.emailMatchMod.EmailMatch
import typings.autolinker.emailMatchMod.EmailMatchConfig
import typings.autolinker.hashtagMatchMod.HashtagMatch
import typings.autolinker.hashtagMatchMod.HashtagMatchConfig
import typings.autolinker.matchMatchMod.Match
import typings.autolinker.matchMatchMod.MatchConfig
import typings.autolinker.mentionMatchMod.MentionMatch
import typings.autolinker.mentionMatchMod.MentionMatchConfig
import typings.autolinker.phoneMatchMod.PhoneMatch
import typings.autolinker.phoneMatchMod.PhoneMatchConfig
import typings.autolinker.urlMatchMod.UrlMatch
import typings.autolinker.urlMatchMod.UrlMatchConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCfgEmail extends js.Object {
  var Email: Instantiable1[/* cfg */ EmailMatchConfig, EmailMatch]
  var Hashtag: Instantiable1[/* cfg */ HashtagMatchConfig, HashtagMatch]
  var Match: Instantiable1[/* cfg */ MatchConfig, typings.autolinker.matchMatchMod.Match]
  var Mention: Instantiable1[/* cfg */ MentionMatchConfig, MentionMatch]
  var Phone: Instantiable1[/* cfg */ PhoneMatchConfig, PhoneMatch]
  var Url: Instantiable1[/* cfg */ UrlMatchConfig, UrlMatch]
}

object AnonCfgEmail {
  @scala.inline
  def apply(
    Email: Instantiable1[/* cfg */ EmailMatchConfig, EmailMatch],
    Hashtag: Instantiable1[/* cfg */ HashtagMatchConfig, HashtagMatch],
    Match: Instantiable1[/* cfg */ MatchConfig, Match],
    Mention: Instantiable1[/* cfg */ MentionMatchConfig, MentionMatch],
    Phone: Instantiable1[/* cfg */ PhoneMatchConfig, PhoneMatch],
    Url: Instantiable1[/* cfg */ UrlMatchConfig, UrlMatch]
  ): AnonCfgEmail = {
    val __obj = js.Dynamic.literal(Email = Email.asInstanceOf[js.Any], Hashtag = Hashtag.asInstanceOf[js.Any], Match = Match.asInstanceOf[js.Any], Mention = Mention.asInstanceOf[js.Any], Phone = Phone.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCfgEmail]
  }
}

