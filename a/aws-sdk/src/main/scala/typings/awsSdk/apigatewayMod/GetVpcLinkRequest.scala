package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVpcLinkRequest extends StObject {
  
  /**
    * The identifier of the VpcLink. It is used in an Integration to reference this VpcLink.
    */
  var vpcLinkId: String
}
object GetVpcLinkRequest {
  
  inline def apply(vpcLinkId: String): GetVpcLinkRequest = {
    val __obj = js.Dynamic.literal(vpcLinkId = vpcLinkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVpcLinkRequest]
  }
  
  extension [Self <: GetVpcLinkRequest](x: Self) {
    
    inline def setVpcLinkId(value: String): Self = StObject.set(x, "vpcLinkId", value.asInstanceOf[js.Any])
  }
}
