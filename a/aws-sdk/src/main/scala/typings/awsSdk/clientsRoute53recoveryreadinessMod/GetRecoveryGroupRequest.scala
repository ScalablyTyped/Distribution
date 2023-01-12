package typings.awsSdk.clientsRoute53recoveryreadinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRecoveryGroupRequest extends StObject {
  
  /**
    * The name of a recovery group.
    */
  var RecoveryGroupName: string
}
object GetRecoveryGroupRequest {
  
  inline def apply(RecoveryGroupName: string): GetRecoveryGroupRequest = {
    val __obj = js.Dynamic.literal(RecoveryGroupName = RecoveryGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRecoveryGroupRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetRecoveryGroupRequest] (val x: Self) extends AnyVal {
    
    inline def setRecoveryGroupName(value: string): Self = StObject.set(x, "RecoveryGroupName", value.asInstanceOf[js.Any])
  }
}
