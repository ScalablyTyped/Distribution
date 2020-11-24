package typings.antvComponent.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Label extends js.Object {
  
  var label: AutoHide = js.native
  
  var line: StyleStroke = js.native
  
  var subTickLine: Count = js.native
  
  var tickLine: AlignTick = js.native
  
  var tickStates: Active = js.native
  
  var title: Position = js.native
}
object Label {
  
  @scala.inline
  def apply(
    label: AutoHide,
    line: StyleStroke,
    subTickLine: Count,
    tickLine: AlignTick,
    tickStates: Active,
    title: Position
  ): Label = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], subTickLine = subTickLine.asInstanceOf[js.Any], tickLine = tickLine.asInstanceOf[js.Any], tickStates = tickStates.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
  
  @scala.inline
  implicit class LabelOps[Self <: Label] (val x: Self) extends AnyVal {
    
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
    def setLabel(value: AutoHide): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: StyleStroke): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubTickLine(value: Count): Self = this.set("subTickLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickLine(value: AlignTick): Self = this.set("tickLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickStates(value: Active): Self = this.set("tickStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: Position): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
