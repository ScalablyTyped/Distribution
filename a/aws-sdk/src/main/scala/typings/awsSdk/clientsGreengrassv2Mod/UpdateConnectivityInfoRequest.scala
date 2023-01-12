package typings.awsSdk.clientsGreengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateConnectivityInfoRequest extends StObject {
  
  /**
    * The connectivity information for the core device.
    */
  var connectivityInfo: connectivityInfoList
  
  /**
    * The name of the core device. This is also the name of the IoT thing.
    */
  var thingName: CoreDeviceThingName
}
object UpdateConnectivityInfoRequest {
  
  inline def apply(connectivityInfo: connectivityInfoList, thingName: CoreDeviceThingName): UpdateConnectivityInfoRequest = {
    val __obj = js.Dynamic.literal(connectivityInfo = connectivityInfo.asInstanceOf[js.Any], thingName = thingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConnectivityInfoRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateConnectivityInfoRequest] (val x: Self) extends AnyVal {
    
    inline def setConnectivityInfo(value: connectivityInfoList): Self = StObject.set(x, "connectivityInfo", value.asInstanceOf[js.Any])
    
    inline def setConnectivityInfoVarargs(value: ConnectivityInfo*): Self = StObject.set(x, "connectivityInfo", js.Array(value*))
    
    inline def setThingName(value: CoreDeviceThingName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
  }
}
