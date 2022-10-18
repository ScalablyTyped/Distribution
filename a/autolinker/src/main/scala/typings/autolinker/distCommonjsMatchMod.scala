package typings.autolinker

import typings.autolinker.distCommonjsMatchAbstractMatchMod.AbstractMatchConfig
import typings.autolinker.distCommonjsMatchEmailMatchMod.EmailMatchConfig
import typings.autolinker.distCommonjsMatchHashtagMatchMod.HashtagMatchConfig
import typings.autolinker.distCommonjsMatchMentionMatchMod.MentionMatchConfig
import typings.autolinker.distCommonjsMatchPhoneMatchMod.PhoneMatchConfig
import typings.autolinker.distCommonjsMatchUrlMatchMod.UrlMatchConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsMatchMod {
  
  /* note: abstract class */ @JSImport("autolinker/dist/commonjs/match", "AbstractMatch")
  @js.native
  open class AbstractMatch protected ()
    extends typings.autolinker.distCommonjsMatchAbstractMatchMod.AbstractMatch {
    /**
      * @member Autolinker.match.Match
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match
      *   instance, specified in an Object (map).
      */
    def this(cfg: AbstractMatchConfig) = this()
  }
  
  @JSImport("autolinker/dist/commonjs/match", "EmailMatch")
  @js.native
  open class EmailMatch protected ()
    extends typings.autolinker.distCommonjsMatchEmailMatchMod.EmailMatch {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match
      *   instance, specified in an Object (map).
      */
    def this(cfg: EmailMatchConfig) = this()
  }
  
  @JSImport("autolinker/dist/commonjs/match", "HashtagMatch")
  @js.native
  open class HashtagMatch protected ()
    extends typings.autolinker.distCommonjsMatchHashtagMatchMod.HashtagMatch {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match
      *   instance, specified in an Object (map).
      */
    def this(cfg: HashtagMatchConfig) = this()
  }
  
  @JSImport("autolinker/dist/commonjs/match", "MentionMatch")
  @js.native
  open class MentionMatch protected ()
    extends typings.autolinker.distCommonjsMatchMentionMatchMod.MentionMatch {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match
      *   instance, specified in an Object (map).
      */
    def this(cfg: MentionMatchConfig) = this()
  }
  
  @JSImport("autolinker/dist/commonjs/match", "PhoneMatch")
  @js.native
  open class PhoneMatch protected ()
    extends typings.autolinker.distCommonjsMatchPhoneMatchMod.PhoneMatch {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match
      *   instance, specified in an Object (map).
      */
    def this(cfg: PhoneMatchConfig) = this()
  }
  
  @JSImport("autolinker/dist/commonjs/match", "UrlMatch")
  @js.native
  open class UrlMatch protected ()
    extends typings.autolinker.distCommonjsMatchUrlMatchMod.UrlMatch {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match
      *   instance, specified in an Object (map).
      */
    def this(cfg: UrlMatchConfig) = this()
  }
}
