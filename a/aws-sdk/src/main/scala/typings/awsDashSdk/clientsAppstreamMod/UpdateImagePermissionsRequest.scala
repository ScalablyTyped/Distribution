package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateImagePermissionsRequest extends js.Object {
  /**
    * The permissions for the image.
    */
  var ImagePermissions: typings.awsDashSdk.clientsAppstreamMod.ImagePermissions
  /**
    * The name of the private image.
    */
  var Name: typings.awsDashSdk.clientsAppstreamMod.Name
  /**
    * The 12-digit identifier of the AWS account for which you want add or update image permissions.
    */
  var SharedAccountId: AwsAccountId
}

object UpdateImagePermissionsRequest {
  @scala.inline
  def apply(ImagePermissions: ImagePermissions, Name: Name, SharedAccountId: AwsAccountId): UpdateImagePermissionsRequest = {
    val __obj = js.Dynamic.literal(ImagePermissions = ImagePermissions, Name = Name, SharedAccountId = SharedAccountId)
  
    __obj.asInstanceOf[UpdateImagePermissionsRequest]
  }
}

