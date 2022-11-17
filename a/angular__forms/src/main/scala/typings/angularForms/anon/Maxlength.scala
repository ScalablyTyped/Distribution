package typings.angularForms.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Maxlength extends StObject {
  
  var maxlength: "maxlength"
}
object Maxlength {
  
  inline def apply(): Maxlength = {
    val __obj = js.Dynamic.literal(maxlength = "maxlength")
    __obj.asInstanceOf[Maxlength]
  }
  
  extension [Self <: Maxlength](x: Self) {
    
    inline def setMaxlength(value: "maxlength"): Self = StObject.set(x, "maxlength", value.asInstanceOf[js.Any])
  }
}
