package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessesType extends StObject {
  
  /**
    * The names of the process types.
    */
  var Processes: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.Processes] = js.undefined
}
object ProcessesType {
  
  inline def apply(): ProcessesType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessesType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProcessesType] (val x: Self) extends AnyVal {
    
    inline def setProcesses(value: Processes): Self = StObject.set(x, "Processes", value.asInstanceOf[js.Any])
    
    inline def setProcessesUndefined: Self = StObject.set(x, "Processes", js.undefined)
    
    inline def setProcessesVarargs(value: ProcessType*): Self = StObject.set(x, "Processes", js.Array(value*))
  }
}
