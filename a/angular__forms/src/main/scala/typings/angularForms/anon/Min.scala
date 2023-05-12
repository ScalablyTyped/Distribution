package typings.angularForms.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Min extends StObject {
  
  var min: `13`
}
object Min {
  
  inline def apply(min: `13`): Min = {
    val __obj = js.Dynamic.literal(min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Min]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Min] (val x: Self) extends AnyVal {
    
    inline def setMin(value: `13`): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
  }
}
