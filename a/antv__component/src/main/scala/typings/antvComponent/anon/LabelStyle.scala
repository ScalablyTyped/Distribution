package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelStyle extends StObject {
  
  var labelStyle: FontWeightNumber
  
  var tickLineStyle: LineWidthNumber
}
object LabelStyle {
  
  inline def apply(labelStyle: FontWeightNumber, tickLineStyle: LineWidthNumber): LabelStyle = {
    val __obj = js.Dynamic.literal(labelStyle = labelStyle.asInstanceOf[js.Any], tickLineStyle = tickLineStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelStyle]
  }
  
  extension [Self <: LabelStyle](x: Self) {
    
    inline def setLabelStyle(value: FontWeightNumber): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    inline def setTickLineStyle(value: LineWidthNumber): Self = StObject.set(x, "tickLineStyle", value.asInstanceOf[js.Any])
  }
}
