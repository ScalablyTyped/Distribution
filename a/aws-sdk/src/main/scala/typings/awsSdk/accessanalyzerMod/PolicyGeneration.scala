package typings.awsSdk.accessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyGeneration extends StObject {
  
  /**
    * A timestamp of when the policy generation was completed.
    */
  var completedOn: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The JobId that is returned by the StartPolicyGeneration operation. The JobId can be used with GetGeneratedPolicy to retrieve the generated policies or used with CancelPolicyGeneration to cancel the policy generation request.
    */
  var jobId: JobId
  
  /**
    * The ARN of the IAM entity (user or role) for which you are generating a policy.
    */
  var principalArn: PrincipalArn
  
  /**
    * A timestamp of when the policy generation started.
    */
  var startedOn: js.Date
  
  /**
    * The status of the policy generation request.
    */
  var status: JobStatus
}
object PolicyGeneration {
  
  inline def apply(jobId: JobId, principalArn: PrincipalArn, startedOn: js.Date, status: JobStatus): PolicyGeneration = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], principalArn = principalArn.asInstanceOf[js.Any], startedOn = startedOn.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyGeneration]
  }
  
  extension [Self <: PolicyGeneration](x: Self) {
    
    inline def setCompletedOn(value: js.Date): Self = StObject.set(x, "completedOn", value.asInstanceOf[js.Any])
    
    inline def setCompletedOnUndefined: Self = StObject.set(x, "completedOn", js.undefined)
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setPrincipalArn(value: PrincipalArn): Self = StObject.set(x, "principalArn", value.asInstanceOf[js.Any])
    
    inline def setStartedOn(value: js.Date): Self = StObject.set(x, "startedOn", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: JobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
