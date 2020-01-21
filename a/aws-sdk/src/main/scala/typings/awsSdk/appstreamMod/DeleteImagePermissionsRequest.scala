package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteImagePermissionsRequest extends js.Object {
  /**
    * The name of the private image.
    */
  var Name: typings.awsSdk.appstreamMod.Name = js.native
  /**
    * The 12-digit identifier of the AWS account for which to delete image permissions.
    */
  var SharedAccountId: AwsAccountId = js.native
}

object DeleteImagePermissionsRequest {
  @scala.inline
  def apply(Name: Name, SharedAccountId: AwsAccountId): DeleteImagePermissionsRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SharedAccountId = SharedAccountId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteImagePermissionsRequest]
  }
}

