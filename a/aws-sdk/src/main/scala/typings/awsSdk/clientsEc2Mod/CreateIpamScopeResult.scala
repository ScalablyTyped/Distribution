package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateIpamScopeResult extends StObject {
  
  /**
    * Information about the created scope.
    */
  var IpamScope: js.UndefOr[typings.awsSdk.clientsEc2Mod.IpamScope] = js.undefined
}
object CreateIpamScopeResult {
  
  inline def apply(): CreateIpamScopeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateIpamScopeResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateIpamScopeResult] (val x: Self) extends AnyVal {
    
    inline def setIpamScope(value: IpamScope): Self = StObject.set(x, "IpamScope", value.asInstanceOf[js.Any])
    
    inline def setIpamScopeUndefined: Self = StObject.set(x, "IpamScope", js.undefined)
  }
}
