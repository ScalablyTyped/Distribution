package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInstanceProfileResponse extends StObject {
  
  /**
    * A structure containing details about the instance profile.
    */
  var InstanceProfile: typings.awsSdk.clientsIamMod.InstanceProfile
}
object GetInstanceProfileResponse {
  
  inline def apply(InstanceProfile: InstanceProfile): GetInstanceProfileResponse = {
    val __obj = js.Dynamic.literal(InstanceProfile = InstanceProfile.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceProfileResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetInstanceProfileResponse] (val x: Self) extends AnyVal {
    
    inline def setInstanceProfile(value: InstanceProfile): Self = StObject.set(x, "InstanceProfile", value.asInstanceOf[js.Any])
  }
}
