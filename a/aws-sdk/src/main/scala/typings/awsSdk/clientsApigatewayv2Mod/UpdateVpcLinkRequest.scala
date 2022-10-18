package typings.awsSdk.clientsApigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateVpcLinkRequest extends StObject {
  
  /**
    * The name of the VPC link.
    */
  var Name: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
  
  /**
    * The ID of the VPC link.
    */
  var VpcLinkId: string
}
object UpdateVpcLinkRequest {
  
  inline def apply(VpcLinkId: string): UpdateVpcLinkRequest = {
    val __obj = js.Dynamic.literal(VpcLinkId = VpcLinkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVpcLinkRequest]
  }
  
  extension [Self <: UpdateVpcLinkRequest](x: Self) {
    
    inline def setName(value: StringWithLengthBetween1And128): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setVpcLinkId(value: string): Self = StObject.set(x, "VpcLinkId", value.asInstanceOf[js.Any])
  }
}
