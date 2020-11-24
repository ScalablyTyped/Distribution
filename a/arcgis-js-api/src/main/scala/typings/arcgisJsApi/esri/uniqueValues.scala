package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A function that queries for unique values from a field in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-uniqueValues.html)
  */
@js.native
trait uniqueValues extends js.Object {
  
  /**
    * Returns an object containing an array of unique values queried from a given field (or values returned from an expression) in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) along with the total count of features that belong to the given category.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-uniqueValues.html#uniqueValues)
    */
  def uniqueValues(params: uniqueValuesUniqueValuesParams): js.Promise[UniqueValuesResult] = js.native
}
object uniqueValues {
  
  @scala.inline
  def apply(uniqueValues: uniqueValuesUniqueValuesParams => js.Promise[UniqueValuesResult]): uniqueValues = {
    val __obj = js.Dynamic.literal(uniqueValues = js.Any.fromFunction1(uniqueValues))
    __obj.asInstanceOf[uniqueValues]
  }
  
  @scala.inline
  implicit class uniqueValuesOps[Self <: uniqueValues] (val x: Self) extends AnyVal {
    
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
    def setUniqueValues(value: uniqueValuesUniqueValuesParams => js.Promise[UniqueValuesResult]): Self = this.set("uniqueValues", js.Any.fromFunction1(value))
  }
}
