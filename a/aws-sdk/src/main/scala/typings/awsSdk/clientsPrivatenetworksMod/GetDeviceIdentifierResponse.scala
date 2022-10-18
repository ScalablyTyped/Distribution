package typings.awsSdk.clientsPrivatenetworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDeviceIdentifierResponse extends StObject {
  
  /**
    * Information about the device identifier.
    */
  var deviceIdentifier: js.UndefOr[DeviceIdentifier] = js.undefined
  
  /**
    *  The device identifier tags. 
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object GetDeviceIdentifierResponse {
  
  inline def apply(): GetDeviceIdentifierResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDeviceIdentifierResponse]
  }
  
  extension [Self <: GetDeviceIdentifierResponse](x: Self) {
    
    inline def setDeviceIdentifier(value: DeviceIdentifier): Self = StObject.set(x, "deviceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdentifierUndefined: Self = StObject.set(x, "deviceIdentifier", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
