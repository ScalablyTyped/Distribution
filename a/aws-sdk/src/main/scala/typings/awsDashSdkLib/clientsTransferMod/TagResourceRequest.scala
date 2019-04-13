package typings
package awsDashSdkLib.clientsTransferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagResourceRequest extends js.Object {
  /**
    * An Amazon Resource Name (ARN) for a specific AWS resource, such as a server, user, or role.
    */
  var Arn: awsDashSdkLib.clientsTransferMod.Arn
  /**
    * Key-value pairs assigned to ARNs that you can use to group and search for resources by type. You can attach this metadata to user accounts for any purpose.
    */
  var Tags: awsDashSdkLib.clientsTransferMod.Tags
}

object TagResourceRequest {
  @scala.inline
  def apply(Arn: Arn, Tags: Tags): TagResourceRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn, Tags = Tags)
  
    __obj.asInstanceOf[TagResourceRequest]
  }
}

