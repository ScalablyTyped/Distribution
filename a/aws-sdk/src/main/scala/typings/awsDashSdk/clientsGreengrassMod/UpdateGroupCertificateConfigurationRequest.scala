package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateGroupCertificateConfigurationRequest extends js.Object {
  /**
    * The amount of time remaining before the certificate expires, in milliseconds.
    */
  var CertificateExpiryInMilliseconds: js.UndefOr[__string] = js.undefined
  /**
    * The ID of the Greengrass group.
    */
  var GroupId: __string
}

object UpdateGroupCertificateConfigurationRequest {
  @scala.inline
  def apply(GroupId: __string, CertificateExpiryInMilliseconds: __string = null): UpdateGroupCertificateConfigurationRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId)
    if (CertificateExpiryInMilliseconds != null) __obj.updateDynamic("CertificateExpiryInMilliseconds")(CertificateExpiryInMilliseconds)
    __obj.asInstanceOf[UpdateGroupCertificateConfigurationRequest]
  }
}

