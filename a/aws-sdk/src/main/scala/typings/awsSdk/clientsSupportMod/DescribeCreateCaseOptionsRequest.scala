package typings.awsSdk.clientsSupportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCreateCaseOptionsRequest extends StObject {
  
  /**
    * The category of problem for the support case. You also use the DescribeServices operation to get the category code for a service. Each Amazon Web Services service defines its own set of category codes.
    */
  var categoryCode: CategoryCode
  
  /**
    * The type of issue for the case. You can specify customer-service or technical. If you don't specify a value, the default is technical.
    */
  var issueType: IssueType
  
  /**
    * The language in which Amazon Web Services Support handles the case. Amazon Web Services Support currently supports Chinese (“zh”), English ("en"), Japanese ("ja") and Korean (“ko”). You must specify the ISO 639-1 code for the language parameter if you want support in that language.
    */
  var language: Language
  
  /**
    * The code for the Amazon Web Services service. You can use the DescribeServices operation to get the possible serviceCode values.
    */
  var serviceCode: ServiceCode
}
object DescribeCreateCaseOptionsRequest {
  
  inline def apply(categoryCode: CategoryCode, issueType: IssueType, language: Language, serviceCode: ServiceCode): DescribeCreateCaseOptionsRequest = {
    val __obj = js.Dynamic.literal(categoryCode = categoryCode.asInstanceOf[js.Any], issueType = issueType.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], serviceCode = serviceCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCreateCaseOptionsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeCreateCaseOptionsRequest] (val x: Self) extends AnyVal {
    
    inline def setCategoryCode(value: CategoryCode): Self = StObject.set(x, "categoryCode", value.asInstanceOf[js.Any])
    
    inline def setIssueType(value: IssueType): Self = StObject.set(x, "issueType", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: Language): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setServiceCode(value: ServiceCode): Self = StObject.set(x, "serviceCode", value.asInstanceOf[js.Any])
  }
}
