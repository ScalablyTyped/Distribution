package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.PictureMarkerSymbolProper
import typings.arcgisJsApi.anon.SimpleMarkerSymbolPropert
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoRSSLayerProperties
  extends StObject
     with LayerProperties
     with ScaleRangeLayerProperties
     with BlendLayerProperties {
  
  /**
    * Indicates whether the layer will be included in the legend.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoRSSLayer.html#legendEnabled)
    */
  var legendEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Symbol used to represent line features from the GeoRSS feed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoRSSLayer.html#lineSymbol)
    */
  var lineSymbol: js.UndefOr[SimpleLineSymbolProperties] = js.undefined
  
  /**
    * Symbol used to represent point features from the GeoRSS feed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoRSSLayer.html#pointSymbol)
    */
  var pointSymbol: js.UndefOr[PictureMarkerSymbolProper | SimpleMarkerSymbolPropert] = js.undefined
  
  /**
    * Symbol used to represent polygon features from the GeoRSS feed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoRSSLayer.html#polygonSymbol)
    */
  var polygonSymbol: js.UndefOr[SimpleFillSymbolProperties] = js.undefined
  
  /**
    * Refresh interval of the layer in minutes.
    *
    * @default 0
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoRSSLayer.html#refreshInterval)
    */
  var refreshInterval: js.UndefOr[Double] = js.undefined
  
  /**
    * The URL pointing to a GeoRSS file.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoRSSLayer.html#url)
    */
  var url: js.UndefOr[String] = js.undefined
}
object GeoRSSLayerProperties {
  
  inline def apply(): GeoRSSLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoRSSLayerProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeoRSSLayerProperties] (val x: Self) extends AnyVal {
    
    inline def setLegendEnabled(value: Boolean): Self = StObject.set(x, "legendEnabled", value.asInstanceOf[js.Any])
    
    inline def setLegendEnabledUndefined: Self = StObject.set(x, "legendEnabled", js.undefined)
    
    inline def setLineSymbol(value: SimpleLineSymbolProperties): Self = StObject.set(x, "lineSymbol", value.asInstanceOf[js.Any])
    
    inline def setLineSymbolUndefined: Self = StObject.set(x, "lineSymbol", js.undefined)
    
    inline def setPointSymbol(value: PictureMarkerSymbolProper | SimpleMarkerSymbolPropert): Self = StObject.set(x, "pointSymbol", value.asInstanceOf[js.Any])
    
    inline def setPointSymbolUndefined: Self = StObject.set(x, "pointSymbol", js.undefined)
    
    inline def setPolygonSymbol(value: SimpleFillSymbolProperties): Self = StObject.set(x, "polygonSymbol", value.asInstanceOf[js.Any])
    
    inline def setPolygonSymbolUndefined: Self = StObject.set(x, "polygonSymbol", js.undefined)
    
    inline def setRefreshInterval(value: Double): Self = StObject.set(x, "refreshInterval", value.asInstanceOf[js.Any])
    
    inline def setRefreshIntervalUndefined: Self = StObject.set(x, "refreshInterval", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
