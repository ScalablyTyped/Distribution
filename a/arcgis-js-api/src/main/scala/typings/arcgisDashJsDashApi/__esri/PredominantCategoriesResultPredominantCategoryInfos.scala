package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PredominantCategoriesResultPredominantCategoryInfos extends Object {
  /**
    * The number of features belonging to the predominant category.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-predominantCategories.html#PredominantCategoriesResult)
    */
  var count: Double
  /**
    * The label describing the predominant category, or field name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-predominantCategories.html#PredominantCategoriesResult)
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * The value or category referenced in a predominance visualization. This is typically a field name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-predominantCategories.html#PredominantCategoriesResult)
    */
  var value: String | Double
}

object PredominantCategoriesResultPredominantCategoryInfos {
  @scala.inline
  def apply(
    constructor: js.Function,
    count: Double,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    value: String | Double,
    label: String = null
  ): PredominantCategoriesResultPredominantCategoryInfos = {
    val __obj = js.Dynamic.literal(constructor = constructor, count = count, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), value = value.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[PredominantCategoriesResultPredominantCategoryInfos]
  }
}

