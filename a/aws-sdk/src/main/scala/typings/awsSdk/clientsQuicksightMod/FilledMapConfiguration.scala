package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilledMapConfiguration extends StObject {
  
  /**
    * The field wells of the visual.
    */
  var FieldWells: js.UndefOr[FilledMapFieldWells] = js.undefined
  
  /**
    * The legend display setup of the visual.
    */
  var Legend: js.UndefOr[LegendOptions] = js.undefined
  
  /**
    * The map style options of the filled map visual.
    */
  var MapStyleOptions: js.UndefOr[GeospatialMapStyleOptions] = js.undefined
  
  /**
    * The sort configuration of a FilledMapVisual.
    */
  var SortConfiguration: js.UndefOr[FilledMapSortConfiguration] = js.undefined
  
  /**
    * The tooltip display setup of the visual.
    */
  var Tooltip: js.UndefOr[TooltipOptions] = js.undefined
  
  /**
    * The window options of the filled map visual.
    */
  var WindowOptions: js.UndefOr[GeospatialWindowOptions] = js.undefined
}
object FilledMapConfiguration {
  
  inline def apply(): FilledMapConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilledMapConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilledMapConfiguration] (val x: Self) extends AnyVal {
    
    inline def setFieldWells(value: FilledMapFieldWells): Self = StObject.set(x, "FieldWells", value.asInstanceOf[js.Any])
    
    inline def setFieldWellsUndefined: Self = StObject.set(x, "FieldWells", js.undefined)
    
    inline def setLegend(value: LegendOptions): Self = StObject.set(x, "Legend", value.asInstanceOf[js.Any])
    
    inline def setLegendUndefined: Self = StObject.set(x, "Legend", js.undefined)
    
    inline def setMapStyleOptions(value: GeospatialMapStyleOptions): Self = StObject.set(x, "MapStyleOptions", value.asInstanceOf[js.Any])
    
    inline def setMapStyleOptionsUndefined: Self = StObject.set(x, "MapStyleOptions", js.undefined)
    
    inline def setSortConfiguration(value: FilledMapSortConfiguration): Self = StObject.set(x, "SortConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSortConfigurationUndefined: Self = StObject.set(x, "SortConfiguration", js.undefined)
    
    inline def setTooltip(value: TooltipOptions): Self = StObject.set(x, "Tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "Tooltip", js.undefined)
    
    inline def setWindowOptions(value: GeospatialWindowOptions): Self = StObject.set(x, "WindowOptions", value.asInstanceOf[js.Any])
    
    inline def setWindowOptionsUndefined: Self = StObject.set(x, "WindowOptions", js.undefined)
  }
}
