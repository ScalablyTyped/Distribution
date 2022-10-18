package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVpcAttributeRequest extends StObject {
  
  /**
    * The VPC attribute.
    */
  var Attribute: VpcAttributeName
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the VPC.
    */
  var VpcId: typings.awsSdk.clientsEc2Mod.VpcId
}
object DescribeVpcAttributeRequest {
  
  inline def apply(Attribute: VpcAttributeName, VpcId: VpcId): DescribeVpcAttributeRequest = {
    val __obj = js.Dynamic.literal(Attribute = Attribute.asInstanceOf[js.Any], VpcId = VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVpcAttributeRequest]
  }
  
  extension [Self <: DescribeVpcAttributeRequest](x: Self) {
    
    inline def setAttribute(value: VpcAttributeName): Self = StObject.set(x, "Attribute", value.asInstanceOf[js.Any])
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
  }
}
