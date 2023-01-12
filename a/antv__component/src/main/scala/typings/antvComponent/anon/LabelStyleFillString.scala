package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelStyleFillString extends StObject {
  
  var labelStyle: FillString
}
object LabelStyleFillString {
  
  inline def apply(labelStyle: FillString): LabelStyleFillString = {
    val __obj = js.Dynamic.literal(labelStyle = labelStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelStyleFillString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LabelStyleFillString] (val x: Self) extends AnyVal {
    
    inline def setLabelStyle(value: FillString): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
  }
}
