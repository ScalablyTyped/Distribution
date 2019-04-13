package typings
package awsDashSdkLib.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteImagePermissionsRequest extends js.Object {
  /**
    * The name of the private image.
    */
  var Name: awsDashSdkLib.clientsAppstreamMod.Name
  /**
    * The 12-digit identifier of the AWS account for which to delete image permissions.
    */
  var SharedAccountId: AwsAccountId
}

object DeleteImagePermissionsRequest {
  @scala.inline
  def apply(Name: Name, SharedAccountId: AwsAccountId): DeleteImagePermissionsRequest = {
    val __obj = js.Dynamic.literal(Name = Name, SharedAccountId = SharedAccountId)
  
    __obj.asInstanceOf[DeleteImagePermissionsRequest]
  }
}

