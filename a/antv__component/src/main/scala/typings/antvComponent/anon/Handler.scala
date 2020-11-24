package typings.antvComponent.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Handler extends js.Object {
  
  var handler: Size = js.native
  
  var label: Formatter = js.native
  
  var rail: DefaultLength = js.native
  
  var title: Spacing = js.native
}
object Handler {
  
  @scala.inline
  def apply(handler: Size, label: Formatter, rail: DefaultLength, title: Spacing): Handler = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], rail = rail.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Handler]
  }
  
  @scala.inline
  implicit class HandlerOps[Self <: Handler] (val x: Self) extends AnyVal {
    
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
    def setHandler(value: Size): Self = this.set("handler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Formatter): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRail(value: DefaultLength): Self = this.set("rail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: Spacing): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
