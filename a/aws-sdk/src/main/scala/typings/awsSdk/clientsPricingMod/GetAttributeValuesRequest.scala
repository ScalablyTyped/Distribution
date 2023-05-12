package typings.awsSdk.clientsPricingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAttributeValuesRequest extends StObject {
  
  /**
    * The name of the attribute that you want to retrieve the values for, such as volumeType.
    */
  var AttributeName: String
  
  /**
    * The maximum number of results to return in response.
    */
  var MaxResults: js.UndefOr[BoxedInteger] = js.undefined
  
  /**
    * The pagination token that indicates the next set of results that you want to retrieve.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The service code for the service whose attributes you want to retrieve. For example, if you want the retrieve an EC2 attribute, use AmazonEC2.
    */
  var ServiceCode: String
}
object GetAttributeValuesRequest {
  
  inline def apply(AttributeName: String, ServiceCode: String): GetAttributeValuesRequest = {
    val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any], ServiceCode = ServiceCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAttributeValuesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAttributeValuesRequest] (val x: Self) extends AnyVal {
    
    inline def setAttributeName(value: String): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: BoxedInteger): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setServiceCode(value: String): Self = StObject.set(x, "ServiceCode", value.asInstanceOf[js.Any])
  }
}
