package typings.awsSdk.clientsIotdeviceadvisorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceUnderTest extends StObject {
  
  /**
    * Lists device's certificate ARN.
    */
  var certificateArn: js.UndefOr[AmazonResourceName] = js.undefined
  
  /**
    * Lists device's role ARN.
    */
  var deviceRoleArn: js.UndefOr[AmazonResourceName] = js.undefined
  
  /**
    * Lists device's thing ARN.
    */
  var thingArn: js.UndefOr[AmazonResourceName] = js.undefined
}
object DeviceUnderTest {
  
  inline def apply(): DeviceUnderTest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceUnderTest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceUnderTest] (val x: Self) extends AnyVal {
    
    inline def setCertificateArn(value: AmazonResourceName): Self = StObject.set(x, "certificateArn", value.asInstanceOf[js.Any])
    
    inline def setCertificateArnUndefined: Self = StObject.set(x, "certificateArn", js.undefined)
    
    inline def setDeviceRoleArn(value: AmazonResourceName): Self = StObject.set(x, "deviceRoleArn", value.asInstanceOf[js.Any])
    
    inline def setDeviceRoleArnUndefined: Self = StObject.set(x, "deviceRoleArn", js.undefined)
    
    inline def setThingArn(value: AmazonResourceName): Self = StObject.set(x, "thingArn", value.asInstanceOf[js.Any])
    
    inline def setThingArnUndefined: Self = StObject.set(x, "thingArn", js.undefined)
  }
}
