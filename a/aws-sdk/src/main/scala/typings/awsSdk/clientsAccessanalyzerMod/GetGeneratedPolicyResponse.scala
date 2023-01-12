package typings.awsSdk.clientsAccessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGeneratedPolicyResponse extends StObject {
  
  /**
    * A GeneratedPolicyResult object that contains the generated policies and associated details.
    */
  var generatedPolicyResult: GeneratedPolicyResult
  
  /**
    * A GeneratedPolicyDetails object that contains details about the generated policy.
    */
  var jobDetails: JobDetails
}
object GetGeneratedPolicyResponse {
  
  inline def apply(generatedPolicyResult: GeneratedPolicyResult, jobDetails: JobDetails): GetGeneratedPolicyResponse = {
    val __obj = js.Dynamic.literal(generatedPolicyResult = generatedPolicyResult.asInstanceOf[js.Any], jobDetails = jobDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGeneratedPolicyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetGeneratedPolicyResponse] (val x: Self) extends AnyVal {
    
    inline def setGeneratedPolicyResult(value: GeneratedPolicyResult): Self = StObject.set(x, "generatedPolicyResult", value.asInstanceOf[js.Any])
    
    inline def setJobDetails(value: JobDetails): Self = StObject.set(x, "jobDetails", value.asInstanceOf[js.Any])
  }
}
