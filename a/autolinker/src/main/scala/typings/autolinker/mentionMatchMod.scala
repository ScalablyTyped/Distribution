package typings.autolinker

import typings.autolinker.abstractMatchMod.AbstractMatch
import typings.autolinker.abstractMatchMod.AbstractMatchConfig
import typings.autolinker.anchorTagBuilderMod.AnchorTagBuilder
import typings.autolinker.matchMatchMod.Match
import typings.autolinker.mentionUtilsMod.MentionService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mentionMatchMod {
  
  @JSImport("autolinker/dist/commonjs/match/mention-match", "MentionMatch")
  @js.native
  open class MentionMatch protected ()
    extends AbstractMatch
       with Match {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match
      *   instance, specified in an Object (map).
      */
    def this(cfg: MentionMatchConfig) = this()
    
    /**
      * Returns the mention, without the '@' character.
      *
      * @return {String}
      */
    def getMention(): String = js.native
    
    /**
      * Returns the configured {@link #serviceName} to point the mention to.
      * Ex: 'instagram', 'twitter', 'soundcloud'.
      *
      * @return {String}
      */
    def getServiceName(): MentionService = js.native
    
    /**
      * @cfg {String} mention (required)
      *
      * The Mention that was matched, without the '@' character.
      */
    /* private */ val mention: Any = js.native
    
    /**
      * @cfg {String} serviceName
      *
      * The service to point mention matches to. See {@link Autolinker#mention}
      * for available values.
      */
    /* private */ val serviceName: Any = js.native
    
    /**
      * @public
      * @property {'mention'} type
      *
      * A string name for the type of match that this class represents. Can be
      * used in a TypeScript discriminating union to type-narrow from the
      * `Match` type.
      */
    @JSName("type")
    val type_MentionMatch: typings.autolinker.autolinkerStrings.mention = js.native
  }
  
  trait MentionMatchConfig
    extends StObject
       with AbstractMatchConfig {
    
    var mention: String
    
    var serviceName: MentionService
  }
  object MentionMatchConfig {
    
    inline def apply(
      matchedText: String,
      mention: String,
      offset: Double,
      serviceName: MentionService,
      tagBuilder: AnchorTagBuilder
    ): MentionMatchConfig = {
      val __obj = js.Dynamic.literal(matchedText = matchedText.asInstanceOf[js.Any], mention = mention.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], tagBuilder = tagBuilder.asInstanceOf[js.Any])
      __obj.asInstanceOf[MentionMatchConfig]
    }
    
    extension [Self <: MentionMatchConfig](x: Self) {
      
      inline def setMention(value: String): Self = StObject.set(x, "mention", value.asInstanceOf[js.Any])
      
      inline def setServiceName(value: MentionService): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    }
  }
}
