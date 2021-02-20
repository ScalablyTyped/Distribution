package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateImagePermissionsRequest extends StObject {
  
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
  implicit class UpdateImagePermissionsRequestMutableBuilder[Self <: UpdateImagePermissionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImagePermissions(value: ImagePermissions): Self = StObject.set(x, "ImagePermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedAccountId(value: AwsAccountId): Self = StObject.set(x, "SharedAccountId", value.asInstanceOf[js.Any])
  }
}
