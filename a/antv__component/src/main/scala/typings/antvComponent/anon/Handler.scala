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
  
  @scala.inline
  def apply(handler: Size, label: Formatter, rail: DefaultLength, title: Spacing): Handler = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], rail = rail.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Handler]
  }
  
  @scala.inline
  implicit class HandlerMutableBuilder[Self <: Handler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandler(value: Size): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Formatter): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRail(value: DefaultLength): Self = StObject.set(x, "rail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: Spacing): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
