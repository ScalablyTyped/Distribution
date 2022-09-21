package typings.ajvFormats

import org.scalablytyped.runtime.Shortcut
import typings.ajv.coreMod.Plugin
import typings.ajv.distTypesMod.CodeKeywordDefinition
import typings.ajv.distTypesMod.ErrorObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object limitMod extends Shortcut {
  
  @JSImport("ajv-formats/dist/limit", JSImport.Default)
  @js.native
  val default: Plugin[Unit] = js.native
  
  @JSImport("ajv-formats/dist/limit", "formatLimitDefinition")
  @js.native
  val formatLimitDefinition: CodeKeywordDefinition = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.ajvFormats.ajvFormatsStrings.LessthansignEqualssign
    - typings.ajvFormats.ajvFormatsStrings.GreaterthansignEqualssign
    - typings.ajvFormats.ajvFormatsStrings.Lessthansign
    - typings.ajvFormats.ajvFormatsStrings.Greaterthansign
  */
  trait Comparison extends StObject
  object Comparison {
    
    inline def Greaterthansign: typings.ajvFormats.ajvFormatsStrings.Greaterthansign = ">".asInstanceOf[typings.ajvFormats.ajvFormatsStrings.Greaterthansign]
    
    inline def GreaterthansignEqualssign: typings.ajvFormats.ajvFormatsStrings.GreaterthansignEqualssign = ">=".asInstanceOf[typings.ajvFormats.ajvFormatsStrings.GreaterthansignEqualssign]
    
    inline def Lessthansign: typings.ajvFormats.ajvFormatsStrings.Lessthansign = "<".asInstanceOf[typings.ajvFormats.ajvFormatsStrings.Lessthansign]
    
    inline def LessthansignEqualssign: typings.ajvFormats.ajvFormatsStrings.LessthansignEqualssign = "<=".asInstanceOf[typings.ajvFormats.ajvFormatsStrings.LessthansignEqualssign]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ajvFormats.ajvFormatsStrings.formatMaximum
    - typings.ajvFormats.ajvFormatsStrings.formatMinimum
    - typings.ajvFormats.ajvFormatsStrings.formatExclusiveMaximum
    - typings.ajvFormats.ajvFormatsStrings.formatExclusiveMinimum
  */
  trait Kwd extends StObject
  object Kwd {
    
    inline def formatExclusiveMaximum: typings.ajvFormats.ajvFormatsStrings.formatExclusiveMaximum = "formatExclusiveMaximum".asInstanceOf[typings.ajvFormats.ajvFormatsStrings.formatExclusiveMaximum]
    
    inline def formatExclusiveMinimum: typings.ajvFormats.ajvFormatsStrings.formatExclusiveMinimum = "formatExclusiveMinimum".asInstanceOf[typings.ajvFormats.ajvFormatsStrings.formatExclusiveMinimum]
    
    inline def formatMaximum: typings.ajvFormats.ajvFormatsStrings.formatMaximum = "formatMaximum".asInstanceOf[typings.ajvFormats.ajvFormatsStrings.formatMaximum]
    
    inline def formatMinimum: typings.ajvFormats.ajvFormatsStrings.formatMinimum = "formatMinimum".asInstanceOf[typings.ajvFormats.ajvFormatsStrings.formatMinimum]
  }
  
  type LimitFormatError = ErrorObject[Kwd, typings.ajvFormats.anon.Comparison, Any]
  
  type _To = Plugin[Unit]
  
  /* This means you don't have to write `default`, but can instead just say `limitMod.foo` */
  override def _to: Plugin[Unit] = default
}
