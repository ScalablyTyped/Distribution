package typings.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerminateRecoveryInstancesResponse extends StObject {
  
  /**
    * The Job for terminating the Recovery Instances.
    */
  var job: js.UndefOr[Job] = js.undefined
}
object TerminateRecoveryInstancesResponse {
  
  inline def apply(): TerminateRecoveryInstancesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminateRecoveryInstancesResponse]
  }
  
  extension [Self <: TerminateRecoveryInstancesResponse](x: Self) {
    
    inline def setJob(value: Job): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
    
    inline def setJobUndefined: Self = StObject.set(x, "job", js.undefined)
  }
}
