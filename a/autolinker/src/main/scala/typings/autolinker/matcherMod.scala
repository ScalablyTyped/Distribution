package typings.autolinker

import typings.autolinker.hashtagMatcherMod.HashtagMatcherConfig
import typings.autolinker.matcherMatcherMod.MatcherConfig
import typings.autolinker.mentionMatcherMod.MentionMatcherConfig
import typings.autolinker.urlMatcherMod.UrlMatcherConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matcherMod {
  
  @JSImport("autolinker/dist/commonjs/matcher", "EmailMatcher")
  @js.native
  class EmailMatcher protected ()
    extends typings.autolinker.emailMatcherMod.EmailMatcher {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Matcher
      *   instance, specified in an Object (map).
      */
    def this(cfg: MatcherConfig) = this()
  }
  
  @JSImport("autolinker/dist/commonjs/matcher", "HashtagMatcher")
  @js.native
  class HashtagMatcher protected ()
    extends typings.autolinker.hashtagMatcherMod.HashtagMatcher {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match instance,
      *   specified in an Object (map).
      */
    def this(cfg: HashtagMatcherConfig) = this()
  }
  
  @JSImport("autolinker/dist/commonjs/matcher", "Matcher")
  @js.native
  abstract class Matcher protected ()
    extends typings.autolinker.matcherMatcherMod.Matcher {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Matcher
      *   instance, specified in an Object (map).
      */
    def this(cfg: MatcherConfig) = this()
  }
  
  @JSImport("autolinker/dist/commonjs/matcher", "MentionMatcher")
  @js.native
  class MentionMatcher protected ()
    extends typings.autolinker.mentionMatcherMod.MentionMatcher {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match instance,
      *   specified in an Object (map).
      */
    def this(cfg: MentionMatcherConfig) = this()
  }
  
  @JSImport("autolinker/dist/commonjs/matcher", "PhoneMatcher")
  @js.native
  class PhoneMatcher protected ()
    extends typings.autolinker.phoneMatcherMod.PhoneMatcher {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Matcher
      *   instance, specified in an Object (map).
      */
    def this(cfg: MatcherConfig) = this()
  }
  
  @JSImport("autolinker/dist/commonjs/matcher", "UrlMatcher")
  @js.native
  class UrlMatcher protected ()
    extends typings.autolinker.urlMatcherMod.UrlMatcher {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match instance,
      *   specified in an Object (map).
      */
    def this(cfg: UrlMatcherConfig) = this()
  }
}
