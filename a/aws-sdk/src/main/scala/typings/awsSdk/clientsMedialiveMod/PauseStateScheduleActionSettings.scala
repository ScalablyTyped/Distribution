package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PauseStateScheduleActionSettings extends StObject {
  
  var Pipelines: js.UndefOr[listOfPipelinePauseStateSettings] = js.undefined
}
object PauseStateScheduleActionSettings {
  
  inline def apply(): PauseStateScheduleActionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PauseStateScheduleActionSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PauseStateScheduleActionSettings] (val x: Self) extends AnyVal {
    
    inline def setPipelines(value: listOfPipelinePauseStateSettings): Self = StObject.set(x, "Pipelines", value.asInstanceOf[js.Any])
    
    inline def setPipelinesUndefined: Self = StObject.set(x, "Pipelines", js.undefined)
    
    inline def setPipelinesVarargs(value: PipelinePauseStateSettings*): Self = StObject.set(x, "Pipelines", js.Array(value*))
  }
}
