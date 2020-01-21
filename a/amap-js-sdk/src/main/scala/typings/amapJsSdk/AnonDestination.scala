package typings.amapJsSdk

import typings.amapJsSdk.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDestination extends js.Object {
  var destination: js.UndefOr[LngLat] = js.undefined
  var destinationName: js.UndefOr[String] = js.undefined
  var origin: js.UndefOr[LngLat] = js.undefined
  var originName: js.UndefOr[String] = js.undefined
}

object AnonDestination {
  @scala.inline
  def apply(
    destination: LngLat = null,
    destinationName: String = null,
    origin: LngLat = null,
    originName: String = null
  ): AnonDestination = {
    val __obj = js.Dynamic.literal()
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (destinationName != null) __obj.updateDynamic("destinationName")(destinationName.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (originName != null) __obj.updateDynamic("originName")(originName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDestination]
  }
}

