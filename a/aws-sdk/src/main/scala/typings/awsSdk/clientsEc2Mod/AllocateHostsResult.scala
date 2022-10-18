package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllocateHostsResult extends StObject {
  
  /**
    * The ID of the allocated Dedicated Host. This is used to launch an instance onto a specific host.
    */
  var HostIds: js.UndefOr[ResponseHostIdList] = js.undefined
}
object AllocateHostsResult {
  
  inline def apply(): AllocateHostsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllocateHostsResult]
  }
  
  extension [Self <: AllocateHostsResult](x: Self) {
    
    inline def setHostIds(value: ResponseHostIdList): Self = StObject.set(x, "HostIds", value.asInstanceOf[js.Any])
    
    inline def setHostIdsUndefined: Self = StObject.set(x, "HostIds", js.undefined)
    
    inline def setHostIdsVarargs(value: String*): Self = StObject.set(x, "HostIds", js.Array(value*))
  }
}
