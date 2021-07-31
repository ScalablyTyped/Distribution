package typings.antDesignPro.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Y1 extends StObject {
  
  var x: Double
  
  var y1: Double
  
  var y2: js.UndefOr[Double] = js.undefined
}
object Y1 {
  
  @scala.inline
  def apply(x: Double, y1: Double): Y1 = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any])
    __obj.asInstanceOf[Y1]
  }
  
  @scala.inline
  implicit class Y1MutableBuilder[Self <: Y1] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
  }
}
