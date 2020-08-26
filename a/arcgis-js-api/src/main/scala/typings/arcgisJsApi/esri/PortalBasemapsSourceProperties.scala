package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortalBasemapsSourceProperties extends LocalBasemapsSourceProperties {
  /**
    * Function used to filter basemaps after being fetched from the Portal.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-support-PortalBasemapsSource.html#filterFunction)
    */
  var filterFunction: js.UndefOr[js.Function] = js.native
  /**
    * The Portal from which to fetch basemaps.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-support-PortalBasemapsSource.html#portal)
    */
  var portal: js.UndefOr[PortalProperties] = js.native
  /**
    * An object with key-value pairs used to create a custom basemap gallery group query. Note that all parameters will be joined using the `AND` operator. A query string can also be provided for more advanced use cases.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-support-PortalBasemapsSource.html#query)
    */
  var query: js.UndefOr[js.Any | String] = js.native
  /**
    * Callback for updating basemaps after being fetched and filtered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-support-PortalBasemapsSource.html#updateBasemapsCallback)
    */
  var updateBasemapsCallback: js.UndefOr[js.Function] = js.native
}

object PortalBasemapsSourceProperties {
  @scala.inline
  def apply(): PortalBasemapsSourceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortalBasemapsSourceProperties]
  }
  @scala.inline
  implicit class PortalBasemapsSourcePropertiesOps[Self <: PortalBasemapsSourceProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFilterFunction(value: js.Function): Self = this.set("filterFunction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterFunction: Self = this.set("filterFunction", js.undefined)
    @scala.inline
    def setPortal(value: PortalProperties): Self = this.set("portal", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePortal: Self = this.set("portal", js.undefined)
    @scala.inline
    def setQuery(value: js.Any | String): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setUpdateBasemapsCallback(value: js.Function): Self = this.set("updateBasemapsCallback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateBasemapsCallback: Self = this.set("updateBasemapsCallback", js.undefined)
  }
  
}

