package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`bing-maps`
import typings.arcgisJsApi.arcgisJsApiStrings.aerial
import typings.arcgisJsApi.arcgisJsApiStrings.hybrid
import typings.arcgisJsApi.arcgisJsApiStrings.road
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BingMapsLayer extends BaseTileLayer {
  
  /**
    * Expose Bing logo url.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BingMapsLayer.html#bingLogo)
    */
  val bingLogo: String = js.native
  
  /**
    * Copyright information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BingMapsLayer.html#copyright)
    */
  val copyright: String = js.native
  
  /**
    * Provides culture specific map labels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BingMapsLayer.html#culture)
    */
  var culture: String = js.native
  
  /**
    * Indicates if the layer has attribution data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BingMapsLayer.html#hasAttributionData)
    */
  val hasAttributionData: Boolean = js.native
  
  /**
    * Bing Maps Key.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BingMapsLayer.html#key)
    */
  var key: String = js.native
  
  /**
    * This will alter Geopolitical disputed borders and labels to align with the specified user region.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BingMapsLayer.html#region)
    */
  var region: String = js.native
  
  /**
    * For more information on Bing map styles please visit: https://docs.microsoft.com/en-us/bingmaps/rest-services/imagery/get-imagery-metadata.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BingMapsLayer.html#style)
    */
  var style: road | aerial | hybrid = js.native
  
  @JSName("type")
  val type_BingMapsLayer: `bing-maps` = js.native
}
