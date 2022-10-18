package typings.autolinker

import typings.autolinker.distCommonjsAutolinkerMod.HashtagConfig
import typings.autolinker.distCommonjsAutolinkerMod.MentionConfig
import typings.autolinker.distCommonjsMatchMatchMod.MatchType
import typings.autolinker.distCommonjsMatchUrlMatchMod.UrlMatchType
import typings.autolinker.distCommonjsParserHashtagUtilsMod.HashtagService
import typings.autolinker.distCommonjsParserMentionUtilsMod.MentionService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autolinkerStrings {
  
  @js.native
  sealed trait email
    extends StObject
       with MatchType
  inline def email: email = "email".asInstanceOf[email]
  
  @js.native
  sealed trait end extends StObject
  inline def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait facebook
    extends StObject
       with HashtagConfig
       with HashtagService
  inline def facebook: facebook = "facebook".asInstanceOf[facebook]
  
  @js.native
  sealed trait hashtag
    extends StObject
       with MatchType
  inline def hashtag: hashtag = "hashtag".asInstanceOf[hashtag]
  
  @js.native
  sealed trait instagram
    extends StObject
       with HashtagConfig
       with HashtagService
       with MentionConfig
       with MentionService
  inline def instagram: instagram = "instagram".asInstanceOf[instagram]
  
  @js.native
  sealed trait ipV4
    extends StObject
       with UrlMatchType
  inline def ipV4: ipV4 = "ipV4".asInstanceOf[ipV4]
  
  @js.native
  sealed trait mention
    extends StObject
       with MatchType
  inline def mention: mention = "mention".asInstanceOf[mention]
  
  @js.native
  sealed trait middle extends StObject
  inline def middle: middle = "middle".asInstanceOf[middle]
  
  @js.native
  sealed trait phone
    extends StObject
       with MatchType
  inline def phone: phone = "phone".asInstanceOf[phone]
  
  @js.native
  sealed trait scheme
    extends StObject
       with UrlMatchType
  inline def scheme: scheme = "scheme".asInstanceOf[scheme]
  
  @js.native
  sealed trait smart extends StObject
  inline def smart: smart = "smart".asInstanceOf[smart]
  
  @js.native
  sealed trait soundcloud
    extends StObject
       with MentionConfig
       with MentionService
  inline def soundcloud: soundcloud = "soundcloud".asInstanceOf[soundcloud]
  
  @js.native
  sealed trait tiktok
    extends StObject
       with HashtagConfig
       with HashtagService
       with MentionConfig
       with MentionService
  inline def tiktok: tiktok = "tiktok".asInstanceOf[tiktok]
  
  @js.native
  sealed trait tld
    extends StObject
       with UrlMatchType
  inline def tld: tld = "tld".asInstanceOf[tld]
  
  @js.native
  sealed trait twitter
    extends StObject
       with HashtagConfig
       with HashtagService
       with MentionConfig
       with MentionService
  inline def twitter: twitter = "twitter".asInstanceOf[twitter]
  
  @js.native
  sealed trait url
    extends StObject
       with MatchType
  inline def url: url = "url".asInstanceOf[url]
}
