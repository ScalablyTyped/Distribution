package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateImagePermissionsRequest extends StObject {
  
  /**
    * The permissions for the image.
    */
  var ImagePermissions: typings.awsSdk.clientsAppstreamMod.ImagePermissions
  
  /**
    * The name of the private image.
    */
  var Name: typings.awsSdk.clientsAppstreamMod.Name
  
  /**
    * The 12-digit identifier of the AWS account for which you want add or update image permissions.
    */
  var SharedAccountId: AwsAccountId
}
object UpdateImagePermissionsRequest {
  
  inline def apply(ImagePermissions: ImagePermissions, Name: Name, SharedAccountId: AwsAccountId): UpdateImagePermissionsRequest = {
    val __obj = js.Dynamic.literal(ImagePermissions = ImagePermissions.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], SharedAccountId = SharedAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateImagePermissionsRequest]
  }
  
  extension [Self <: UpdateImagePermissionsRequest](x: Self) {
    
    inline def setImagePermissions(value: ImagePermissions): Self = StObject.set(x, "ImagePermissions", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setSharedAccountId(value: AwsAccountId): Self = StObject.set(x, "SharedAccountId", value.asInstanceOf[js.Any])
  }
}
