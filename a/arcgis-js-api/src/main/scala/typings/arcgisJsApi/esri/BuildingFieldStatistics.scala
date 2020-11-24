package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildingFieldStatistics extends Object {
  
  /**
    * Name of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingSummaryStatistics.html#BuildingFieldStatistics)
    */
  var fieldName: String = js.native
  
  /**
    * Label of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingSummaryStatistics.html#BuildingFieldStatistics)
    */
  var label: String = js.native
  
  /**
    * Maximum value of the field for numeric values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingSummaryStatistics.html#BuildingFieldStatistics)
    */
  var max: Double = js.native
  
  /**
    * Minimum value of the field for numeric values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingSummaryStatistics.html#BuildingFieldStatistics)
    */
  var min: Double = js.native
  
  /**
    * Model Name of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingSummaryStatistics.html#BuildingFieldStatistics)
    */
  var modelName: String = js.native
  
  /**
    * List of the most frequent values of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingSummaryStatistics.html#BuildingFieldStatistics)
    */
  var mostFrequentValues: js.Array[Double | String] = js.native
  
  /**
    * List of sublayer ids where this field is available.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingSummaryStatistics.html#BuildingFieldStatistics)
    */
  var subLayerIds: js.Array[Double] = js.native
}
object BuildingFieldStatistics {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    fieldName: String,
    hasOwnProperty: PropertyKey => Boolean,
    label: String,
    max: Double,
    min: Double,
    modelName: String,
    mostFrequentValues: js.Array[Double | String],
    propertyIsEnumerable: PropertyKey => Boolean,
    subLayerIds: js.Array[Double]
  ): BuildingFieldStatistics = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], fieldName = fieldName.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), label = label.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], modelName = modelName.asInstanceOf[js.Any], mostFrequentValues = mostFrequentValues.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), subLayerIds = subLayerIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildingFieldStatistics]
  }
  
  @scala.inline
  implicit class BuildingFieldStatisticsOps[Self <: BuildingFieldStatistics] (val x: Self) extends AnyVal {
    
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
    def setFieldName(value: String): Self = this.set("fieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelName(value: String): Self = this.set("modelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMostFrequentValuesVarargs(value: (Double | String)*): Self = this.set("mostFrequentValues", js.Array(value :_*))
    
    @scala.inline
    def setMostFrequentValues(value: js.Array[Double | String]): Self = this.set("mostFrequentValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubLayerIdsVarargs(value: Double*): Self = this.set("subLayerIds", js.Array(value :_*))
    
    @scala.inline
    def setSubLayerIds(value: js.Array[Double]): Self = this.set("subLayerIds", value.asInstanceOf[js.Any])
  }
}
