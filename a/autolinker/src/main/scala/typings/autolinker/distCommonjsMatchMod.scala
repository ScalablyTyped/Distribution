package typings.autolinker

import typings.autolinker.distCommonjsMatchEmailDashMatchMod.EmailMatchConfig
import typings.autolinker.distCommonjsMatchHashtagDashMatchMod.HashtagMatchConfig
import typings.autolinker.distCommonjsMatchMatchMod.MatchConfig
import typings.autolinker.distCommonjsMatchMentionDashMatchMod.MentionMatchConfig
import typings.autolinker.distCommonjsMatchPhoneDashMatchMod.PhoneMatchConfig
import typings.autolinker.distCommonjsMatchUrlDashMatchMod.UrlMatchConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("autolinker/dist/commonjs/match", JSImport.Namespace)
@js.native
object distCommonjsMatchMod extends js.Object {
  @js.native
  class EmailMatch protected ()
    extends typings.autolinker.distCommonjsMatchEmailDashMatchMod.EmailMatch {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match
      *   instance, specified in an Object (map).
      */
    def this(cfg: EmailMatchConfig) = this()
  }
  
  @js.native
  class HashtagMatch protected ()
    extends typings.autolinker.distCommonjsMatchHashtagDashMatchMod.HashtagMatch {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match
      *   instance, specified in an Object (map).
      */
    def this(cfg: HashtagMatchConfig) = this()
  }
  
  @js.native
  abstract class Match protected ()
    extends typings.autolinker.distCommonjsMatchMatchMod.Match {
    /**
      * @member Autolinker.match.Match
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match
      *   instance, specified in an Object (map).
      */
    def this(cfg: MatchConfig) = this()
  }
  
  @js.native
  class MentionMatch protected ()
    extends typings.autolinker.distCommonjsMatchMentionDashMatchMod.MentionMatch {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match
      *   instance, specified in an Object (map).
      */
    def this(cfg: MentionMatchConfig) = this()
  }
  
  @js.native
  class PhoneMatch protected ()
    extends typings.autolinker.distCommonjsMatchPhoneDashMatchMod.PhoneMatch {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match
      *   instance, specified in an Object (map).
      */
    def this(cfg: PhoneMatchConfig) = this()
  }
  
  @js.native
  class UrlMatch protected ()
    extends typings.autolinker.distCommonjsMatchUrlDashMatchMod.UrlMatch {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match
      *   instance, specified in an Object (map).
      */
    def this(cfg: UrlMatchConfig) = this()
  }
  
}

