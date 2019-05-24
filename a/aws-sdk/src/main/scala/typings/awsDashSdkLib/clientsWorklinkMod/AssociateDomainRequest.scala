package typings
package awsDashSdkLib.clientsWorklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociateDomainRequest extends js.Object {
  /**
    * The ARN of an issued ACM certificate that is valid for the domain being associated.
    */
  var AcmCertificateArn: awsDashSdkLib.clientsWorklinkMod.AcmCertificateArn
  /**
    * The name to display.
    */
  var DisplayName: js.UndefOr[DisplayName] = js.undefined
  /**
    * The fully qualified domain name (FQDN).
    */
  var DomainName: awsDashSdkLib.clientsWorklinkMod.DomainName
  /**
    * The Amazon Resource Name (ARN) of the fleet.
    */
  var FleetArn: awsDashSdkLib.clientsWorklinkMod.FleetArn
}

object AssociateDomainRequest {
  @scala.inline
  def apply(
    AcmCertificateArn: AcmCertificateArn,
    DomainName: DomainName,
    FleetArn: FleetArn,
    DisplayName: DisplayName = null
  ): AssociateDomainRequest = {
    val __obj = js.Dynamic.literal(AcmCertificateArn = AcmCertificateArn, DomainName = DomainName, FleetArn = FleetArn)
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName)
    __obj.asInstanceOf[AssociateDomainRequest]
  }
}

