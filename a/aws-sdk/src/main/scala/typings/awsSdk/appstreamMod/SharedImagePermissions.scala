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
  @scala.inline
  implicit class SharedImagePermissionsOps[Self <: SharedImagePermissions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setImagePermissions(value: ImagePermissions): Self = this.set("imagePermissions", value.asInstanceOf[js.Any])
    @scala.inline
    def setSharedAccountId(value: AwsAccountId): Self = this.set("sharedAccountId", value.asInstanceOf[js.Any])
  }
  
}

