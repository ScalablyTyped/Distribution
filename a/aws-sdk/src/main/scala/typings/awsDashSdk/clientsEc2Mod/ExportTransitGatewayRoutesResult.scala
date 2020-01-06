package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportTransitGatewayRoutesResult extends js.Object {
  /**
    * The URL of the exported file in Amazon S3. For example, s3://bucket_name/VPCTransitGateway/TransitGatewayRouteTables/file_name.
    */
  var S3Location: js.UndefOr[String] = js.native
}

object ExportTransitGatewayRoutesResult {
  @scala.inline
  def apply(S3Location: String = null): ExportTransitGatewayRoutesResult = {
    val __obj = js.Dynamic.literal()
    if (S3Location != null) __obj.updateDynamic("S3Location")(S3Location.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportTransitGatewayRoutesResult]
  }
}

