package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiRegionAccessPointsAsyncResponse extends StObject {
  
  /**
    * A collection of status information for the different Regions that a Multi-Region Access Point supports.
    */
  var Regions: js.UndefOr[MultiRegionAccessPointRegionalResponseList] = js.undefined
}
object MultiRegionAccessPointsAsyncResponse {
  
  inline def apply(): MultiRegionAccessPointsAsyncResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiRegionAccessPointsAsyncResponse]
  }
  
  extension [Self <: MultiRegionAccessPointsAsyncResponse](x: Self) {
    
    inline def setRegions(value: MultiRegionAccessPointRegionalResponseList): Self = StObject.set(x, "Regions", value.asInstanceOf[js.Any])
    
    inline def setRegionsUndefined: Self = StObject.set(x, "Regions", js.undefined)
    
    inline def setRegionsVarargs(value: MultiRegionAccessPointRegionalResponse*): Self = StObject.set(x, "Regions", js.Array(value*))
  }
}
