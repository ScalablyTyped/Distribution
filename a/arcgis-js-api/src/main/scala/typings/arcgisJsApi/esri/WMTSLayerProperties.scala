package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.KVP
import typings.arcgisJsApi.arcgisJsApiStrings.RESTful
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WMTSLayerProperties
  extends LayerProperties
     with PortalLayerProperties
     with ScaleRangeLayerProperties
     with RefreshableLayerProperties {
  /**
    * Currently active sublayer. Defaults to the first sublayer in [sublayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#sublayers).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#activeLayer)
    */
  var activeLayer: js.UndefOr[WMTSSublayerProperties] = js.native
  /**
    * Copyright information for the WMTS service. This defaults to the value of the AccessConstraints property from the GetCapabilities request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#copyright)
    */
  var copyright: js.UndefOr[String] = js.native
  /**
    * Use this to append different custom parameters to the WMTS tile requests. The custom layer parameters are applied to GetTile.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#customLayerParameters)
    */
  var customLayerParameters: js.UndefOr[js.Any] = js.native
  /**
    * Use this to append custom parameters to all WMTS requests. The custom parameters are applied to GetCapabilities and GetTile. For example, if an access key is required, the key can be configured as a custom parameter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#customParameters)
    */
  var customParameters: js.UndefOr[js.Any] = js.native
  /**
    * The service mode for the WMTS layer. If not specified, the API will first make a getCapabilities request using `RESTful`. If that fails, it will try using `KVP`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#serviceMode)
    *
    * @default RESTful
    */
  var serviceMode: js.UndefOr[RESTful | KVP] = js.native
  /**
    * A collection of [WMTSSublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html) objects.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#sublayers)
    */
  var sublayers: js.UndefOr[CollectionProperties[WMTSSublayerProperties]] = js.native
  /**
    * The URL of the WMTS service. The URL for the GetCapabilities is created based on the url and serviceMode properties. For example https://gibs.earthdata.nasa.gov/wmts/epsg4326/best.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#url)
    */
  var url: js.UndefOr[String] = js.native
  /**
    * Version of the [WMTS specification](http://www.opengeospatial.org/standards/wmts) to use. Probably `1.0.0`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#version)
    */
  var version: js.UndefOr[String] = js.native
}

object WMTSLayerProperties {
  @scala.inline
  def apply(): WMTSLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WMTSLayerProperties]
  }
  @scala.inline
  implicit class WMTSLayerPropertiesOps[Self <: WMTSLayerProperties] (val x: Self) extends AnyVal {
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
    def setActiveLayer(value: WMTSSublayerProperties): Self = this.set("activeLayer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveLayer: Self = this.set("activeLayer", js.undefined)
    @scala.inline
    def setCopyright(value: String): Self = this.set("copyright", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopyright: Self = this.set("copyright", js.undefined)
    @scala.inline
    def setCustomLayerParameters(value: js.Any): Self = this.set("customLayerParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomLayerParameters: Self = this.set("customLayerParameters", js.undefined)
    @scala.inline
    def setCustomParameters(value: js.Any): Self = this.set("customParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomParameters: Self = this.set("customParameters", js.undefined)
    @scala.inline
    def setServiceMode(value: RESTful | KVP): Self = this.set("serviceMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceMode: Self = this.set("serviceMode", js.undefined)
    @scala.inline
    def setSublayersVarargs(value: WMTSSublayerProperties*): Self = this.set("sublayers", js.Array(value :_*))
    @scala.inline
    def setSublayers(value: CollectionProperties[WMTSSublayerProperties]): Self = this.set("sublayers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSublayers: Self = this.set("sublayers", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

