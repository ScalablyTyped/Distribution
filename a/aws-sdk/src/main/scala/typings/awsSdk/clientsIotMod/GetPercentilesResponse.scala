package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPercentilesResponse extends StObject {
  
  /**
    * The percentile values of the aggregated fields.
    */
  var percentiles: js.UndefOr[Percentiles] = js.undefined
}
object GetPercentilesResponse {
  
  inline def apply(): GetPercentilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPercentilesResponse]
  }
  
  extension [Self <: GetPercentilesResponse](x: Self) {
    
    inline def setPercentiles(value: Percentiles): Self = StObject.set(x, "percentiles", value.asInstanceOf[js.Any])
    
    inline def setPercentilesUndefined: Self = StObject.set(x, "percentiles", js.undefined)
    
    inline def setPercentilesVarargs(value: PercentPair*): Self = StObject.set(x, "percentiles", js.Array(value*))
  }
}
