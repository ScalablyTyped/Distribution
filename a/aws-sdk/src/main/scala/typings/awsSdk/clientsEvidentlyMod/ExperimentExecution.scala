package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExperimentExecution extends StObject {
  
  /**
    * The date and time that the experiment ended.
    */
  var endedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date and time that the experiment started.
    */
  var startedTime: js.UndefOr[js.Date] = js.undefined
}
object ExperimentExecution {
  
  inline def apply(): ExperimentExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExperimentExecution]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExperimentExecution] (val x: Self) extends AnyVal {
    
    inline def setEndedTime(value: js.Date): Self = StObject.set(x, "endedTime", value.asInstanceOf[js.Any])
    
    inline def setEndedTimeUndefined: Self = StObject.set(x, "endedTime", js.undefined)
    
    inline def setStartedTime(value: js.Date): Self = StObject.set(x, "startedTime", value.asInstanceOf[js.Any])
    
    inline def setStartedTimeUndefined: Self = StObject.set(x, "startedTime", js.undefined)
  }
}
