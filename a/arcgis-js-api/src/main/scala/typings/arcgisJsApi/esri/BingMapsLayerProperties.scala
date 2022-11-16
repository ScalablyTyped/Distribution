package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.aerial
import typings.arcgisJsApi.arcgisJsApiStrings.hybrid
import typings.arcgisJsApi.arcgisJsApiStrings.road
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BingMapsLayerProperties
  extends StObject
     with BaseTileLayerProperties {
  
  /**
    * Provides culture specific map labels.
    *
    * @default "en-US"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BingMapsLayer.html#culture)
    */
  var culture: js.UndefOr[String] = js.undefined
  
  /**
    * Bing Maps Key.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BingMapsLayer.html#key)
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * This will alter Geopolitical disputed borders and labels to align with the specified user region.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BingMapsLayer.html#region)
    */
  var region: js.UndefOr[String] = js.undefined
  
  /**
    * For more information on Bing map styles please visit: https://learn.microsoft.com/en-us/bingmaps/rest-services/imagery/get-imagery-metadata
    *
    * @default "road"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BingMapsLayer.html#style)
    */
  var style: js.UndefOr[road | aerial | hybrid] = js.undefined
}
object BingMapsLayerProperties {
  
  inline def apply(): BingMapsLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BingMapsLayerProperties]
  }
  
  extension [Self <: BingMapsLayerProperties](x: Self) {
    
    inline def setCulture(value: String): Self = StObject.set(x, "culture", value.asInstanceOf[js.Any])
    
    inline def setCultureUndefined: Self = StObject.set(x, "culture", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setStyle(value: road | aerial | hybrid): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
