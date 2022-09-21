package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpacingNumber extends StObject {
  
  var spacing: Double
  
  var style: R
}
object SpacingNumber {
  
  inline def apply(spacing: Double, style: R): SpacingNumber = {
    val __obj = js.Dynamic.literal(spacing = spacing.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpacingNumber]
  }
  
  extension [Self <: SpacingNumber](x: Self) {
    
    inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: R): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
