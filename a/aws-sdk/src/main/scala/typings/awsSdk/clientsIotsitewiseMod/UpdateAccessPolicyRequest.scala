package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAccessPolicyRequest extends StObject {
  
  /**
    * The ID of the access policy.
    */
  var accessPolicyId: ID
  
  /**
    * The identity for this access policy. Choose an Amazon Web Services SSO user, an Amazon Web Services SSO group, or an IAM user.
    */
  var accessPolicyIdentity: Identity
  
  /**
    * The permission level for this access policy. Note that a project ADMINISTRATOR is also known as a project owner.
    */
  var accessPolicyPermission: Permission
  
  /**
    * The IoT SiteWise Monitor resource for this access policy. Choose either a portal or a project.
    */
  var accessPolicyResource: Resource
  
  /**
    * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse this client token if a new idempotent request is required.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
}
object UpdateAccessPolicyRequest {
  
  inline def apply(
    accessPolicyId: ID,
    accessPolicyIdentity: Identity,
    accessPolicyPermission: Permission,
    accessPolicyResource: Resource
  ): UpdateAccessPolicyRequest = {
    val __obj = js.Dynamic.literal(accessPolicyId = accessPolicyId.asInstanceOf[js.Any], accessPolicyIdentity = accessPolicyIdentity.asInstanceOf[js.Any], accessPolicyPermission = accessPolicyPermission.asInstanceOf[js.Any], accessPolicyResource = accessPolicyResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAccessPolicyRequest]
  }
  
  extension [Self <: UpdateAccessPolicyRequest](x: Self) {
    
    inline def setAccessPolicyId(value: ID): Self = StObject.set(x, "accessPolicyId", value.asInstanceOf[js.Any])
    
    inline def setAccessPolicyIdentity(value: Identity): Self = StObject.set(x, "accessPolicyIdentity", value.asInstanceOf[js.Any])
    
    inline def setAccessPolicyPermission(value: Permission): Self = StObject.set(x, "accessPolicyPermission", value.asInstanceOf[js.Any])
    
    inline def setAccessPolicyResource(value: Resource): Self = StObject.set(x, "accessPolicyResource", value.asInstanceOf[js.Any])
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
  }
}
