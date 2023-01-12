package typings.awsSdk.clientsGreengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConnectivityInfoRequest extends StObject {
  
  /**
    * The name of the core device. This is also the name of the IoT thing.
    */
  var thingName: CoreDeviceThingName
}
object GetConnectivityInfoRequest {
  
  inline def apply(thingName: CoreDeviceThingName): GetConnectivityInfoRequest = {
    val __obj = js.Dynamic.literal(thingName = thingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConnectivityInfoRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetConnectivityInfoRequest] (val x: Self) extends AnyVal {
    
    inline def setThingName(value: CoreDeviceThingName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
  }
}
