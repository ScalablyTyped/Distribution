package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Arialabel extends StObject {
  
  var `aria-label`: Unit
  
  var iconOnly: Boolean
  
  var label: String
  
  var role: Unit
}
object Arialabel {
  
  @scala.inline
  def apply(`aria-label`: Unit, iconOnly: Boolean, label: String, role: Unit): Arialabel = {
    val __obj = js.Dynamic.literal(iconOnly = iconOnly.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arialabel]
  }
  
  @scala.inline
  implicit class ArialabelMutableBuilder[Self <: Arialabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setAria-label`(value: Unit): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconOnly(value: Boolean): Self = StObject.set(x, "iconOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole(value: Unit): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
  }
}
