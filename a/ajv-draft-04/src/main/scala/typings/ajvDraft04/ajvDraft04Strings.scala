package typings.ajvDraft04

import typings.ajvDraft04.distVocabularyValidationLimitNumberMod.Comparison
import typings.ajvDraft04.distVocabularyValidationLimitNumberMod.ExclusiveLimitKwd
import typings.ajvDraft04.distVocabularyValidationLimitNumberMod.LimitKwd
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ajvDraft04Strings {
  
  @js.native
  sealed trait Greaterthansign
    extends StObject
       with Comparison
  inline def Greaterthansign: Greaterthansign = ">".asInstanceOf[Greaterthansign]
  
  @js.native
  sealed trait GreaterthansignEqualssign
    extends StObject
       with Comparison
  inline def GreaterthansignEqualssign: GreaterthansignEqualssign = ">=".asInstanceOf[GreaterthansignEqualssign]
  
  @js.native
  sealed trait Lessthansign
    extends StObject
       with Comparison
  inline def Lessthansign: Lessthansign = "<".asInstanceOf[Lessthansign]
  
  @js.native
  sealed trait LessthansignEqualssign
    extends StObject
       with Comparison
  inline def LessthansignEqualssign: LessthansignEqualssign = "<=".asInstanceOf[LessthansignEqualssign]
  
  @js.native
  sealed trait exclusiveMaximum
    extends StObject
       with ExclusiveLimitKwd
  inline def exclusiveMaximum: exclusiveMaximum = "exclusiveMaximum".asInstanceOf[exclusiveMaximum]
  
  @js.native
  sealed trait exclusiveMinimum
    extends StObject
       with ExclusiveLimitKwd
  inline def exclusiveMinimum: exclusiveMinimum = "exclusiveMinimum".asInstanceOf[exclusiveMinimum]
  
  @js.native
  sealed trait maxItems extends StObject
  inline def maxItems: maxItems = "maxItems".asInstanceOf[maxItems]
  
  @js.native
  sealed trait maxLength extends StObject
  inline def maxLength: maxLength = "maxLength".asInstanceOf[maxLength]
  
  @js.native
  sealed trait maxProperties extends StObject
  inline def maxProperties: maxProperties = "maxProperties".asInstanceOf[maxProperties]
  
  @js.native
  sealed trait maximum
    extends StObject
       with LimitKwd
  inline def maximum: maximum = "maximum".asInstanceOf[maximum]
  
  @js.native
  sealed trait minItems extends StObject
  inline def minItems: minItems = "minItems".asInstanceOf[minItems]
  
  @js.native
  sealed trait minLength extends StObject
  inline def minLength: minLength = "minLength".asInstanceOf[minLength]
  
  @js.native
  sealed trait minProperties extends StObject
  inline def minProperties: minProperties = "minProperties".asInstanceOf[minProperties]
  
  @js.native
  sealed trait minimum
    extends StObject
       with LimitKwd
  inline def minimum: minimum = "minimum".asInstanceOf[minimum]
}
