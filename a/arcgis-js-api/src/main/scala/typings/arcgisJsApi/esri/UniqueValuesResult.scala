package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UniqueValuesResult extends Object {
  /**
    * An array of objects, each containing a unique value/type/category present in the field specified in the [uniqueValues()](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-uniqueValues.html#uniqueValues) query. See table below for the specification of each object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-uniqueValues.html#UniqueValuesResult)
    */
  var uniqueValueInfos: js.Array[UniqueValuesResultUniqueValueInfos] = js.native
}

object UniqueValuesResult {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    uniqueValueInfos: js.Array[UniqueValuesResultUniqueValueInfos]
  ): UniqueValuesResult = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), uniqueValueInfos = uniqueValueInfos.asInstanceOf[js.Any])
    __obj.asInstanceOf[UniqueValuesResult]
  }
  @scala.inline
  implicit class UniqueValuesResultOps[Self <: UniqueValuesResult] (val x: Self) extends AnyVal {
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
    def setUniqueValueInfosVarargs(value: UniqueValuesResultUniqueValueInfos*): Self = this.set("uniqueValueInfos", js.Array(value :_*))
    @scala.inline
    def setUniqueValueInfos(value: js.Array[UniqueValuesResultUniqueValueInfos]): Self = this.set("uniqueValueInfos", value.asInstanceOf[js.Any])
  }
  
}

