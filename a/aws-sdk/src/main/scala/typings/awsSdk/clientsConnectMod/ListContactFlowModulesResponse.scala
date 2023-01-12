package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListContactFlowModulesResponse extends StObject {
  
  /**
    * Information about the flow module.
    */
  var ContactFlowModulesSummaryList: js.UndefOr[typings.awsSdk.clientsConnectMod.ContactFlowModulesSummaryList] = js.undefined
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsConnectMod.NextToken] = js.undefined
}
object ListContactFlowModulesResponse {
  
  inline def apply(): ListContactFlowModulesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListContactFlowModulesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListContactFlowModulesResponse] (val x: Self) extends AnyVal {
    
    inline def setContactFlowModulesSummaryList(value: ContactFlowModulesSummaryList): Self = StObject.set(x, "ContactFlowModulesSummaryList", value.asInstanceOf[js.Any])
    
    inline def setContactFlowModulesSummaryListUndefined: Self = StObject.set(x, "ContactFlowModulesSummaryList", js.undefined)
    
    inline def setContactFlowModulesSummaryListVarargs(value: ContactFlowModuleSummary*): Self = StObject.set(x, "ContactFlowModulesSummaryList", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
