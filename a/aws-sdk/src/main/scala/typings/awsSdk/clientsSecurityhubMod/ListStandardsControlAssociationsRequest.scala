package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStandardsControlAssociationsRequest extends StObject {
  
  /**
    *  An optional parameter that limits the total results of the API response to the specified number. If this parameter isn't provided in the request, the results include the first 25 standard and control associations. The results also include a NextToken parameter that you can use in a subsequent API call to get the next 25 associations. This repeats until all associations for the specified control are returned. The number of results is limited by the number of supported Security Hub standards that you've enabled in the calling account. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsSecurityhubMod.MaxResults] = js.undefined
  
  /**
    *  Optional pagination parameter. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSecurityhubMod.NextToken] = js.undefined
  
  /**
    *  The identifier of the control (identified with SecurityControlId, SecurityControlArn, or a mix of both parameters) that you want to determine the enablement status of in each enabled standard. 
    */
  var SecurityControlId: NonEmptyString
}
object ListStandardsControlAssociationsRequest {
  
  inline def apply(SecurityControlId: NonEmptyString): ListStandardsControlAssociationsRequest = {
    val __obj = js.Dynamic.literal(SecurityControlId = SecurityControlId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStandardsControlAssociationsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListStandardsControlAssociationsRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSecurityControlId(value: NonEmptyString): Self = StObject.set(x, "SecurityControlId", value.asInstanceOf[js.Any])
  }
}
