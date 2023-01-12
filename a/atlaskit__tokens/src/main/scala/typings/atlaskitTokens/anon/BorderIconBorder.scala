package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderIconBorder[BaseToken] extends StObject {
  
  var accent: BoldOrange[BaseToken]
  
  var background: BoldDiscovery[BaseToken]
  
  var border: FocusNeutral[BaseToken]
  
  var iconBorder: DangerDiscovery[BaseToken]
  
  var interaction: Inverse19[BaseToken]
  
  var overlay: `18`[BaseToken]
  
  var text: MediumEmphasis[BaseToken]
}
object BorderIconBorder {
  
  inline def apply[BaseToken](
    accent: BoldOrange[BaseToken],
    background: BoldDiscovery[BaseToken],
    border: FocusNeutral[BaseToken],
    iconBorder: DangerDiscovery[BaseToken],
    interaction: Inverse19[BaseToken],
    overlay: `18`[BaseToken],
    text: MediumEmphasis[BaseToken]
  ): BorderIconBorder[BaseToken] = {
    val __obj = js.Dynamic.literal(accent = accent.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], border = border.asInstanceOf[js.Any], iconBorder = iconBorder.asInstanceOf[js.Any], interaction = interaction.asInstanceOf[js.Any], overlay = overlay.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderIconBorder[BaseToken]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BorderIconBorder[?], BaseToken] (val x: Self & BorderIconBorder[BaseToken]) extends AnyVal {
    
    inline def setAccent(value: BoldOrange[BaseToken]): Self = StObject.set(x, "accent", value.asInstanceOf[js.Any])
    
    inline def setBackground(value: BoldDiscovery[BaseToken]): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBorder(value: FocusNeutral[BaseToken]): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setIconBorder(value: DangerDiscovery[BaseToken]): Self = StObject.set(x, "iconBorder", value.asInstanceOf[js.Any])
    
    inline def setInteraction(value: Inverse19[BaseToken]): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
    
    inline def setOverlay(value: `18`[BaseToken]): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    
    inline def setText(value: MediumEmphasis[BaseToken]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
