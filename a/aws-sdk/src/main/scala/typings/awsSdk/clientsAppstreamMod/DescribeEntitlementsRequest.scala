package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEntitlementsRequest extends StObject {
  
  /**
    * The maximum size of each page of results.
    */
  var MaxResults: js.UndefOr[Integer] = js.undefined
  
  /**
    * The name of the entitlement.
    */
  var Name: js.UndefOr[typings.awsSdk.clientsAppstreamMod.Name] = js.undefined
  
  /**
    * The pagination token used to retrieve the next page of results for this operation.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the stack with which the entitlement is associated.
    */
  var StackName: Name
}
object DescribeEntitlementsRequest {
  
  inline def apply(StackName: Name): DescribeEntitlementsRequest = {
    val __obj = js.Dynamic.literal(StackName = StackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEntitlementsRequest]
  }
  
  extension [Self <: DescribeEntitlementsRequest](x: Self) {
    
    inline def setMaxResults(value: Integer): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStackName(value: Name): Self = StObject.set(x, "StackName", value.asInstanceOf[js.Any])
  }
}
