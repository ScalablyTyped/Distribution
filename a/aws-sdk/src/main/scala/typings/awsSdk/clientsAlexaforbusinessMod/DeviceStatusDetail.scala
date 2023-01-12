package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceStatusDetail extends StObject {
  
  /**
    * The device status detail code.
    */
  var Code: js.UndefOr[DeviceStatusDetailCode] = js.undefined
  
  /**
    * The list of available features on the device.
    */
  var Feature: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.Feature] = js.undefined
}
object DeviceStatusDetail {
  
  inline def apply(): DeviceStatusDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceStatusDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceStatusDetail] (val x: Self) extends AnyVal {
    
    inline def setCode(value: DeviceStatusDetailCode): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setFeature(value: Feature): Self = StObject.set(x, "Feature", value.asInstanceOf[js.Any])
    
    inline def setFeatureUndefined: Self = StObject.set(x, "Feature", js.undefined)
  }
}
