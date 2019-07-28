package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebSceneSaveAsOptions extends Object {
  /**
    * the folder in which to save the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#saveAs)
    */
  var folder: js.UndefOr[PortalFolder] = js.undefined
  /**
    * allow the scene to be saved even in the case it contains unsupported content (layers, renderers, symbols). Any content that is not supported will not be saved and the scene may appear different when reloaded from its portal item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#saveAs)
    */
  var ignoreUnsupported: js.UndefOr[Boolean] = js.undefined
}

object WebSceneSaveAsOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    folder: PortalFolder = null,
    ignoreUnsupported: js.UndefOr[Boolean] = js.undefined
  ): WebSceneSaveAsOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (folder != null) __obj.updateDynamic("folder")(folder)
    if (!js.isUndefined(ignoreUnsupported)) __obj.updateDynamic("ignoreUnsupported")(ignoreUnsupported)
    __obj.asInstanceOf[WebSceneSaveAsOptions]
  }
}

