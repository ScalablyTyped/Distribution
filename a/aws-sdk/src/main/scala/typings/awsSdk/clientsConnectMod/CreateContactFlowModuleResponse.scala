package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateContactFlowModuleResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the flow module.
    */
  var Arn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The identifier of the flow module.
    */
  var Id: js.UndefOr[ContactFlowModuleId] = js.undefined
}
object CreateContactFlowModuleResponse {
  
  inline def apply(): CreateContactFlowModuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateContactFlowModuleResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateContactFlowModuleResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: ARN): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setId(value: ContactFlowModuleId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
