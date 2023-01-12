package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiRegionAccessPointRegionalResponse extends StObject {
  
  /**
    * The name of the Region in the Multi-Region Access Point.
    */
  var Name: js.UndefOr[RegionName] = js.undefined
  
  /**
    * The current status of the Multi-Region Access Point in this Region.
    */
  var RequestStatus: js.UndefOr[AsyncRequestStatus] = js.undefined
}
object MultiRegionAccessPointRegionalResponse {
  
  inline def apply(): MultiRegionAccessPointRegionalResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiRegionAccessPointRegionalResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MultiRegionAccessPointRegionalResponse] (val x: Self) extends AnyVal {
    
    inline def setName(value: RegionName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRequestStatus(value: AsyncRequestStatus): Self = StObject.set(x, "RequestStatus", value.asInstanceOf[js.Any])
    
    inline def setRequestStatusUndefined: Self = StObject.set(x, "RequestStatus", js.undefined)
  }
}
