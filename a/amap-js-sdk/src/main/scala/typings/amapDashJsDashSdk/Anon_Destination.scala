package typings.amapDashJsDashSdk

import typings.amapDashJsDashSdk.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Destination extends js.Object {
  var destination: js.UndefOr[LngLat] = js.undefined
  var destinationName: js.UndefOr[String] = js.undefined
  var origin: js.UndefOr[LngLat] = js.undefined
  var originName: js.UndefOr[String] = js.undefined
}

object Anon_Destination {
  @scala.inline
  def apply(
    destination: LngLat = null,
    destinationName: String = null,
    origin: LngLat = null,
    originName: String = null
  ): Anon_Destination = {
    val __obj = js.Dynamic.literal()
    if (destination != null) __obj.updateDynamic("destination")(destination)
    if (destinationName != null) __obj.updateDynamic("destinationName")(destinationName)
    if (origin != null) __obj.updateDynamic("origin")(origin)
    if (originName != null) __obj.updateDynamic("originName")(originName)
    __obj.asInstanceOf[Anon_Destination]
  }
}

