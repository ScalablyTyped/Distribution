package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebMapSaveAsOptions extends Object {
  /**
    * The folder in which to save the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#saveAs)
    */
  var folder: js.UndefOr[PortalFolder] = js.native
  /**
    * Allow the webmap to be saved even in the case it contains unsupported content (layers, renderers, symbols). Any content that is not supported will not be saved and the webmap may appear different when reloaded from its portal item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#saveAs)
    */
  var ignoreUnsupported: js.UndefOr[Boolean] = js.native
}

object WebMapSaveAsOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): WebMapSaveAsOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[WebMapSaveAsOptions]
  }
  @scala.inline
  implicit class WebMapSaveAsOptionsOps[Self <: WebMapSaveAsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFolder(value: PortalFolder): Self = this.set("folder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFolder: Self = this.set("folder", js.undefined)
    @scala.inline
    def setIgnoreUnsupported(value: Boolean): Self = this.set("ignoreUnsupported", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreUnsupported: Self = this.set("ignoreUnsupported", js.undefined)
  }
  
}

