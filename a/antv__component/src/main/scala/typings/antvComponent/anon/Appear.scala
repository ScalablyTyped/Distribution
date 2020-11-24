package typings.antvComponent.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Appear extends js.Object {
  
  var appear: js.Any = js.native
  
  var enter: Duration = js.native
  
  var leave: Duration = js.native
  
  var update: Duration = js.native
}
object Appear {
  
  @scala.inline
  def apply(appear: js.Any, enter: Duration, leave: Duration, update: Duration): Appear = {
    val __obj = js.Dynamic.literal(appear = appear.asInstanceOf[js.Any], enter = enter.asInstanceOf[js.Any], leave = leave.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appear]
  }
  
  @scala.inline
  implicit class AppearOps[Self <: Appear] (val x: Self) extends AnyVal {
    
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
    def setAppear(value: js.Any): Self = this.set("appear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnter(value: Duration): Self = this.set("enter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeave(value: Duration): Self = this.set("leave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: Duration): Self = this.set("update", value.asInstanceOf[js.Any])
  }
}
