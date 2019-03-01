package typings
package angularDashBootstrapDashLightboxLib.angularNs.bootstrapNs.lightboxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILightboxImageInfo extends js.Object {
  var caption: js.UndefOr[java.lang.String] = js.undefined
  var height: scala.Double
  var thumbUrl: js.UndefOr[java.lang.String] = js.undefined
  var url: java.lang.String
  var width: scala.Double
}

object ILightboxImageInfo {
  @scala.inline
  def apply(
    height: scala.Double,
    url: java.lang.String,
    width: scala.Double,
    caption: java.lang.String = null,
    thumbUrl: java.lang.String = null
  ): ILightboxImageInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("url")(url)
    __obj.updateDynamic("width")(width)
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (thumbUrl != null) __obj.updateDynamic("thumbUrl")(thumbUrl)
    __obj.asInstanceOf[ILightboxImageInfo]
  }
}

