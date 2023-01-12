package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachStaticIpRequest extends StObject {
  
  /**
    * The instance name to which you want to attach the static IP address.
    */
  var instanceName: ResourceName
  
  /**
    * The name of the static IP.
    */
  var staticIpName: ResourceName
}
object AttachStaticIpRequest {
  
  inline def apply(instanceName: ResourceName, staticIpName: ResourceName): AttachStaticIpRequest = {
    val __obj = js.Dynamic.literal(instanceName = instanceName.asInstanceOf[js.Any], staticIpName = staticIpName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachStaticIpRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttachStaticIpRequest] (val x: Self) extends AnyVal {
    
    inline def setInstanceName(value: ResourceName): Self = StObject.set(x, "instanceName", value.asInstanceOf[js.Any])
    
    inline def setStaticIpName(value: ResourceName): Self = StObject.set(x, "staticIpName", value.asInstanceOf[js.Any])
  }
}
