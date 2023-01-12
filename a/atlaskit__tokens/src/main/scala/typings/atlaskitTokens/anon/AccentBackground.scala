package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccentBackground extends StObject {
  
  var accent: BoldGreen
  
  var background: BoldDanger
  
  var border: Neutral
  
  var iconBorder: BrandDanger
  
  var interaction: InverseHoveredPaintTokenPressedPaintToken
  
  var overlay: HoverPaintTokenPressedPaintToken
  
  var text: LowEmphasis
}
object AccentBackground {
  
  inline def apply(
    accent: BoldGreen,
    background: BoldDanger,
    border: Neutral,
    iconBorder: BrandDanger,
    interaction: InverseHoveredPaintTokenPressedPaintToken,
    overlay: HoverPaintTokenPressedPaintToken,
    text: LowEmphasis
  ): AccentBackground = {
    val __obj = js.Dynamic.literal(accent = accent.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], border = border.asInstanceOf[js.Any], iconBorder = iconBorder.asInstanceOf[js.Any], interaction = interaction.asInstanceOf[js.Any], overlay = overlay.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccentBackground]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccentBackground] (val x: Self) extends AnyVal {
    
    inline def setAccent(value: BoldGreen): Self = StObject.set(x, "accent", value.asInstanceOf[js.Any])
    
    inline def setBackground(value: BoldDanger): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBorder(value: Neutral): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setIconBorder(value: BrandDanger): Self = StObject.set(x, "iconBorder", value.asInstanceOf[js.Any])
    
    inline def setInteraction(value: InverseHoveredPaintTokenPressedPaintToken): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
    
    inline def setOverlay(value: HoverPaintTokenPressedPaintToken): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    
    inline def setText(value: LowEmphasis): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
