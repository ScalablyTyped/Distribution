package typings.autolinker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mentionUtilsMod {
  
  @JSImport("autolinker/dist/commonjs/parser/mention-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isMentionTextChar(char: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMentionTextChar")(char.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidMention(mention: String, serviceName: MentionService): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidMention")(mention.asInstanceOf[js.Any], serviceName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("autolinker/dist/commonjs/parser/mention-utils", "mentionServices")
  @js.native
  val mentionServices: js.Array[MentionService] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.autolinker.autolinkerStrings.twitter
    - typings.autolinker.autolinkerStrings.instagram
    - typings.autolinker.autolinkerStrings.soundcloud
    - typings.autolinker.autolinkerStrings.tiktok
  */
  trait MentionService extends StObject
  object MentionService {
    
    inline def instagram: typings.autolinker.autolinkerStrings.instagram = "instagram".asInstanceOf[typings.autolinker.autolinkerStrings.instagram]
    
    inline def soundcloud: typings.autolinker.autolinkerStrings.soundcloud = "soundcloud".asInstanceOf[typings.autolinker.autolinkerStrings.soundcloud]
    
    inline def tiktok: typings.autolinker.autolinkerStrings.tiktok = "tiktok".asInstanceOf[typings.autolinker.autolinkerStrings.tiktok]
    
    inline def twitter: typings.autolinker.autolinkerStrings.twitter = "twitter".asInstanceOf[typings.autolinker.autolinkerStrings.twitter]
  }
}
