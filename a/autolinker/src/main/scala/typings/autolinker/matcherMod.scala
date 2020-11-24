package typings.autolinker

import typings.autolinker.hashtagMatcherMod.HashtagMatcherConfig
import typings.autolinker.matcherMatcherMod.MatcherConfig
import typings.autolinker.mentionMatcherMod.MentionMatcherConfig
import typings.autolinker.urlMatcherMod.UrlMatcherConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("autolinker/dist/commonjs/matcher", JSImport.Namespace)
@js.native
object matcherMod extends js.Object {
  
  @js.native
  class EmailMatcher ()
    extends typings.autolinker.emailMatcherMod.EmailMatcher
  
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
  
  @js.native
  class PhoneMatcher ()
    extends typings.autolinker.phoneMatcherMod.PhoneMatcher
  
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
