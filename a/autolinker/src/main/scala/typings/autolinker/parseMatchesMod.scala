package typings.autolinker

import typings.autolinker.anchorTagBuilderMod.AnchorTagBuilder
import typings.autolinker.anon.RequiredStripPrefixConfig
import typings.autolinker.hashtagUtilsMod.HashtagService
import typings.autolinker.matchMatchMod.Match
import typings.autolinker.mentionUtilsMod.MentionService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseMatchesMod {
  
  @JSImport("autolinker/dist/commonjs/parser/parse-matches", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def excludeUnbalancedTrailingBracesAndPunctuation(matchedText: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("excludeUnbalancedTrailingBracesAndPunctuation")(matchedText.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parseMatches(text: String, args: ParseMatchesArgs): js.Array[Match] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMatches")(text.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Array[Match]]
  
  trait ParseMatchesArgs extends StObject {
    
    var decodePercentEncoding: Boolean
    
    var hashtagServiceName: HashtagService
    
    var mentionServiceName: MentionService
    
    var stripPrefix: RequiredStripPrefixConfig
    
    var stripTrailingSlash: Boolean
    
    var tagBuilder: AnchorTagBuilder
  }
  object ParseMatchesArgs {
    
    inline def apply(
      decodePercentEncoding: Boolean,
      hashtagServiceName: HashtagService,
      mentionServiceName: MentionService,
      stripPrefix: RequiredStripPrefixConfig,
      stripTrailingSlash: Boolean,
      tagBuilder: AnchorTagBuilder
    ): ParseMatchesArgs = {
      val __obj = js.Dynamic.literal(decodePercentEncoding = decodePercentEncoding.asInstanceOf[js.Any], hashtagServiceName = hashtagServiceName.asInstanceOf[js.Any], mentionServiceName = mentionServiceName.asInstanceOf[js.Any], stripPrefix = stripPrefix.asInstanceOf[js.Any], stripTrailingSlash = stripTrailingSlash.asInstanceOf[js.Any], tagBuilder = tagBuilder.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseMatchesArgs]
    }
    
    extension [Self <: ParseMatchesArgs](x: Self) {
      
      inline def setDecodePercentEncoding(value: Boolean): Self = StObject.set(x, "decodePercentEncoding", value.asInstanceOf[js.Any])
      
      inline def setHashtagServiceName(value: HashtagService): Self = StObject.set(x, "hashtagServiceName", value.asInstanceOf[js.Any])
      
      inline def setMentionServiceName(value: MentionService): Self = StObject.set(x, "mentionServiceName", value.asInstanceOf[js.Any])
      
      inline def setStripPrefix(value: RequiredStripPrefixConfig): Self = StObject.set(x, "stripPrefix", value.asInstanceOf[js.Any])
      
      inline def setStripTrailingSlash(value: Boolean): Self = StObject.set(x, "stripTrailingSlash", value.asInstanceOf[js.Any])
      
      inline def setTagBuilder(value: AnchorTagBuilder): Self = StObject.set(x, "tagBuilder", value.asInstanceOf[js.Any])
    }
  }
}
