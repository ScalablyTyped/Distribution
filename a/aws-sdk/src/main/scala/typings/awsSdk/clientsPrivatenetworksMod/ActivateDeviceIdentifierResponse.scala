package typings.awsSdk.clientsPrivatenetworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivateDeviceIdentifierResponse extends StObject {
  
  /**
    * Information about the device identifier.
    */
  var deviceIdentifier: DeviceIdentifier
  
  /**
    *  The tags on the device identifier. 
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object ActivateDeviceIdentifierResponse {
  
  inline def apply(deviceIdentifier: DeviceIdentifier): ActivateDeviceIdentifierResponse = {
    val __obj = js.Dynamic.literal(deviceIdentifier = deviceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivateDeviceIdentifierResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActivateDeviceIdentifierResponse] (val x: Self) extends AnyVal {
    
    inline def setDeviceIdentifier(value: DeviceIdentifier): Self = StObject.set(x, "deviceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
