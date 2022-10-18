package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceProfile extends StObject {
  
  /**
    * The Amazon Resource Name of the resource.
    */
  var Arn: js.UndefOr[DeviceProfileArn] = js.undefined
  
  /**
    * The ID of the device profile.
    */
  var Id: js.UndefOr[DeviceProfileId] = js.undefined
  
  /**
    * The name of the resource.
    */
  var Name: js.UndefOr[DeviceProfileName] = js.undefined
}
object DeviceProfile {
  
  inline def apply(): DeviceProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceProfile]
  }
  
  extension [Self <: DeviceProfile](x: Self) {
    
    inline def setArn(value: DeviceProfileArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setId(value: DeviceProfileId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setName(value: DeviceProfileName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
