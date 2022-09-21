package typings.autolinker

import typings.autolinker.matchMatchMod.Match
import typings.autolinker.parseMatchesMod.ParseMatchesArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserMod {
  
  @JSImport("autolinker/dist/commonjs/parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def excludeUnbalancedTrailingBracesAndPunctuation(matchedText: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("excludeUnbalancedTrailingBracesAndPunctuation")(matchedText.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parseMatches(text: String, args: ParseMatchesArgs): js.Array[Match] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMatches")(text.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Array[Match]]
}
