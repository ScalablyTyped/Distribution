package typings.arcgisDashJsDashApi.__esri.renderers

import typings.arcgisDashJsDashApi.__esri.HeatmapRendererProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.renderers.HeatmapRenderer")
@js.native
/**
  * The HeatmapRenderer renders point [FeatureLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html), [CSVLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html) and [GeoJSONLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html) as a raster surface, emphasizing areas with a high density of points. This renderer uses a [Gaussian Blur](https://en.wikipedia.org/wiki/Gaussian_blur) to determine the strength of the influence of each point over an area determined by the [blurRadius](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#blurRadius). A Gaussian, or normal, distribution is used to spread the color of the point so it appears to be a fuzzy circle.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html)
  */
class HeatmapRendererCls ()
  extends typings.arcgisDashJsDashApi.__esri.HeatmapRenderer {
  def this(properties: HeatmapRendererProperties) = this()
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/using-fromjson/index.html) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

