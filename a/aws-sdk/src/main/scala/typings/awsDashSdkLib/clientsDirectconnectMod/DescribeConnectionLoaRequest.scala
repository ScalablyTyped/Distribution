package typings
package awsDashSdkLib.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeConnectionLoaRequest extends js.Object {
  /**
    * The ID of the connection.
    */
  var connectionId: ConnectionId
  /**
    * The standard media type for the LOA-CFA document. The only supported value is application/pdf.
    */
  var loaContentType: js.UndefOr[LoaContentType] = js.undefined
  /**
    * The name of the APN partner or service provider who establishes connectivity on your behalf. If you specify this parameter, the LOA-CFA lists the provider name alongside your company name as the requester of the cross connect.
    */
  var providerName: js.UndefOr[ProviderName] = js.undefined
}

object DescribeConnectionLoaRequest {
  @scala.inline
  def apply(
    connectionId: ConnectionId,
    loaContentType: LoaContentType = null,
    providerName: ProviderName = null
  ): DescribeConnectionLoaRequest = {
    val __obj = js.Dynamic.literal(connectionId = connectionId)
    if (loaContentType != null) __obj.updateDynamic("loaContentType")(loaContentType.asInstanceOf[js.Any])
    if (providerName != null) __obj.updateDynamic("providerName")(providerName)
    __obj.asInstanceOf[DescribeConnectionLoaRequest]
  }
}

