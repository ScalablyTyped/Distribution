package typings.arcgisJsApi.esri

import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait widgetsSwipeVisibleElements
  extends StObject
     with SwipeVisibleElements
object widgetsSwipeVisibleElements {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    divider: Boolean,
    handle: Boolean,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): widgetsSwipeVisibleElements = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], divider = divider.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[widgetsSwipeVisibleElements]
  }
}
