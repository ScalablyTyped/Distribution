package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortalBasemapsSourceProperties extends LocalBasemapsSourceProperties {
  
  /**
    * Function used to filter basemaps after being fetched from the Portal.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-support-PortalBasemapsSource.html#filterFunction)
    */
  var filterFunction: js.UndefOr[BasemapFilter] = js.native
  
  /**
    * The Portal from which to fetch basemaps.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-support-PortalBasemapsSource.html#portal)
    */
  var portal: js.UndefOr[PortalProperties] = js.native
  
  /**
    * An object with key-value pairs used to create a custom basemap gallery group query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-support-PortalBasemapsSource.html#query)
    */
  var query: js.UndefOr[js.Any | String] = js.native
  
  /**
    * Callback for updating basemaps after being fetched and filtered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-support-PortalBasemapsSource.html#updateBasemapsCallback)
    */
  var updateBasemapsCallback: js.UndefOr[UpdateBasemapsCallback] = js.native
}
object PortalBasemapsSourceProperties {
  
  @scala.inline
  def apply(): PortalBasemapsSourceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortalBasemapsSourceProperties]
  }
  
  @scala.inline
  implicit class PortalBasemapsSourcePropertiesMutableBuilder[Self <: PortalBasemapsSourceProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilterFunction(value: (/* item */ Basemap, /* index */ Double, /* array */ js.Array[Basemap]) => Boolean): Self = StObject.set(x, "filterFunction", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFilterFunctionUndefined: Self = StObject.set(x, "filterFunction", js.undefined)
    
    @scala.inline
    def setPortal(value: PortalProperties): Self = StObject.set(x, "portal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalUndefined: Self = StObject.set(x, "portal", js.undefined)
    
    @scala.inline
    def setQuery(value: js.Any | String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setUpdateBasemapsCallback(value: /* items */ js.Array[Basemap] => js.Array[Basemap]): Self = StObject.set(x, "updateBasemapsCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateBasemapsCallbackUndefined: Self = StObject.set(x, "updateBasemapsCallback", js.undefined)
  }
}
