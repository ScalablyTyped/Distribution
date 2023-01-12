package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDeviceProfileResponse extends StObject {
  
  /**
    * The Amazon Resource Name of the new resource.
    */
  var Arn: js.UndefOr[DeviceProfileArn] = js.undefined
  
  /**
    * The ID of the new device profile.
    */
  var Id: js.UndefOr[DeviceProfileId] = js.undefined
}
object CreateDeviceProfileResponse {
  
  inline def apply(): CreateDeviceProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDeviceProfileResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDeviceProfileResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: DeviceProfileArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setId(value: DeviceProfileId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
