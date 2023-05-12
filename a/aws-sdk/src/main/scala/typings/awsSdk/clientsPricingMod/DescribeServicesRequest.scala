package typings.awsSdk.clientsPricingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeServicesRequest extends StObject {
  
  /**
    * The format version that you want the response to be in. Valid values are: aws_v1 
    */
  var FormatVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of results that you want returned in the response.
    */
  var MaxResults: js.UndefOr[BoxedInteger] = js.undefined
  
  /**
    * The pagination token that indicates the next set of results that you want to retrieve.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The code for the service whose information you want to retrieve, such as AmazonEC2. You can use the ServiceCode to filter the results in a GetProducts call. To retrieve a list of all services, leave this blank.
    */
  var ServiceCode: js.UndefOr[String] = js.undefined
}
object DescribeServicesRequest {
  
  inline def apply(): DescribeServicesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeServicesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeServicesRequest] (val x: Self) extends AnyVal {
    
    inline def setFormatVersion(value: String): Self = StObject.set(x, "FormatVersion", value.asInstanceOf[js.Any])
    
    inline def setFormatVersionUndefined: Self = StObject.set(x, "FormatVersion", js.undefined)
    
    inline def setMaxResults(value: BoxedInteger): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setServiceCode(value: String): Self = StObject.set(x, "ServiceCode", value.asInstanceOf[js.Any])
    
    inline def setServiceCodeUndefined: Self = StObject.set(x, "ServiceCode", js.undefined)
  }
}
