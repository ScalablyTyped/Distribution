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
  
  @scala.inline
  def apply(features: js.Array[Feature]): FeatureSet = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureSet]
  }
  
  @scala.inline
  implicit class FeatureSetMutableBuilder[Self <: FeatureSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayFieldName(value: String): Self = StObject.set(x, "displayFieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayFieldNameUndefined: Self = StObject.set(x, "displayFieldName", js.undefined)
    
    @scala.inline
    def setFeatures(value: js.Array[Feature]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturesVarargs(value: Feature*): Self = StObject.set(x, "features", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: js.Array[Field]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: Field*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setGeometryType(value: esriGeometryType): Self = StObject.set(x, "geometryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometryTypeUndefined: Self = StObject.set(x, "geometryType", js.undefined)
    
    @scala.inline
    def setGlobalIdFieldName(value: String): Self = StObject.set(x, "globalIdFieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalIdFieldNameUndefined: Self = StObject.set(x, "globalIdFieldName", js.undefined)
    
    @scala.inline
    def setObjectIdFieldName(value: String): Self = StObject.set(x, "objectIdFieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdFieldNameUndefined: Self = StObject.set(x, "objectIdFieldName", js.undefined)
    
    @scala.inline
    def setSpatialReference(value: SpatialReference): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpatialReferenceUndefined: Self = StObject.set(x, "spatialReference", js.undefined)
  }
}
