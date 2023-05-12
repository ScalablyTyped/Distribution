package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PanelConfiguration extends StObject {
  
  /**
    * Sets the background color for each panel.
    */
  var BackgroundColor: js.UndefOr[HexColorWithTransparency] = js.undefined
  
  /**
    * Determines whether or not a background for each small multiples panel is rendered.
    */
  var BackgroundVisibility: js.UndefOr[Visibility] = js.undefined
  
  /**
    * Sets the line color of panel borders.
    */
  var BorderColor: js.UndefOr[HexColorWithTransparency] = js.undefined
  
  /**
    * Sets the line style of panel borders.
    */
  var BorderStyle: js.UndefOr[PanelBorderStyle] = js.undefined
  
  /**
    * Sets the line thickness of panel borders.
    */
  var BorderThickness: js.UndefOr[PixelLength] = js.undefined
  
  /**
    * Determines whether or not each panel displays a border.
    */
  var BorderVisibility: js.UndefOr[Visibility] = js.undefined
  
  /**
    * Sets the total amount of negative space to display between sibling panels.
    */
  var GutterSpacing: js.UndefOr[PixelLength] = js.undefined
  
  /**
    * Determines whether or not negative space between sibling panels is rendered.
    */
  var GutterVisibility: js.UndefOr[Visibility] = js.undefined
  
  /**
    * Configures the title display within each small multiples panel.
    */
  var Title: js.UndefOr[PanelTitleOptions] = js.undefined
}
object PanelConfiguration {
  
  inline def apply(): PanelConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanelConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PanelConfiguration] (val x: Self) extends AnyVal {
    
    inline def setBackgroundColor(value: HexColorWithTransparency): Self = StObject.set(x, "BackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "BackgroundColor", js.undefined)
    
    inline def setBackgroundVisibility(value: Visibility): Self = StObject.set(x, "BackgroundVisibility", value.asInstanceOf[js.Any])
    
    inline def setBackgroundVisibilityUndefined: Self = StObject.set(x, "BackgroundVisibility", js.undefined)
    
    inline def setBorderColor(value: HexColorWithTransparency): Self = StObject.set(x, "BorderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "BorderColor", js.undefined)
    
    inline def setBorderStyle(value: PanelBorderStyle): Self = StObject.set(x, "BorderStyle", value.asInstanceOf[js.Any])
    
    inline def setBorderStyleUndefined: Self = StObject.set(x, "BorderStyle", js.undefined)
    
    inline def setBorderThickness(value: PixelLength): Self = StObject.set(x, "BorderThickness", value.asInstanceOf[js.Any])
    
    inline def setBorderThicknessUndefined: Self = StObject.set(x, "BorderThickness", js.undefined)
    
    inline def setBorderVisibility(value: Visibility): Self = StObject.set(x, "BorderVisibility", value.asInstanceOf[js.Any])
    
    inline def setBorderVisibilityUndefined: Self = StObject.set(x, "BorderVisibility", js.undefined)
    
    inline def setGutterSpacing(value: PixelLength): Self = StObject.set(x, "GutterSpacing", value.asInstanceOf[js.Any])
    
    inline def setGutterSpacingUndefined: Self = StObject.set(x, "GutterSpacing", js.undefined)
    
    inline def setGutterVisibility(value: Visibility): Self = StObject.set(x, "GutterVisibility", value.asInstanceOf[js.Any])
    
    inline def setGutterVisibilityUndefined: Self = StObject.set(x, "GutterVisibility", js.undefined)
    
    inline def setTitle(value: PanelTitleOptions): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
  }
}
