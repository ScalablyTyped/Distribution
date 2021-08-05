package typings.autolinker

import typings.autolinker.anchorTagBuilderMod.AnchorTagBuilder
import typings.autolinker.matchMatchMod.Match
import typings.autolinker.matchMatchMod.MatchConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hashtagMatchMod {
  
  @JSImport("autolinker/dist/commonjs/match/hashtag-match", "HashtagMatch")
  @js.native
  class HashtagMatch protected () extends Match {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match
      *   instance, specified in an Object (map).
      */
    def this(cfg: HashtagMatchConfig) = this()
    
    /**
      * Returns the matched hashtag, without the '#' character.
      *
      * @return {String}
      */
    def getHashtag(): String = js.native
    
    /**
      * Returns the configured {@link #serviceName} to point the HashtagMatch to.
      * Ex: 'facebook', 'twitter'.
      *
      * @return {String}
      */
    def getServiceName(): String = js.native
    
    /**
      * @cfg {String} hashtag (required)
      *
      * The HashtagMatch that was matched, without the '#'.
      */
    /* private */ val hashtag: js.Any = js.native
    
    /**
      * @cfg {String} serviceName
      *
      * The service to point hashtag matches to. See {@link Autolinker#hashtag}
      * for available values.
      */
    /* private */ val serviceName: js.Any = js.native
  }
  
  trait HashtagMatchConfig
    extends StObject
       with MatchConfig {
    
    var hashtag: String
    
    var serviceName: String
  }
  object HashtagMatchConfig {
    
    inline def apply(
      hashtag: String,
      matchedText: String,
      offset: Double,
      serviceName: String,
      tagBuilder: AnchorTagBuilder
    ): HashtagMatchConfig = {
      val __obj = js.Dynamic.literal(hashtag = hashtag.asInstanceOf[js.Any], matchedText = matchedText.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], tagBuilder = tagBuilder.asInstanceOf[js.Any])
      __obj.asInstanceOf[HashtagMatchConfig]
    }
    
    extension [Self <: HashtagMatchConfig](x: Self) {
      
      inline def setHashtag(value: String): Self = StObject.set(x, "hashtag", value.asInstanceOf[js.Any])
      
      inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    }
  }
}
