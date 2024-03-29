package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllocateStaticIpRequest extends StObject {
  
  /**
    * The name of the static IP address.
    */
  var staticIpName: ResourceName
}
object AllocateStaticIpRequest {
  
  inline def apply(staticIpName: ResourceName): AllocateStaticIpRequest = {
    val __obj = js.Dynamic.literal(staticIpName = staticIpName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllocateStaticIpRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllocateStaticIpRequest] (val x: Self) extends AnyVal {
    
    inline def setStaticIpName(value: ResourceName): Self = StObject.set(x, "staticIpName", value.asInstanceOf[js.Any])
  }
}
