package typings
package awsDashSdkLib.clientsAcmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListCertificatesRequest extends js.Object {
  /**
    * Filter the certificate list by status value.
    */
  var CertificateStatuses: js.UndefOr[CertificateStatuses] = js.undefined
  /**
    * Filter the certificate list. For more information, see the Filters structure.
    */
  var Includes: js.UndefOr[Filters] = js.undefined
  /**
    * Use this parameter when paginating results to specify the maximum number of items to return in the response. If additional items exist beyond the number you specify, the NextToken element is sent in the response. Use this NextToken value in a subsequent request to retrieve additional items.
    */
  var MaxItems: js.UndefOr[MaxItems] = js.undefined
  /**
    * Use this parameter only when paginating results and only in a subsequent request after you receive a response with truncated results. Set it to the value of NextToken from the response you just received.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object ListCertificatesRequest {
  @scala.inline
  def apply(
    CertificateStatuses: CertificateStatuses = null,
    Includes: Filters = null,
    MaxItems: js.UndefOr[MaxItems] = js.undefined,
    NextToken: NextToken = null
  ): ListCertificatesRequest = {
    val __obj = js.Dynamic.literal()
    if (CertificateStatuses != null) __obj.updateDynamic("CertificateStatuses")(CertificateStatuses)
    if (Includes != null) __obj.updateDynamic("Includes")(Includes)
    if (!js.isUndefined(MaxItems)) __obj.updateDynamic("MaxItems")(MaxItems)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListCertificatesRequest]
  }
}

