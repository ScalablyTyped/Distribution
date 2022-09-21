package typings.ajvFormats

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Comparison extends StObject {
    
    var comparison: typings.ajvFormats.limitMod.Comparison
    
    var limit: String
  }
  object Comparison {
    
    inline def apply(comparison: typings.ajvFormats.limitMod.Comparison, limit: String): Comparison = {
      val __obj = js.Dynamic.literal(comparison = comparison.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any])
      __obj.asInstanceOf[Comparison]
    }
    
    extension [Self <: Comparison](x: Self) {
      
      inline def setComparison(value: typings.ajvFormats.limitMod.Comparison): Self = StObject.set(x, "comparison", value.asInstanceOf[js.Any])
      
      inline def setLimit(value: String): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    }
  }
}
