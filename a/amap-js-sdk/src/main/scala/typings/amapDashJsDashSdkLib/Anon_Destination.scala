package typings
package amapDashJsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Destination extends js.Object {
  var destination: js.UndefOr[amapDashJsDashSdkLib.AMapNs.LngLat] = js.undefined
  var destinationName: js.UndefOr[java.lang.String] = js.undefined
  var origin: js.UndefOr[amapDashJsDashSdkLib.AMapNs.LngLat] = js.undefined
  var originName: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Destination {
  @scala.inline
  def apply(
    destination: amapDashJsDashSdkLib.AMapNs.LngLat = null,
    destinationName: java.lang.String = null,
    origin: amapDashJsDashSdkLib.AMapNs.LngLat = null,
    originName: java.lang.String = null
  ): Anon_Destination = {
    val __obj = js.Dynamic.literal()
    if (destination != null) __obj.updateDynamic("destination")(destination)
    if (destinationName != null) __obj.updateDynamic("destinationName")(destinationName)
    if (origin != null) __obj.updateDynamic("origin")(origin)
    if (originName != null) __obj.updateDynamic("originName")(originName)
    __obj.asInstanceOf[Anon_Destination]
  }
}

