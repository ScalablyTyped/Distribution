package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFleetsResult extends StObject {
  
  /**
    * Information about the fleets.
    */
  var Fleets: js.UndefOr[FleetList] = js.undefined
  
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeFleetsResult {
  
  inline def apply(): DescribeFleetsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFleetsResult]
  }
  
  extension [Self <: DescribeFleetsResult](x: Self) {
    
    inline def setFleets(value: FleetList): Self = StObject.set(x, "Fleets", value.asInstanceOf[js.Any])
    
    inline def setFleetsUndefined: Self = StObject.set(x, "Fleets", js.undefined)
    
    inline def setFleetsVarargs(value: Fleet*): Self = StObject.set(x, "Fleets", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
