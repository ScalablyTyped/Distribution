package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoprocessorProperties
  extends StObject
     with TaskProperties {
  
  /**
    * The spatial reference of the output geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#outSpatialReference)
    */
  var outSpatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
  
  /**
    * ProcessExtent, if specified, will only process features that overlap this extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#processExtent)
    */
  var processExtent: js.UndefOr[ExtentProperties] = js.undefined
  
  /**
    * The spatial reference that the model will use to perform geometry operations.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#processSpatialReference)
    */
  var processSpatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
  
  /**
    * If `true`, m-values will be included in the results if the features have m-values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#returnM)
    */
  var returnM: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, z-values will be included in the results if the features have z-values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#returnZ)
    */
  var returnZ: js.UndefOr[Boolean] = js.undefined
}
object GeoprocessorProperties {
  
  inline def apply(): GeoprocessorProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoprocessorProperties]
  }
  
  extension [Self <: GeoprocessorProperties](x: Self) {
    
    inline def setOutSpatialReference(value: SpatialReferenceProperties): Self = StObject.set(x, "outSpatialReference", value.asInstanceOf[js.Any])
    
    inline def setOutSpatialReferenceUndefined: Self = StObject.set(x, "outSpatialReference", js.undefined)
    
    inline def setProcessExtent(value: ExtentProperties): Self = StObject.set(x, "processExtent", value.asInstanceOf[js.Any])
    
    inline def setProcessExtentUndefined: Self = StObject.set(x, "processExtent", js.undefined)
    
    inline def setProcessSpatialReference(value: SpatialReferenceProperties): Self = StObject.set(x, "processSpatialReference", value.asInstanceOf[js.Any])
    
    inline def setProcessSpatialReferenceUndefined: Self = StObject.set(x, "processSpatialReference", js.undefined)
    
    inline def setReturnM(value: Boolean): Self = StObject.set(x, "returnM", value.asInstanceOf[js.Any])
    
    inline def setReturnMUndefined: Self = StObject.set(x, "returnM", js.undefined)
    
    inline def setReturnZ(value: Boolean): Self = StObject.set(x, "returnZ", value.asInstanceOf[js.Any])
    
    inline def setReturnZUndefined: Self = StObject.set(x, "returnZ", js.undefined)
  }
}
