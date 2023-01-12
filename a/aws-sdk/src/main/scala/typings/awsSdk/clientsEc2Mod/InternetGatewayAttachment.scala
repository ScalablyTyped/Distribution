package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InternetGatewayAttachment extends StObject {
  
  /**
    * The current state of the attachment. For an internet gateway, the state is available when attached to a VPC; otherwise, this value is not returned.
    */
  var State: js.UndefOr[AttachmentStatus] = js.undefined
  
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}
object InternetGatewayAttachment {
  
  inline def apply(): InternetGatewayAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InternetGatewayAttachment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InternetGatewayAttachment] (val x: Self) extends AnyVal {
    
    inline def setState(value: AttachmentStatus): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
