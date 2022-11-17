package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NgPlural extends StObject {
  
  var ngPlural: "ngPlural"
}
object NgPlural {
  
  inline def apply(): NgPlural = {
    val __obj = js.Dynamic.literal(ngPlural = "ngPlural")
    __obj.asInstanceOf[NgPlural]
  }
  
  extension [Self <: NgPlural](x: Self) {
    
    inline def setNgPlural(value: "ngPlural"): Self = StObject.set(x, "ngPlural", value.asInstanceOf[js.Any])
  }
}
