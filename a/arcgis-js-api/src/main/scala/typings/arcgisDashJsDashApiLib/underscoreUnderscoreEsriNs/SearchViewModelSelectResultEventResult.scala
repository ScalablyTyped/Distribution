package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchViewModelSelectResultEventResult
  extends stdLib.Object {
  var extent: Extent
  var feature: Graphic
  var name: java.lang.String
}

object SearchViewModelSelectResultEventResult {
  @scala.inline
  def apply(
    constructor: js.Function,
    extent: Extent,
    feature: Graphic,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    name: java.lang.String,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean
  ): SearchViewModelSelectResultEventResult = {
    val __obj = js.Dynamic.literal(constructor = constructor, extent = extent, feature = feature, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), name = name, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[SearchViewModelSelectResultEventResult]
  }
}

