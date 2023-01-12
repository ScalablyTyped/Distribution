package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StackDriftInformation extends StObject {
  
  /**
    * Most recent time when a drift detection operation was initiated on the stack, or any of its individual resources that support drift detection.
    */
  var LastCheckTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Status of the stack's actual configuration compared to its expected template configuration.    DRIFTED: The stack differs from its expected template configuration. A stack is considered to have drifted if one or more of its resources have drifted.    NOT_CHECKED: CloudFormation hasn't checked if the stack differs from its expected template configuration.    IN_SYNC: The stack's actual configuration matches its expected template configuration.    UNKNOWN: This value is reserved for future use.  
    */
  var StackDriftStatus: typings.awsSdk.clientsCloudformationMod.StackDriftStatus
}
object StackDriftInformation {
  
  inline def apply(StackDriftStatus: StackDriftStatus): StackDriftInformation = {
    val __obj = js.Dynamic.literal(StackDriftStatus = StackDriftStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackDriftInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StackDriftInformation] (val x: Self) extends AnyVal {
    
    inline def setLastCheckTimestamp(value: js.Date): Self = StObject.set(x, "LastCheckTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastCheckTimestampUndefined: Self = StObject.set(x, "LastCheckTimestamp", js.undefined)
    
    inline def setStackDriftStatus(value: StackDriftStatus): Self = StObject.set(x, "StackDriftStatus", value.asInstanceOf[js.Any])
  }
}
