package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunnelChartDataLabelOptions extends StObject {
  
  /**
    * The visibility of the category labels within the data labels.
    */
  var CategoryLabelVisibility: js.UndefOr[Visibility] = js.undefined
  
  /**
    * The color of the data label text.
    */
  var LabelColor: js.UndefOr[HexColor] = js.undefined
  
  /**
    * The font configuration for the data labels. Only the FontSize attribute of the font configuration is used for data labels.
    */
  var LabelFontConfiguration: js.UndefOr[FontConfiguration] = js.undefined
  
  /**
    * Determines the style of the metric labels.
    */
  var MeasureDataLabelStyle: js.UndefOr[FunnelChartMeasureDataLabelStyle] = js.undefined
  
  /**
    * The visibility of the measure labels within the data labels.
    */
  var MeasureLabelVisibility: js.UndefOr[Visibility] = js.undefined
  
  /**
    * Determines the positioning of the data label relative to a section of the funnel.
    */
  var Position: js.UndefOr[DataLabelPosition] = js.undefined
  
  /**
    * The visibility option that determines if data labels are displayed.
    */
  var Visibility: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Visibility] = js.undefined
}
object FunnelChartDataLabelOptions {
  
  inline def apply(): FunnelChartDataLabelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunnelChartDataLabelOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FunnelChartDataLabelOptions] (val x: Self) extends AnyVal {
    
    inline def setCategoryLabelVisibility(value: Visibility): Self = StObject.set(x, "CategoryLabelVisibility", value.asInstanceOf[js.Any])
    
    inline def setCategoryLabelVisibilityUndefined: Self = StObject.set(x, "CategoryLabelVisibility", js.undefined)
    
    inline def setLabelColor(value: HexColor): Self = StObject.set(x, "LabelColor", value.asInstanceOf[js.Any])
    
    inline def setLabelColorUndefined: Self = StObject.set(x, "LabelColor", js.undefined)
    
    inline def setLabelFontConfiguration(value: FontConfiguration): Self = StObject.set(x, "LabelFontConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLabelFontConfigurationUndefined: Self = StObject.set(x, "LabelFontConfiguration", js.undefined)
    
    inline def setMeasureDataLabelStyle(value: FunnelChartMeasureDataLabelStyle): Self = StObject.set(x, "MeasureDataLabelStyle", value.asInstanceOf[js.Any])
    
    inline def setMeasureDataLabelStyleUndefined: Self = StObject.set(x, "MeasureDataLabelStyle", js.undefined)
    
    inline def setMeasureLabelVisibility(value: Visibility): Self = StObject.set(x, "MeasureLabelVisibility", value.asInstanceOf[js.Any])
    
    inline def setMeasureLabelVisibilityUndefined: Self = StObject.set(x, "MeasureLabelVisibility", js.undefined)
    
    inline def setPosition(value: DataLabelPosition): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "Position", js.undefined)
    
    inline def setVisibility(value: Visibility): Self = StObject.set(x, "Visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "Visibility", js.undefined)
  }
}
