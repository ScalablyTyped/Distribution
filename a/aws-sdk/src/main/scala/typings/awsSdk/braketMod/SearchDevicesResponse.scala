package typings.awsSdk.braketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchDevicesResponse extends StObject {
  
  /**
    * An array of DeviceSummary objects for devices that match the specified filter values.
    */
  var devices: DeviceSummaryList
  
  /**
    * A token used for pagination of results, or null if there are no additional results. Use the token value in a subsequent request to continue results where the previous request ended.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object SearchDevicesResponse {
  
  inline def apply(devices: DeviceSummaryList): SearchDevicesResponse = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchDevicesResponse]
  }
  
  extension [Self <: SearchDevicesResponse](x: Self) {
    
    inline def setDevices(value: DeviceSummaryList): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesVarargs(value: DeviceSummary*): Self = StObject.set(x, "devices", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
