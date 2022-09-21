package typings.awsSdk.accessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidatePolicyFinding extends StObject {
  
  /**
    * A localized message that explains the finding and provides guidance on how to address it.
    */
  var findingDetails: String
  
  /**
    * The impact of the finding. Security warnings report when the policy allows access that we consider overly permissive. Errors report when a part of the policy is not functional. Warnings report non-security issues when a policy does not conform to policy writing best practices. Suggestions recommend stylistic improvements in the policy that do not impact access.
    */
  var findingType: ValidatePolicyFindingType
  
  /**
    * The issue code provides an identifier of the issue associated with this finding.
    */
  var issueCode: IssueCode
  
  /**
    * A link to additional documentation about the type of finding.
    */
  var learnMoreLink: LearnMoreLink
  
  /**
    * The list of locations in the policy document that are related to the finding. The issue code provides a summary of an issue identified by the finding.
    */
  var locations: LocationList
}
object ValidatePolicyFinding {
  
  inline def apply(
    findingDetails: String,
    findingType: ValidatePolicyFindingType,
    issueCode: IssueCode,
    learnMoreLink: LearnMoreLink,
    locations: LocationList
  ): ValidatePolicyFinding = {
    val __obj = js.Dynamic.literal(findingDetails = findingDetails.asInstanceOf[js.Any], findingType = findingType.asInstanceOf[js.Any], issueCode = issueCode.asInstanceOf[js.Any], learnMoreLink = learnMoreLink.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidatePolicyFinding]
  }
  
  extension [Self <: ValidatePolicyFinding](x: Self) {
    
    inline def setFindingDetails(value: String): Self = StObject.set(x, "findingDetails", value.asInstanceOf[js.Any])
    
    inline def setFindingType(value: ValidatePolicyFindingType): Self = StObject.set(x, "findingType", value.asInstanceOf[js.Any])
    
    inline def setIssueCode(value: IssueCode): Self = StObject.set(x, "issueCode", value.asInstanceOf[js.Any])
    
    inline def setLearnMoreLink(value: LearnMoreLink): Self = StObject.set(x, "learnMoreLink", value.asInstanceOf[js.Any])
    
    inline def setLocations(value: LocationList): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    inline def setLocationsVarargs(value: Location*): Self = StObject.set(x, "locations", js.Array(value*))
  }
}
