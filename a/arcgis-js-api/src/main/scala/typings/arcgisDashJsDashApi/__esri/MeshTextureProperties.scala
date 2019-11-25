package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.clamp
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.repeat
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.ImageData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeshTextureProperties extends js.Object {
  /**
    * A direct reference to the image data. The image data can be an [image element](https://developer.mozilla.org/en-US/docs/Web/API/HTMLImageElement), [canvas element](https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement) or [ImageData](https://developer.mozilla.org/en-US/docs/Web/API/ImageData).  The data property is mutually exclusive with the url property, setting the data will clear the url (if there is one).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshTexture.html#data)
    */
  var data: js.UndefOr[HTMLImageElement | HTMLCanvasElement | ImageData] = js.undefined
  /**
    * Indicates whether the image data should be interpreted as being semi-transparent. The default value is automatically derived when the data property contains a canvas element or an ImageData object. If instead a url to a .png file was provided, it is assumed that transparency is present. In all other cases it defaults to `false`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshTexture.html#transparent)
    *
    * @default undefined
    */
  var transparent: js.UndefOr[Boolean] = js.undefined
  /**
    * The url to the image resource. This can either be a remote url (absolute or relative) or a data url.  The url property is mutually exclusive with the data property, setting the url will clear the data (if there is one).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshTexture.html#url)
    */
  var url: js.UndefOr[String] = js.undefined
  /**
    * Specifies how uv coordinates outside the [0, 1] range are handled. One of "repeat", "clamp" or "mirror". Can also be specified separately for the two texture axes using an object:
    * ```js
    * {
    *   vertical: "clamp",
    *   horizontal: "repeat"
    * }
    * ```
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshTexture.html#wrap)
    *
    * @default "repeat"
    */
  var wrap: js.UndefOr[clamp | repeat | SeparableWrapModes] = js.undefined
}

object MeshTextureProperties {
  @scala.inline
  def apply(
    data: HTMLImageElement | HTMLCanvasElement | ImageData = null,
    transparent: js.UndefOr[Boolean] = js.undefined,
    url: String = null,
    wrap: clamp | repeat | SeparableWrapModes = null
  ): MeshTextureProperties = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (wrap != null) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeshTextureProperties]
  }
}

