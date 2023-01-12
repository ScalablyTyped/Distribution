package typings.angularForms.anon

import typings.angularForms.angularFormsStrings.ngFormOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var options: ngFormOptions
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal(options = "ngFormOptions")
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    inline def setOptions(value: ngFormOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
