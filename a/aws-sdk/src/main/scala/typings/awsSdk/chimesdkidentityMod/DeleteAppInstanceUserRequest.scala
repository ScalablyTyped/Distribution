package typings.awsSdk.chimesdkidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAppInstanceUserRequest extends StObject {
  
  /**
    * The ARN of the user request being deleted.
    */
  var AppInstanceUserArn: ChimeArn
}
object DeleteAppInstanceUserRequest {
  
  inline def apply(AppInstanceUserArn: ChimeArn): DeleteAppInstanceUserRequest = {
    val __obj = js.Dynamic.literal(AppInstanceUserArn = AppInstanceUserArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAppInstanceUserRequest]
  }
  
  extension [Self <: DeleteAppInstanceUserRequest](x: Self) {
    
    inline def setAppInstanceUserArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceUserArn", value.asInstanceOf[js.Any])
  }
}
