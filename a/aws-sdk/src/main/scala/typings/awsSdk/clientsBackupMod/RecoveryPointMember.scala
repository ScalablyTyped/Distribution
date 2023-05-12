package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecoveryPointMember extends StObject {
  
  /**
    * This is the Amazon Resource Name (ARN) of the parent (composite) recovery point.
    */
  var RecoveryPointArn: js.UndefOr[ARN] = js.undefined
}
object RecoveryPointMember {
  
  inline def apply(): RecoveryPointMember = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecoveryPointMember]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecoveryPointMember] (val x: Self) extends AnyVal {
    
    inline def setRecoveryPointArn(value: ARN): Self = StObject.set(x, "RecoveryPointArn", value.asInstanceOf[js.Any])
    
    inline def setRecoveryPointArnUndefined: Self = StObject.set(x, "RecoveryPointArn", js.undefined)
  }
}
