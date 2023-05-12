package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReferenceLineLabelConfiguration extends StObject {
  
  /**
    * The custom label configuration of the label in a reference line.
    */
  var CustomLabelConfiguration: js.UndefOr[ReferenceLineCustomLabelConfiguration] = js.undefined
  
  /**
    * The font color configuration of the label in a reference line.
    */
  var FontColor: js.UndefOr[HexColor] = js.undefined
  
  /**
    * The font configuration of the label in a reference line.
    */
  var FontConfiguration: js.UndefOr[typings.awsSdk.clientsQuicksightMod.FontConfiguration] = js.undefined
  
  /**
    * The horizontal position configuration of the label in a reference line. Choose one of the following options:    LEFT     CENTER     RIGHT   
    */
  var HorizontalPosition: js.UndefOr[ReferenceLineLabelHorizontalPosition] = js.undefined
  
  /**
    * The value label configuration of the label in a reference line.
    */
  var ValueLabelConfiguration: js.UndefOr[ReferenceLineValueLabelConfiguration] = js.undefined
  
  /**
    * The vertical position configuration of the label in a reference line. Choose one of the following options:    ABOVE     BELOW   
    */
  var VerticalPosition: js.UndefOr[ReferenceLineLabelVerticalPosition] = js.undefined
}
object ReferenceLineLabelConfiguration {
  
  inline def apply(): ReferenceLineLabelConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReferenceLineLabelConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReferenceLineLabelConfiguration] (val x: Self) extends AnyVal {
    
    inline def setCustomLabelConfiguration(value: ReferenceLineCustomLabelConfiguration): Self = StObject.set(x, "CustomLabelConfiguration", value.asInstanceOf[js.Any])
    
    inline def setCustomLabelConfigurationUndefined: Self = StObject.set(x, "CustomLabelConfiguration", js.undefined)
    
    inline def setFontColor(value: HexColor): Self = StObject.set(x, "FontColor", value.asInstanceOf[js.Any])
    
    inline def setFontColorUndefined: Self = StObject.set(x, "FontColor", js.undefined)
    
    inline def setFontConfiguration(value: FontConfiguration): Self = StObject.set(x, "FontConfiguration", value.asInstanceOf[js.Any])
    
    inline def setFontConfigurationUndefined: Self = StObject.set(x, "FontConfiguration", js.undefined)
    
    inline def setHorizontalPosition(value: ReferenceLineLabelHorizontalPosition): Self = StObject.set(x, "HorizontalPosition", value.asInstanceOf[js.Any])
    
    inline def setHorizontalPositionUndefined: Self = StObject.set(x, "HorizontalPosition", js.undefined)
    
    inline def setValueLabelConfiguration(value: ReferenceLineValueLabelConfiguration): Self = StObject.set(x, "ValueLabelConfiguration", value.asInstanceOf[js.Any])
    
    inline def setValueLabelConfigurationUndefined: Self = StObject.set(x, "ValueLabelConfiguration", js.undefined)
    
    inline def setVerticalPosition(value: ReferenceLineLabelVerticalPosition): Self = StObject.set(x, "VerticalPosition", value.asInstanceOf[js.Any])
    
    inline def setVerticalPositionUndefined: Self = StObject.set(x, "VerticalPosition", js.undefined)
  }
}
