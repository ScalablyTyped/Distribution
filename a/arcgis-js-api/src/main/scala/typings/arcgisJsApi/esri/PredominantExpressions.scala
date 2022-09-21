package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PredominantExpressions
  extends StObject
     with Object {
  
  /**
    * The Arcade and SQL expressions used to query the server or client-side layer for statistics of the percentage among all competing fields comprised by the predominant category.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-support-predominanceUtils.html#PredominantExpressions)
    */
  var opacity: OpacityExpressionInfo
  
  /**
    * The Arcade expression used to get the predominant category among a set of fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-support-predominanceUtils.html#PredominantExpressions)
    */
  var predominantCategory: PredominantExpressionsPredominantCategory
  
  /**
    * The Arcade and SQL expressions used to query the server or client-side layer for statistics of the sum of all competing fields considered for the predominance visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-support-predominanceUtils.html#PredominantExpressions)
    */
  var size: SizeExpressionInfo
}
object PredominantExpressions {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    opacity: OpacityExpressionInfo,
    predominantCategory: PredominantExpressionsPredominantCategory,
    propertyIsEnumerable: PropertyKey => Boolean,
    size: SizeExpressionInfo
  ): PredominantExpressions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), opacity = opacity.asInstanceOf[js.Any], predominantCategory = predominantCategory.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredominantExpressions]
  }
  
  extension [Self <: PredominantExpressions](x: Self) {
    
    inline def setOpacity(value: OpacityExpressionInfo): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setPredominantCategory(value: PredominantExpressionsPredominantCategory): Self = StObject.set(x, "predominantCategory", value.asInstanceOf[js.Any])
    
    inline def setSize(value: SizeExpressionInfo): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
