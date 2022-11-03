package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessPolicySummary extends StObject {
  
  /**
    * The date the access policy was created, in Unix epoch time.
    */
  var creationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the access policy.
    */
  var id: ID
  
  /**
    * The identity (an IAM Identity Center user, an IAM Identity Center group, or an IAM user).
    */
  var identity: Identity
  
  /**
    * The date the access policy was last updated, in Unix epoch time.
    */
  var lastUpdateDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The permissions for the access policy. Note that a project ADMINISTRATOR is also known as a project owner.
    */
  var permission: Permission
  
  /**
    * The IoT SiteWise Monitor resource (a portal or project).
    */
  var resource: Resource
}
object AccessPolicySummary {
  
  inline def apply(id: ID, identity: Identity, permission: Permission, resource: Resource): AccessPolicySummary = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], permission = permission.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessPolicySummary]
  }
  
  extension [Self <: AccessPolicySummary](x: Self) {
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setId(value: ID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdentity(value: Identity): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateDate(value: js.Date): Self = StObject.set(x, "lastUpdateDate", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateDateUndefined: Self = StObject.set(x, "lastUpdateDate", js.undefined)
    
    inline def setPermission(value: Permission): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    inline def setResource(value: Resource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
  }
}
