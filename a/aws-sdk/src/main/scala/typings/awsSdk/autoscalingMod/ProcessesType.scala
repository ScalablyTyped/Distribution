package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProcessesType extends js.Object {
  
  /**
    * The names of the process types.
    */
  var Processes: js.UndefOr[typings.awsSdk.autoscalingMod.Processes] = js.native
}
object ProcessesType {
  
  @scala.inline
  def apply(): ProcessesType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessesType]
  }
  
  @scala.inline
  implicit class ProcessesTypeOps[Self <: ProcessesType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setProcessesVarargs(value: ProcessType*): Self = this.set("Processes", js.Array(value :_*))
    
    @scala.inline
    def setProcesses(value: Processes): Self = this.set("Processes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcesses: Self = this.set("Processes", js.undefined)
  }
}
