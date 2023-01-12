package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderedLayerProperties extends StObject {
  
  /**
    * Determines the order in which features are drawn in the view.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-OrderedLayer.html#orderBy)
    */
  var orderBy: js.UndefOr[js.Array[OrderedLayerOrderBy]] = js.undefined
}
object OrderedLayerProperties {
  
  inline def apply(): OrderedLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderedLayerProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrderedLayerProperties] (val x: Self) extends AnyVal {
    
    inline def setOrderBy(value: js.Array[OrderedLayerOrderBy]): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    inline def setOrderByVarargs(value: OrderedLayerOrderBy*): Self = StObject.set(x, "orderBy", js.Array(value*))
  }
}
