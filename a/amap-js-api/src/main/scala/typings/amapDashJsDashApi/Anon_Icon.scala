package typings.amapDashJsDashApi

import typings.amapDashJsDashApi.AMapNs.LabelMarkerNs.IconOptions
import typings.amapDashJsDashApi.AMapNs.LabelMarkerNs.TextOptions
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
    val __obj = js.Dynamic.literal(icon = icon, opacity = opacity, text = text, zIndex = zIndex)
  
    __obj.asInstanceOf[Anon_Icon]
  }
}

