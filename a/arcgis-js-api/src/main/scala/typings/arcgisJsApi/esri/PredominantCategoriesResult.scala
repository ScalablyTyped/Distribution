package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PredominantCategoriesResult extends StObject {
  
  /**
  		 * An array of objects describing the count of each predominant category.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-predominantCategories.html#PredominantCategoriesResult)
  		 */
  var predominantCategoryInfos: js.Array[PredominantCategoriesResultPredominantCategoryInfos]
}
object PredominantCategoriesResult {
  
  inline def apply(predominantCategoryInfos: js.Array[PredominantCategoriesResultPredominantCategoryInfos]): PredominantCategoriesResult = {
    val __obj = js.Dynamic.literal(predominantCategoryInfos = predominantCategoryInfos.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredominantCategoriesResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PredominantCategoriesResult] (val x: Self) extends AnyVal {
    
    inline def setPredominantCategoryInfos(value: js.Array[PredominantCategoriesResultPredominantCategoryInfos]): Self = StObject.set(x, "predominantCategoryInfos", value.asInstanceOf[js.Any])
    
    inline def setPredominantCategoryInfosVarargs(value: PredominantCategoriesResultPredominantCategoryInfos*): Self = StObject.set(x, "predominantCategoryInfos", js.Array(value*))
  }
}
