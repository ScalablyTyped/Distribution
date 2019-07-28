package typings.awsDashSdk.clientsWorklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociateWebsiteCertificateAuthorityRequest extends js.Object {
  /**
    * The root certificate of the CA.
    */
  var Certificate: typings.awsDashSdk.clientsWorklinkMod.Certificate
  /**
    * The certificate name to display.
    */
  var DisplayName: js.UndefOr[typings.awsDashSdk.clientsWorklinkMod.DisplayName] = js.undefined
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typings.awsDashSdk.clientsWorklinkMod.FleetArn
}

object AssociateWebsiteCertificateAuthorityRequest {
  @scala.inline
  def apply(Certificate: Certificate, FleetArn: FleetArn, DisplayName: DisplayName = null): AssociateWebsiteCertificateAuthorityRequest = {
    val __obj = js.Dynamic.literal(Certificate = Certificate, FleetArn = FleetArn)
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName)
    __obj.asInstanceOf[AssociateWebsiteCertificateAuthorityRequest]
  }
}

