package typings.angularForms.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Minlength extends StObject {
  
  var minlength: `12`
}
object Minlength {
  
  inline def apply(minlength: `12`): Minlength = {
    val __obj = js.Dynamic.literal(minlength = minlength.asInstanceOf[js.Any])
    __obj.asInstanceOf[Minlength]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Minlength] (val x: Self) extends AnyVal {
    
    inline def setMinlength(value: `12`): Self = StObject.set(x, "minlength", value.asInstanceOf[js.Any])
  }
}
