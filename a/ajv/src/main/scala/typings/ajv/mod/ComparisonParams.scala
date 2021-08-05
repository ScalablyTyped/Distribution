package typings.ajv.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComparisonParams
  extends StObject
     with ErrorParameters {
  
  var comparison: String
  
  var exclusive: Boolean
  
  var limit: Double | String
}
object ComparisonParams {
  
  inline def apply(comparison: String, exclusive: Boolean, limit: Double | String): ComparisonParams = {
    val __obj = js.Dynamic.literal(comparison = comparison.asInstanceOf[js.Any], exclusive = exclusive.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComparisonParams]
  }
  
  extension [Self <: ComparisonParams](x: Self) {
    
    inline def setComparison(value: String): Self = StObject.set(x, "comparison", value.asInstanceOf[js.Any])
    
    inline def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
    
    inline def setLimit(value: Double | String): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
  }
}
