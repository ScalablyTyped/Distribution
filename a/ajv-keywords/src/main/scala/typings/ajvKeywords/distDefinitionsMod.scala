package typings.ajvKeywords

import typings.ajv.distTypesMod.ErrorNoParams
import typings.ajv.distTypesMod.Vocabulary
import typings.ajvKeywords.ajvKeywordsStrings.allRequired
import typings.ajvKeywords.ajvKeywordsStrings.anyRequired
import typings.ajvKeywords.ajvKeywordsStrings.deepProperties
import typings.ajvKeywords.ajvKeywordsStrings.deepRequired
import typings.ajvKeywords.ajvKeywordsStrings.dynamicDefaults
import typings.ajvKeywords.ajvKeywordsStrings.exclusiveRange
import typings.ajvKeywords.ajvKeywordsStrings.instanceof
import typings.ajvKeywords.ajvKeywordsStrings.oneRequired
import typings.ajvKeywords.ajvKeywordsStrings.prohibited
import typings.ajvKeywords.ajvKeywordsStrings.range
import typings.ajvKeywords.ajvKeywordsStrings.regexp
import typings.ajvKeywords.ajvKeywordsStrings.transform
import typings.ajvKeywords.ajvKeywordsStrings.uniqueItemProperties
import typings.ajvKeywords.distDefinitionsPatternRequiredMod.PatternRequiredError
import typings.ajvKeywords.distDefinitionsSelectMod.SelectError
import typings.ajvKeywords.distDefinitionsTypesMod.DefinitionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDefinitionsMod {
  
  @JSImport("ajv-keywords/dist/definitions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Vocabulary = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Vocabulary]
  inline def default(opts: DefinitionOptions): Vocabulary = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(opts.asInstanceOf[js.Any]).asInstanceOf[Vocabulary]
  
  type AjvKeywordsError = PatternRequiredError | SelectError | (ErrorNoParams[
    range | exclusiveRange | anyRequired | oneRequired | allRequired | deepProperties | deepRequired | dynamicDefaults | instanceof | prohibited | regexp | transform | uniqueItemProperties, 
    Any
  ])
}
