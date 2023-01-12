package typings.awsSdk.clientsConnectcampaignsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInstanceOnboardingJobStatusResponse extends StObject {
  
  var connectInstanceOnboardingJobStatus: js.UndefOr[InstanceOnboardingJobStatus] = js.undefined
}
object GetInstanceOnboardingJobStatusResponse {
  
  inline def apply(): GetInstanceOnboardingJobStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInstanceOnboardingJobStatusResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetInstanceOnboardingJobStatusResponse] (val x: Self) extends AnyVal {
    
    inline def setConnectInstanceOnboardingJobStatus(value: InstanceOnboardingJobStatus): Self = StObject.set(x, "connectInstanceOnboardingJobStatus", value.asInstanceOf[js.Any])
    
    inline def setConnectInstanceOnboardingJobStatusUndefined: Self = StObject.set(x, "connectInstanceOnboardingJobStatus", js.undefined)
  }
}
