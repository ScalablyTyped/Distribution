package typings.awsDashSdk.clientsAcmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCertificatesRequest extends js.Object {
  /**
    * Filter the certificate list by status value.
    */
  var CertificateStatuses: js.UndefOr[typings.awsDashSdk.clientsAcmMod.CertificateStatuses] = js.native
  /**
    * Filter the certificate list. For more information, see the Filters structure.
    */
  var Includes: js.UndefOr[Filters] = js.native
  /**
    * Use this parameter when paginating results to specify the maximum number of items to return in the response. If additional items exist beyond the number you specify, the NextToken element is sent in the response. Use this NextToken value in a subsequent request to retrieve additional items.
    */
  var MaxItems: js.UndefOr[typings.awsDashSdk.clientsAcmMod.MaxItems] = js.native
  /**
    * Use this parameter only when paginating results and only in a subsequent request after you receive a response with truncated results. Set it to the value of NextToken from the response you just received.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsAcmMod.NextToken] = js.native
}

object ListCertificatesRequest {
  @scala.inline
  def apply(
    CertificateStatuses: CertificateStatuses = null,
    Includes: Filters = null,
    MaxItems: Int | Double = null,
    NextToken: NextToken = null
  ): ListCertificatesRequest = {
    val __obj = js.Dynamic.literal()
    if (CertificateStatuses != null) __obj.updateDynamic("CertificateStatuses")(CertificateStatuses.asInstanceOf[js.Any])
    if (Includes != null) __obj.updateDynamic("Includes")(Includes.asInstanceOf[js.Any])
    if (MaxItems != null) __obj.updateDynamic("MaxItems")(MaxItems.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCertificatesRequest]
  }
}

