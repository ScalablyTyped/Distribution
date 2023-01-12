package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyVpcTenancyRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The instance tenancy attribute for the VPC. 
    */
  var InstanceTenancy: VpcTenancy
  
  /**
    * The ID of the VPC.
    */
  var VpcId: typings.awsSdk.clientsEc2Mod.VpcId
}
object ModifyVpcTenancyRequest {
  
  inline def apply(InstanceTenancy: VpcTenancy, VpcId: VpcId): ModifyVpcTenancyRequest = {
    val __obj = js.Dynamic.literal(InstanceTenancy = InstanceTenancy.asInstanceOf[js.Any], VpcId = VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyVpcTenancyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyVpcTenancyRequest] (val x: Self) extends AnyVal {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setInstanceTenancy(value: VpcTenancy): Self = StObject.set(x, "InstanceTenancy", value.asInstanceOf[js.Any])
    
    inline def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
  }
}
