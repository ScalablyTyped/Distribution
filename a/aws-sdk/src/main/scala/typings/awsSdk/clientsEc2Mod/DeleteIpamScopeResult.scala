package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteIpamScopeResult extends StObject {
  
  /**
    * Information about the results of the deletion.
    */
  var IpamScope: js.UndefOr[typings.awsSdk.clientsEc2Mod.IpamScope] = js.undefined
}
object DeleteIpamScopeResult {
  
  inline def apply(): DeleteIpamScopeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteIpamScopeResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteIpamScopeResult] (val x: Self) extends AnyVal {
    
    inline def setIpamScope(value: IpamScope): Self = StObject.set(x, "IpamScope", value.asInstanceOf[js.Any])
    
    inline def setIpamScopeUndefined: Self = StObject.set(x, "IpamScope", js.undefined)
  }
}
