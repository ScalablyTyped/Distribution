package typings.arcgisJsApi.esri

import typings.std.AbortSignal
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait uniqueValuesUniqueValuesParams
  extends StObject
     with Object {
  
  /**
    * A subset of features for which to generate the unique values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-uniqueValues.html#uniqueValues)
    */
  var features: js.UndefOr[js.Array[Graphic]] = js.undefined
  
  /**
    * The name of the numeric or string field from which the unique values will be obtained.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-uniqueValues.html#uniqueValues)
    */
  var field: js.UndefOr[String] = js.undefined
  
  /**
    * The layer from which to query for unique values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-uniqueValues.html#uniqueValues)
    */
  var layer: FeatureLayer | SceneLayer | CSVLayer | PointCloudLayer | GeoJSONLayer
  
  /**
    * Indicates that all domain codes should be returned if the given field has domain values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-uniqueValues.html#uniqueValues)
    */
  var returnAllCodedValues: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Allows for cancelable requests.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-uniqueValues.html#uniqueValues)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
  
  /**
    * A SQL expression evaluating to a number or string.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-uniqueValues.html#uniqueValues)
    */
  var sqlExpression: js.UndefOr[String] = js.undefined
  
  /**
    * A SQL where clause used to filter features for the statistics query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-uniqueValues.html#uniqueValues)
    */
  var sqlWhere: js.UndefOr[String] = js.undefined
  
  /**
    * An [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression that returns a number or string.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-uniqueValues.html#uniqueValues)
    */
  var valueExpression: js.UndefOr[String] = js.undefined
  
  /**
    * A [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) or [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) instance is required when a `valueExpression` is specified.
    *
    * [Read more...](global.html)
    */
  var view: js.UndefOr[View] = js.undefined
}
object uniqueValuesUniqueValuesParams {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    layer: FeatureLayer | SceneLayer | CSVLayer | PointCloudLayer | GeoJSONLayer,
    propertyIsEnumerable: PropertyKey => Boolean
  ): uniqueValuesUniqueValuesParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[uniqueValuesUniqueValuesParams]
  }
  
  @scala.inline
  implicit class uniqueValuesUniqueValuesParamsMutableBuilder[Self <: uniqueValuesUniqueValuesParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFeatures(value: js.Array[Graphic]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    @scala.inline
    def setFeaturesVarargs(value: Graphic*): Self = StObject.set(x, "features", js.Array(value :_*))
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setLayer(value: FeatureLayer | SceneLayer | CSVLayer | PointCloudLayer | GeoJSONLayer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnAllCodedValues(value: Boolean): Self = StObject.set(x, "returnAllCodedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnAllCodedValuesUndefined: Self = StObject.set(x, "returnAllCodedValues", js.undefined)
    
    @scala.inline
    def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    @scala.inline
    def setSqlExpression(value: String): Self = StObject.set(x, "sqlExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqlExpressionUndefined: Self = StObject.set(x, "sqlExpression", js.undefined)
    
    @scala.inline
    def setSqlWhere(value: String): Self = StObject.set(x, "sqlWhere", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqlWhereUndefined: Self = StObject.set(x, "sqlWhere", js.undefined)
    
    @scala.inline
    def setValueExpression(value: String): Self = StObject.set(x, "valueExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueExpressionUndefined: Self = StObject.set(x, "valueExpression", js.undefined)
    
    @scala.inline
    def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
