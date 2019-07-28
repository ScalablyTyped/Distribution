package typings.awsDashSdk.clientsWorklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeWebsiteCertificateAuthorityRequest extends js.Object {
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typings.awsDashSdk.clientsWorklinkMod.FleetArn
  /**
    * A unique identifier for the certificate authority.
    */
  var WebsiteCaId: Id
}

object DescribeWebsiteCertificateAuthorityRequest {
  @scala.inline
  def apply(FleetArn: FleetArn, WebsiteCaId: Id): DescribeWebsiteCertificateAuthorityRequest = {
    val __obj = js.Dynamic.literal(FleetArn = FleetArn, WebsiteCaId = WebsiteCaId)
  
    __obj.asInstanceOf[DescribeWebsiteCertificateAuthorityRequest]
  }
}

