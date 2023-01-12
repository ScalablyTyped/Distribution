package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarginHorizontal extends StObject {
  
  var marginHorizontal: Double
  
  var marginVertical: Double
}
object MarginHorizontal {
  
  inline def apply(marginHorizontal: Double, marginVertical: Double): MarginHorizontal = {
    val __obj = js.Dynamic.literal(marginHorizontal = marginHorizontal.asInstanceOf[js.Any], marginVertical = marginVertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarginHorizontal]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MarginHorizontal] (val x: Self) extends AnyVal {
    
    inline def setMarginHorizontal(value: Double): Self = StObject.set(x, "marginHorizontal", value.asInstanceOf[js.Any])
    
    inline def setMarginVertical(value: Double): Self = StObject.set(x, "marginVertical", value.asInstanceOf[js.Any])
  }
}
