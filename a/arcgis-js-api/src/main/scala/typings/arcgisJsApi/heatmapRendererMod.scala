package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.HeatmapRenderer
import typings.arcgisJsApi.esri.HeatmapRendererConstructor
import typings.arcgisJsApi.esri.HeatmapRendererProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object heatmapRendererMod extends Shortcut {
  
  @JSImport("esri/renderers/HeatmapRenderer", JSImport.Namespace)
  @js.native
  val ^ : HeatmapRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers/HeatmapRenderer", JSImport.Namespace)
  @js.native
  /**
    * The HeatmapRenderer renders point [FeatureLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html), [CSVLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html), [GeoJSONLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html) and [OGCFeatureLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html) as a raster surface, emphasizing areas with a high density of points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html)
    */
  class Class () extends HeatmapRenderer {
    def this(properties: HeatmapRendererProperties) = this()
  }
  
  type _To = HeatmapRendererConstructor
  
  /* This means you don't have to write `^`, but can instead just say `heatmapRendererMod.foo` */
  override def _to: HeatmapRendererConstructor = ^
}
