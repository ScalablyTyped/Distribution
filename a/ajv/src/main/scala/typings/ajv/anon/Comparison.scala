package typings.ajv.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Comparison extends StObject {
  
  var comparison: typings.ajv.distVocabulariesValidationLimitNumberMod.Comparison
  
  var limit: Double
}
object Comparison {
  
  inline def apply(comparison: typings.ajv.distVocabulariesValidationLimitNumberMod.Comparison, limit: Double): Comparison = {
    val __obj = js.Dynamic.literal(comparison = comparison.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comparison]
  }
  
  extension [Self <: Comparison](x: Self) {
    
    inline def setComparison(value: typings.ajv.distVocabulariesValidationLimitNumberMod.Comparison): Self = StObject.set(x, "comparison", value.asInstanceOf[js.Any])
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
  }
}
