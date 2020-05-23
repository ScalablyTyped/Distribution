package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebMapSaveAsOptions extends Object {
  /**
    * The folder in which to save the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#saveAs)
    */
  var folder: js.UndefOr[PortalFolder] = js.undefined
  /**
    * Allow the webmap to be saved even in the case it contains unsupported content (layers, renderers, symbols). Any content that is not supported will not be saved and the webmap may appear different when reloaded from its portal item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#saveAs)
    */
  var ignoreUnsupported: js.UndefOr[Boolean] = js.undefined
}

object WebMapSaveAsOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    folder: PortalFolder = null,
    ignoreUnsupported: js.UndefOr[Boolean] = js.undefined
  ): WebMapSaveAsOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (folder != null) __obj.updateDynamic("folder")(folder.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreUnsupported)) __obj.updateDynamic("ignoreUnsupported")(ignoreUnsupported.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebMapSaveAsOptions]
  }
}

