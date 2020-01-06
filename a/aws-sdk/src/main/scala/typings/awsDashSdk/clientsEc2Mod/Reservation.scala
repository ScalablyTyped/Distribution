package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reservation extends js.Object {
  /**
    * [EC2-Classic only] The security groups.
    */
  var Groups: js.UndefOr[GroupIdentifierList] = js.native
  /**
    * The instances.
    */
  var Instances: js.UndefOr[InstanceList] = js.native
  /**
    * The ID of the AWS account that owns the reservation.
    */
  var OwnerId: js.UndefOr[String] = js.native
  /**
    * The ID of the requester that launched the instances on your behalf (for example, AWS Management Console or Auto Scaling).
    */
  var RequesterId: js.UndefOr[String] = js.native
  /**
    * The ID of the reservation.
    */
  var ReservationId: js.UndefOr[String] = js.native
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
    if (Groups != null) __obj.updateDynamic("Groups")(Groups.asInstanceOf[js.Any])
    if (Instances != null) __obj.updateDynamic("Instances")(Instances.asInstanceOf[js.Any])
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId.asInstanceOf[js.Any])
    if (RequesterId != null) __obj.updateDynamic("RequesterId")(RequesterId.asInstanceOf[js.Any])
    if (ReservationId != null) __obj.updateDynamic("ReservationId")(ReservationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reservation]
  }
}

