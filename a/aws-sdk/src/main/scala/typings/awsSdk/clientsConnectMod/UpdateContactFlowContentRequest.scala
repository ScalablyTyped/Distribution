package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateContactFlowContentRequest extends StObject {
  
  /**
    * The identifier of the flow.
    */
  var ContactFlowId: typings.awsSdk.clientsConnectMod.ContactFlowId
  
  /**
    * The JSON string that represents flow's content. For an example, see Example contact flow in Amazon Connect Flow language in the Amazon Connect Administrator Guide. 
    */
  var Content: ContactFlowContent
  
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
}
object UpdateContactFlowContentRequest {
  
  inline def apply(ContactFlowId: ContactFlowId, Content: ContactFlowContent, InstanceId: InstanceId): UpdateContactFlowContentRequest = {
    val __obj = js.Dynamic.literal(ContactFlowId = ContactFlowId.asInstanceOf[js.Any], Content = Content.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateContactFlowContentRequest]
  }
  
  extension [Self <: UpdateContactFlowContentRequest](x: Self) {
    
    inline def setContactFlowId(value: ContactFlowId): Self = StObject.set(x, "ContactFlowId", value.asInstanceOf[js.Any])
    
    inline def setContent(value: ContactFlowContent): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
  }
}
