package typings.amapDashJsDashApi

import typings.amapDashJsDashApi.AMap.LabelMarker.IconOptions
import typings.amapDashJsDashApi.AMap.LabelMarker.TextOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Icon extends js.Object {
  var icon: IconOptions
  var opacity: Double
  var text: TextOptions
  var zIndex: Double
}

object Anon_Icon {
  @scala.inline
  def apply(icon: IconOptions, opacity: Double, text: TextOptions, zIndex: Double): Anon_Icon = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Icon]
  }
}

