package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetachStaticIpRequest extends StObject {
  
  /**
    * The name of the static IP to detach from the instance.
    */
  var staticIpName: ResourceName
}
object DetachStaticIpRequest {
  
  inline def apply(staticIpName: ResourceName): DetachStaticIpRequest = {
    val __obj = js.Dynamic.literal(staticIpName = staticIpName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetachStaticIpRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DetachStaticIpRequest] (val x: Self) extends AnyVal {
    
    inline def setStaticIpName(value: ResourceName): Self = StObject.set(x, "staticIpName", value.asInstanceOf[js.Any])
  }
}
