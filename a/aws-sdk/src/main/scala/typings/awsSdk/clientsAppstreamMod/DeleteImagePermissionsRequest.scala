package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteImagePermissionsRequest extends StObject {
  
  /**
    * The name of the private image.
    */
  var Name: typings.awsSdk.clientsAppstreamMod.Name
  
  /**
    * The 12-digit identifier of the AWS account for which to delete image permissions.
    */
  var SharedAccountId: AwsAccountId
}
object DeleteImagePermissionsRequest {
  
  inline def apply(Name: Name, SharedAccountId: AwsAccountId): DeleteImagePermissionsRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SharedAccountId = SharedAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteImagePermissionsRequest]
  }
  
  extension [Self <: DeleteImagePermissionsRequest](x: Self) {
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setSharedAccountId(value: AwsAccountId): Self = StObject.set(x, "SharedAccountId", value.asInstanceOf[js.Any])
  }
}
