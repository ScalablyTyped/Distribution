package typings.awsSdk.clientsAccessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGeneratedPolicyRequest extends StObject {
  
  /**
    * The level of detail that you want to generate. You can specify whether to generate policies with placeholders for resource ARNs for actions that support resource level granularity in policies. For example, in the resource section of a policy, you can receive a placeholder such as "Resource":"arn:aws:s3:::${BucketName}" instead of "*".
    */
  var includeResourcePlaceholders: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The level of detail that you want to generate. You can specify whether to generate service-level policies.  IAM Access Analyzer uses iam:servicelastaccessed to identify services that have been used recently to create this service-level template.
    */
  var includeServiceLevelTemplate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The JobId that is returned by the StartPolicyGeneration operation. The JobId can be used with GetGeneratedPolicy to retrieve the generated policies or used with CancelPolicyGeneration to cancel the policy generation request.
    */
  var jobId: JobId
}
object GetGeneratedPolicyRequest {
  
  inline def apply(jobId: JobId): GetGeneratedPolicyRequest = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGeneratedPolicyRequest]
  }
  
  extension [Self <: GetGeneratedPolicyRequest](x: Self) {
    
    inline def setIncludeResourcePlaceholders(value: Boolean): Self = StObject.set(x, "includeResourcePlaceholders", value.asInstanceOf[js.Any])
    
    inline def setIncludeResourcePlaceholdersUndefined: Self = StObject.set(x, "includeResourcePlaceholders", js.undefined)
    
    inline def setIncludeServiceLevelTemplate(value: Boolean): Self = StObject.set(x, "includeServiceLevelTemplate", value.asInstanceOf[js.Any])
    
    inline def setIncludeServiceLevelTemplateUndefined: Self = StObject.set(x, "includeServiceLevelTemplate", js.undefined)
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
  }
}
