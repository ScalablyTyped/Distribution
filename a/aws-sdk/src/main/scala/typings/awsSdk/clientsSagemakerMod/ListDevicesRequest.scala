package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDevicesRequest extends StObject {
  
  /**
    * Filter for fleets containing this name in their device fleet name.
    */
  var DeviceFleetName: js.UndefOr[EntityName] = js.undefined
  
  /**
    * Select fleets where the job was updated after X
    */
  var LatestHeartbeatAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Maximum number of results to select.
    */
  var MaxResults: js.UndefOr[ListMaxResults] = js.undefined
  
  /**
    * A filter that searches devices that contains this name in any of their models.
    */
  var ModelName: js.UndefOr[EntityName] = js.undefined
  
  /**
    * The response from the last list when returning a list large enough to need tokening.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
}
object ListDevicesRequest {
  
  inline def apply(): ListDevicesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDevicesRequest]
  }
  
  extension [Self <: ListDevicesRequest](x: Self) {
    
    inline def setDeviceFleetName(value: EntityName): Self = StObject.set(x, "DeviceFleetName", value.asInstanceOf[js.Any])
    
    inline def setDeviceFleetNameUndefined: Self = StObject.set(x, "DeviceFleetName", js.undefined)
    
    inline def setLatestHeartbeatAfter(value: js.Date): Self = StObject.set(x, "LatestHeartbeatAfter", value.asInstanceOf[js.Any])
    
    inline def setLatestHeartbeatAfterUndefined: Self = StObject.set(x, "LatestHeartbeatAfter", js.undefined)
    
    inline def setMaxResults(value: ListMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setModelName(value: EntityName): Self = StObject.set(x, "ModelName", value.asInstanceOf[js.Any])
    
    inline def setModelNameUndefined: Self = StObject.set(x, "ModelName", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
