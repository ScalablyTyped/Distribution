package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlexDirectionString extends StObject {
  
  var flexDirection: String
}
object FlexDirectionString {
  
  inline def apply(flexDirection: String): FlexDirectionString = {
    val __obj = js.Dynamic.literal(flexDirection = flexDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexDirectionString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlexDirectionString] (val x: Self) extends AnyVal {
    
    inline def setFlexDirection(value: String): Self = StObject.set(x, "flexDirection", value.asInstanceOf[js.Any])
  }
}
