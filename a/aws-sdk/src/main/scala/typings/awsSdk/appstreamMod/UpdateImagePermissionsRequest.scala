package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateImagePermissionsRequest extends js.Object {
  /**
    * The permissions for the image.
    */
  var ImagePermissions: typings.awsSdk.appstreamMod.ImagePermissions = js.native
  /**
    * The name of the private image.
    */
  var Name: typings.awsSdk.appstreamMod.Name = js.native
  /**
    * The 12-digit identifier of the AWS account for which you want add or update image permissions.
    */
  var SharedAccountId: AwsAccountId = js.native
}

object UpdateImagePermissionsRequest {
  @scala.inline
  def apply(ImagePermissions: ImagePermissions, Name: Name, SharedAccountId: AwsAccountId): UpdateImagePermissionsRequest = {
    val __obj = js.Dynamic.literal(ImagePermissions = ImagePermissions.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], SharedAccountId = SharedAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateImagePermissionsRequest]
  }
  @scala.inline
  implicit class UpdateImagePermissionsRequestOps[Self <: UpdateImagePermissionsRequest] (val x: Self) extends AnyVal {
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
    def setImagePermissions(value: ImagePermissions): Self = this.set("ImagePermissions", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: Name): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSharedAccountId(value: AwsAccountId): Self = this.set("SharedAccountId", value.asInstanceOf[js.Any])
  }
  
}

