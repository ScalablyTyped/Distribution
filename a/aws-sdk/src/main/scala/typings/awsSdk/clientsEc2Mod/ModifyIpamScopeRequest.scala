package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyIpamScopeRequest extends StObject {
  
  /**
    * The description of the scope you want to modify.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * A check for whether you have the required permissions for the action without actually making the request and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the scope you want to modify.
    */
  var IpamScopeId: typings.awsSdk.clientsEc2Mod.IpamScopeId
}
object ModifyIpamScopeRequest {
  
  inline def apply(IpamScopeId: IpamScopeId): ModifyIpamScopeRequest = {
    val __obj = js.Dynamic.literal(IpamScopeId = IpamScopeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyIpamScopeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyIpamScopeRequest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setIpamScopeId(value: IpamScopeId): Self = StObject.set(x, "IpamScopeId", value.asInstanceOf[js.Any])
  }
}
