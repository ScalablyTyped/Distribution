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
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    name: java.lang.String,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean]
  ): SearchViewModelSelectResultEventResult = {
    val __obj = js.Dynamic.literal(constructor = constructor, extent = extent, feature = feature, hasOwnProperty = hasOwnProperty, name = name, propertyIsEnumerable = propertyIsEnumerable)
  
    __obj.asInstanceOf[SearchViewModelSelectResultEventResult]
  }
}

