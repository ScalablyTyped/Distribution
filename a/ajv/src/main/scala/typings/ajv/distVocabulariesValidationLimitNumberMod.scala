package typings.ajv

import org.scalablytyped.runtime.Shortcut
import typings.ajv.anon.Data
import typings.ajv.distTypesMod.CodeKeywordDefinition
import typings.ajv.distTypesMod.ErrorObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVocabulariesValidationLimitNumberMod extends Shortcut {
  
  @JSImport("ajv/dist/vocabularies/validation/limitNumber", JSImport.Default)
  @js.native
  val default: CodeKeywordDefinition = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.ajv.ajvStrings.LessthansignEqualssign
    - typings.ajv.ajvStrings.GreaterthansignEqualssign
    - typings.ajv.ajvStrings.Lessthansign
    - typings.ajv.ajvStrings.Greaterthansign
  */
  trait Comparison extends StObject
  object Comparison {
    
    inline def Greaterthansign: typings.ajv.ajvStrings.Greaterthansign = ">".asInstanceOf[typings.ajv.ajvStrings.Greaterthansign]
    
    inline def GreaterthansignEqualssign: typings.ajv.ajvStrings.GreaterthansignEqualssign = ">=".asInstanceOf[typings.ajv.ajvStrings.GreaterthansignEqualssign]
    
    inline def Lessthansign: typings.ajv.ajvStrings.Lessthansign = "<".asInstanceOf[typings.ajv.ajvStrings.Lessthansign]
    
    inline def LessthansignEqualssign: typings.ajv.ajvStrings.LessthansignEqualssign = "<=".asInstanceOf[typings.ajv.ajvStrings.LessthansignEqualssign]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ajv.ajvStrings.maximum
    - typings.ajv.ajvStrings.minimum
    - typings.ajv.ajvStrings.exclusiveMaximum
    - typings.ajv.ajvStrings.exclusiveMinimum
  */
  trait Kwd extends StObject
  object Kwd {
    
    inline def exclusiveMaximum: typings.ajv.ajvStrings.exclusiveMaximum = "exclusiveMaximum".asInstanceOf[typings.ajv.ajvStrings.exclusiveMaximum]
    
    inline def exclusiveMinimum: typings.ajv.ajvStrings.exclusiveMinimum = "exclusiveMinimum".asInstanceOf[typings.ajv.ajvStrings.exclusiveMinimum]
    
    inline def maximum: typings.ajv.ajvStrings.maximum = "maximum".asInstanceOf[typings.ajv.ajvStrings.maximum]
    
    inline def minimum: typings.ajv.ajvStrings.minimum = "minimum".asInstanceOf[typings.ajv.ajvStrings.minimum]
  }
  
  type LimitNumberError = ErrorObject[Kwd, typings.ajv.anon.Comparison, Double | Data]
  
  type _To = CodeKeywordDefinition
  
  /* This means you don't have to write `default`, but can instead just say `distVocabulariesValidationLimitNumberMod.foo` */
  override def _to: CodeKeywordDefinition = default
}
