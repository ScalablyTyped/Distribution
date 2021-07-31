package typings.antDesignPro.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Y2 extends StObject {
  
  var y1: String
  
  var y2: js.UndefOr[String] = js.undefined
}
object Y2 {
  
  @scala.inline
  def apply(y1: String): Y2 = {
    val __obj = js.Dynamic.literal(y1 = y1.asInstanceOf[js.Any])
    __obj.asInstanceOf[Y2]
  }
  
  @scala.inline
  implicit class Y2MutableBuilder[Self <: Y2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setY1(value: String): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY2(value: String): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
  }
}
