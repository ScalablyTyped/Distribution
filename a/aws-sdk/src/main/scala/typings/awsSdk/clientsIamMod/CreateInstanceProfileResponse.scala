package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateInstanceProfileResponse extends StObject {
  
  /**
    * A structure containing details about the new instance profile.
    */
  var InstanceProfile: typings.awsSdk.clientsIamMod.InstanceProfile
}
object CreateInstanceProfileResponse {
  
  inline def apply(InstanceProfile: InstanceProfile): CreateInstanceProfileResponse = {
    val __obj = js.Dynamic.literal(InstanceProfile = InstanceProfile.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInstanceProfileResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateInstanceProfileResponse] (val x: Self) extends AnyVal {
    
    inline def setInstanceProfile(value: InstanceProfile): Self = StObject.set(x, "InstanceProfile", value.asInstanceOf[js.Any])
  }
}
