package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class DeleteImagePermissionsRequestOps[Self <: DeleteImagePermissionsRequest] (val x: Self) extends AnyVal {
    
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
    def setName(value: Name): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedAccountId(value: AwsAccountId): Self = this.set("SharedAccountId", value.asInstanceOf[js.Any])
  }
}
