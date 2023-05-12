package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PanelTitleOptions extends StObject {
  
  var FontConfiguration: js.UndefOr[typings.awsSdk.clientsQuicksightMod.FontConfiguration] = js.undefined
  
  /**
    * Sets the horizontal text alignment of the title within each panel.
    */
  var HorizontalTextAlignment: js.UndefOr[typings.awsSdk.clientsQuicksightMod.HorizontalTextAlignment] = js.undefined
  
  /**
    * Determines whether or not panel titles are displayed.
    */
  var Visibility: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Visibility] = js.undefined
}
object PanelTitleOptions {
  
  inline def apply(): PanelTitleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanelTitleOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PanelTitleOptions] (val x: Self) extends AnyVal {
    
    inline def setFontConfiguration(value: FontConfiguration): Self = StObject.set(x, "FontConfiguration", value.asInstanceOf[js.Any])
    
    inline def setFontConfigurationUndefined: Self = StObject.set(x, "FontConfiguration", js.undefined)
    
    inline def setHorizontalTextAlignment(value: HorizontalTextAlignment): Self = StObject.set(x, "HorizontalTextAlignment", value.asInstanceOf[js.Any])
    
    inline def setHorizontalTextAlignmentUndefined: Self = StObject.set(x, "HorizontalTextAlignment", js.undefined)
    
    inline def setVisibility(value: Visibility): Self = StObject.set(x, "Visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "Visibility", js.undefined)
  }
}
