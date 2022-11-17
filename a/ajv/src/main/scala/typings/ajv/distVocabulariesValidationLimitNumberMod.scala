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
  
  object Comparison {
    
    inline def Greaterthansign: ">" = ">".asInstanceOf[">"]
    
    inline def GreaterthansignEqualssign: ">=" = ">=".asInstanceOf[">="]
    
    inline def Lessthansign: "<" = "<".asInstanceOf["<"]
    
    inline def LessthansignEqualssign: "<=" = "<=".asInstanceOf["<="]
  }
  type Comparison = "<=" | ">=" | "<" | ">"
  
  object Kwd {
    
    inline def exclusiveMaximum: "exclusiveMaximum" = "exclusiveMaximum".asInstanceOf["exclusiveMaximum"]
    
    inline def exclusiveMinimum: "exclusiveMinimum" = "exclusiveMinimum".asInstanceOf["exclusiveMinimum"]
    
    inline def maximum: "maximum" = "maximum".asInstanceOf["maximum"]
    
    inline def minimum: "minimum" = "minimum".asInstanceOf["minimum"]
  }
  type Kwd = "maximum" | "minimum" | "exclusiveMaximum" | "exclusiveMinimum"
  
  type LimitNumberError = ErrorObject[Kwd, typings.ajv.anon.Comparison, Double | Data]
  
  type _To = CodeKeywordDefinition
  
  /* This means you don't have to write `default`, but can instead just say `distVocabulariesValidationLimitNumberMod.foo` */
  override def _to: CodeKeywordDefinition = default
}
