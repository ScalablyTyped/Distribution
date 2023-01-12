package typings.awsSdk.clientsCloud9Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEnvironmentMembershipRequest extends StObject {
  
  /**
    * The ID of the environment to delete the environment member from.
    */
  var environmentId: EnvironmentId
  
  /**
    * The Amazon Resource Name (ARN) of the environment member to delete from the environment.
    */
  var userArn: UserArn
}
object DeleteEnvironmentMembershipRequest {
  
  inline def apply(environmentId: EnvironmentId, userArn: UserArn): DeleteEnvironmentMembershipRequest = {
    val __obj = js.Dynamic.literal(environmentId = environmentId.asInstanceOf[js.Any], userArn = userArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEnvironmentMembershipRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteEnvironmentMembershipRequest] (val x: Self) extends AnyVal {
    
    inline def setEnvironmentId(value: EnvironmentId): Self = StObject.set(x, "environmentId", value.asInstanceOf[js.Any])
    
    inline def setUserArn(value: UserArn): Self = StObject.set(x, "userArn", value.asInstanceOf[js.Any])
  }
}
