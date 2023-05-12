package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeospatialMapConfiguration extends StObject {
  
  /**
    * The field wells of the visual.
    */
  var FieldWells: js.UndefOr[GeospatialMapFieldWells] = js.undefined
  
  /**
    * The legend display setup of the visual.
    */
  var Legend: js.UndefOr[LegendOptions] = js.undefined
  
  /**
    * The map style options of the geospatial map.
    */
  var MapStyleOptions: js.UndefOr[GeospatialMapStyleOptions] = js.undefined
  
  /**
    * The point style options of the geospatial map.
    */
  var PointStyleOptions: js.UndefOr[GeospatialPointStyleOptions] = js.undefined
  
  /**
    * The tooltip display setup of the visual.
    */
  var Tooltip: js.UndefOr[TooltipOptions] = js.undefined
  
  var VisualPalette: js.UndefOr[typings.awsSdk.clientsQuicksightMod.VisualPalette] = js.undefined
  
  /**
    * The window options of the geospatial map.
    */
  var WindowOptions: js.UndefOr[GeospatialWindowOptions] = js.undefined
}
object GeospatialMapConfiguration {
  
  inline def apply(): GeospatialMapConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeospatialMapConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeospatialMapConfiguration] (val x: Self) extends AnyVal {
    
    inline def setFieldWells(value: GeospatialMapFieldWells): Self = StObject.set(x, "FieldWells", value.asInstanceOf[js.Any])
    
    inline def setFieldWellsUndefined: Self = StObject.set(x, "FieldWells", js.undefined)
    
    inline def setLegend(value: LegendOptions): Self = StObject.set(x, "Legend", value.asInstanceOf[js.Any])
    
    inline def setLegendUndefined: Self = StObject.set(x, "Legend", js.undefined)
    
    inline def setMapStyleOptions(value: GeospatialMapStyleOptions): Self = StObject.set(x, "MapStyleOptions", value.asInstanceOf[js.Any])
    
    inline def setMapStyleOptionsUndefined: Self = StObject.set(x, "MapStyleOptions", js.undefined)
    
    inline def setPointStyleOptions(value: GeospatialPointStyleOptions): Self = StObject.set(x, "PointStyleOptions", value.asInstanceOf[js.Any])
    
    inline def setPointStyleOptionsUndefined: Self = StObject.set(x, "PointStyleOptions", js.undefined)
    
    inline def setTooltip(value: TooltipOptions): Self = StObject.set(x, "Tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "Tooltip", js.undefined)
    
    inline def setVisualPalette(value: VisualPalette): Self = StObject.set(x, "VisualPalette", value.asInstanceOf[js.Any])
    
    inline def setVisualPaletteUndefined: Self = StObject.set(x, "VisualPalette", js.undefined)
    
    inline def setWindowOptions(value: GeospatialWindowOptions): Self = StObject.set(x, "WindowOptions", value.asInstanceOf[js.Any])
    
    inline def setWindowOptionsUndefined: Self = StObject.set(x, "WindowOptions", js.undefined)
  }
}
