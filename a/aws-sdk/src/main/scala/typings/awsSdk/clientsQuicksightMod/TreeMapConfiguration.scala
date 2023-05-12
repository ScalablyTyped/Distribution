package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeMapConfiguration extends StObject {
  
  /**
    * The label options (label text, label visibility) for the colors displayed in a tree map.
    */
  var ColorLabelOptions: js.UndefOr[ChartAxisLabelOptions] = js.undefined
  
  /**
    * The color options (gradient color, point of divergence) of a tree map.
    */
  var ColorScale: js.UndefOr[typings.awsSdk.clientsQuicksightMod.ColorScale] = js.undefined
  
  /**
    * The options that determine if visual data labels are displayed.
    */
  var DataLabels: js.UndefOr[DataLabelOptions] = js.undefined
  
  /**
    * The field wells of the visual.
    */
  var FieldWells: js.UndefOr[TreeMapFieldWells] = js.undefined
  
  /**
    * The label options (label text, label visibility) of the groups that are displayed in a tree map.
    */
  var GroupLabelOptions: js.UndefOr[ChartAxisLabelOptions] = js.undefined
  
  /**
    * The legend display setup of the visual.
    */
  var Legend: js.UndefOr[LegendOptions] = js.undefined
  
  /**
    * The label options (label text, label visibility) of the sizes that are displayed in a tree map.
    */
  var SizeLabelOptions: js.UndefOr[ChartAxisLabelOptions] = js.undefined
  
  /**
    * The sort configuration of a tree map.
    */
  var SortConfiguration: js.UndefOr[TreeMapSortConfiguration] = js.undefined
  
  /**
    * The tooltip display setup of the visual.
    */
  var Tooltip: js.UndefOr[TooltipOptions] = js.undefined
}
object TreeMapConfiguration {
  
  inline def apply(): TreeMapConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeMapConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TreeMapConfiguration] (val x: Self) extends AnyVal {
    
    inline def setColorLabelOptions(value: ChartAxisLabelOptions): Self = StObject.set(x, "ColorLabelOptions", value.asInstanceOf[js.Any])
    
    inline def setColorLabelOptionsUndefined: Self = StObject.set(x, "ColorLabelOptions", js.undefined)
    
    inline def setColorScale(value: ColorScale): Self = StObject.set(x, "ColorScale", value.asInstanceOf[js.Any])
    
    inline def setColorScaleUndefined: Self = StObject.set(x, "ColorScale", js.undefined)
    
    inline def setDataLabels(value: DataLabelOptions): Self = StObject.set(x, "DataLabels", value.asInstanceOf[js.Any])
    
    inline def setDataLabelsUndefined: Self = StObject.set(x, "DataLabels", js.undefined)
    
    inline def setFieldWells(value: TreeMapFieldWells): Self = StObject.set(x, "FieldWells", value.asInstanceOf[js.Any])
    
    inline def setFieldWellsUndefined: Self = StObject.set(x, "FieldWells", js.undefined)
    
    inline def setGroupLabelOptions(value: ChartAxisLabelOptions): Self = StObject.set(x, "GroupLabelOptions", value.asInstanceOf[js.Any])
    
    inline def setGroupLabelOptionsUndefined: Self = StObject.set(x, "GroupLabelOptions", js.undefined)
    
    inline def setLegend(value: LegendOptions): Self = StObject.set(x, "Legend", value.asInstanceOf[js.Any])
    
    inline def setLegendUndefined: Self = StObject.set(x, "Legend", js.undefined)
    
    inline def setSizeLabelOptions(value: ChartAxisLabelOptions): Self = StObject.set(x, "SizeLabelOptions", value.asInstanceOf[js.Any])
    
    inline def setSizeLabelOptionsUndefined: Self = StObject.set(x, "SizeLabelOptions", js.undefined)
    
    inline def setSortConfiguration(value: TreeMapSortConfiguration): Self = StObject.set(x, "SortConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSortConfigurationUndefined: Self = StObject.set(x, "SortConfiguration", js.undefined)
    
    inline def setTooltip(value: TooltipOptions): Self = StObject.set(x, "Tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "Tooltip", js.undefined)
  }
}
