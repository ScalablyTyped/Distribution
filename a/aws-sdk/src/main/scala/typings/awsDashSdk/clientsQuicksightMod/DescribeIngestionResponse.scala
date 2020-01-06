package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeIngestionResponse extends js.Object {
  /**
    * Information about the ingestion.
    */
  var Ingestion: js.UndefOr[typings.awsDashSdk.clientsQuicksightMod.Ingestion] = js.native
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[java.lang.String] = js.native
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
}

object DescribeIngestionResponse {
  @scala.inline
  def apply(Ingestion: Ingestion = null, RequestId: java.lang.String = null, Status: Int | scala.Double = null): DescribeIngestionResponse = {
    val __obj = js.Dynamic.literal()
    if (Ingestion != null) __obj.updateDynamic("Ingestion")(Ingestion.asInstanceOf[js.Any])
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeIngestionResponse]
  }
}

