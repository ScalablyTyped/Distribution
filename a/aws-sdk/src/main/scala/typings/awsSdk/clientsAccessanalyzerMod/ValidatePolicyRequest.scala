package typings.awsSdk.clientsAccessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidatePolicyRequest extends StObject {
  
  /**
    * The locale to use for localizing the findings.
    */
  var locale: js.UndefOr[Locale] = js.undefined
  
  /**
    * The maximum number of results to return in the response.
    */
  var maxResults: js.UndefOr[Integer] = js.undefined
  
  /**
    * A token used for pagination of results returned.
    */
  var nextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * The JSON policy document to use as the content for the policy.
    */
  var policyDocument: PolicyDocument
  
  /**
    * The type of policy to validate. Identity policies grant permissions to IAM principals. Identity policies include managed and inline policies for IAM roles, users, and groups. They also include service-control policies (SCPs) that are attached to an Amazon Web Services organization, organizational unit (OU), or an account. Resource policies grant permissions on Amazon Web Services resources. Resource policies include trust policies for IAM roles and bucket policies for Amazon S3 buckets. You can provide a generic input such as identity policy or resource policy or a specific input such as managed policy or Amazon S3 bucket policy. 
    */
  var policyType: PolicyType
  
  /**
    * The type of resource to attach to your resource policy. Specify a value for the policy validation resource type only if the policy type is RESOURCE_POLICY. For example, to validate a resource policy to attach to an Amazon S3 bucket, you can choose AWS::S3::Bucket for the policy validation resource type. For resource types not supported as valid values, IAM Access Analyzer runs policy checks that apply to all resource policies. For example, to validate a resource policy to attach to a KMS key, do not specify a value for the policy validation resource type and IAM Access Analyzer will run policy checks that apply to all resource policies.
    */
  var validatePolicyResourceType: js.UndefOr[ValidatePolicyResourceType] = js.undefined
}
object ValidatePolicyRequest {
  
  inline def apply(policyDocument: PolicyDocument, policyType: PolicyType): ValidatePolicyRequest = {
    val __obj = js.Dynamic.literal(policyDocument = policyDocument.asInstanceOf[js.Any], policyType = policyType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidatePolicyRequest]
  }
  
  extension [Self <: ValidatePolicyRequest](x: Self) {
    
    inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setMaxResults(value: Integer): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setPolicyDocument(value: PolicyDocument): Self = StObject.set(x, "policyDocument", value.asInstanceOf[js.Any])
    
    inline def setPolicyType(value: PolicyType): Self = StObject.set(x, "policyType", value.asInstanceOf[js.Any])
    
    inline def setValidatePolicyResourceType(value: ValidatePolicyResourceType): Self = StObject.set(x, "validatePolicyResourceType", value.asInstanceOf[js.Any])
    
    inline def setValidatePolicyResourceTypeUndefined: Self = StObject.set(x, "validatePolicyResourceType", js.undefined)
  }
}
