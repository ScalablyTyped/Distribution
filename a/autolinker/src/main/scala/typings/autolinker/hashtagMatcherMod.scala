package typings.autolinker

import typings.autolinker.anchorTagBuilderMod.AnchorTagBuilder
import typings.autolinker.autolinkerMod.HashtagServices
import typings.autolinker.matcherMatcherMod.Matcher
import typings.autolinker.matcherMatcherMod.MatcherConfig
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hashtagMatcherMod {
  
  @JSImport("autolinker/dist/commonjs/matcher/hashtag-matcher", "HashtagMatcher")
  @js.native
  class HashtagMatcher protected () extends Matcher {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match instance,
      *   specified in an Object (map).
      */
    def this(cfg: HashtagMatcherConfig) = this()
    
    /**
      * The regular expression to match Hashtags. Example match:
      *
      *     #asdf
      *
      * @protected
      * @property {RegExp} matcherRegex
      */
    var matcherRegex: RegExp = js.native
    
    /**
      * The regular expression to use to check the character before a username match to
      * make sure we didn't accidentally match an email address.
      *
      * For example, the string "asdf@asdf.com" should not match "@asdf" as a username.
      *
      * @protected
      * @property {RegExp} nonWordCharRegex
      */
    var nonWordCharRegex: RegExp = js.native
    
    /**
      * @cfg {String} serviceName
      *
      * The service to point hashtag matches to. See {@link Autolinker#hashtag}
      * for available values.
      */
    val serviceName: HashtagServices = js.native
  }
  
  trait HashtagMatcherConfig
    extends StObject
       with MatcherConfig {
    
    var serviceName: HashtagServices
  }
  object HashtagMatcherConfig {
    
    @scala.inline
    def apply(serviceName: HashtagServices, tagBuilder: AnchorTagBuilder): HashtagMatcherConfig = {
      val __obj = js.Dynamic.literal(serviceName = serviceName.asInstanceOf[js.Any], tagBuilder = tagBuilder.asInstanceOf[js.Any])
      __obj.asInstanceOf[HashtagMatcherConfig]
    }
    
    @scala.inline
    implicit class HashtagMatcherConfigMutableBuilder[Self <: HashtagMatcherConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setServiceName(value: HashtagServices): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    }
  }
}
