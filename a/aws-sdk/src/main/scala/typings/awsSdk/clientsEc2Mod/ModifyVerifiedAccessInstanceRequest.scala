package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyVerifiedAccessInstanceRequest extends StObject {
  
  /**
    * A unique, case-sensitive token that you provide to ensure idempotency of your modification request. For more information, see Ensuring Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * A description for the Verified Access instance.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the Verified Access instance.
    */
  var VerifiedAccessInstanceId: typings.awsSdk.clientsEc2Mod.VerifiedAccessInstanceId
}
object ModifyVerifiedAccessInstanceRequest {
  
  inline def apply(VerifiedAccessInstanceId: VerifiedAccessInstanceId): ModifyVerifiedAccessInstanceRequest = {
    val __obj = js.Dynamic.literal(VerifiedAccessInstanceId = VerifiedAccessInstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyVerifiedAccessInstanceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyVerifiedAccessInstanceRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setVerifiedAccessInstanceId(value: VerifiedAccessInstanceId): Self = StObject.set(x, "VerifiedAccessInstanceId", value.asInstanceOf[js.Any])
  }
}
