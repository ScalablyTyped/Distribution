package typings.ajvKeywords

import typings.ajv.distTypesMod.CodeKeywordDefinition
import typings.ajv.distTypesMod.ErrorObject
import typings.ajvKeywords.ajvKeywordsStrings.patternRequired
import typings.ajvKeywords.anon.MissingPattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDefinitionsPatternRequiredMod {
  
  @JSImport("ajv-keywords/dist/definitions/patternRequired", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): CodeKeywordDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[CodeKeywordDefinition]
  
  type PatternRequiredError = ErrorObject[patternRequired, MissingPattern, Any]
}
