package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.arcgisDashJsDashApi.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayerConstructor
  extends /**
  * The layer is the most fundamental component of a [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html). It is a collection of spatial data in the form of vector graphics or raster images that represent real-world phenomena. Layers may contain discrete features that store vector data or continuous cells/pixels that store raster data.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html)
  */
Instantiable0[Layer]
     with Instantiable1[/* properties */ LayerProperties, Layer] {
  /**
    * Creates a new layer instance from an ArcGIS Server URL. Depending on the URL, the returned layer type may be a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html), [TileLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileLayer.html), [MapImageLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html), [SceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html), [StreamLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html), [ElevationLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html) or [GroupLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GroupLayer.html).  This is useful when you work with various ArcGIS Server URLs, but you don't necessarily know which layer type(s) they create. This method creates the appropriate layer type for you. In case of a feature service or a scene service, when the URL points to the service and the service has multiple layers, the returned promise will resolve to a [GroupLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GroupLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#fromArcGISServerUrl)
    *
    * @param params Input parameters for creating the layer.
    * @param params.url The ArcGIS Server URL used to create the layer.
    * @param params.properties Set any of the layer's properties here for constructing the layer instance (e.g. popupTemplate, renderer, etc.).
    *
    */
  def fromArcGISServerUrl(params: LayerFromArcGISServerUrlParams): IPromise[Layer] = js.native
  /**
    * Creates a new layer instance of the appropriate layer class from an ArcGIS Online or ArcGIS Enterprise [portal item](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html). If the item points to a feature service with multiple layers, then a [GroupLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GroupLayer.html) is created. If the item points to a service with a single layer, then it resolves to a layer of the same type of class as the service.  See also: [isLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#isLayer)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#fromPortalItem)
    *
    * @param params The parameters for loading the portal item.
    * @param params.portalItem The object representing an ArcGIS Online or ArcGIS Enterprise portal item from which to load the layer.
    *
    */
  def fromPortalItem(params: LayerFromPortalItemParams): IPromise[Layer] = js.native
}

