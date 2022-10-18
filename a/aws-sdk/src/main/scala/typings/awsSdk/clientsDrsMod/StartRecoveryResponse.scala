package typings.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartRecoveryResponse extends StObject {
  
  /**
    * The Recovery Job.
    */
  var job: js.UndefOr[Job] = js.undefined
}
object StartRecoveryResponse {
  
  inline def apply(): StartRecoveryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartRecoveryResponse]
  }
  
  extension [Self <: StartRecoveryResponse](x: Self) {
    
    inline def setJob(value: Job): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
    
    inline def setJobUndefined: Self = StObject.set(x, "job", js.undefined)
  }
}
