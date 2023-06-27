package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.ascending
import typings.arcgisJsApi.arcgisJsApiStrings.descending
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderedLayerOrderBy extends StObject {
  
  /**
  		 * The number or date field whose values will be used to sort features.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-OrderedLayer.html#orderBy)
  		 */
  var field: js.UndefOr[String] = js.undefined
  
  /**
  		 * The sort order.
  		 *
  		 * @default ascending
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-OrderedLayer.html#orderBy)
  		 */
  var order: js.UndefOr[ascending | descending] = js.undefined
  
  /**
  		 * An [Arcade](https://developers.arcgis.com/javascript/latest/arcade/) expression following the specification defined by the [Arcade Feature Z Profile](https://developers.arcgis.com/javascript/latest/arcade/#feature-sorting).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-OrderedLayer.html#orderBy)
  		 */
  var valueExpression: js.UndefOr[String] = js.undefined
}
object OrderedLayerOrderBy {
  
  inline def apply(): OrderedLayerOrderBy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderedLayerOrderBy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrderedLayerOrderBy] (val x: Self) extends AnyVal {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setOrder(value: ascending | descending): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setValueExpression(value: String): Self = StObject.set(x, "valueExpression", value.asInstanceOf[js.Any])
    
    inline def setValueExpressionUndefined: Self = StObject.set(x, "valueExpression", js.undefined)
  }
}
