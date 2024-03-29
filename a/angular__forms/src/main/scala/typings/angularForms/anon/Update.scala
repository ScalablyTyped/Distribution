package typings.angularForms.anon

import typings.angularForms.angularFormsStrings.ngModelChange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Update extends StObject {
  
  var update: ngModelChange
}
object Update {
  
  inline def apply(): Update = {
    val __obj = js.Dynamic.literal(update = "ngModelChange")
    __obj.asInstanceOf[Update]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Update] (val x: Self) extends AnyVal {
    
    inline def setUpdate(value: ngModelChange): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
  }
}
