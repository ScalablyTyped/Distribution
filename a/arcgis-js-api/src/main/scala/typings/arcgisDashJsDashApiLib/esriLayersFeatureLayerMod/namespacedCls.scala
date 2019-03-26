package typings
package arcgisDashJsDashApiLib.esriLayersFeatureLayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/layers/FeatureLayer", JSImport.Namespace)
@js.native
/**
  * A FeatureLayer is a single layer that can be created from a [Map Service](http://server.arcgis.com/en/server/latest/publish-services/windows/what-is-a-map-service.htm) or [Feature Service](http://server.arcgis.com/en/server/latest/publish-services/windows/what-is-a-feature-service-.htm); ArcGIS Online or ArcGIS Enterprise portal items; or from an array of client-side features. It is composed of discrete features, each of which has a [Geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html) that allows it to be rendered in either a 2D [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or 3D [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) as a [graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) with spatial context. Features also contain data [attributes](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#attributes) that provide additional information about the real-world feature it represents; attributes may be viewed in [popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#popupTemplate) windows and used for [rendering](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-Renderer.html) the layer. FeatureLayers may be [queried](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#queryFeatures), [analyzed](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html), and [rendered](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#renderer) to visualize data in a spatial context.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html)
  */
class namespacedCls ()
  extends arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.FeatureLayer {
  def this(properties: arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.FeatureLayerProperties) = this()
  /**
    * The maximum scale (most zoomed in) at which the layer is visible in the view. If the map is zoomed in beyond this scale, the layer will not be visible. A value of `0` means the layer does not have a maximum scale. The maxScale value should always be smaller than the [minScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#minScale) value, and greater than or equal to the service specification.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#maxScale)
    *
    * @default 0
    */
  /* CompleteClass */
  override var maxScale: scala.Double = js.native
  /**
    * The minimum scale (most zoomed out) at which the layer is visible in the view. If the map is zoomed out beyond this scale, the layer will not be visible. A value of `0` means the layer does not have a minimum scale. The minScale value should always be larger than the [maxScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#maxScale) value, and lesser than or equal to the service specification.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#minScale)
    *
    * @default 0
    */
  /* CompleteClass */
  override var minScale: scala.Double = js.native
  /**
    * The portal item from which the layer is loaded. If the portal item references a Feature Service or Scene Service, then you can specify a single layer to load with the [layerId](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-PortalLayer.html#layerId) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-PortalLayer.html#portalItem)
    */
  /* CompleteClass */
  override var portalItem: arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.PortalItem = js.native
  /**
    * Refresh interval of the layer in minutes. Minimum refresh interval is 0.1 minute (6 seconds). Value of `0` indicates no refresh.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-RefreshableLayer.html#refreshInterval)
    *
    * @default 0
    */
  /* CompleteClass */
  override var refreshInterval: scala.Double = js.native
  /**
    * Fetches all the data for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-RefreshableLayer.html#refresh)
    *
    *
    */
  /* CompleteClass */
  override def refresh(): scala.Unit = js.native
}

