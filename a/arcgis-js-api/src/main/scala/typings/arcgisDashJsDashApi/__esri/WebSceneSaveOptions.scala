package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebSceneSaveOptions extends Object {
  /**
    * When `true`, the scene will save even if it contains unsupported content (layers, renderers, symbols). Any content that is not supported will not be saved and the scene may appear different when reloaded from its portal item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#save)
    */
  var ignoreUnsupported: js.UndefOr[Boolean] = js.undefined
}

object WebSceneSaveOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    ignoreUnsupported: js.UndefOr[Boolean] = js.undefined
  ): WebSceneSaveOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (!js.isUndefined(ignoreUnsupported)) __obj.updateDynamic("ignoreUnsupported")(ignoreUnsupported.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebSceneSaveOptions]
  }
}

