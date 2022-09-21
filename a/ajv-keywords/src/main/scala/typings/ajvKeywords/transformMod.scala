package typings.ajvKeywords

import org.scalablytyped.runtime.Shortcut
import typings.ajv.distTypesMod.CodeKeywordDefinition
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformMod extends Shortcut {
  
  @JSImport("ajv-keywords/dist/definitions/transform", JSImport.Default)
  @js.native
  val default: js.Function0[CodeKeywordDefinition] & typings.ajvKeywords.anon.Transform = js.native
  
  type Transform = js.Function2[/* s */ String, /* cfg */ js.UndefOr[TransformConfig], String]
  
  trait TransformConfig extends StObject {
    
    var hash: Record[String, js.UndefOr[String]]
  }
  object TransformConfig {
    
    inline def apply(hash: Record[String, js.UndefOr[String]]): TransformConfig = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransformConfig]
    }
    
    extension [Self <: TransformConfig](x: Self) {
      
      inline def setHash(value: Record[String, js.UndefOr[String]]): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ajvKeywords.ajvKeywordsStrings.trimStart
    - typings.ajvKeywords.ajvKeywordsStrings.trimEnd
    - typings.ajvKeywords.ajvKeywordsStrings.trimLeft
    - typings.ajvKeywords.ajvKeywordsStrings.trimRight
    - typings.ajvKeywords.ajvKeywordsStrings.trim
    - typings.ajvKeywords.ajvKeywordsStrings.toLowerCase
    - typings.ajvKeywords.ajvKeywordsStrings.toUpperCase
    - typings.ajvKeywords.ajvKeywordsStrings.toEnumCase
  */
  trait TransformName extends StObject
  object TransformName {
    
    inline def toEnumCase: typings.ajvKeywords.ajvKeywordsStrings.toEnumCase = "toEnumCase".asInstanceOf[typings.ajvKeywords.ajvKeywordsStrings.toEnumCase]
    
    inline def toLowerCase: typings.ajvKeywords.ajvKeywordsStrings.toLowerCase = "toLowerCase".asInstanceOf[typings.ajvKeywords.ajvKeywordsStrings.toLowerCase]
    
    inline def toUpperCase: typings.ajvKeywords.ajvKeywordsStrings.toUpperCase = "toUpperCase".asInstanceOf[typings.ajvKeywords.ajvKeywordsStrings.toUpperCase]
    
    inline def trim: typings.ajvKeywords.ajvKeywordsStrings.trim = "trim".asInstanceOf[typings.ajvKeywords.ajvKeywordsStrings.trim]
    
    inline def trimEnd: typings.ajvKeywords.ajvKeywordsStrings.trimEnd = "trimEnd".asInstanceOf[typings.ajvKeywords.ajvKeywordsStrings.trimEnd]
    
    inline def trimLeft: typings.ajvKeywords.ajvKeywordsStrings.trimLeft = "trimLeft".asInstanceOf[typings.ajvKeywords.ajvKeywordsStrings.trimLeft]
    
    inline def trimRight: typings.ajvKeywords.ajvKeywordsStrings.trimRight = "trimRight".asInstanceOf[typings.ajvKeywords.ajvKeywordsStrings.trimRight]
    
    inline def trimStart: typings.ajvKeywords.ajvKeywordsStrings.trimStart = "trimStart".asInstanceOf[typings.ajvKeywords.ajvKeywordsStrings.trimStart]
  }
  
  type _To = js.Function0[CodeKeywordDefinition] & typings.ajvKeywords.anon.Transform
  
  /* This means you don't have to write `default`, but can instead just say `transformMod.foo` */
  override def _to: js.Function0[CodeKeywordDefinition] & typings.ajvKeywords.anon.Transform = default
}
