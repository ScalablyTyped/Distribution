package typings.angularCore.mod

import typings.angularCore.angularCoreStrings.ICU
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICU_MARKER extends StObject {
  
  var marker: ICU
}
object ICU_MARKER {
  
  inline def apply(): ICU_MARKER = {
    val __obj = js.Dynamic.literal(marker = "ICU")
    __obj.asInstanceOf[ICU_MARKER]
  }
  
  extension [Self <: ICU_MARKER](x: Self) {
    
    inline def setMarker(value: ICU): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
  }
}
