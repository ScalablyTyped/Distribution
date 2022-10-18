package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStaticIpRequest extends StObject {
  
  /**
    * The name of the static IP in Lightsail.
    */
  var staticIpName: ResourceName
}
object GetStaticIpRequest {
  
  inline def apply(staticIpName: ResourceName): GetStaticIpRequest = {
    val __obj = js.Dynamic.literal(staticIpName = staticIpName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStaticIpRequest]
  }
  
  extension [Self <: GetStaticIpRequest](x: Self) {
    
    inline def setStaticIpName(value: ResourceName): Self = StObject.set(x, "staticIpName", value.asInstanceOf[js.Any])
  }
}
