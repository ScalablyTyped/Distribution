package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeoRSSLayerProperties
  extends LayerProperties
     with ScaleRangeLayerProperties
     with BlendLayerProperties {
  
  /**
    * Symbol used to represent line features from the GeoRSS feed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoRSSLayer.html#lineSymbol)
    */
  var lineSymbol: js.UndefOr[SimpleLineSymbolProperties] = js.native
  
  /**
    * Symbol used to represent point features from the GeoRSS feed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoRSSLayer.html#pointSymbol)
    */
  var pointSymbol: js.UndefOr[PictureMarkerSymbolProperties | SimpleMarkerSymbolProperties] = js.native
  
  /**
    * Symbol used to represent polygon features from the GeoRSS feed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoRSSLayer.html#polygonSymbol)
    */
  var polygonSymbol: js.UndefOr[SimpleFillSymbolProperties] = js.native
  
  /**
    * The URL pointing to a GeoRSS file.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoRSSLayer.html#url)
    */
  var url: js.UndefOr[String] = js.native
}
object GeoRSSLayerProperties {
  
  @scala.inline
  def apply(): GeoRSSLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoRSSLayerProperties]
  }
  
  @scala.inline
  implicit class GeoRSSLayerPropertiesOps[Self <: GeoRSSLayerProperties] (val x: Self) extends AnyVal {
    
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
    def setLineSymbol(value: SimpleLineSymbolProperties): Self = this.set("lineSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineSymbol: Self = this.set("lineSymbol", js.undefined)
    
    @scala.inline
    def setPointSymbol(value: PictureMarkerSymbolProperties | SimpleMarkerSymbolProperties): Self = this.set("pointSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointSymbol: Self = this.set("pointSymbol", js.undefined)
    
    @scala.inline
    def setPolygonSymbol(value: SimpleFillSymbolProperties): Self = this.set("polygonSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolygonSymbol: Self = this.set("polygonSymbol", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
