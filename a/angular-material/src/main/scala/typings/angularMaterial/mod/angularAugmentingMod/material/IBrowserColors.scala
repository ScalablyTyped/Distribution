package typings.angularMaterial.mod.angularAugmentingMod.material

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBrowserColors extends StObject {
  
  var hue: String = js.native
  
  var palette: String = js.native
  
  var theme: String = js.native
}
object IBrowserColors {
  
  @scala.inline
  def apply(hue: String, palette: String, theme: String): IBrowserColors = {
    val __obj = js.Dynamic.literal(hue = hue.asInstanceOf[js.Any], palette = palette.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBrowserColors]
  }
  
  @scala.inline
  implicit class IBrowserColorsMutableBuilder[Self <: IBrowserColors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHue(value: String): Self = StObject.set(x, "hue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPalette(value: String): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
