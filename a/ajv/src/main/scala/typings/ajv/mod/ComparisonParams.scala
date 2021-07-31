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
  
  @scala.inline
  def apply(comparison: String, exclusive: Boolean, limit: Double | String): ComparisonParams = {
    val __obj = js.Dynamic.literal(comparison = comparison.asInstanceOf[js.Any], exclusive = exclusive.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComparisonParams]
  }
  
  @scala.inline
  implicit class ComparisonParamsMutableBuilder[Self <: ComparisonParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComparison(value: String): Self = StObject.set(x, "comparison", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimit(value: Double | String): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
  }
}
