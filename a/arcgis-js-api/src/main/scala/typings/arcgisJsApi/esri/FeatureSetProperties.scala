package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.extent
import typings.arcgisJsApi.arcgisJsApiStrings.mesh
import typings.arcgisJsApi.arcgisJsApiStrings.multipoint
import typings.arcgisJsApi.arcgisJsApiStrings.point
import typings.arcgisJsApi.arcgisJsApiStrings.polygon
import typings.arcgisJsApi.arcgisJsApiStrings.polyline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureSetProperties extends StObject {
  
  /**
    * The name of the layer's primary display field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html#displayFieldName)
    */
  var displayFieldName: js.UndefOr[String] = js.undefined
  
  /**
    * Typically, a layer has a limit on the number of features (i.e., records) returned by the query operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html#exceededTransferLimit)
    */
  var exceededTransferLimit: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The array of graphics returned from a task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html#features)
    */
  var features: js.UndefOr[js.Array[GraphicProperties]] = js.undefined
  
  /**
    * Information about each field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html#fields)
    */
  var fields: js.UndefOr[js.Array[FieldProperties]] = js.undefined
  
  /**
    * The geometry type of features in the FeatureSet.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html#geometryType)
    */
  var geometryType: js.UndefOr[point | multipoint | polyline | polygon | extent | mesh] = js.undefined
  
  /**
    * The [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#geometry) used to query the features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html#queryGeometry)
    */
  var queryGeometry: js.UndefOr[GeometryProperties] = js.undefined
  
  /**
    * When a FeatureSet is used as input to Geoprocessor, the spatial reference is set to the map's spatial reference by default.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html#spatialReference)
    */
  var spatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
}
object FeatureSetProperties {
  
  inline def apply(): FeatureSetProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureSetProperties]
  }
  
  extension [Self <: FeatureSetProperties](x: Self) {
    
    inline def setDisplayFieldName(value: String): Self = StObject.set(x, "displayFieldName", value.asInstanceOf[js.Any])
    
    inline def setDisplayFieldNameUndefined: Self = StObject.set(x, "displayFieldName", js.undefined)
    
    inline def setExceededTransferLimit(value: Boolean): Self = StObject.set(x, "exceededTransferLimit", value.asInstanceOf[js.Any])
    
    inline def setExceededTransferLimitUndefined: Self = StObject.set(x, "exceededTransferLimit", js.undefined)
    
    inline def setFeatures(value: js.Array[GraphicProperties]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setFeaturesVarargs(value: GraphicProperties*): Self = StObject.set(x, "features", js.Array(value :_*))
    
    inline def setFields(value: js.Array[FieldProperties]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: FieldProperties*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    inline def setGeometryType(value: point | multipoint | polyline | polygon | extent | mesh): Self = StObject.set(x, "geometryType", value.asInstanceOf[js.Any])
    
    inline def setGeometryTypeUndefined: Self = StObject.set(x, "geometryType", js.undefined)
    
    inline def setQueryGeometry(value: GeometryProperties): Self = StObject.set(x, "queryGeometry", value.asInstanceOf[js.Any])
    
    inline def setQueryGeometryUndefined: Self = StObject.set(x, "queryGeometry", js.undefined)
    
    inline def setSpatialReference(value: SpatialReferenceProperties): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
    
    inline def setSpatialReferenceUndefined: Self = StObject.set(x, "spatialReference", js.undefined)
  }
}
