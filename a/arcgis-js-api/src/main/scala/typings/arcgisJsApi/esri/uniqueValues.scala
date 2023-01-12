package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A function that queries for unique values from a field in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-uniqueValues.html)
  */
trait uniqueValues extends StObject {
  
  /**
    * Returns an object containing an array of unique values queried from a given field (or values returned from an expression) in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) along with the total count of features that belong to the given category.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-uniqueValues.html#uniqueValues)
    */
  def uniqueValues(params: uniqueValuesUniqueValuesParams): js.Promise[UniqueValuesResult]
}
object uniqueValues {
  
  inline def apply(uniqueValues: uniqueValuesUniqueValuesParams => js.Promise[UniqueValuesResult]): uniqueValues = {
    val __obj = js.Dynamic.literal(uniqueValues = js.Any.fromFunction1(uniqueValues))
    __obj.asInstanceOf[uniqueValues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: uniqueValues] (val x: Self) extends AnyVal {
    
    inline def setUniqueValues(value: uniqueValuesUniqueValuesParams => js.Promise[UniqueValuesResult]): Self = StObject.set(x, "uniqueValues", js.Any.fromFunction1(value))
  }
}
