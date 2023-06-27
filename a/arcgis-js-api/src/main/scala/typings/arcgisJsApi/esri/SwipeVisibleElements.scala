package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwipeVisibleElements extends StObject {
  
  /**
  		 * Indicates whether the divider between the leading and trailing layers is visible.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe.html#VisibleElements)
  		 */
  var divider: Boolean
  
  /**
  		 * Indicates whether the handle from which you drag the widget is visible.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe.html#VisibleElements)
  		 */
  var handle: Boolean
}
object SwipeVisibleElements {
  
  inline def apply(divider: Boolean, handle: Boolean): SwipeVisibleElements = {
    val __obj = js.Dynamic.literal(divider = divider.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwipeVisibleElements]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SwipeVisibleElements] (val x: Self) extends AnyVal {
    
    inline def setDivider(value: Boolean): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
    
    inline def setHandle(value: Boolean): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
  }
}
