package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.aerial
import typings.arcgisJsApi.arcgisJsApiStrings.hybrid
import typings.arcgisJsApi.arcgisJsApiStrings.road
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BingMapsLayerProperties extends BaseTileLayerProperties {
  
  /**
    * Provides culture specific map labels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BingMapsLayer.html#culture)
    */
  var culture: js.UndefOr[String] = js.native
  
  /**
    * Bing Maps Key.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BingMapsLayer.html#key)
    */
  var key: js.UndefOr[String] = js.native
  
  /**
    * This will alter Geopolitical disputed borders and labels to align with the specified user region.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BingMapsLayer.html#region)
    */
  var region: js.UndefOr[String] = js.native
  
  /**
    * For more information on Bing map styles please visit: https://docs.microsoft.com/en-us/bingmaps/rest-services/imagery/get-imagery-metadata.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BingMapsLayer.html#style)
    */
  var style: js.UndefOr[road | aerial | hybrid] = js.native
}
object BingMapsLayerProperties {
  
  @scala.inline
  def apply(): BingMapsLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BingMapsLayerProperties]
  }
  
  @scala.inline
  implicit class BingMapsLayerPropertiesMutableBuilder[Self <: BingMapsLayerProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCulture(value: String): Self = StObject.set(x, "culture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCultureUndefined: Self = StObject.set(x, "culture", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setStyle(value: road | aerial | hybrid): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
