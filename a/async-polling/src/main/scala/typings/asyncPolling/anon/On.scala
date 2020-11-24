package typings.asyncPolling.anon

import typings.asyncPolling.mod.EventName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait On extends js.Object {
  
  def on(eventName: EventName, listener: js.Function): js.Any = js.native
  
  def run(): js.Any = js.native
  
  def stop(): js.Any = js.native
}
object On {
  
  @scala.inline
  def apply(on: (EventName, js.Function) => js.Any, run: () => js.Any, stop: () => js.Any): On = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction2(on), run = js.Any.fromFunction0(run), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[On]
  }
  
  @scala.inline
  implicit class OnOps[Self <: On] (val x: Self) extends AnyVal {
    
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
    def setOn(value: (EventName, js.Function) => js.Any): Self = this.set("on", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRun(value: () => js.Any): Self = this.set("run", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStop(value: () => js.Any): Self = this.set("stop", js.Any.fromFunction0(value))
  }
}
