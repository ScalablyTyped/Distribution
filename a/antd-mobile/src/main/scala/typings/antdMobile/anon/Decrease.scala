package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Decrease extends StObject {
  
  var decrease: String
  
  var increase: String
}
object Decrease {
  
  inline def apply(decrease: String, increase: String): Decrease = {
    val __obj = js.Dynamic.literal(decrease = decrease.asInstanceOf[js.Any], increase = increase.asInstanceOf[js.Any])
    __obj.asInstanceOf[Decrease]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Decrease] (val x: Self) extends AnyVal {
    
    inline def setDecrease(value: String): Self = StObject.set(x, "decrease", value.asInstanceOf[js.Any])
    
    inline def setIncrease(value: String): Self = StObject.set(x, "increase", value.asInstanceOf[js.Any])
  }
}
