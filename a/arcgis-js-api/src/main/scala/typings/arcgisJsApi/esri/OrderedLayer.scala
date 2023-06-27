package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderedLayer extends StObject {
  
  /**
  		 * Determines the order in which features are drawn in the view.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-OrderedLayer.html#orderBy)
  		 */
  var orderBy: js.Array[OrderedLayerOrderBy]
}
object OrderedLayer {
  
  inline def apply(orderBy: js.Array[OrderedLayerOrderBy]): OrderedLayer = {
    val __obj = js.Dynamic.literal(orderBy = orderBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderedLayer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrderedLayer] (val x: Self) extends AnyVal {
    
    inline def setOrderBy(value: js.Array[OrderedLayerOrderBy]): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByVarargs(value: OrderedLayerOrderBy*): Self = StObject.set(x, "orderBy", js.Array(value*))
  }
}
