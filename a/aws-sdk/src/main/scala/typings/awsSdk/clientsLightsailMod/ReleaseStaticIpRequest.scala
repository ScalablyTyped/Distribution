package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseStaticIpRequest extends StObject {
  
  /**
    * The name of the static IP to delete.
    */
  var staticIpName: ResourceName
}
object ReleaseStaticIpRequest {
  
  inline def apply(staticIpName: ResourceName): ReleaseStaticIpRequest = {
    val __obj = js.Dynamic.literal(staticIpName = staticIpName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseStaticIpRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReleaseStaticIpRequest] (val x: Self) extends AnyVal {
    
    inline def setStaticIpName(value: ResourceName): Self = StObject.set(x, "staticIpName", value.asInstanceOf[js.Any])
  }
}
