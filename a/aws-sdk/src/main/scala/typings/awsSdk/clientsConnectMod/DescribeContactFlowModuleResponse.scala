package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeContactFlowModuleResponse extends StObject {
  
  /**
    * Information about the flow module.
    */
  var ContactFlowModule: js.UndefOr[typings.awsSdk.clientsConnectMod.ContactFlowModule] = js.undefined
}
object DescribeContactFlowModuleResponse {
  
  inline def apply(): DescribeContactFlowModuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeContactFlowModuleResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeContactFlowModuleResponse] (val x: Self) extends AnyVal {
    
    inline def setContactFlowModule(value: ContactFlowModule): Self = StObject.set(x, "ContactFlowModule", value.asInstanceOf[js.Any])
    
    inline def setContactFlowModuleUndefined: Self = StObject.set(x, "ContactFlowModule", js.undefined)
  }
}
