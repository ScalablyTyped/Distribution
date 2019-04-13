package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reservation extends js.Object {
  /**
    * [EC2-Classic only] One or more security groups.
    */
  var Groups: js.UndefOr[GroupIdentifierList] = js.undefined
  /**
    * One or more instances.
    */
  var Instances: js.UndefOr[InstanceList] = js.undefined
  /**
    * The ID of the AWS account that owns the reservation.
    */
  var OwnerId: js.UndefOr[String] = js.undefined
  /**
    * The ID of the requester that launched the instances on your behalf (for example, AWS Management Console or Auto Scaling).
    */
  var RequesterId: js.UndefOr[String] = js.undefined
  /**
    * The ID of the reservation.
    */
  var ReservationId: js.UndefOr[String] = js.undefined
}

object Reservation {
  @scala.inline
  def apply(
    Groups: GroupIdentifierList = null,
    Instances: InstanceList = null,
    OwnerId: String = null,
    RequesterId: String = null,
    ReservationId: String = null
  ): Reservation = {
    val __obj = js.Dynamic.literal()
    if (Groups != null) __obj.updateDynamic("Groups")(Groups)
    if (Instances != null) __obj.updateDynamic("Instances")(Instances)
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId)
    if (RequesterId != null) __obj.updateDynamic("RequesterId")(RequesterId)
    if (ReservationId != null) __obj.updateDynamic("ReservationId")(ReservationId)
    __obj.asInstanceOf[Reservation]
  }
}

