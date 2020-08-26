package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WMSLayerProperties
  extends LayerProperties
     with PortalLayerProperties
     with ScaleRangeLayerProperties
     with RefreshableLayerProperties {
  /**
    * Copyright information for the WMS service. This defaults to the value of the AccessConstraints property from the GetCapabilities request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#copyright)
    */
  var copyright: js.UndefOr[String] = js.native
  /**
    * Use this to append different custom parameters to the WMS map requests. The custom layer parameters are applied to GetMap and GetFeatureInfo.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#customLayerParameters)
    */
  var customLayerParameters: js.UndefOr[js.Any] = js.native
  /**
    * Use this to append custom parameters to all WMS requests. The custom parameters are applied to GetCapabilities, GetMap and GetFeatureInfo. For example, if an access key is required, the key can be configured as a custom parameter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#customParameters)
    */
  var customParameters: js.UndefOr[js.Any] = js.native
  /**
    * Description for the WMS layer. This defaults to the value of the Abstract property from the WMS GetCapabilities request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#description)
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Return format of feature information (MIME type).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#featureInfoFormat)
    */
  var featureInfoFormat: js.UndefOr[String] = js.native
  /**
    * The URL for the WMS GetFeatureInfo call.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#featureInfoUrl)
    */
  var featureInfoUrl: js.UndefOr[String] = js.native
  /**
    * All bounding boxes defined for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#fullExtents)
    */
  var fullExtents: js.UndefOr[js.Array[ExtentProperties]] = js.native
  /**
    * The map image format (MIME type) to request. Defaults to `image/png` if the WMS service supports it. If not, it defaults to the value of the first `<Format>` in `<GetMap>` in the GetCapabilities response.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#imageFormat)
    */
  var imageFormat: js.UndefOr[String] = js.native
  /**
    * Indicates the maximum height of the image exported by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#imageMaxHeight)
    *
    * @default 2048
    */
  var imageMaxHeight: js.UndefOr[Double] = js.native
  /**
    * Indicates the maximum width of the image exported by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#imageMaxWidth)
    *
    * @default 2048
    */
  var imageMaxWidth: js.UndefOr[Double] = js.native
  /**
    * Indicates whether the background of the image exported by the service is transparent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#imageTransparency)
    *
    * @default true
    */
  var imageTransparency: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the layer will be included in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#legendEnabled)
    *
    * @default true
    */
  var legendEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The spatial reference of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#spatialReference)
    */
  var spatialReference: js.UndefOr[SpatialReferenceProperties] = js.native
  /**
    * List of spatialReference well known ids derived from the CRS elements of the first layer in the GetCapabilities request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#spatialReferences)
    */
  var spatialReferences: js.UndefOr[js.Array[Double]] = js.native
  /**
    * A collection of [WMSSublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html)s.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#sublayers)
    */
  var sublayers: js.UndefOr[CollectionProperties[WMSSublayerProperties]] = js.native
  /**
    * The URL of the WMS service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#url)
    */
  var url: js.UndefOr[String] = js.native
  /**
    * Version of the [WMS specification](http://www.opengeospatial.org/standards/wms) to use. For example, `1.3.0`, `1.1.1`, `1.1` or `1.0`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#version)
    */
  var version: js.UndefOr[String] = js.native
}

object WMSLayerProperties {
  @scala.inline
  def apply(): WMSLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WMSLayerProperties]
  }
  @scala.inline
  implicit class WMSLayerPropertiesOps[Self <: WMSLayerProperties] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setFeatureInfoFormat(value: String): Self = this.set("featureInfoFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatureInfoFormat: Self = this.set("featureInfoFormat", js.undefined)
    @scala.inline
    def setFeatureInfoUrl(value: String): Self = this.set("featureInfoUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatureInfoUrl: Self = this.set("featureInfoUrl", js.undefined)
    @scala.inline
    def setFullExtentsVarargs(value: ExtentProperties*): Self = this.set("fullExtents", js.Array(value :_*))
    @scala.inline
    def setFullExtents(value: js.Array[ExtentProperties]): Self = this.set("fullExtents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullExtents: Self = this.set("fullExtents", js.undefined)
    @scala.inline
    def setImageFormat(value: String): Self = this.set("imageFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageFormat: Self = this.set("imageFormat", js.undefined)
    @scala.inline
    def setImageMaxHeight(value: Double): Self = this.set("imageMaxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageMaxHeight: Self = this.set("imageMaxHeight", js.undefined)
    @scala.inline
    def setImageMaxWidth(value: Double): Self = this.set("imageMaxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageMaxWidth: Self = this.set("imageMaxWidth", js.undefined)
    @scala.inline
    def setImageTransparency(value: Boolean): Self = this.set("imageTransparency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageTransparency: Self = this.set("imageTransparency", js.undefined)
    @scala.inline
    def setLegendEnabled(value: Boolean): Self = this.set("legendEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegendEnabled: Self = this.set("legendEnabled", js.undefined)
    @scala.inline
    def setSpatialReference(value: SpatialReferenceProperties): Self = this.set("spatialReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpatialReference: Self = this.set("spatialReference", js.undefined)
    @scala.inline
    def setSpatialReferencesVarargs(value: Double*): Self = this.set("spatialReferences", js.Array(value :_*))
    @scala.inline
    def setSpatialReferences(value: js.Array[Double]): Self = this.set("spatialReferences", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpatialReferences: Self = this.set("spatialReferences", js.undefined)
    @scala.inline
    def setSublayersVarargs(value: WMSSublayerProperties*): Self = this.set("sublayers", js.Array(value :_*))
    @scala.inline
    def setSublayers(value: CollectionProperties[WMSSublayerProperties]): Self = this.set("sublayers", value.asInstanceOf[js.Any])
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

