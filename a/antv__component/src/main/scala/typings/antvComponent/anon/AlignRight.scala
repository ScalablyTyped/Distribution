package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlignRight extends StObject {
  
  var alignRight: Boolean
  
  var formatter: Any
  
  var spacing: Double
  
  var style: LineHeight
}
object AlignRight {
  
  inline def apply(alignRight: Boolean, formatter: Any, spacing: Double, style: LineHeight): AlignRight = {
    val __obj = js.Dynamic.literal(alignRight = alignRight.asInstanceOf[js.Any], formatter = formatter.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlignRight]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AlignRight] (val x: Self) extends AnyVal {
    
    inline def setAlignRight(value: Boolean): Self = StObject.set(x, "alignRight", value.asInstanceOf[js.Any])
    
    inline def setFormatter(value: Any): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
    
    inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: LineHeight): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
