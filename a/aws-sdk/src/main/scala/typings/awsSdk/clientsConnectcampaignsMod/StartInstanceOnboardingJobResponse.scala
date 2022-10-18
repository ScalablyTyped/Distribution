package typings.awsSdk.clientsConnectcampaignsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartInstanceOnboardingJobResponse extends StObject {
  
  var connectInstanceOnboardingJobStatus: js.UndefOr[InstanceOnboardingJobStatus] = js.undefined
}
object StartInstanceOnboardingJobResponse {
  
  inline def apply(): StartInstanceOnboardingJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartInstanceOnboardingJobResponse]
  }
  
  extension [Self <: StartInstanceOnboardingJobResponse](x: Self) {
    
    inline def setConnectInstanceOnboardingJobStatus(value: InstanceOnboardingJobStatus): Self = StObject.set(x, "connectInstanceOnboardingJobStatus", value.asInstanceOf[js.Any])
    
    inline def setConnectInstanceOnboardingJobStatusUndefined: Self = StObject.set(x, "connectInstanceOnboardingJobStatus", js.undefined)
  }
}
