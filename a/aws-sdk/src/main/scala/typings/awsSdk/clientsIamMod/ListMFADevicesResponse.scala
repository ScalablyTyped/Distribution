package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMFADevicesResponse extends StObject {
  
  /**
    * A flag that indicates whether there are more items to return. If your results were truncated, you can make a subsequent pagination request using the Marker request parameter to retrieve more items. Note that IAM might return fewer than the MaxItems number of results even when there are more results available. We recommend that you check IsTruncated after every call to ensure that you receive all your results.
    */
  var IsTruncated: js.UndefOr[booleanType] = js.undefined
  
  /**
    * A list of MFA devices.
    */
  var MFADevices: mfaDeviceListType
  
  /**
    * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
    */
  var Marker: js.UndefOr[responseMarkerType] = js.undefined
}
object ListMFADevicesResponse {
  
  inline def apply(MFADevices: mfaDeviceListType): ListMFADevicesResponse = {
    val __obj = js.Dynamic.literal(MFADevices = MFADevices.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMFADevicesResponse]
  }
  
  extension [Self <: ListMFADevicesResponse](x: Self) {
    
    inline def setIsTruncated(value: booleanType): Self = StObject.set(x, "IsTruncated", value.asInstanceOf[js.Any])
    
    inline def setIsTruncatedUndefined: Self = StObject.set(x, "IsTruncated", js.undefined)
    
    inline def setMFADevices(value: mfaDeviceListType): Self = StObject.set(x, "MFADevices", value.asInstanceOf[js.Any])
    
    inline def setMFADevicesVarargs(value: MFADevice*): Self = StObject.set(x, "MFADevices", js.Array(value*))
    
    inline def setMarker(value: responseMarkerType): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
