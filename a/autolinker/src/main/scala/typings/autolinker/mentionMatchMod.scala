package typings.autolinker

import typings.autolinker.anchorTagBuilderMod.AnchorTagBuilder
import typings.autolinker.autolinkerMod.MentionServices
import typings.autolinker.matchMatchMod.Match
import typings.autolinker.matchMatchMod.MatchConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mentionMatchMod {
  
  @JSImport("autolinker/dist/commonjs/match/mention-match", "MentionMatch")
  @js.native
  class MentionMatch protected () extends Match {
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
    def getServiceName(): MentionServices = js.native
    
    /**
      * @cfg {String} mention (required)
      *
      * The Mention that was matched, without the '@' character.
      */
    val mention: js.Any = js.native
    
    /**
      * @cfg {String} serviceName
      *
      * The service to point mention matches to. See {@link Autolinker#mention}
      * for available values.
      */
    val serviceName: js.Any = js.native
  }
  
  trait MentionMatchConfig
    extends StObject
       with MatchConfig {
    
    var mention: String
    
    var serviceName: MentionServices
  }
  object MentionMatchConfig {
    
    @scala.inline
    def apply(
      matchedText: String,
      mention: String,
      offset: Double,
      serviceName: MentionServices,
      tagBuilder: AnchorTagBuilder
    ): MentionMatchConfig = {
      val __obj = js.Dynamic.literal(matchedText = matchedText.asInstanceOf[js.Any], mention = mention.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], tagBuilder = tagBuilder.asInstanceOf[js.Any])
      __obj.asInstanceOf[MentionMatchConfig]
    }
    
    @scala.inline
    implicit class MentionMatchConfigMutableBuilder[Self <: MentionMatchConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMention(value: String): Self = StObject.set(x, "mention", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceName(value: MentionServices): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    }
  }
}
