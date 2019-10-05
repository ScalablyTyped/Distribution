package typings.amapDashJsDashApiDashDriving

import typings.amapDashJsDashApi.AMap.LocationValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Destination extends js.Object {
  var destination: LocationValue
  var destinationName: js.UndefOr[String] = js.undefined
  var origin: LocationValue
  var originName: js.UndefOr[String] = js.undefined
}

object Anon_Destination {
  @scala.inline
  def apply(
    destination: LocationValue,
    origin: LocationValue,
    destinationName: String = null,
    originName: String = null
  ): Anon_Destination = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    if (destinationName != null) __obj.updateDynamic("destinationName")(destinationName)
    if (originName != null) __obj.updateDynamic("originName")(originName)
    __obj.asInstanceOf[Anon_Destination]
  }
}

