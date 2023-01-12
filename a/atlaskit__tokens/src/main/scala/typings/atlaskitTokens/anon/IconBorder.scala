package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IconBorder extends StObject {
  
  var accent: BoldBlue
  
  var background: BoldBrand
  
  var border: Focus
  
  var iconBorder: Success
  
  var interaction: InverseHoveredPressed
  
  var overlay: HoverPaintToken
  
  var text: HighEmphasis
}
object IconBorder {
  
  inline def apply(
    accent: BoldBlue,
    background: BoldBrand,
    border: Focus,
    iconBorder: Success,
    interaction: InverseHoveredPressed,
    overlay: HoverPaintToken,
    text: HighEmphasis
  ): IconBorder = {
    val __obj = js.Dynamic.literal(accent = accent.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], border = border.asInstanceOf[js.Any], iconBorder = iconBorder.asInstanceOf[js.Any], interaction = interaction.asInstanceOf[js.Any], overlay = overlay.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconBorder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IconBorder] (val x: Self) extends AnyVal {
    
    inline def setAccent(value: BoldBlue): Self = StObject.set(x, "accent", value.asInstanceOf[js.Any])
    
    inline def setBackground(value: BoldBrand): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBorder(value: Focus): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setIconBorder(value: Success): Self = StObject.set(x, "iconBorder", value.asInstanceOf[js.Any])
    
    inline def setInteraction(value: InverseHoveredPressed): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
    
    inline def setOverlay(value: HoverPaintToken): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    
    inline def setText(value: HighEmphasis): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
