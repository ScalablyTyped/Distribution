package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcAttachment extends StObject {
  
  /**
    * Provides details about the VPC attachment.
    */
  var Attachment: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.Attachment] = js.undefined
  
  /**
    * Provides details about the VPC attachment.
    */
  var Options: js.UndefOr[VpcOptions] = js.undefined
  
  /**
    * The subnet ARNs.
    */
  var SubnetArns: js.UndefOr[SubnetArnList] = js.undefined
}
object VpcAttachment {
  
  inline def apply(): VpcAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcAttachment]
  }
  
  extension [Self <: VpcAttachment](x: Self) {
    
    inline def setAttachment(value: Attachment): Self = StObject.set(x, "Attachment", value.asInstanceOf[js.Any])
    
    inline def setAttachmentUndefined: Self = StObject.set(x, "Attachment", js.undefined)
    
    inline def setOptions(value: VpcOptions): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "Options", js.undefined)
    
    inline def setSubnetArns(value: SubnetArnList): Self = StObject.set(x, "SubnetArns", value.asInstanceOf[js.Any])
    
    inline def setSubnetArnsUndefined: Self = StObject.set(x, "SubnetArns", js.undefined)
    
    inline def setSubnetArnsVarargs(value: SubnetArn*): Self = StObject.set(x, "SubnetArns", js.Array(value*))
  }
}
