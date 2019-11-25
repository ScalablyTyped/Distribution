package typings.angularDashBootstrapDashLightbox.angular.bootstrap.lightbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILightboxImageInfo extends js.Object {
  var caption: js.UndefOr[String] = js.undefined
  var height: Double
  var thumbUrl: js.UndefOr[String] = js.undefined
  var url: String
  var width: Double
}

object ILightboxImageInfo {
  @scala.inline
  def apply(height: Double, url: String, width: Double, caption: String = null, thumbUrl: String = null): ILightboxImageInfo = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (thumbUrl != null) __obj.updateDynamic("thumbUrl")(thumbUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILightboxImageInfo]
  }
}

