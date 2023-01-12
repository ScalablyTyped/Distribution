package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateContactFlowResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the flow.
    */
  var ContactFlowArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The identifier of the flow.
    */
  var ContactFlowId: js.UndefOr[typings.awsSdk.clientsConnectMod.ContactFlowId] = js.undefined
}
object CreateContactFlowResponse {
  
  inline def apply(): CreateContactFlowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateContactFlowResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateContactFlowResponse] (val x: Self) extends AnyVal {
    
    inline def setContactFlowArn(value: ARN): Self = StObject.set(x, "ContactFlowArn", value.asInstanceOf[js.Any])
    
    inline def setContactFlowArnUndefined: Self = StObject.set(x, "ContactFlowArn", js.undefined)
    
    inline def setContactFlowId(value: ContactFlowId): Self = StObject.set(x, "ContactFlowId", value.asInstanceOf[js.Any])
    
    inline def setContactFlowIdUndefined: Self = StObject.set(x, "ContactFlowId", js.undefined)
  }
}
