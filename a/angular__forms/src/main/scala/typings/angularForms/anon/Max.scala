package typings.angularForms.anon

import typings.angularForms.angularFormsStrings.max
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Max extends StObject {
  
  var max: typings.angularForms.angularFormsStrings.max
}
object Max {
  
  inline def apply(): Max = {
    val __obj = js.Dynamic.literal(max = "max")
    __obj.asInstanceOf[Max]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Max] (val x: Self) extends AnyVal {
    
    inline def setMax(value: max): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
  }
}
