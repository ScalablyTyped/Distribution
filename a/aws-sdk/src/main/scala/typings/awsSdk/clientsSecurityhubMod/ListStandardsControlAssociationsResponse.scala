package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStandardsControlAssociationsResponse extends StObject {
  
  /**
    *  A pagination parameter that's included in the response only if it was included in the request. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSecurityhubMod.NextToken] = js.undefined
  
  /**
    *  An array that provides the enablement status and other details for each security control that applies to each enabled standard. 
    */
  var StandardsControlAssociationSummaries: typings.awsSdk.clientsSecurityhubMod.StandardsControlAssociationSummaries
}
object ListStandardsControlAssociationsResponse {
  
  inline def apply(StandardsControlAssociationSummaries: StandardsControlAssociationSummaries): ListStandardsControlAssociationsResponse = {
    val __obj = js.Dynamic.literal(StandardsControlAssociationSummaries = StandardsControlAssociationSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStandardsControlAssociationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListStandardsControlAssociationsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStandardsControlAssociationSummaries(value: StandardsControlAssociationSummaries): Self = StObject.set(x, "StandardsControlAssociationSummaries", value.asInstanceOf[js.Any])
    
    inline def setStandardsControlAssociationSummariesVarargs(value: StandardsControlAssociationSummary*): Self = StObject.set(x, "StandardsControlAssociationSummaries", js.Array(value*))
  }
}
