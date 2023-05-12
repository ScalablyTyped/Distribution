package typings.antdMobile.anon

import typings.antdMobile.antdMobileStrings.onMouseDown
import typings.antdMobile.antdMobileStrings.onMouseMove
import typings.antdMobile.antdMobileStrings.onMouseUp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mousedown extends StObject {
  
  val mousedown: onMouseDown
  
  val mousemove: onMouseMove
  
  val mouseup: onMouseUp
}
object Mousedown {
  
  inline def apply(): Mousedown = {
    val __obj = js.Dynamic.literal(mousedown = "onMouseDown", mousemove = "onMouseMove", mouseup = "onMouseUp")
    __obj.asInstanceOf[Mousedown]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Mousedown] (val x: Self) extends AnyVal {
    
    inline def setMousedown(value: onMouseDown): Self = StObject.set(x, "mousedown", value.asInstanceOf[js.Any])
    
    inline def setMousemove(value: onMouseMove): Self = StObject.set(x, "mousemove", value.asInstanceOf[js.Any])
    
    inline def setMouseup(value: onMouseUp): Self = StObject.set(x, "mouseup", value.asInstanceOf[js.Any])
  }
}
