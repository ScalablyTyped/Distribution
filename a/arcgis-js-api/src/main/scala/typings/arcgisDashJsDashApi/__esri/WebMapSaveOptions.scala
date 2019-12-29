package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebMapSaveOptions extends Object {
  /**
    * When `true`, the webmap will save even if it contains unsupported content (layers, renderers, symbols). Any content that is not supported will not be saved and the webmap may appear different when reloaded from its portal item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#save)
    */
  var ignoreUnsupported: js.UndefOr[Boolean] = js.undefined
}

object WebMapSaveOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    ignoreUnsupported: js.UndefOr[Boolean] = js.undefined
  ): WebMapSaveOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (!js.isUndefined(ignoreUnsupported)) __obj.updateDynamic("ignoreUnsupported")(ignoreUnsupported.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebMapSaveOptions]
  }
}

