package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOfferingStatusResult extends StObject {
  
  /**
    * When specified, gets the offering status for the current period.
    */
  var current: js.UndefOr[OfferingStatusMap] = js.undefined
  
  /**
    * When specified, gets the offering status for the next period.
    */
  var nextPeriod: js.UndefOr[OfferingStatusMap] = js.undefined
  
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object GetOfferingStatusResult {
  
  inline def apply(): GetOfferingStatusResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOfferingStatusResult]
  }
  
  extension [Self <: GetOfferingStatusResult](x: Self) {
    
    inline def setCurrent(value: OfferingStatusMap): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
    
    inline def setNextPeriod(value: OfferingStatusMap): Self = StObject.set(x, "nextPeriod", value.asInstanceOf[js.Any])
    
    inline def setNextPeriodUndefined: Self = StObject.set(x, "nextPeriod", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
