package typings.awsSdk.clientsRoute53recoveryreadinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRecoveryGroupRequest extends StObject {
  
  /**
    * The name of a recovery group.
    */
  var RecoveryGroupName: string
}
object DeleteRecoveryGroupRequest {
  
  inline def apply(RecoveryGroupName: string): DeleteRecoveryGroupRequest = {
    val __obj = js.Dynamic.literal(RecoveryGroupName = RecoveryGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRecoveryGroupRequest]
  }
  
  extension [Self <: DeleteRecoveryGroupRequest](x: Self) {
    
    inline def setRecoveryGroupName(value: string): Self = StObject.set(x, "RecoveryGroupName", value.asInstanceOf[js.Any])
  }
}
