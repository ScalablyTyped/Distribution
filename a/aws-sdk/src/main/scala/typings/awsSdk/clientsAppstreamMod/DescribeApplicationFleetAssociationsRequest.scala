package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeApplicationFleetAssociationsRequest extends StObject {
  
  /**
    * The ARN of the application.
    */
  var ApplicationArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The name of the fleet.
    */
  var FleetName: js.UndefOr[Name] = js.undefined
  
  /**
    * The maximum size of each page of results.
    */
  var MaxResults: js.UndefOr[Integer] = js.undefined
  
  /**
    * The pagination token used to retrieve the next page of results for this operation.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeApplicationFleetAssociationsRequest {
  
  inline def apply(): DescribeApplicationFleetAssociationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeApplicationFleetAssociationsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeApplicationFleetAssociationsRequest] (val x: Self) extends AnyVal {
    
    inline def setApplicationArn(value: Arn): Self = StObject.set(x, "ApplicationArn", value.asInstanceOf[js.Any])
    
    inline def setApplicationArnUndefined: Self = StObject.set(x, "ApplicationArn", js.undefined)
    
    inline def setFleetName(value: Name): Self = StObject.set(x, "FleetName", value.asInstanceOf[js.Any])
    
    inline def setFleetNameUndefined: Self = StObject.set(x, "FleetName", js.undefined)
    
    inline def setMaxResults(value: Integer): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
