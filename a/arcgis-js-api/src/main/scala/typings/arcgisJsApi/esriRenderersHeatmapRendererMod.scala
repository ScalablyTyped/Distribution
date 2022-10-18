package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.HeatmapRenderer
import typings.arcgisJsApi.esri.HeatmapRendererConstructor
import typings.arcgisJsApi.esri.HeatmapRendererProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRenderersHeatmapRendererMod extends Shortcut {
  
  @JSImport("esri/renderers/HeatmapRenderer", JSImport.Namespace)
  @js.native
  val ^ : js.Object & HeatmapRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers/HeatmapRenderer", JSImport.Namespace)
  @js.native
  /**
    * The HeatmapRenderer uses [kernel density](https://pro.arcgis.com/en/pro-app/2.8/tool-reference/spatial-analyst/how-kernel-density-works.htm) to render point features in [FeatureLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html), [CSVLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html), [GeoJSONLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html) and [OGCFeatureLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html) as a raster surface.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html)
    */
  open class Class ()
    extends StObject
       with HeatmapRenderer {
    def this(properties: HeatmapRendererProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & HeatmapRendererConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriRenderersHeatmapRendererMod.foo` */
  override def _to: js.Object & HeatmapRendererConstructor = ^
}
