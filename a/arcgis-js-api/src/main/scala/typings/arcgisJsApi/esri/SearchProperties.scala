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
}
object SearchProperties {
  
  @scala.inline
  def apply(): SearchProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchProperties]
  }
  
  @scala.inline
  implicit class SearchPropertiesMutableBuilder[Self <: SearchProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddressSearchEnabled(value: Boolean): Self = StObject.set(x, "addressSearchEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressSearchEnabledUndefined: Self = StObject.set(x, "addressSearchEnabled", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setHintText(value: String): Self = StObject.set(x, "hintText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHintTextUndefined: Self = StObject.set(x, "hintText", js.undefined)
    
    @scala.inline
    def setLayers(value: CollectionProperties[SearchLayerProperties]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    @scala.inline
    def setLayersVarargs(value: SearchLayerProperties*): Self = StObject.set(x, "layers", js.Array(value :_*))
  }
}
