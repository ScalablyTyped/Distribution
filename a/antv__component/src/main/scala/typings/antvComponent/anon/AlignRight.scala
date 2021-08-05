package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlignRight extends StObject {
  
  var alignRight: Boolean
  
  var formatter: js.Any
  
  var style: FillFontSize
}
object AlignRight {
  
  inline def apply(alignRight: Boolean, formatter: js.Any, style: FillFontSize): AlignRight = {
    val __obj = js.Dynamic.literal(alignRight = alignRight.asInstanceOf[js.Any], formatter = formatter.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlignRight]
  }
  
  extension [Self <: AlignRight](x: Self) {
    
    inline def setAlignRight(value: Boolean): Self = StObject.set(x, "alignRight", value.asInstanceOf[js.Any])
    
    inline def setFormatter(value: js.Any): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: FillFontSize): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
