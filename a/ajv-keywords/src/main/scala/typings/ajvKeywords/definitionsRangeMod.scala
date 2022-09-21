package typings.ajvKeywords

import typings.ajv.distTypesMod.MacroKeywordDefinition
import typings.ajvKeywords.typesMod.GetDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object definitionsRangeMod {
  
  @JSImport("ajv-keywords/dist/definitions/_range", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(keyword: RangeKwd): GetDefinition[MacroKeywordDefinition] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(keyword.asInstanceOf[js.Any]).asInstanceOf[GetDefinition[MacroKeywordDefinition]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.ajvKeywords.ajvKeywordsStrings.range
    - typings.ajvKeywords.ajvKeywordsStrings.exclusiveRange
  */
  trait RangeKwd extends StObject
  object RangeKwd {
    
    inline def exclusiveRange: typings.ajvKeywords.ajvKeywordsStrings.exclusiveRange = "exclusiveRange".asInstanceOf[typings.ajvKeywords.ajvKeywordsStrings.exclusiveRange]
    
    inline def range: typings.ajvKeywords.ajvKeywordsStrings.range = "range".asInstanceOf[typings.ajvKeywords.ajvKeywordsStrings.range]
  }
}
