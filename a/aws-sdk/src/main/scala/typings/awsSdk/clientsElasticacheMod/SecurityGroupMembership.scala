package typings.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityGroupMembership extends StObject {
  
  /**
    * The identifier of the cache security group.
    */
  var SecurityGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the cache security group membership. The status changes whenever a cache security group is modified, or when the cache security groups assigned to a cluster are modified.
    */
  var Status: js.UndefOr[String] = js.undefined
}
object SecurityGroupMembership {
  
  inline def apply(): SecurityGroupMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityGroupMembership]
  }
  
  extension [Self <: SecurityGroupMembership](x: Self) {
    
    inline def setSecurityGroupId(value: String): Self = StObject.set(x, "SecurityGroupId", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdUndefined: Self = StObject.set(x, "SecurityGroupId", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
