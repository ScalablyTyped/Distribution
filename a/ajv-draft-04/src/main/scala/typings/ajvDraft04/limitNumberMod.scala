package typings.ajvDraft04

import org.scalablytyped.runtime.Shortcut
import typings.ajv.distTypesMod.CodeKeywordDefinition
import typings.ajv.distTypesMod.ErrorObject
import typings.ajvDraft04.anon.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object limitNumberMod extends Shortcut {
  
  @JSImport("ajv-draft-04/dist/vocabulary/validation/limitNumber", JSImport.Default)
  @js.native
  val default: CodeKeywordDefinition = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.ajvDraft04.ajvDraft04Strings.LessthansignEqualssign
    - typings.ajvDraft04.ajvDraft04Strings.GreaterthansignEqualssign
    - typings.ajvDraft04.ajvDraft04Strings.Lessthansign
    - typings.ajvDraft04.ajvDraft04Strings.Greaterthansign
  */
  trait Comparison extends StObject
  object Comparison {
    
    inline def Greaterthansign: typings.ajvDraft04.ajvDraft04Strings.Greaterthansign = ">".asInstanceOf[typings.ajvDraft04.ajvDraft04Strings.Greaterthansign]
    
    inline def GreaterthansignEqualssign: typings.ajvDraft04.ajvDraft04Strings.GreaterthansignEqualssign = ">=".asInstanceOf[typings.ajvDraft04.ajvDraft04Strings.GreaterthansignEqualssign]
    
    inline def Lessthansign: typings.ajvDraft04.ajvDraft04Strings.Lessthansign = "<".asInstanceOf[typings.ajvDraft04.ajvDraft04Strings.Lessthansign]
    
    inline def LessthansignEqualssign: typings.ajvDraft04.ajvDraft04Strings.LessthansignEqualssign = "<=".asInstanceOf[typings.ajvDraft04.ajvDraft04Strings.LessthansignEqualssign]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ajvDraft04.ajvDraft04Strings.exclusiveMaximum
    - typings.ajvDraft04.ajvDraft04Strings.exclusiveMinimum
  */
  trait ExclusiveLimitKwd extends StObject
  object ExclusiveLimitKwd {
    
    inline def exclusiveMaximum: typings.ajvDraft04.ajvDraft04Strings.exclusiveMaximum = "exclusiveMaximum".asInstanceOf[typings.ajvDraft04.ajvDraft04Strings.exclusiveMaximum]
    
    inline def exclusiveMinimum: typings.ajvDraft04.ajvDraft04Strings.exclusiveMinimum = "exclusiveMinimum".asInstanceOf[typings.ajvDraft04.ajvDraft04Strings.exclusiveMinimum]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ajvDraft04.ajvDraft04Strings.maximum
    - typings.ajvDraft04.ajvDraft04Strings.minimum
  */
  trait LimitKwd extends StObject
  object LimitKwd {
    
    inline def maximum: typings.ajvDraft04.ajvDraft04Strings.maximum = "maximum".asInstanceOf[typings.ajvDraft04.ajvDraft04Strings.maximum]
    
    inline def minimum: typings.ajvDraft04.ajvDraft04Strings.minimum = "minimum".asInstanceOf[typings.ajvDraft04.ajvDraft04Strings.minimum]
  }
  
  type LimitNumberError = ErrorObject[LimitKwd, typings.ajvDraft04.anon.Comparison, Double | Data]
  
  type _To = CodeKeywordDefinition
  
  /* This means you don't have to write `default`, but can instead just say `limitNumberMod.foo` */
  override def _to: CodeKeywordDefinition = default
}
