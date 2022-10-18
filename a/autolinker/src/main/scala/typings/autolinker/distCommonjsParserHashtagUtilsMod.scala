package typings.autolinker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsParserHashtagUtilsMod {
  
  @JSImport("autolinker/dist/commonjs/parser/hashtag-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("autolinker/dist/commonjs/parser/hashtag-utils", "hashtagServices")
  @js.native
  val hashtagServices: js.Array[HashtagService] = js.native
  
  inline def isHashtagTextChar(char: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHashtagTextChar")(char.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidHashtag(hashtag: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidHashtag")(hashtag.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typings.autolinker.autolinkerStrings.twitter
    - typings.autolinker.autolinkerStrings.facebook
    - typings.autolinker.autolinkerStrings.instagram
    - typings.autolinker.autolinkerStrings.tiktok
  */
  trait HashtagService extends StObject
  object HashtagService {
    
    inline def facebook: typings.autolinker.autolinkerStrings.facebook = "facebook".asInstanceOf[typings.autolinker.autolinkerStrings.facebook]
    
    inline def instagram: typings.autolinker.autolinkerStrings.instagram = "instagram".asInstanceOf[typings.autolinker.autolinkerStrings.instagram]
    
    inline def tiktok: typings.autolinker.autolinkerStrings.tiktok = "tiktok".asInstanceOf[typings.autolinker.autolinkerStrings.tiktok]
    
    inline def twitter: typings.autolinker.autolinkerStrings.twitter = "twitter".asInstanceOf[typings.autolinker.autolinkerStrings.twitter]
  }
}
