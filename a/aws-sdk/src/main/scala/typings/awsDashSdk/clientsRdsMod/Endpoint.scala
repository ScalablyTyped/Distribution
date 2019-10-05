package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Endpoint extends js.Object {
  /**
    * Specifies the DNS address of the DB instance.
    */
  var Address: js.UndefOr[String] = js.undefined
  /**
    * Specifies the ID that Amazon Route 53 assigns when you create a hosted zone.
    */
  var HostedZoneId: js.UndefOr[String] = js.undefined
  /**
    * Specifies the port that the database engine is listening on.
    */
  var Port: js.UndefOr[Integer] = js.undefined
}

object Endpoint {
  @scala.inline
  def apply(Address: String = null, HostedZoneId: String = null, Port: Int | scala.Double = null): Endpoint = {
    val __obj = js.Dynamic.literal()
    if (Address != null) __obj.updateDynamic("Address")(Address)
    if (HostedZoneId != null) __obj.updateDynamic("HostedZoneId")(HostedZoneId)
    if (Port != null) __obj.updateDynamic("Port")(Port.asInstanceOf[js.Any])
    __obj.asInstanceOf[Endpoint]
  }
}

