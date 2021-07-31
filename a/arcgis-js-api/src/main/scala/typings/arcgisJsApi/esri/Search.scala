package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Search
  extends StObject
     with Accessor {
  
  /**
    * Indicates whether the place finder is enabled in the web scene or the web map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-Search.html#addressSearchEnabled)
    */
  var addressSearchEnabled: Boolean = js.native
  
  /**
    * Whether search functionality is enabled in the web scene or the web map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-Search.html#enabled)
    */
  var enabled: Boolean = js.native
  
  /**
    * The hint provided with the search dialog.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-Search.html#hintText)
    */
  var hintText: String = js.native
  
  /**
    * A collection of layers to be included in search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-Search.html#layers)
    */
  var layers: Collection[SearchLayer] = js.native
}
