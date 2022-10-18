package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDevicePositionHistoryResponse extends StObject {
  
  /**
    * Contains the position history details for the requested device.
    */
  var DevicePositions: DevicePositionList
  
  /**
    * A pagination token indicating there are additional pages available. You can use the token in a following request to fetch the next set of results.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object GetDevicePositionHistoryResponse {
  
  inline def apply(DevicePositions: DevicePositionList): GetDevicePositionHistoryResponse = {
    val __obj = js.Dynamic.literal(DevicePositions = DevicePositions.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDevicePositionHistoryResponse]
  }
  
  extension [Self <: GetDevicePositionHistoryResponse](x: Self) {
    
    inline def setDevicePositions(value: DevicePositionList): Self = StObject.set(x, "DevicePositions", value.asInstanceOf[js.Any])
    
    inline def setDevicePositionsVarargs(value: DevicePosition*): Self = StObject.set(x, "DevicePositions", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
