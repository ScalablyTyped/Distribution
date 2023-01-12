package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A convenience module for providing input options for the geoprocessing service return values.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geoprocessor-GPOptions.html)
  */
trait GPOptions extends StObject {
  
  /**
    * The spatial reference of the output geometries.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geoprocessor-GPOptions.html#outSpatialReference)
    */
  var outSpatialReference: SpatialReference
  
  /**
    * ProcessExtent, if specified, will only process features that overlap this extent.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geoprocessor-GPOptions.html#processExtent)
    */
  var processExtent: Extent
  
  /**
    * The spatial reference that the model will use to perform geometry operations.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geoprocessor-GPOptions.html#processSpatialReference)
    */
  var processSpatialReference: SpatialReference
  
  /**
    * If `true`, m-values will be included in the results if the features have m-values.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geoprocessor-GPOptions.html#returnM)
    */
  var returnM: Boolean
  
  /**
    * If `true`, z-values will be included in the results if the features have z-values.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geoprocessor-GPOptions.html#returnZ)
    */
  var returnZ: Boolean
}
object GPOptions {
  
  inline def apply(
    outSpatialReference: SpatialReference,
    processExtent: Extent,
    processSpatialReference: SpatialReference,
    returnM: Boolean,
    returnZ: Boolean
  ): GPOptions = {
    val __obj = js.Dynamic.literal(outSpatialReference = outSpatialReference.asInstanceOf[js.Any], processExtent = processExtent.asInstanceOf[js.Any], processSpatialReference = processSpatialReference.asInstanceOf[js.Any], returnM = returnM.asInstanceOf[js.Any], returnZ = returnZ.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPOptions] (val x: Self) extends AnyVal {
    
    inline def setOutSpatialReference(value: SpatialReference): Self = StObject.set(x, "outSpatialReference", value.asInstanceOf[js.Any])
    
    inline def setProcessExtent(value: Extent): Self = StObject.set(x, "processExtent", value.asInstanceOf[js.Any])
    
    inline def setProcessSpatialReference(value: SpatialReference): Self = StObject.set(x, "processSpatialReference", value.asInstanceOf[js.Any])
    
    inline def setReturnM(value: Boolean): Self = StObject.set(x, "returnM", value.asInstanceOf[js.Any])
    
    inline def setReturnZ(value: Boolean): Self = StObject.set(x, "returnZ", value.asInstanceOf[js.Any])
  }
}
