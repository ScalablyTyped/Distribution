package typings.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVpcLinkRequest extends StObject {
  
  /**
    * The ID of the VPC link.
    */
  var VpcLinkId: string
}
object GetVpcLinkRequest {
  
  inline def apply(VpcLinkId: string): GetVpcLinkRequest = {
    val __obj = js.Dynamic.literal(VpcLinkId = VpcLinkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVpcLinkRequest]
  }
  
  extension [Self <: GetVpcLinkRequest](x: Self) {
    
    inline def setVpcLinkId(value: string): Self = StObject.set(x, "VpcLinkId", value.asInstanceOf[js.Any])
  }
}
