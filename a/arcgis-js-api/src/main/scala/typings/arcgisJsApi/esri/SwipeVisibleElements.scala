package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwipeVisibleElements
  extends StObject
     with Object {
  
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
  
  inline def apply(
    constructor: js.Function,
    divider: Boolean,
    handle: Boolean,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SwipeVisibleElements = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], divider = divider.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[SwipeVisibleElements]
  }
  
  extension [Self <: SwipeVisibleElements](x: Self) {
    
    inline def setDivider(value: Boolean): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
    
    inline def setHandle(value: Boolean): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
  }
}
