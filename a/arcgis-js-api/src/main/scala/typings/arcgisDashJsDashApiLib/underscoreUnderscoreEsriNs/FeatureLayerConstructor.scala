package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureLayerConstructor
  extends /**
  * A FeatureLayer is a single layer that can be created from a [Map Service](http://server.arcgis.com/en/server/latest/publish-services/windows/what-is-a-map-service.htm) or [Feature Service](http://server.arcgis.com/en/server/latest/publish-services/windows/what-is-a-feature-service-.htm); ArcGIS Online or ArcGIS Enterprise portal items; or from an array of client-side features. It is composed of discrete features, each of which has a [Geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html) that allows it to be rendered in either a 2D [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or 3D [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) as a [graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) with spatial context. Features also contain data [attributes](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#attributes) that provide additional information about the real-world feature it represents; attributes may be viewed in [popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#popupTemplate) windows and used for [rendering](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-Renderer.html) the layer. FeatureLayers may be [queried](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#queryFeatures), [analyzed](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html), and [rendered](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#renderer) to visualize data in a spatial context.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html)
  */
org.scalablytyped.runtime.Instantiable0[FeatureLayer]
     with org.scalablytyped.runtime.Instantiable1[/* properties */ FeatureLayerProperties, FeatureLayer] {
  def fromJSON(json: js.Any): FeatureLayer = js.native
}

