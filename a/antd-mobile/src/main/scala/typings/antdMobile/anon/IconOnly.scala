package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IconOnly extends StObject {
  
  var `aria-label`: String = js.native
  
  var iconOnly: js.UndefOr[scala.Nothing] = js.native
  
  var label: js.UndefOr[scala.Nothing] = js.native
  
  var role: String = js.native
}
object IconOnly {
  
  @scala.inline
  def apply(`aria-label`: String, role: String): IconOnly = {
    val __obj = js.Dynamic.literal(role = role.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconOnly]
  }
  
  @scala.inline
  implicit class IconOnlyMutableBuilder[Self <: IconOnly] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
  }
}
