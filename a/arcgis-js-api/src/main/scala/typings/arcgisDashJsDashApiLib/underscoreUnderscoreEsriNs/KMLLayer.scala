package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KMLLayer
  extends Layer
     with PortalLayer
     with ScaleRangeLayer {
  /**
    * A collection of [KMLSublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-KMLSublayer.html)s.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-KMLLayer.html#sublayers)
    */
  var sublayers: Collection[KMLSublayer] = js.native
  /**
    * The publicly accessible URL for a .kml or .kmz file.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-KMLLayer.html#url)
    */
  var url: java.lang.String = js.native
  @JSName("on")
  def on_layerviewcreate(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`layerview-create`,
    eventHandler: KMLLayerLayerviewCreateEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def on_layerviewcreateerror(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`layerview-create-error`,
    eventHandler: KMLLayerLayerviewCreateErrorEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def on_layerviewdestroy(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`layerview-destroy`,
    eventHandler: KMLLayerLayerviewDestroyEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
}

@JSGlobal("__esri.KMLLayer")
@js.native
/**
  * The KMLLayer class is used to create a layer based on a KML file (.kml, .kmz). KML is an XML-based file format used to represent geographic features.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-KMLLayer.html)
  */
class KMLLayerCls () extends KMLLayer {
  def this(properties: KMLLayerProperties) = this()
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
  override var portalItem: PortalItem = js.native
}

