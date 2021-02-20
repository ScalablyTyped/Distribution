package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WMSLayerProperties
  extends LayerProperties
     with BlendLayerProperties
     with PortalLayerProperties
     with ScaleRangeLayerProperties
     with RefreshableLayerProperties {
  
  /**
    * A flattened collection of all [WMSSublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html)s.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#allSublayers)
    */
  var allSublayers: js.UndefOr[CollectionProperties[WMSSublayerProperties]] = js.native
  
  /**
    * Copyright information for the WMS service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#copyright)
    */
  var copyright: js.UndefOr[String] = js.native
  
  /**
    * Use this to append different custom parameters to the WMS map requests.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#customLayerParameters)
    */
  var customLayerParameters: js.UndefOr[js.Any] = js.native
  
  /**
    * Use this to append custom parameters to all WMS requests.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#customParameters)
    */
  var customParameters: js.UndefOr[js.Any] = js.native
  
  /**
    * Description for the WMS layer.
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
    * The map image format (MIME type) to request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#imageFormat)
    */
  var imageFormat: js.UndefOr[String] = js.native
  
  /**
    * Indicates the maximum height of the image exported by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#imageMaxHeight)
    */
  var imageMaxHeight: js.UndefOr[Double] = js.native
  
  /**
    * Indicates the maximum width of the image exported by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#imageMaxWidth)
    */
  var imageMaxWidth: js.UndefOr[Double] = js.native
  
  /**
    * Indicates whether the background of the image exported by the service is transparent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#imageTransparency)
    */
  var imageTransparency: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether the layer will be included in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#legendEnabled)
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
    * The layer's time extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#timeExtent)
    */
  var timeExtent: js.UndefOr[TimeExtentProperties] = js.native
  
  /**
    * TimeInfo provides information such as date fields that store [start](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#startField) and [end](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#endField) time for each feature and the [fullTimeExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#fullTimeExtent) for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#timeInfo)
    */
  var timeInfo: js.UndefOr[TimeInfoProperties] = js.native
  
  /**
    * A temporary offset of the time data based on a certain [TimeInterval](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeInterval.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#timeOffset)
    */
  var timeOffset: js.UndefOr[TimeIntervalProperties] = js.native
  
  /**
    * The URL of the WMS service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#url)
    */
  var url: js.UndefOr[String] = js.native
  
  /**
    * Determines if the layer will update its temporal data based on the view's [timeExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#timeExtent).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#useViewTime)
    */
  var useViewTime: js.UndefOr[Boolean] = js.native
  
  /**
    * Version of the [WMS specification](http://www.opengeospatial.org/standards/wms) to use.
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
  implicit class WMSLayerPropertiesMutableBuilder[Self <: WMSLayerProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllSublayers(value: CollectionProperties[WMSSublayerProperties]): Self = StObject.set(x, "allSublayers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllSublayersUndefined: Self = StObject.set(x, "allSublayers", js.undefined)
    
    @scala.inline
    def setAllSublayersVarargs(value: WMSSublayerProperties*): Self = StObject.set(x, "allSublayers", js.Array(value :_*))
    
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
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setFeatureInfoFormat(value: String): Self = StObject.set(x, "featureInfoFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureInfoFormatUndefined: Self = StObject.set(x, "featureInfoFormat", js.undefined)
    
    @scala.inline
    def setFeatureInfoUrl(value: String): Self = StObject.set(x, "featureInfoUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureInfoUrlUndefined: Self = StObject.set(x, "featureInfoUrl", js.undefined)
    
    @scala.inline
    def setFullExtents(value: js.Array[ExtentProperties]): Self = StObject.set(x, "fullExtents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullExtentsUndefined: Self = StObject.set(x, "fullExtents", js.undefined)
    
    @scala.inline
    def setFullExtentsVarargs(value: ExtentProperties*): Self = StObject.set(x, "fullExtents", js.Array(value :_*))
    
    @scala.inline
    def setImageFormat(value: String): Self = StObject.set(x, "imageFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageFormatUndefined: Self = StObject.set(x, "imageFormat", js.undefined)
    
    @scala.inline
    def setImageMaxHeight(value: Double): Self = StObject.set(x, "imageMaxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageMaxHeightUndefined: Self = StObject.set(x, "imageMaxHeight", js.undefined)
    
    @scala.inline
    def setImageMaxWidth(value: Double): Self = StObject.set(x, "imageMaxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageMaxWidthUndefined: Self = StObject.set(x, "imageMaxWidth", js.undefined)
    
    @scala.inline
    def setImageTransparency(value: Boolean): Self = StObject.set(x, "imageTransparency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageTransparencyUndefined: Self = StObject.set(x, "imageTransparency", js.undefined)
    
    @scala.inline
    def setLegendEnabled(value: Boolean): Self = StObject.set(x, "legendEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendEnabledUndefined: Self = StObject.set(x, "legendEnabled", js.undefined)
    
    @scala.inline
    def setSpatialReference(value: SpatialReferenceProperties): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpatialReferenceUndefined: Self = StObject.set(x, "spatialReference", js.undefined)
    
    @scala.inline
    def setSpatialReferences(value: js.Array[Double]): Self = StObject.set(x, "spatialReferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpatialReferencesUndefined: Self = StObject.set(x, "spatialReferences", js.undefined)
    
    @scala.inline
    def setSpatialReferencesVarargs(value: Double*): Self = StObject.set(x, "spatialReferences", js.Array(value :_*))
    
    @scala.inline
    def setSublayers(value: CollectionProperties[WMSSublayerProperties]): Self = StObject.set(x, "sublayers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSublayersUndefined: Self = StObject.set(x, "sublayers", js.undefined)
    
    @scala.inline
    def setSublayersVarargs(value: WMSSublayerProperties*): Self = StObject.set(x, "sublayers", js.Array(value :_*))
    
    @scala.inline
    def setTimeExtent(value: TimeExtentProperties): Self = StObject.set(x, "timeExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeExtentUndefined: Self = StObject.set(x, "timeExtent", js.undefined)
    
    @scala.inline
    def setTimeInfo(value: TimeInfoProperties): Self = StObject.set(x, "timeInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeInfoUndefined: Self = StObject.set(x, "timeInfo", js.undefined)
    
    @scala.inline
    def setTimeOffset(value: TimeIntervalProperties): Self = StObject.set(x, "timeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeOffsetUndefined: Self = StObject.set(x, "timeOffset", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setUseViewTime(value: Boolean): Self = StObject.set(x, "useViewTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseViewTimeUndefined: Self = StObject.set(x, "useViewTime", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
