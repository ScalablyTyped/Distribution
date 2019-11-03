package typings.autolinker

import typings.autolinker.distCommonjsMatcherHashtagDashMatcherMod.HashtagMatcherConfig
import typings.autolinker.distCommonjsMatcherMatcherMod.MatcherConfig
import typings.autolinker.distCommonjsMatcherMentionDashMatcherMod.MentionMatcherConfig
import typings.autolinker.distCommonjsMatcherUrlDashMatcherMod.UrlMatcherConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("autolinker/dist/commonjs/matcher", JSImport.Namespace)
@js.native
object distCommonjsMatcherMod extends js.Object {
  @js.native
  class EmailMatcher ()
    extends typings.autolinker.distCommonjsMatcherEmailDashMatcherMod.EmailMatcher
  
  @js.native
  class HashtagMatcher protected ()
    extends typings.autolinker.distCommonjsMatcherHashtagDashMatcherMod.HashtagMatcher {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match instance,
      *   specified in an Object (map).
      */
    def this(cfg: HashtagMatcherConfig) = this()
  }
  
  @js.native
  abstract class Matcher protected ()
    extends typings.autolinker.distCommonjsMatcherMatcherMod.Matcher {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Matcher
      *   instance, specified in an Object (map).
      */
    def this(cfg: MatcherConfig) = this()
  }
  
  @js.native
  class MentionMatcher protected ()
    extends typings.autolinker.distCommonjsMatcherMentionDashMatcherMod.MentionMatcher {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match instance,
      *   specified in an Object (map).
      */
    def this(cfg: MentionMatcherConfig) = this()
  }
  
  @js.native
  class PhoneMatcher ()
    extends typings.autolinker.distCommonjsMatcherPhoneDashMatcherMod.PhoneMatcher
  
  @js.native
  class UrlMatcher protected ()
    extends typings.autolinker.distCommonjsMatcherUrlDashMatcherMod.UrlMatcher {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match instance,
      *   specified in an Object (map).
      */
    def this(cfg: UrlMatcherConfig) = this()
  }
  
}

