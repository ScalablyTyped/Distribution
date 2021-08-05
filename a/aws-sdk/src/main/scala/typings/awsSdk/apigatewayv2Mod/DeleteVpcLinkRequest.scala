package typings.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVpcLinkRequest extends StObject {
  
  /**
    * The ID of the VPC link.
    */
  var VpcLinkId: string
}
object DeleteVpcLinkRequest {
  
  inline def apply(VpcLinkId: string): DeleteVpcLinkRequest = {
    val __obj = js.Dynamic.literal(VpcLinkId = VpcLinkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVpcLinkRequest]
  }
  
  extension [Self <: DeleteVpcLinkRequest](x: Self) {
    
    inline def setVpcLinkId(value: string): Self = StObject.set(x, "VpcLinkId", value.asInstanceOf[js.Any])
  }
}
