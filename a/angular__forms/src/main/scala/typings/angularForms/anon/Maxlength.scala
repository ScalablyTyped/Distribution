package typings.angularForms.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Maxlength extends StObject {
  
  var maxlength: `10`
}
object Maxlength {
  
  inline def apply(maxlength: `10`): Maxlength = {
    val __obj = js.Dynamic.literal(maxlength = maxlength.asInstanceOf[js.Any])
    __obj.asInstanceOf[Maxlength]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Maxlength] (val x: Self) extends AnyVal {
    
    inline def setMaxlength(value: `10`): Self = StObject.set(x, "maxlength", value.asInstanceOf[js.Any])
  }
}
