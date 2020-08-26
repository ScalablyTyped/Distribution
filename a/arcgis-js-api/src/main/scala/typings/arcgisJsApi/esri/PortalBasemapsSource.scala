package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`not-loaded`
import typings.arcgisJsApi.arcgisJsApiStrings.loading
import typings.arcgisJsApi.arcgisJsApiStrings.ready
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortalBasemapsSource extends LocalBasemapsSource {
  /**
    * Function used to filter basemaps after being fetched from the Portal.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-support-PortalBasemapsSource.html#filterFunction)
    */
  var filterFunction: js.Function = js.native
  /**
    * The Portal from which to fetch basemaps.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-support-PortalBasemapsSource.html#portal)
    */
  var portal: Portal = js.native
  /**
    * An object with key-value pairs used to create a custom basemap gallery group query. Note that all parameters will be joined using the `AND` operator. A query string can also be provided for more advanced use cases.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-support-PortalBasemapsSource.html#query)
    */
  var query: js.Any | String = js.native
  /**
    * The source's state.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-support-PortalBasemapsSource.html#state)
    *
    * @default not-loaded
    */
  @JSName("state")
  val state_PortalBasemapsSource: `not-loaded` | loading | ready = js.native
  /**
    * Callback for updating basemaps after being fetched and filtered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-support-PortalBasemapsSource.html#updateBasemapsCallback)
    */
  var updateBasemapsCallback: js.Function = js.native
}

