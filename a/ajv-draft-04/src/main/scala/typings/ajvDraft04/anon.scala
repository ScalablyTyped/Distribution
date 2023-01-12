package typings.ajvDraft04

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Comparison extends StObject {
    
    var comparison: typings.ajvDraft04.distVocabularyValidationLimitNumberMod.Comparison
    
    var limit: Double
  }
  object Comparison {
    
    inline def apply(comparison: typings.ajvDraft04.distVocabularyValidationLimitNumberMod.Comparison, limit: Double): Comparison = {
      val __obj = js.Dynamic.literal(comparison = comparison.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any])
      __obj.asInstanceOf[Comparison]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Comparison] (val x: Self) extends AnyVal {
      
      inline def setComparison(value: typings.ajvDraft04.distVocabularyValidationLimitNumberMod.Comparison): Self = StObject.set(x, "comparison", value.asInstanceOf[js.Any])
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data extends StObject {
    
    @JSName("$data")
    var $data: String
  }
  object Data {
    
    inline def apply($data: String): Data = {
      val __obj = js.Dynamic.literal($data = $data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      inline def set$data(value: String): Self = StObject.set(x, "$data", value.asInstanceOf[js.Any])
    }
  }
  
  trait Limit extends StObject {
    
    var limit: Double
  }
  object Limit {
    
    inline def apply(limit: Double): Limit = {
      val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any])
      __obj.asInstanceOf[Limit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Limit] (val x: Self) extends AnyVal {
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    }
  }
}
