package typings.autolinker

import typings.autolinker.abstractMatchMod.AbstractMatchConfig
import typings.autolinker.emailMatchMod.EmailMatchConfig
import typings.autolinker.hashtagMatchMod.HashtagMatchConfig
import typings.autolinker.mentionMatchMod.MentionMatchConfig
import typings.autolinker.phoneMatchMod.PhoneMatchConfig
import typings.autolinker.urlMatchMod.UrlMatchConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matchMod {
  
  @JSImport("autolinker/dist/commonjs/match", "AbstractMatch")
  @js.native
  abstract class AbstractMatch protected ()
    extends typings.autolinker.abstractMatchMod.AbstractMatch {
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
    extends typings.autolinker.emailMatchMod.EmailMatch {
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
    extends typings.autolinker.hashtagMatchMod.HashtagMatch {
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
    extends typings.autolinker.mentionMatchMod.MentionMatch {
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
    extends typings.autolinker.phoneMatchMod.PhoneMatch {
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
    extends typings.autolinker.urlMatchMod.UrlMatch {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match
      *   instance, specified in an Object (map).
      */
    def this(cfg: UrlMatchConfig) = this()
  }
}
