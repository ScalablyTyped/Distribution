package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListIntegrationAssociationsResponse extends StObject {
  
  /**
    * The associations.
    */
  var IntegrationAssociationSummaryList: js.UndefOr[typings.awsSdk.clientsConnectMod.IntegrationAssociationSummaryList] = js.undefined
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsConnectMod.NextToken] = js.undefined
}
object ListIntegrationAssociationsResponse {
  
  inline def apply(): ListIntegrationAssociationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIntegrationAssociationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListIntegrationAssociationsResponse] (val x: Self) extends AnyVal {
    
    inline def setIntegrationAssociationSummaryList(value: IntegrationAssociationSummaryList): Self = StObject.set(x, "IntegrationAssociationSummaryList", value.asInstanceOf[js.Any])
    
    inline def setIntegrationAssociationSummaryListUndefined: Self = StObject.set(x, "IntegrationAssociationSummaryList", js.undefined)
    
    inline def setIntegrationAssociationSummaryListVarargs(value: IntegrationAssociationSummary*): Self = StObject.set(x, "IntegrationAssociationSummaryList", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
