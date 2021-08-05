package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Handler extends StObject {
  
  var handler: Size
  
  var label: Formatter
  
  var rail: DefaultLength
  
  var title: Spacing
}
object Handler {
  
  inline def apply(handler: Size, label: Formatter, rail: DefaultLength, title: Spacing): Handler = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], rail = rail.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Handler]
  }
  
  extension [Self <: Handler](x: Self) {
    
    inline def setHandler(value: Size): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Formatter): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setRail(value: DefaultLength): Self = StObject.set(x, "rail", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: Spacing): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
