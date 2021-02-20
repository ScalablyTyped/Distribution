package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetVpcLinkRequest extends StObject {
  
  /**
    * [Required] The identifier of the VpcLink. It is used in an Integration to reference this VpcLink.
    */
  var vpcLinkId: String = js.native
}
object GetVpcLinkRequest {
  
  @scala.inline
  def apply(vpcLinkId: String): GetVpcLinkRequest = {
    val __obj = js.Dynamic.literal(vpcLinkId = vpcLinkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVpcLinkRequest]
  }
  
  @scala.inline
  implicit class GetVpcLinkRequestMutableBuilder[Self <: GetVpcLinkRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVpcLinkId(value: String): Self = StObject.set(x, "vpcLinkId", value.asInstanceOf[js.Any])
  }
}
