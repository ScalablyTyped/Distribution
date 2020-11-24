package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.aerial
import typings.arcgisJsApi.arcgisJsApiStrings.hybrid
import typings.arcgisJsApi.arcgisJsApiStrings.road
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
  implicit class BingMapsLayerPropertiesOps[Self <: BingMapsLayerProperties] (val x: Self) extends AnyVal {
    
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
    def setCulture(value: String): Self = this.set("culture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCulture: Self = this.set("culture", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setStyle(value: road | aerial | hybrid): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
