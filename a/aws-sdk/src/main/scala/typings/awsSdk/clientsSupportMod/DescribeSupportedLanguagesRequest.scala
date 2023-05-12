package typings.awsSdk.clientsSupportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSupportedLanguagesRequest extends StObject {
  
  /**
    * The category of problem for the support case. You also use the DescribeServices operation to get the category code for a service. Each Amazon Web Services service defines its own set of category codes.
    */
  var categoryCode: ValidatedCategoryCode
  
  /**
    * The type of issue for the case. You can specify customer-service or technical.
    */
  var issueType: ValidatedIssueTypeString
  
  /**
    * The code for the Amazon Web Services service. You can use the DescribeServices operation to get the possible serviceCode values.
    */
  var serviceCode: ValidatedServiceCode
}
object DescribeSupportedLanguagesRequest {
  
  inline def apply(
    categoryCode: ValidatedCategoryCode,
    issueType: ValidatedIssueTypeString,
    serviceCode: ValidatedServiceCode
  ): DescribeSupportedLanguagesRequest = {
    val __obj = js.Dynamic.literal(categoryCode = categoryCode.asInstanceOf[js.Any], issueType = issueType.asInstanceOf[js.Any], serviceCode = serviceCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSupportedLanguagesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeSupportedLanguagesRequest] (val x: Self) extends AnyVal {
    
    inline def setCategoryCode(value: ValidatedCategoryCode): Self = StObject.set(x, "categoryCode", value.asInstanceOf[js.Any])
    
    inline def setIssueType(value: ValidatedIssueTypeString): Self = StObject.set(x, "issueType", value.asInstanceOf[js.Any])
    
    inline def setServiceCode(value: ValidatedServiceCode): Self = StObject.set(x, "serviceCode", value.asInstanceOf[js.Any])
  }
}
