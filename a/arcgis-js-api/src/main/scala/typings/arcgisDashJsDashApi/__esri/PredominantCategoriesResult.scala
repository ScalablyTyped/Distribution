package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PredominantCategoriesResult extends Object {
  /**
    * An array of objects describing the count of each predominant category.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-predominantCategories.html#PredominantCategoriesResult)
    */
  var predominantCategoryInfos: js.Array[PredominantCategoriesResultPredominantCategoryInfos]
}

object PredominantCategoriesResult {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    predominantCategoryInfos: js.Array[PredominantCategoriesResultPredominantCategoryInfos],
    propertyIsEnumerable: PropertyKey => Boolean
  ): PredominantCategoriesResult = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), predominantCategoryInfos = predominantCategoryInfos.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[PredominantCategoriesResult]
  }
}

