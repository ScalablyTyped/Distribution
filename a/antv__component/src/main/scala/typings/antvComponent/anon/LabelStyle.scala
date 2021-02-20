package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelStyle extends StObject {
  
  var labelStyle: FontWeightNumber = js.native
  
  var tickLineStyle: LineWidthNumber = js.native
}
object LabelStyle {
  
  @scala.inline
  def apply(labelStyle: FontWeightNumber, tickLineStyle: LineWidthNumber): LabelStyle = {
    val __obj = js.Dynamic.literal(labelStyle = labelStyle.asInstanceOf[js.Any], tickLineStyle = tickLineStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelStyle]
  }
  
  @scala.inline
  implicit class LabelStyleMutableBuilder[Self <: LabelStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabelStyle(value: FontWeightNumber): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickLineStyle(value: LineWidthNumber): Self = StObject.set(x, "tickLineStyle", value.asInstanceOf[js.Any])
  }
}
