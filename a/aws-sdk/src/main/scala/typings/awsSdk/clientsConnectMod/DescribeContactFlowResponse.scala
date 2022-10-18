package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeContactFlowResponse extends StObject {
  
  /**
    * Information about the flow.
    */
  var ContactFlow: js.UndefOr[typings.awsSdk.clientsConnectMod.ContactFlow] = js.undefined
}
object DescribeContactFlowResponse {
  
  inline def apply(): DescribeContactFlowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeContactFlowResponse]
  }
  
  extension [Self <: DescribeContactFlowResponse](x: Self) {
    
    inline def setContactFlow(value: ContactFlow): Self = StObject.set(x, "ContactFlow", value.asInstanceOf[js.Any])
    
    inline def setContactFlowUndefined: Self = StObject.set(x, "ContactFlow", js.undefined)
  }
}
