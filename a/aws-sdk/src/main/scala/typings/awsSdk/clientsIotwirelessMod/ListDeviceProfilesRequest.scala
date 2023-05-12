package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDeviceProfilesRequest extends StObject {
  
  /**
    * A filter to list only device profiles that use this type, which can be LoRaWAN or Sidewalk.
    */
  var DeviceProfileType: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.DeviceProfileType] = js.undefined
  
  /**
    * The maximum number of results to return in this operation.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.MaxResults] = js.undefined
  
  /**
    * To retrieve the next set of results, the nextToken value from a previous response; otherwise null to receive the first set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.NextToken] = js.undefined
}
object ListDeviceProfilesRequest {
  
  inline def apply(): ListDeviceProfilesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDeviceProfilesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDeviceProfilesRequest] (val x: Self) extends AnyVal {
    
    inline def setDeviceProfileType(value: DeviceProfileType): Self = StObject.set(x, "DeviceProfileType", value.asInstanceOf[js.Any])
    
    inline def setDeviceProfileTypeUndefined: Self = StObject.set(x, "DeviceProfileType", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
