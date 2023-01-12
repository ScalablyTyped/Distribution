package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopExperimentResponse extends StObject {
  
  /**
    * The date and time that the experiment stopped.
    */
  var endedTime: js.UndefOr[js.Date] = js.undefined
}
object StopExperimentResponse {
  
  inline def apply(): StopExperimentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopExperimentResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopExperimentResponse] (val x: Self) extends AnyVal {
    
    inline def setEndedTime(value: js.Date): Self = StObject.set(x, "endedTime", value.asInstanceOf[js.Any])
    
    inline def setEndedTimeUndefined: Self = StObject.set(x, "endedTime", js.undefined)
  }
}
