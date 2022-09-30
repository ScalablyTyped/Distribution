package typings.angularForms.anon

import typings.angularForms.angularFormsStrings.minlength
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Minlength extends StObject {
  
  var minlength: typings.angularForms.angularFormsStrings.minlength
}
object Minlength {
  
  inline def apply(): Minlength = {
    val __obj = js.Dynamic.literal(minlength = "minlength")
    __obj.asInstanceOf[Minlength]
  }
  
  extension [Self <: Minlength](x: Self) {
    
    inline def setMinlength(value: minlength): Self = StObject.set(x, "minlength", value.asInstanceOf[js.Any])
  }
}
