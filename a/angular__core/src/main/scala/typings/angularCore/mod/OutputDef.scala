package typings.angularCore.mod

import typings.angularCore.angularCoreStrings.body
import typings.angularCore.angularCoreStrings.component
import typings.angularCore.angularCoreStrings.document
import typings.angularCore.angularCoreStrings.window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutputDef extends js.Object {
  
  var eventName: String = js.native
  
  var propName: String | Null = js.native
  
  var target: window | document | body | component | Null = js.native
  
  var `type`: OutputType = js.native
}
object OutputDef {
  
  @scala.inline
  def apply(eventName: String, `type`: OutputType): OutputDef = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputDef]
  }
  
  @scala.inline
  implicit class OutputDefOps[Self <: OutputDef] (val x: Self) extends AnyVal {
    
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
    def setEventName(value: String): Self = this.set("eventName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: OutputType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropName(value: String): Self = this.set("propName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropNameNull: Self = this.set("propName", null)
    
    @scala.inline
    def setTarget(value: window | document | body | component): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetNull: Self = this.set("target", null)
  }
}
