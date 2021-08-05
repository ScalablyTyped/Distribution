package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Formatter extends StObject {
  
  var align: String
  
  var formatter: js.Any
  
  var spacing: Double
  
  var style: FontFamilyFontSize
}
object Formatter {
  
  inline def apply(align: String, formatter: js.Any, spacing: Double, style: FontFamilyFontSize): Formatter = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], formatter = formatter.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Formatter]
  }
  
  extension [Self <: Formatter](x: Self) {
    
    inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setFormatter(value: js.Any): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
    
    inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: FontFamilyFontSize): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
