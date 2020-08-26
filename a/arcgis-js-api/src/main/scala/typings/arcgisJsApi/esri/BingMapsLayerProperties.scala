package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.aerial
import typings.arcgisJsApi.arcgisJsApiStrings.hybrid
import typings.arcgisJsApi.arcgisJsApiStrings.road
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BingMapsLayerProperties extends BaseTileLayerProperties {
  /**
    * Provides culture specific map labels. For more information visit: https://msdn.microsoft.com/en-us/library/ff701709.aspx  For a list of supported culture codes please visit: https://msdn.microsoft.com/en-us/library/hh441729.aspx
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BingMapsLayer.html#culture)
    *
    * @default "en-US"
    */
  var culture: js.UndefOr[String] = js.native
  /**
    * Bing Maps Key.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BingMapsLayer.html#key)
    *
    * @default null
    */
  var key: js.UndefOr[String] = js.native
  /**
    * This will alter Geopolitical disputed borders and labels to align with the specified user region.  For more information on Bing's region setting please visit: https://msdn.microsoft.com/en-us/library/ff701704.aspx  For a list of supported country codes please visit: see https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BingMapsLayer.html#region)
    *
    * @default null
    */
  var region: js.UndefOr[String] = js.native
  /**
    * For more information on Bing map styles please visit: https://msdn.microsoft.com/en-us/library/ff701716.aspx
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BingMapsLayer.html#style)
    *
    * @default "road"
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

