package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchProperties extends StObject {
  
  /**
    * Indicates whether the place finder is enabled in the web scene or the web map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-Search.html#addressSearchEnabled)
    */
  var addressSearchEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether search functionality is enabled in the web scene or the web map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-Search.html#enabled)
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The hint provided with the search dialog.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-Search.html#hintText)
    */
  var hintText: js.UndefOr[String] = js.undefined
  
  /**
    * A collection of layers to be included in search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-Search.html#layers)
    */
  var layers: js.UndefOr[CollectionProperties[SearchLayerProperties]] = js.undefined
  
  /**
    * A collection of tables to be included in search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-Search.html#tables)
    */
  var tables: js.UndefOr[CollectionProperties[SearchTableProperties]] = js.undefined
}
object SearchProperties {
  
  inline def apply(): SearchProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchProperties] (val x: Self) extends AnyVal {
    
    inline def setAddressSearchEnabled(value: Boolean): Self = StObject.set(x, "addressSearchEnabled", value.asInstanceOf[js.Any])
    
    inline def setAddressSearchEnabledUndefined: Self = StObject.set(x, "addressSearchEnabled", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setHintText(value: String): Self = StObject.set(x, "hintText", value.asInstanceOf[js.Any])
    
    inline def setHintTextUndefined: Self = StObject.set(x, "hintText", js.undefined)
    
    inline def setLayers(value: CollectionProperties[SearchLayerProperties]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    inline def setLayersVarargs(value: SearchLayerProperties*): Self = StObject.set(x, "layers", js.Array(value*))
    
    inline def setTables(value: CollectionProperties[SearchTableProperties]): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
    
    inline def setTablesUndefined: Self = StObject.set(x, "tables", js.undefined)
    
    inline def setTablesVarargs(value: SearchTableProperties*): Self = StObject.set(x, "tables", js.Array(value*))
  }
}
