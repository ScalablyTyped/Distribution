package typings.arcgisDashJsDashApi.esriLayersGraphicsLayerMod

import typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.GraphicsLayer
import typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.GraphicsLayerProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/layers/GraphicsLayer", JSImport.Namespace)
@js.native
/**
  * A GraphicsLayer contains one or more client-side [Graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html). Each [graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html#graphics) in the GraphicsLayer is rendered in a [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) inside either a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) or a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). The [graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html#graphics) contain discrete vector [geometries](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html) that represent real-world phenomena.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html)
  */
class Class () extends GraphicsLayer {
  def this(properties: GraphicsLayerProperties) = this()
  /**
    * The maximum scale (most zoomed in) at which the layer is visible in the view. If the map is zoomed in beyond this scale, the layer will not be visible. A value of `0` means the layer does not have a maximum scale. The maxScale value should always be smaller than the [minScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#minScale) value, and greater than or equal to the service specification.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#maxScale)
    *
    * @default 0
    */
  /* CompleteClass */
  override var maxScale: Double = js.native
  /**
    * The minimum scale (most zoomed out) at which the layer is visible in the view. If the map is zoomed out beyond this scale, the layer will not be visible. A value of `0` means the layer does not have a minimum scale. The minScale value should always be larger than the [maxScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#maxScale) value, and lesser than or equal to the service specification.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#minScale)
    *
    * @default 0
    */
  /* CompleteClass */
  override var minScale: Double = js.native
}

