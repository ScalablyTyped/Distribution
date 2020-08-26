package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebMapSaveOptions extends Object {
  /**
    * When `true`, the webmap will save even if it contains unsupported content (layers, renderers, symbols). Any content that is not supported will not be saved and the webmap may appear different when reloaded from its portal item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#save)
    */
  var ignoreUnsupported: js.UndefOr[Boolean] = js.native
}

object WebMapSaveOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): WebMapSaveOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[WebMapSaveOptions]
  }
  @scala.inline
  implicit class WebMapSaveOptionsOps[Self <: WebMapSaveOptions] (val x: Self) extends AnyVal {
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
    def setIgnoreUnsupported(value: Boolean): Self = this.set("ignoreUnsupported", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreUnsupported: Self = this.set("ignoreUnsupported", js.undefined)
  }
  
}

