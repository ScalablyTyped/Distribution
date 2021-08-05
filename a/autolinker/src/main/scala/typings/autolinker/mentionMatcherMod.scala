package typings.autolinker

import org.scalablytyped.runtime.StringDictionary
import typings.autolinker.anchorTagBuilderMod.AnchorTagBuilder
import typings.autolinker.autolinkerMod.MentionServices
import typings.autolinker.matcherMatcherMod.Matcher
import typings.autolinker.matcherMatcherMod.MatcherConfig
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mentionMatcherMod {
  
  @JSImport("autolinker/dist/commonjs/matcher/mention-matcher", "MentionMatcher")
  @js.native
  class MentionMatcher protected () extends Matcher {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match instance,
      *   specified in an Object (map).
      */
    def this(cfg: MentionMatcherConfig) = this()
    
    /**
      * Hash of regular expression to match username handles. Example match:
      *
      *     @asdf
      *
      * @private
      * @property {Object} matcherRegexes
      */
    /* protected */ val matcherRegexes: StringDictionary[RegExp] = js.native
    
    /**
      * The regular expression to use to check the character before a username match to
      * make sure we didn't accidentally match an email address.
      *
      * For example, the string "asdf@asdf.com" should not match "@asdf" as a username.
      *
      * @private
      * @property {RegExp} nonWordCharRegex
      */
    /* protected */ val nonWordCharRegex: RegExp = js.native
    
    /**
      * @cfg {'twitter'/'instagram'/'soundcloud'} protected
      *
      * The name of service to link @mentions to.
      *
      * Valid values are: 'twitter', 'instagram', or 'soundcloud'
      */
    /* protected */ var serviceName: MentionServices = js.native
  }
  
  trait MentionMatcherConfig
    extends StObject
       with MatcherConfig {
    
    var serviceName: MentionServices
  }
  object MentionMatcherConfig {
    
    inline def apply(serviceName: MentionServices, tagBuilder: AnchorTagBuilder): MentionMatcherConfig = {
      val __obj = js.Dynamic.literal(serviceName = serviceName.asInstanceOf[js.Any], tagBuilder = tagBuilder.asInstanceOf[js.Any])
      __obj.asInstanceOf[MentionMatcherConfig]
    }
    
    extension [Self <: MentionMatcherConfig](x: Self) {
      
      inline def setServiceName(value: MentionServices): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    }
  }
}
