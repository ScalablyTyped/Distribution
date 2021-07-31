package typings.awsSdk.alexaforbusinessMod

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
  var Feature: js.UndefOr[typings.awsSdk.alexaforbusinessMod.Feature] = js.undefined
}
object DeviceStatusDetail {
  
  @scala.inline
  def apply(): DeviceStatusDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceStatusDetail]
  }
  
  @scala.inline
  implicit class DeviceStatusDetailMutableBuilder[Self <: DeviceStatusDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: DeviceStatusDetailCode): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    @scala.inline
    def setFeature(value: Feature): Self = StObject.set(x, "Feature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureUndefined: Self = StObject.set(x, "Feature", js.undefined)
  }
}
