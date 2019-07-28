package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DestinationInfo extends js.Object {
  /**
    * The ID of the resource created at the destination.
    */
  var id: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The destination service of the record.
    */
  var service: js.UndefOr[NonEmptyString] = js.undefined
}

object DestinationInfo {
  @scala.inline
  def apply(id: NonEmptyString = null, service: NonEmptyString = null): DestinationInfo = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (service != null) __obj.updateDynamic("service")(service)
    __obj.asInstanceOf[DestinationInfo]
  }
}

