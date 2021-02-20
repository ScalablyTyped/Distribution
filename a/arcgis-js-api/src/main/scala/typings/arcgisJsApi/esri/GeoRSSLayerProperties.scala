package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
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
  implicit class GeoRSSLayerPropertiesMutableBuilder[Self <: GeoRSSLayerProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLineSymbol(value: SimpleLineSymbolProperties): Self = StObject.set(x, "lineSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineSymbolUndefined: Self = StObject.set(x, "lineSymbol", js.undefined)
    
    @scala.inline
    def setPointSymbol(value: PictureMarkerSymbolProperties | SimpleMarkerSymbolProperties): Self = StObject.set(x, "pointSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointSymbolUndefined: Self = StObject.set(x, "pointSymbol", js.undefined)
    
    @scala.inline
    def setPolygonSymbol(value: SimpleFillSymbolProperties): Self = StObject.set(x, "polygonSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolygonSymbolUndefined: Self = StObject.set(x, "polygonSymbol", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
