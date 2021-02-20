package typings.angularCore.mod

import typings.angularCore.angularCoreStrings.ICU
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICU_MARKER extends StObject {
  
  var marker: ICU = js.native
}
object ICU_MARKER {
  
  @scala.inline
  def apply(marker: ICU): ICU_MARKER = {
    val __obj = js.Dynamic.literal(marker = marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICU_MARKER]
  }
  
  @scala.inline
  implicit class ICU_MARKERMutableBuilder[Self <: ICU_MARKER] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarker(value: ICU): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
  }
}
