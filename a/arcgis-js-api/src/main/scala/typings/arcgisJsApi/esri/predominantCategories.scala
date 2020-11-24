package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Function for generating category statistics for a [predominance](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html) renderer.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-predominantCategories.html)
  */
@js.native
trait predominantCategories extends js.Object {
  
  /**
    * Determines predominant categories for a layer based on a given set of competing numeric fields and returns the number of features belonging to each category.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-predominantCategories.html#predominantCategories)
    */
  def predominantCategories(params: predominantCategoriesPredominantCategoriesParams): js.Promise[PredominantCategoriesResult] = js.native
}
object predominantCategories {
  
  @scala.inline
  def apply(
    predominantCategories: predominantCategoriesPredominantCategoriesParams => js.Promise[PredominantCategoriesResult]
  ): predominantCategories = {
    val __obj = js.Dynamic.literal(predominantCategories = js.Any.fromFunction1(predominantCategories))
    __obj.asInstanceOf[predominantCategories]
  }
  
  @scala.inline
  implicit class predominantCategoriesOps[Self <: predominantCategories] (val x: Self) extends AnyVal {
    
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
    def setPredominantCategories(value: predominantCategoriesPredominantCategoriesParams => js.Promise[PredominantCategoriesResult]): Self = this.set("predominantCategories", js.Any.fromFunction1(value))
  }
}
