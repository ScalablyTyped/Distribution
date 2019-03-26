package typings
package arcgisDashJsDashApiLib.esriLayersMapNotesLayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/layers/MapNotesLayer", JSImport.Namespace)
@js.native
/**
  * The MapNotesLayer is used to create layers based on Map Notes within a WebMap or PortalItem. Map notes are part of web maps, and are typically created with ArcGIS Online MapViewer. For additional information, please refer to the ArcGIS Online documentation on how to [Add Map notes](http://doc.arcgis.com/en/arcgis-online/create-maps/add-layers.htm#ESRI_SECTION1_0C90A3B63ABD49D5B9535055991F4684). Within the [web map specification](https://developers.arcgis.com/web-map-specification/), map notes are a special type of [FeatureCollections](https://developers.arcgis.com/web-map-specification/objects/featureCollection/).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapNotesLayer.html)
  */
class namespacedCls ()
  extends arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.MapNotesLayer {
  def this(properties: arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.MapNotesLayerProperties) = this()
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
}

