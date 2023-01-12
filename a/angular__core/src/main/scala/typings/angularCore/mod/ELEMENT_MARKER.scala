package typings.angularCore.mod

import typings.angularCore.angularCoreStrings.element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ELEMENT_MARKER extends StObject {
  
  var marker: element
}
object ELEMENT_MARKER {
  
  inline def apply(): ELEMENT_MARKER = {
    val __obj = js.Dynamic.literal(marker = "element")
    __obj.asInstanceOf[ELEMENT_MARKER]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ELEMENT_MARKER] (val x: Self) extends AnyVal {
    
    inline def setMarker(value: element): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
  }
}
