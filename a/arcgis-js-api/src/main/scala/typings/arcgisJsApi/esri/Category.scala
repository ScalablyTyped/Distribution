package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Category extends StObject {
  
  /**
  		 * The Id of the category of the place.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PlaceResult.html#Category)
  		 */
  var categoryId: Double
  
  /**
  		 * The name of the the category.
  		 *
  		 * [Read more...](global.html)
  		 */
  var label: String
}
object Category {
  
  inline def apply(categoryId: Double, label: String): Category = {
    val __obj = js.Dynamic.literal(categoryId = categoryId.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Category]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Category] (val x: Self) extends AnyVal {
    
    inline def setCategoryId(value: Double): Self = StObject.set(x, "categoryId", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
