package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwipeVisibleElements extends Object {
  /**
    * Indicates whether the divider between the leading and trailing layers is visible. Default value is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe.html#visibleElements)
    */
  var divider: Boolean
  /**
    * Indicates whether the handle from which you drag the widget is visible. Default value is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe.html#visibleElements)
    */
  var handle: Boolean
}

object SwipeVisibleElements {
  @scala.inline
  def apply(
    constructor: js.Function,
    divider: Boolean,
    handle: Boolean,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SwipeVisibleElements = {
    val __obj = js.Dynamic.literal(constructor = constructor, divider = divider, handle = handle, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[SwipeVisibleElements]
  }
}

