package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LegendOptions extends StObject {
  
  /**
    * The height of the legend. If this value is omitted, a default height is used when rendering.
    */
  var Height: js.UndefOr[PixelLength] = js.undefined
  
  /**
    * The positions for the legend. Choose one of the following options:    AUTO     RIGHT     BOTTOM     LEFT   
    */
  var Position: js.UndefOr[LegendPosition] = js.undefined
  
  /**
    * The custom title for the legend.
    */
  var Title: js.UndefOr[LabelOptions] = js.undefined
  
  /**
    * Determines whether or not the legend is visible.
    */
  var Visibility: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Visibility] = js.undefined
  
  /**
    * The width of the legend. If this value is omitted, a default width is used when rendering.
    */
  var Width: js.UndefOr[PixelLength] = js.undefined
}
object LegendOptions {
  
  inline def apply(): LegendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LegendOptions] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: PixelLength): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "Height", js.undefined)
    
    inline def setPosition(value: LegendPosition): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "Position", js.undefined)
    
    inline def setTitle(value: LabelOptions): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
    
    inline def setVisibility(value: Visibility): Self = StObject.set(x, "Visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "Visibility", js.undefined)
    
    inline def setWidth(value: PixelLength): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "Width", js.undefined)
  }
}
