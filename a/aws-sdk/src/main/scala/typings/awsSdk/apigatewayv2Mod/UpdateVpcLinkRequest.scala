package typings.awsSdk.apigatewayv2Mod

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
  
  @scala.inline
  def apply(VpcLinkId: string): UpdateVpcLinkRequest = {
    val __obj = js.Dynamic.literal(VpcLinkId = VpcLinkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVpcLinkRequest]
  }
  
  @scala.inline
  implicit class UpdateVpcLinkRequestMutableBuilder[Self <: UpdateVpcLinkRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: StringWithLengthBetween1And128): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setVpcLinkId(value: string): Self = StObject.set(x, "VpcLinkId", value.asInstanceOf[js.Any])
  }
}
