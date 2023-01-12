package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TraceItem extends StObject {
  
  /**
    * Returns `true` if there is a selection on the view for a trace.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#TraceItem)
    */
  var selected: Boolean
}
object TraceItem {
  
  inline def apply(selected: Boolean): TraceItem = {
    val __obj = js.Dynamic.literal(selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[TraceItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TraceItem] (val x: Self) extends AnyVal {
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
  }
}
