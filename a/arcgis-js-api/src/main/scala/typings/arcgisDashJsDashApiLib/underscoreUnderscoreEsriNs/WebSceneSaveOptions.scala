package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebSceneSaveOptions
  extends stdLib.Object {
  /**
    * When `true`, the scene will save even if it contains unsupported content (layers, renderers, symbols). Any content that is not supported will not be saved and the scene may appear different when reloaded from its portal item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#save)
    */
  var ignoreUnsupported: js.UndefOr[scala.Boolean] = js.undefined
}

object WebSceneSaveOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    ignoreUnsupported: js.UndefOr[scala.Boolean] = js.undefined
  ): WebSceneSaveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    if (!js.isUndefined(ignoreUnsupported)) __obj.updateDynamic("ignoreUnsupported")(ignoreUnsupported)
    __obj.asInstanceOf[WebSceneSaveOptions]
  }
}

