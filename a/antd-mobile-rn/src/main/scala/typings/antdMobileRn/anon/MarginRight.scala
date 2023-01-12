package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarginRight extends StObject {
  
  var marginRight: Double
}
object MarginRight {
  
  inline def apply(marginRight: Double): MarginRight = {
    val __obj = js.Dynamic.literal(marginRight = marginRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarginRight]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MarginRight] (val x: Self) extends AnyVal {
    
    inline def setMarginRight(value: Double): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
  }
}
