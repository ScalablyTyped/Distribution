package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchSelectResultEventResult extends Object {
  var extent: Extent
  var feature: Graphic
  var name: String
}

object SearchSelectResultEventResult {
  @scala.inline
  def apply(
    constructor: js.Function,
    extent: Extent,
    feature: Graphic,
    hasOwnProperty: PropertyKey => Boolean,
    name: String,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SearchSelectResultEventResult = {
    val __obj = js.Dynamic.literal(constructor = constructor, extent = extent, feature = feature, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), name = name, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[SearchSelectResultEventResult]
  }
}

