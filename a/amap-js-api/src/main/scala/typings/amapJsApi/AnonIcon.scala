package typings.amapJsApi

import typings.amapJsApi.AMap.LabelMarker.IconOptions
import typings.amapJsApi.AMap.LabelMarker.TextOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIcon extends js.Object {
  var icon: IconOptions
  var opacity: Double
  var text: TextOptions
  var zIndex: Double
}

object AnonIcon {
  @scala.inline
  def apply(icon: IconOptions, opacity: Double, text: TextOptions, zIndex: Double): AnonIcon = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIcon]
  }
}

