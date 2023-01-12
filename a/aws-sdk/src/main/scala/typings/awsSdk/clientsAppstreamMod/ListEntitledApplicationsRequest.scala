package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEntitledApplicationsRequest extends StObject {
  
  /**
    * The name of the entitlement.
    */
  var EntitlementName: Name
  
  /**
    * The maximum size of each page of results.
    */
  var MaxResults: js.UndefOr[Integer] = js.undefined
  
  /**
    * The pagination token used to retrieve the next page of results for this operation.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the stack with which the entitlement is associated.
    */
  var StackName: Name
}
object ListEntitledApplicationsRequest {
  
  inline def apply(EntitlementName: Name, StackName: Name): ListEntitledApplicationsRequest = {
    val __obj = js.Dynamic.literal(EntitlementName = EntitlementName.asInstanceOf[js.Any], StackName = StackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEntitledApplicationsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListEntitledApplicationsRequest] (val x: Self) extends AnyVal {
    
    inline def setEntitlementName(value: Name): Self = StObject.set(x, "EntitlementName", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: Integer): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStackName(value: Name): Self = StObject.set(x, "StackName", value.asInstanceOf[js.Any])
  }
}
