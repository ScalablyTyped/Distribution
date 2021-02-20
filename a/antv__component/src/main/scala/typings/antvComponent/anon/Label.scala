package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Label extends StObject {
  
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
  implicit class LabelMutableBuilder[Self <: Label] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: AutoHide): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: StyleStroke): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubTickLine(value: Count): Self = StObject.set(x, "subTickLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickLine(value: AlignTick): Self = StObject.set(x, "tickLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickStates(value: Active): Self = StObject.set(x, "tickStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: Position): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
