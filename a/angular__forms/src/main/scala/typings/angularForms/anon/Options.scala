package typings.angularForms.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var options: "ngFormOptions"
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal(options = "ngFormOptions")
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setOptions(value: "ngFormOptions"): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
