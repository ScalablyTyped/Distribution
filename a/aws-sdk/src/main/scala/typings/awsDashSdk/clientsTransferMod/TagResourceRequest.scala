package typings.awsDashSdk.clientsTransferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagResourceRequest extends js.Object {
  /**
    * An Amazon Resource Name (ARN) for a specific AWS resource, such as a server, user, or role.
    */
  var Arn: typings.awsDashSdk.clientsTransferMod.Arn = js.native
  /**
    * Key-value pairs assigned to ARNs that you can use to group and search for resources by type. You can attach this metadata to user accounts for any purpose.
    */
  var Tags: typings.awsDashSdk.clientsTransferMod.Tags = js.native
}

object TagResourceRequest {
  @scala.inline
  def apply(Arn: Arn, Tags: Tags): TagResourceRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TagResourceRequest]
  }
}

