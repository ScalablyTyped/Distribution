package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberFilter extends StObject {
  
  /**
    * The lowest number to be included in the filter.
    */
  var lowerInclusive: js.UndefOr[Double] = js.undefined
  
  /**
    * The highest number to be included in the filter.
    */
  var upperInclusive: js.UndefOr[Double] = js.undefined
}
object NumberFilter {
  
  inline def apply(): NumberFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberFilter]
  }
  
  extension [Self <: NumberFilter](x: Self) {
    
    inline def setLowerInclusive(value: Double): Self = StObject.set(x, "lowerInclusive", value.asInstanceOf[js.Any])
    
    inline def setLowerInclusiveUndefined: Self = StObject.set(x, "lowerInclusive", js.undefined)
    
    inline def setUpperInclusive(value: Double): Self = StObject.set(x, "upperInclusive", value.asInstanceOf[js.Any])
    
    inline def setUpperInclusiveUndefined: Self = StObject.set(x, "upperInclusive", js.undefined)
  }
}
