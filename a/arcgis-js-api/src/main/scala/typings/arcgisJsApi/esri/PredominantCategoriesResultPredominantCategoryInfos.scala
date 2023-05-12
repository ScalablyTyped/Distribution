package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PredominantCategoriesResultPredominantCategoryInfos extends StObject {
  
  /**
    * The number of features belonging to the predominant category.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-predominantCategories.html#PredominantCategoriesResult)
    */
  var count: Double
  
  /**
    * The label describing the predominant category, or field name.
    *
    * [Read more...](global.html)
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * The value or category referenced in a predominance visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-predominantCategories.html#PredominantCategoriesResult)
    */
  var value: String | Double
}
object PredominantCategoriesResultPredominantCategoryInfos {
  
  inline def apply(count: Double, value: String | Double): PredominantCategoriesResultPredominantCategoryInfos = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredominantCategoriesResultPredominantCategoryInfos]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PredominantCategoriesResultPredominantCategoryInfos] (val x: Self) extends AnyVal {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
