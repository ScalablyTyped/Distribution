package typings.awsSdk.clientsPrivatenetworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartNetworkResourceUpdateResponse extends StObject {
  
  /**
    * The network resource.
    */
  var networkResource: js.UndefOr[NetworkResource] = js.undefined
}
object StartNetworkResourceUpdateResponse {
  
  inline def apply(): StartNetworkResourceUpdateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartNetworkResourceUpdateResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartNetworkResourceUpdateResponse] (val x: Self) extends AnyVal {
    
    inline def setNetworkResource(value: NetworkResource): Self = StObject.set(x, "networkResource", value.asInstanceOf[js.Any])
    
    inline def setNetworkResourceUndefined: Self = StObject.set(x, "networkResource", js.undefined)
  }
}
