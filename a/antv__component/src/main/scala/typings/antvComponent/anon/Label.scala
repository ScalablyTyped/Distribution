package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Label extends StObject {
  
  var label: AutoHide
  
  var line: StyleStroke
  
  var optimize: Enable
  
  var subTickLine: Count
  
  var tickLine: AlignTick
  
  var tickStates: Active
  
  var title: Description
}
object Label {
  
  inline def apply(
    label: AutoHide,
    line: StyleStroke,
    optimize: Enable,
    subTickLine: Count,
    tickLine: AlignTick,
    tickStates: Active,
    title: Description
  ): Label = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], optimize = optimize.asInstanceOf[js.Any], subTickLine = subTickLine.asInstanceOf[js.Any], tickLine = tickLine.asInstanceOf[js.Any], tickStates = tickStates.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
  
  extension [Self <: Label](x: Self) {
    
    inline def setLabel(value: AutoHide): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLine(value: StyleStroke): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setOptimize(value: Enable): Self = StObject.set(x, "optimize", value.asInstanceOf[js.Any])
    
    inline def setSubTickLine(value: Count): Self = StObject.set(x, "subTickLine", value.asInstanceOf[js.Any])
    
    inline def setTickLine(value: AlignTick): Self = StObject.set(x, "tickLine", value.asInstanceOf[js.Any])
    
    inline def setTickStates(value: Active): Self = StObject.set(x, "tickStates", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: Description): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
