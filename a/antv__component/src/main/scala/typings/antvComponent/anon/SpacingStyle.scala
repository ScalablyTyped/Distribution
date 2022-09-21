package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpacingStyle extends StObject {
  
  var spacing: Double
  
  var style: LineHeight
}
object SpacingStyle {
  
  inline def apply(spacing: Double, style: LineHeight): SpacingStyle = {
    val __obj = js.Dynamic.literal(spacing = spacing.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpacingStyle]
  }
  
  extension [Self <: SpacingStyle](x: Self) {
    
    inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: LineHeight): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
