package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.KVP
import typings.arcgisJsApi.arcgisJsApiStrings.RESTful
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WMTSLayerProperties
  extends StObject
     with LayerProperties
     with PortalLayerProperties
     with ScaleRangeLayerProperties
     with RefreshableLayerProperties
     with BlendLayerProperties {
  
  /**
    * Currently active sublayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#activeLayer)
    */
  var activeLayer: js.UndefOr[WMTSSublayerProperties] = js.undefined
  
  /**
    * Copyright information for the WMTS service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#copyright)
    */
  var copyright: js.UndefOr[String] = js.undefined
  
  /**
    * Use this to append different custom parameters to the WMTS tile requests.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#customLayerParameters)
    */
  var customLayerParameters: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Use this to append custom parameters to all WMTS requests.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#customParameters)
    */
  var customParameters: js.UndefOr[js.Any] = js.undefined
  
  /**
    * The service mode for the WMTS layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#serviceMode)
    */
  var serviceMode: js.UndefOr[RESTful | KVP] = js.undefined
  
  /**
    * A collection of [WMTSSublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html) objects.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#sublayers)
    */
  var sublayers: js.UndefOr[CollectionProperties[WMTSSublayerProperties]] = js.undefined
  
  /**
    * The URL of the WMTS service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#url)
    */
  var url: js.UndefOr[String] = js.undefined
  
  /**
    * Version of the [WMTS specification](http://www.opengeospatial.org/standards/wmts) to use.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#version)
    */
  var version: js.UndefOr[String] = js.undefined
}
object WMTSLayerProperties {
  
  @scala.inline
  def apply(): WMTSLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WMTSLayerProperties]
  }
  
  @scala.inline
  implicit class WMTSLayerPropertiesMutableBuilder[Self <: WMTSLayerProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveLayer(value: WMTSSublayerProperties): Self = StObject.set(x, "activeLayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveLayerUndefined: Self = StObject.set(x, "activeLayer", js.undefined)
    
    @scala.inline
    def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    @scala.inline
    def setCustomLayerParameters(value: js.Any): Self = StObject.set(x, "customLayerParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomLayerParametersUndefined: Self = StObject.set(x, "customLayerParameters", js.undefined)
    
    @scala.inline
    def setCustomParameters(value: js.Any): Self = StObject.set(x, "customParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomParametersUndefined: Self = StObject.set(x, "customParameters", js.undefined)
    
    @scala.inline
    def setServiceMode(value: RESTful | KVP): Self = StObject.set(x, "serviceMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceModeUndefined: Self = StObject.set(x, "serviceMode", js.undefined)
    
    @scala.inline
    def setSublayers(value: CollectionProperties[WMTSSublayerProperties]): Self = StObject.set(x, "sublayers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSublayersUndefined: Self = StObject.set(x, "sublayers", js.undefined)
    
    @scala.inline
    def setSublayersVarargs(value: WMTSSublayerProperties*): Self = StObject.set(x, "sublayers", js.Array(value :_*))
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
