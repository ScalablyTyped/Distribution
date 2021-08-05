package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PredominantCategoriesResult
  extends StObject
     with Object {
  
  /**
    * An array of objects describing the count of each predominant category.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-predominantCategories.html#PredominantCategoriesResult)
    */
  var predominantCategoryInfos: js.Array[PredominantCategoriesResultPredominantCategoryInfos]
}
object PredominantCategoriesResult {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    predominantCategoryInfos: js.Array[PredominantCategoriesResultPredominantCategoryInfos],
    propertyIsEnumerable: PropertyKey => Boolean
  ): PredominantCategoriesResult = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), predominantCategoryInfos = predominantCategoryInfos.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[PredominantCategoriesResult]
  }
  
  extension [Self <: PredominantCategoriesResult](x: Self) {
    
    inline def setPredominantCategoryInfos(value: js.Array[PredominantCategoriesResultPredominantCategoryInfos]): Self = StObject.set(x, "predominantCategoryInfos", value.asInstanceOf[js.Any])
    
    inline def setPredominantCategoryInfosVarargs(value: PredominantCategoriesResultPredominantCategoryInfos*): Self = StObject.set(x, "predominantCategoryInfos", js.Array(value :_*))
  }
}
