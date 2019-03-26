package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynamicLayer extends js.Object {
  /**
    * The portal item from which the layer is loaded. This will load the layer along with any overridden properties (e.g. renderers, definition expressions, etc.) saved to the portal item, not the map service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-DynamicLayer.html#portalItem)
    */
  var portalItem: PortalItem = js.native
  /**
    * The URL to the REST endpoint of the map service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-DynamicLayer.html#url)
    */
  var url: java.lang.String = js.native
  /**
    * This method fetches the image for the specified extent and size.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-DynamicLayer.html#fetchImage)
    *
    * @param extent The extent of the view.
    * @param width The width of the view in pixels.
    * @param height The height of the view in pixels.
    * @param options The parameter options is an object with the following properties.
    * @param options.rotation The rotation in degrees of the exported image. Available since ArcGIS Server 10.3.
    * @param options.pixelRatio The ratio of the resolution in physical pixels of the image to the resolution it will be displayed at.
    *
    */
  def fetchImage(extent: Extent, width: scala.Double, height: scala.Double): arcgisDashJsDashApiLib.IPromise[stdLib.HTMLImageElement | stdLib.HTMLCanvasElement] = js.native
  def fetchImage(extent: Extent, width: scala.Double, height: scala.Double, options: DynamicLayerFetchImageOptions): arcgisDashJsDashApiLib.IPromise[stdLib.HTMLImageElement | stdLib.HTMLCanvasElement] = js.native
  /**
    * This method returns a URL to an image for a given extent, width and height.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-DynamicLayer.html#getImageUrl)
    *
    * @param extent The extent of the exported image.
    * @param width The width of the view in pixels.
    * @param height The height of the view in pixels.
    * @param options The parameter options is an object with the following properties.
    * @param options.pixelRatio The ratio of the resolution in physical pixels of the image to the resolution it will be displayed at.
    * @param options.rotation The rotation in degrees of the exported image. Available since ArcGIS Server 10.3.
    *
    */
  def getImageUrl(extent: Extent, width: scala.Double, height: scala.Double): arcgisDashJsDashApiLib.IPromise[java.lang.String] | java.lang.String = js.native
  def getImageUrl(extent: Extent, width: scala.Double, height: scala.Double, options: DynamicLayerGetImageUrlOptions): arcgisDashJsDashApiLib.IPromise[java.lang.String] | java.lang.String = js.native
}

@JSGlobal("__esri.DynamicLayer")
@js.native
class DynamicLayerCls () extends DynamicLayer

