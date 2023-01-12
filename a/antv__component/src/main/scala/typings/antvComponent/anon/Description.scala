package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Description extends StObject {
  
  var autoRotate: Boolean
  
  var description: String
  
  var iconStyle: FillStroke
  
  var position: String
  
  var spacing: Double
  
  var style: TextBaseline
}
object Description {
  
  inline def apply(
    autoRotate: Boolean,
    description: String,
    iconStyle: FillStroke,
    position: String,
    spacing: Double,
    style: TextBaseline
  ): Description = {
    val __obj = js.Dynamic.literal(autoRotate = autoRotate.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], iconStyle = iconStyle.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Description]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Description] (val x: Self) extends AnyVal {
    
    inline def setAutoRotate(value: Boolean): Self = StObject.set(x, "autoRotate", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setIconStyle(value: FillStroke): Self = StObject.set(x, "iconStyle", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: TextBaseline): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
