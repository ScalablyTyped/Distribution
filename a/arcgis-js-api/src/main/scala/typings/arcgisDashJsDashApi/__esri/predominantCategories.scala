package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait predominantCategories extends js.Object {
  /**
    * Determines predominant categories for a layer based on a given set of competing numeric fields and returns the number of features belonging to each category.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-predominantCategories.html#predominantCategories)
    *
    * @param params See the table below for details of each parameter.
    * @param params.layer The layer from which to generate predominant categories for the given set of `fields`.
    * @param params.fields An array of numeric fields from which to determine predominant categories. The fields must all be number fields and they must be competing or complementary (e.g. population totals by language spoken at home, or harvested acres by crop type, or the results of an election by candidate or party).
    * @param params.view The view in which features will be rendered.
    *
    */
  def predominantCategories(params: predominantCategoriesPredominantCategoriesParams): IPromise[PredominantCategoriesResult]
}

@JSGlobal("__esri.predominantCategories")
@js.native
object predominantCategories extends TopLevel[predominantCategories]

