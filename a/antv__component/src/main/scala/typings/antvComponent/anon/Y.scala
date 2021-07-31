package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Y extends StObject {
  
  var x: js.Any
  
  var y: js.Any
}
object Y {
  
  @scala.inline
  def apply(x: js.Any, y: js.Any): Y = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Y]
  }
  
  @scala.inline
  implicit class YMutableBuilder[Self <: Y] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: js.Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: js.Any): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
