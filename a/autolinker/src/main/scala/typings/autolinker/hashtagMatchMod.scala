package typings.autolinker

import typings.autolinker.abstractMatchMod.AbstractMatch
import typings.autolinker.abstractMatchMod.AbstractMatchConfig
import typings.autolinker.anchorTagBuilderMod.AnchorTagBuilder
import typings.autolinker.hashtagUtilsMod.HashtagService
import typings.autolinker.matchMatchMod.Match
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hashtagMatchMod {
  
  @JSImport("autolinker/dist/commonjs/match/hashtag-match", "HashtagMatch")
  @js.native
  open class HashtagMatch protected ()
    extends AbstractMatch
       with Match {
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
    def getServiceName(): HashtagService = js.native
    
    /**
      * @cfg {String} hashtag (required)
      *
      * The HashtagMatch that was matched, without the '#'.
      */
    /* private */ val hashtag: Any = js.native
    
    /**
      * @cfg {String} serviceName
      *
      * The service to point hashtag matches to. See {@link Autolinker#hashtag}
      * for available values.
      */
    /* private */ val serviceName: Any = js.native
    
    /**
      * @public
      * @property {'hashtag'} type
      *
      * A string name for the type of match that this class represents. Can be
      * used in a TypeScript discriminating union to type-narrow from the
      * `Match` type.
      */
    @JSName("type")
    val type_HashtagMatch: typings.autolinker.autolinkerStrings.hashtag = js.native
  }
  
  trait HashtagMatchConfig
    extends StObject
       with AbstractMatchConfig {
    
    var hashtag: String
    
    var serviceName: HashtagService
  }
  object HashtagMatchConfig {
    
    inline def apply(
      hashtag: String,
      matchedText: String,
      offset: Double,
      serviceName: HashtagService,
      tagBuilder: AnchorTagBuilder
    ): HashtagMatchConfig = {
      val __obj = js.Dynamic.literal(hashtag = hashtag.asInstanceOf[js.Any], matchedText = matchedText.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], tagBuilder = tagBuilder.asInstanceOf[js.Any])
      __obj.asInstanceOf[HashtagMatchConfig]
    }
    
    extension [Self <: HashtagMatchConfig](x: Self) {
      
      inline def setHashtag(value: String): Self = StObject.set(x, "hashtag", value.asInstanceOf[js.Any])
      
      inline def setServiceName(value: HashtagService): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    }
  }
}
