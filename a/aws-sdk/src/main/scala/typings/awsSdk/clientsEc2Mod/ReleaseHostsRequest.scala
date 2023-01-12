package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseHostsRequest extends StObject {
  
  /**
    * The IDs of the Dedicated Hosts to release.
    */
  var HostIds: RequestHostIdList
}
object ReleaseHostsRequest {
  
  inline def apply(HostIds: RequestHostIdList): ReleaseHostsRequest = {
    val __obj = js.Dynamic.literal(HostIds = HostIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseHostsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReleaseHostsRequest] (val x: Self) extends AnyVal {
    
    inline def setHostIds(value: RequestHostIdList): Self = StObject.set(x, "HostIds", value.asInstanceOf[js.Any])
    
    inline def setHostIdsVarargs(value: DedicatedHostId*): Self = StObject.set(x, "HostIds", js.Array(value*))
  }
}
