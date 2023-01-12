package typings.arcgisRestApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureSet
  extends StObject
     with HasZM {
  
  // optional
  var displayFieldName: js.UndefOr[String] = js.undefined
  
  var features: js.Array[Feature]
  
  // for feature layers only.
  var fields: js.UndefOr[js.Array[Field]] = js.undefined
  
  // optional
  var geometryType: js.UndefOr[esriGeometryType] = js.undefined
  
  // optional
  var globalIdFieldName: js.UndefOr[String] = js.undefined
  
  var objectIdFieldName: js.UndefOr[String] = js.undefined
  
  // for feature layers only
  var spatialReference: js.UndefOr[SpatialReference] = js.undefined
}
object FeatureSet {
  
  inline def apply(features: js.Array[Feature]): FeatureSet = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureSet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeatureSet] (val x: Self) extends AnyVal {
    
    inline def setDisplayFieldName(value: String): Self = StObject.set(x, "displayFieldName", value.asInstanceOf[js.Any])
    
    inline def setDisplayFieldNameUndefined: Self = StObject.set(x, "displayFieldName", js.undefined)
    
    inline def setFeatures(value: js.Array[Feature]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesVarargs(value: Feature*): Self = StObject.set(x, "features", js.Array(value*))
    
    inline def setFields(value: js.Array[Field]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: Field*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setGeometryType(value: esriGeometryType): Self = StObject.set(x, "geometryType", value.asInstanceOf[js.Any])
    
    inline def setGeometryTypeUndefined: Self = StObject.set(x, "geometryType", js.undefined)
    
    inline def setGlobalIdFieldName(value: String): Self = StObject.set(x, "globalIdFieldName", value.asInstanceOf[js.Any])
    
    inline def setGlobalIdFieldNameUndefined: Self = StObject.set(x, "globalIdFieldName", js.undefined)
    
    inline def setObjectIdFieldName(value: String): Self = StObject.set(x, "objectIdFieldName", value.asInstanceOf[js.Any])
    
    inline def setObjectIdFieldNameUndefined: Self = StObject.set(x, "objectIdFieldName", js.undefined)
    
    inline def setSpatialReference(value: SpatialReference): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
    
    inline def setSpatialReferenceUndefined: Self = StObject.set(x, "spatialReference", js.undefined)
  }
}
