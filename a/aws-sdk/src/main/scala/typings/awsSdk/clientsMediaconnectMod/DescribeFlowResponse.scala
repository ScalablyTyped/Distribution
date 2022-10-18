package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFlowResponse extends StObject {
  
  var Flow: js.UndefOr[typings.awsSdk.clientsMediaconnectMod.Flow] = js.undefined
  
  var Messages: js.UndefOr[typings.awsSdk.clientsMediaconnectMod.Messages] = js.undefined
}
object DescribeFlowResponse {
  
  inline def apply(): DescribeFlowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFlowResponse]
  }
  
  extension [Self <: DescribeFlowResponse](x: Self) {
    
    inline def setFlow(value: Flow): Self = StObject.set(x, "Flow", value.asInstanceOf[js.Any])
    
    inline def setFlowUndefined: Self = StObject.set(x, "Flow", js.undefined)
    
    inline def setMessages(value: Messages): Self = StObject.set(x, "Messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "Messages", js.undefined)
  }
}
