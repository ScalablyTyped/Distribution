package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.ClassBreaksRendererProper
import typings.arcgisJsApi.anon.RasterStretchRendererProp
import typings.arcgisJsApi.arcgisJsApiStrings.bilinear
import typings.arcgisJsApi.arcgisJsApiStrings.cubic
import typings.arcgisJsApi.arcgisJsApiStrings.majority
import typings.arcgisJsApi.arcgisJsApiStrings.nearest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WCSLayerProperties
  extends StObject
     with LayerProperties
     with ImageryTileMixinProperties
     with PortalLayerProperties
     with ScaleRangeLayerProperties {
  
  /**
    * The coverage identifier for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#coverageId)
    */
  var coverageId: js.UndefOr[String] = js.undefined
  
  /**
    * Use this property to append custom parameters to all WCS requests.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#customParameters)
    */
  var customParameters: js.UndefOr[Any] = js.undefined
  
  /**
    * An array of raster fields in the layer that consists of service pixel value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#fields)
    */
  var fields: js.UndefOr[js.Array[FieldProperties]] = js.undefined
  
  /**
    * Defines how to interpolate pixel values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#interpolation)
    */
  var interpolation: js.UndefOr[nearest | bilinear | cubic | majority] = js.undefined
  
  /**
    * The renderer assigned to the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#renderer)
    */
  @JSName("renderer")
  var renderer_WCSLayerProperties: js.UndefOr[ClassBreaksRendererProper | RasterStretchRendererProp] = js.undefined
  
  /**
    * The layer's time extent.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#timeExtent)
    */
  var timeExtent: js.UndefOr[TimeExtentProperties] = js.undefined
  
  /**
    * TimeInfo provides information such as date fields that store [start](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#startField) and [end](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#endField) time for each feature and the [fullTimeExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#fullTimeExtent) for the layer.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#timeInfo)
    */
  var timeInfo: js.UndefOr[TimeInfoProperties] = js.undefined
  
  /**
    * A temporary offset of the time data based on a certain [TimeInterval](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeInterval.html).
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#timeOffset)
    */
  var timeOffset: js.UndefOr[TimeIntervalProperties] = js.undefined
  
  /**
    * The URL of the WCS service endpoint of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#url)
    */
  var url: js.UndefOr[String] = js.undefined
  
  /**
    * Determines if the layer will update its temporal data based on the view's [timeExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#timeExtent).
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#useViewTime)
    */
  var useViewTime: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The version of Web Coverage Service currently being used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#version)
    */
  var version: js.UndefOr[String] = js.undefined
}
object WCSLayerProperties {
  
  inline def apply(): WCSLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WCSLayerProperties]
  }
  
  extension [Self <: WCSLayerProperties](x: Self) {
    
    inline def setCoverageId(value: String): Self = StObject.set(x, "coverageId", value.asInstanceOf[js.Any])
    
    inline def setCoverageIdUndefined: Self = StObject.set(x, "coverageId", js.undefined)
    
    inline def setCustomParameters(value: Any): Self = StObject.set(x, "customParameters", value.asInstanceOf[js.Any])
    
    inline def setCustomParametersUndefined: Self = StObject.set(x, "customParameters", js.undefined)
    
    inline def setFields(value: js.Array[FieldProperties]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: FieldProperties*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setInterpolation(value: nearest | bilinear | cubic | majority): Self = StObject.set(x, "interpolation", value.asInstanceOf[js.Any])
    
    inline def setInterpolationUndefined: Self = StObject.set(x, "interpolation", js.undefined)
    
    inline def setRenderer(value: ClassBreaksRendererProper | RasterStretchRendererProp): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    inline def setTimeExtent(value: TimeExtentProperties): Self = StObject.set(x, "timeExtent", value.asInstanceOf[js.Any])
    
    inline def setTimeExtentUndefined: Self = StObject.set(x, "timeExtent", js.undefined)
    
    inline def setTimeInfo(value: TimeInfoProperties): Self = StObject.set(x, "timeInfo", value.asInstanceOf[js.Any])
    
    inline def setTimeInfoUndefined: Self = StObject.set(x, "timeInfo", js.undefined)
    
    inline def setTimeOffset(value: TimeIntervalProperties): Self = StObject.set(x, "timeOffset", value.asInstanceOf[js.Any])
    
    inline def setTimeOffsetUndefined: Self = StObject.set(x, "timeOffset", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUseViewTime(value: Boolean): Self = StObject.set(x, "useViewTime", value.asInstanceOf[js.Any])
    
    inline def setUseViewTimeUndefined: Self = StObject.set(x, "useViewTime", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
