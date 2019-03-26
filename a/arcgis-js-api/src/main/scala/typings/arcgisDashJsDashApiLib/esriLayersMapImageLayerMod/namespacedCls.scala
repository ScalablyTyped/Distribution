package typings
package arcgisDashJsDashApiLib.esriLayersMapImageLayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/layers/MapImageLayer", JSImport.Namespace)
@js.native
/**
  * MapImageLayer allows you to display and analyze data from [sublayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#sublayers) defined in a [map service](http://server.arcgis.com/en/server/latest/publish-services/windows/what-is-a-map-service.htm), exporting images instead of features. Map service images are dynamically generated on the server based on a request, which includes an LOD (level of detail), a bounding box, dpi, spatial reference and other options. The exported image is of the entire map extent specified.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html)
  */
class namespacedCls ()
  extends arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.MapImageLayer {
  def this(properties: arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.MapImageLayerProperties) = this()
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
    * Refresh interval of the layer in minutes. Minimum refresh interval is 0.1 minute (6 seconds). Value of `0` indicates no refresh.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-RefreshableLayer.html#refreshInterval)
    *
    * @default 0
    */
  /* CompleteClass */
  override var refreshInterval: scala.Double = js.native
  /**
    * Returns a deep clone of a map service's [sublayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html) as defined by the service. This is useful for scenarios when the developer is unfamiliar with the service sublayers and needs to "reset" the layer's sublayers to match those defined by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SublayersOwner.html#createServiceSublayers)
    *
    *
    */
  /* CompleteClass */
  override def createServiceSublayers(): arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.Collection[arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.Sublayer] = js.native
  /**
    * Returns the sublayer with the given layerId.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SublayersOwner.html#findSublayerById)
    *
    * @param id The [id](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#id) of the sublayer.
    *
    */
  /* CompleteClass */
  override def findSublayerById(id: scala.Double): arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.Sublayer = js.native
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

