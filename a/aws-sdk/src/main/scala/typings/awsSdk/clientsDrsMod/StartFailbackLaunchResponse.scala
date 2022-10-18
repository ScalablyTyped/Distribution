package typings.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartFailbackLaunchResponse extends StObject {
  
  /**
    * The failback launch Job.
    */
  var job: js.UndefOr[Job] = js.undefined
}
object StartFailbackLaunchResponse {
  
  inline def apply(): StartFailbackLaunchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartFailbackLaunchResponse]
  }
  
  extension [Self <: StartFailbackLaunchResponse](x: Self) {
    
    inline def setJob(value: Job): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
    
    inline def setJobUndefined: Self = StObject.set(x, "job", js.undefined)
  }
}
