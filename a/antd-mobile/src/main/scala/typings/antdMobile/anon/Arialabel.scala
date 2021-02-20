package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Arialabel extends StObject {
  
  var `aria-label`: js.UndefOr[scala.Nothing] = js.native
  
  var iconOnly: Boolean = js.native
  
  var label: String = js.native
  
  var role: js.UndefOr[scala.Nothing] = js.native
}
object Arialabel {
  
  @scala.inline
  def apply(iconOnly: Boolean, label: String): Arialabel = {
    val __obj = js.Dynamic.literal(iconOnly = iconOnly.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arialabel]
  }
  
  @scala.inline
  implicit class ArialabelMutableBuilder[Self <: Arialabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIconOnly(value: Boolean): Self = StObject.set(x, "iconOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
