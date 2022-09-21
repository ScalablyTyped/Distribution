package typings.ajvKeywords

import typings.ajv.distTypesMod.MacroKeywordDefinition
import typings.ajvKeywords.typesMod.GetDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requiredMod {
  
  @JSImport("ajv-keywords/dist/definitions/_required", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(keyword: RequiredKwd): GetDefinition[MacroKeywordDefinition] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(keyword.asInstanceOf[js.Any]).asInstanceOf[GetDefinition[MacroKeywordDefinition]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.ajvKeywords.ajvKeywordsStrings.anyRequired
    - typings.ajvKeywords.ajvKeywordsStrings.oneRequired
  */
  trait RequiredKwd extends StObject
  object RequiredKwd {
    
    inline def anyRequired: typings.ajvKeywords.ajvKeywordsStrings.anyRequired = "anyRequired".asInstanceOf[typings.ajvKeywords.ajvKeywordsStrings.anyRequired]
    
    inline def oneRequired: typings.ajvKeywords.ajvKeywordsStrings.oneRequired = "oneRequired".asInstanceOf[typings.ajvKeywords.ajvKeywordsStrings.oneRequired]
  }
}
