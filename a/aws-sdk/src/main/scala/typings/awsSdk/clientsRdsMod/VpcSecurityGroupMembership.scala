package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcSecurityGroupMembership extends StObject {
  
  /**
    * The membership status of the VPC security group. Currently, the only valid status is active.
    */
  var Status: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the VPC security group.
    */
  var VpcSecurityGroupId: js.UndefOr[String] = js.undefined
}
object VpcSecurityGroupMembership {
  
  inline def apply(): VpcSecurityGroupMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcSecurityGroupMembership]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VpcSecurityGroupMembership] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setVpcSecurityGroupId(value: String): Self = StObject.set(x, "VpcSecurityGroupId", value.asInstanceOf[js.Any])
    
    inline def setVpcSecurityGroupIdUndefined: Self = StObject.set(x, "VpcSecurityGroupId", js.undefined)
  }
}
