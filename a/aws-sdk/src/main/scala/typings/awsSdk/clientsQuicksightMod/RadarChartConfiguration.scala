package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RadarChartConfiguration extends StObject {
  
  /**
    * Determines the visibility of the colors of alternatign bands in a radar chart.
    */
  var AlternateBandColorsVisibility: js.UndefOr[Visibility] = js.undefined
  
  /**
    * The color of the even-numbered alternate bands of a radar chart.
    */
  var AlternateBandEvenColor: js.UndefOr[HexColor] = js.undefined
  
  /**
    * The color of the odd-numbered alternate bands of a radar chart.
    */
  var AlternateBandOddColor: js.UndefOr[HexColor] = js.undefined
  
  /**
    * The base sreies settings of a radar chart.
    */
  var BaseSeriesSettings: js.UndefOr[RadarChartSeriesSettings] = js.undefined
  
  /**
    * The category axis of a radar chart.
    */
  var CategoryAxis: js.UndefOr[AxisDisplayOptions] = js.undefined
  
  /**
    * The category label options of a radar chart.
    */
  var CategoryLabelOptions: js.UndefOr[ChartAxisLabelOptions] = js.undefined
  
  /**
    * The color axis of a radar chart.
    */
  var ColorAxis: js.UndefOr[AxisDisplayOptions] = js.undefined
  
  /**
    * The color label options of a radar chart.
    */
  var ColorLabelOptions: js.UndefOr[ChartAxisLabelOptions] = js.undefined
  
  /**
    * The field well configuration of a RadarChartVisual.
    */
  var FieldWells: js.UndefOr[RadarChartFieldWells] = js.undefined
  
  /**
    * The legend display setup of the visual.
    */
  var Legend: js.UndefOr[LegendOptions] = js.undefined
  
  /**
    * The shape of the radar chart.
    */
  var Shape: js.UndefOr[RadarChartShape] = js.undefined
  
  /**
    * The sort configuration of a RadarChartVisual.
    */
  var SortConfiguration: js.UndefOr[RadarChartSortConfiguration] = js.undefined
  
  /**
    * The start angle of a radar chart's axis.
    */
  var StartAngle: js.UndefOr[RadarChartStartAngle] = js.undefined
  
  /**
    * The palette (chart color) display setup of the visual.
    */
  var VisualPalette: js.UndefOr[typings.awsSdk.clientsQuicksightMod.VisualPalette] = js.undefined
}
object RadarChartConfiguration {
  
  inline def apply(): RadarChartConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadarChartConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RadarChartConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAlternateBandColorsVisibility(value: Visibility): Self = StObject.set(x, "AlternateBandColorsVisibility", value.asInstanceOf[js.Any])
    
    inline def setAlternateBandColorsVisibilityUndefined: Self = StObject.set(x, "AlternateBandColorsVisibility", js.undefined)
    
    inline def setAlternateBandEvenColor(value: HexColor): Self = StObject.set(x, "AlternateBandEvenColor", value.asInstanceOf[js.Any])
    
    inline def setAlternateBandEvenColorUndefined: Self = StObject.set(x, "AlternateBandEvenColor", js.undefined)
    
    inline def setAlternateBandOddColor(value: HexColor): Self = StObject.set(x, "AlternateBandOddColor", value.asInstanceOf[js.Any])
    
    inline def setAlternateBandOddColorUndefined: Self = StObject.set(x, "AlternateBandOddColor", js.undefined)
    
    inline def setBaseSeriesSettings(value: RadarChartSeriesSettings): Self = StObject.set(x, "BaseSeriesSettings", value.asInstanceOf[js.Any])
    
    inline def setBaseSeriesSettingsUndefined: Self = StObject.set(x, "BaseSeriesSettings", js.undefined)
    
    inline def setCategoryAxis(value: AxisDisplayOptions): Self = StObject.set(x, "CategoryAxis", value.asInstanceOf[js.Any])
    
    inline def setCategoryAxisUndefined: Self = StObject.set(x, "CategoryAxis", js.undefined)
    
    inline def setCategoryLabelOptions(value: ChartAxisLabelOptions): Self = StObject.set(x, "CategoryLabelOptions", value.asInstanceOf[js.Any])
    
    inline def setCategoryLabelOptionsUndefined: Self = StObject.set(x, "CategoryLabelOptions", js.undefined)
    
    inline def setColorAxis(value: AxisDisplayOptions): Self = StObject.set(x, "ColorAxis", value.asInstanceOf[js.Any])
    
    inline def setColorAxisUndefined: Self = StObject.set(x, "ColorAxis", js.undefined)
    
    inline def setColorLabelOptions(value: ChartAxisLabelOptions): Self = StObject.set(x, "ColorLabelOptions", value.asInstanceOf[js.Any])
    
    inline def setColorLabelOptionsUndefined: Self = StObject.set(x, "ColorLabelOptions", js.undefined)
    
    inline def setFieldWells(value: RadarChartFieldWells): Self = StObject.set(x, "FieldWells", value.asInstanceOf[js.Any])
    
    inline def setFieldWellsUndefined: Self = StObject.set(x, "FieldWells", js.undefined)
    
    inline def setLegend(value: LegendOptions): Self = StObject.set(x, "Legend", value.asInstanceOf[js.Any])
    
    inline def setLegendUndefined: Self = StObject.set(x, "Legend", js.undefined)
    
    inline def setShape(value: RadarChartShape): Self = StObject.set(x, "Shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "Shape", js.undefined)
    
    inline def setSortConfiguration(value: RadarChartSortConfiguration): Self = StObject.set(x, "SortConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSortConfigurationUndefined: Self = StObject.set(x, "SortConfiguration", js.undefined)
    
    inline def setStartAngle(value: RadarChartStartAngle): Self = StObject.set(x, "StartAngle", value.asInstanceOf[js.Any])
    
    inline def setStartAngleUndefined: Self = StObject.set(x, "StartAngle", js.undefined)
    
    inline def setVisualPalette(value: VisualPalette): Self = StObject.set(x, "VisualPalette", value.asInstanceOf[js.Any])
    
    inline def setVisualPaletteUndefined: Self = StObject.set(x, "VisualPalette", js.undefined)
  }
}
