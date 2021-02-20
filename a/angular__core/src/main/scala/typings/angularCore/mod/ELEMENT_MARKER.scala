package typings.angularCore.mod

import typings.angularCore.angularCoreStrings.element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ELEMENT_MARKER extends StObject {
  
  var marker: element = js.native
}
object ELEMENT_MARKER {
  
  @scala.inline
  def apply(marker: element): ELEMENT_MARKER = {
    val __obj = js.Dynamic.literal(marker = marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ELEMENT_MARKER]
  }
  
  @scala.inline
  implicit class ELEMENT_MARKERMutableBuilder[Self <: ELEMENT_MARKER] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarker(value: element): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
  }
}
