package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IconOnly extends StObject {
  
  var `aria-label`: String
  
  var iconOnly: Unit
  
  var label: Unit
  
  var role: String
}
object IconOnly {
  
  @scala.inline
  def apply(`aria-label`: String, iconOnly: Unit, label: Unit, role: String): IconOnly = {
    val __obj = js.Dynamic.literal(iconOnly = iconOnly.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconOnly]
  }
  
  @scala.inline
  implicit class IconOnlyMutableBuilder[Self <: IconOnly] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconOnly(value: Unit): Self = StObject.set(x, "iconOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Unit): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
  }
}
