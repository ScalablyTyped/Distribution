package typings.awsSdk.clientsConnectcampaignsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteInstanceOnboardingJobRequest extends StObject {
  
  var connectInstanceId: InstanceId
}
object DeleteInstanceOnboardingJobRequest {
  
  inline def apply(connectInstanceId: InstanceId): DeleteInstanceOnboardingJobRequest = {
    val __obj = js.Dynamic.literal(connectInstanceId = connectInstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInstanceOnboardingJobRequest]
  }
  
  extension [Self <: DeleteInstanceOnboardingJobRequest](x: Self) {
    
    inline def setConnectInstanceId(value: InstanceId): Self = StObject.set(x, "connectInstanceId", value.asInstanceOf[js.Any])
  }
}
