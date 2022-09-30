package typings.angularForms.anon

import typings.angularForms.angularFormsStrings.ngSubmit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NgSubmit extends StObject {
  
  var ngSubmit: typings.angularForms.angularFormsStrings.ngSubmit
}
object NgSubmit {
  
  inline def apply(): NgSubmit = {
    val __obj = js.Dynamic.literal(ngSubmit = "ngSubmit")
    __obj.asInstanceOf[NgSubmit]
  }
  
  extension [Self <: NgSubmit](x: Self) {
    
    inline def setNgSubmit(value: ngSubmit): Self = StObject.set(x, "ngSubmit", value.asInstanceOf[js.Any])
  }
}
