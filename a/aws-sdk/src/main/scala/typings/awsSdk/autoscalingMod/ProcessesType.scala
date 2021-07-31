package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessesType extends StObject {
  
  /**
    * The names of the process types.
    */
  var Processes: js.UndefOr[typings.awsSdk.autoscalingMod.Processes] = js.undefined
}
object ProcessesType {
  
  @scala.inline
  def apply(): ProcessesType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessesType]
  }
  
  @scala.inline
  implicit class ProcessesTypeMutableBuilder[Self <: ProcessesType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProcesses(value: Processes): Self = StObject.set(x, "Processes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessesUndefined: Self = StObject.set(x, "Processes", js.undefined)
    
    @scala.inline
    def setProcessesVarargs(value: ProcessType*): Self = StObject.set(x, "Processes", js.Array(value :_*))
  }
}
