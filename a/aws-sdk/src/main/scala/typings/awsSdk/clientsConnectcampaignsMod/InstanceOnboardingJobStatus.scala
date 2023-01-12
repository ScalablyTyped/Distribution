package typings.awsSdk.clientsConnectcampaignsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceOnboardingJobStatus extends StObject {
  
  var connectInstanceId: InstanceId
  
  var failureCode: js.UndefOr[InstanceOnboardingJobFailureCode] = js.undefined
  
  var status: InstanceOnboardingJobStatusCode
}
object InstanceOnboardingJobStatus {
  
  inline def apply(connectInstanceId: InstanceId, status: InstanceOnboardingJobStatusCode): InstanceOnboardingJobStatus = {
    val __obj = js.Dynamic.literal(connectInstanceId = connectInstanceId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceOnboardingJobStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstanceOnboardingJobStatus] (val x: Self) extends AnyVal {
    
    inline def setConnectInstanceId(value: InstanceId): Self = StObject.set(x, "connectInstanceId", value.asInstanceOf[js.Any])
    
    inline def setFailureCode(value: InstanceOnboardingJobFailureCode): Self = StObject.set(x, "failureCode", value.asInstanceOf[js.Any])
    
    inline def setFailureCodeUndefined: Self = StObject.set(x, "failureCode", js.undefined)
    
    inline def setStatus(value: InstanceOnboardingJobStatusCode): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
