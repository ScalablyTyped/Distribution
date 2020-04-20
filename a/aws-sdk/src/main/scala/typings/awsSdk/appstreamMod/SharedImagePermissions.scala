package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedImagePermissions extends js.Object {
  /**
    * Describes the permissions for a shared image.
    */
  var imagePermissions: ImagePermissions = js.native
  /**
    * The 12-digit identifier of the AWS account with which the image is shared.
    */
  var sharedAccountId: AwsAccountId = js.native
}

object SharedImagePermissions {
  @scala.inline
  def apply(imagePermissions: ImagePermissions, sharedAccountId: AwsAccountId): SharedImagePermissions = {
    val __obj = js.Dynamic.literal(imagePermissions = imagePermissions.asInstanceOf[js.Any], sharedAccountId = sharedAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedImagePermissions]
  }
}

