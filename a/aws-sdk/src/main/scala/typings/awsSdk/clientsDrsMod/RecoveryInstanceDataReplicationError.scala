package typings.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecoveryInstanceDataReplicationError extends StObject {
  
  /**
    * Error in data replication.
    */
  var error: js.UndefOr[FailbackReplicationError] = js.undefined
  
  /**
    * Error in data replication.
    */
  var rawError: js.UndefOr[LargeBoundedString] = js.undefined
}
object RecoveryInstanceDataReplicationError {
  
  inline def apply(): RecoveryInstanceDataReplicationError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecoveryInstanceDataReplicationError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecoveryInstanceDataReplicationError] (val x: Self) extends AnyVal {
    
    inline def setError(value: FailbackReplicationError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setRawError(value: LargeBoundedString): Self = StObject.set(x, "rawError", value.asInstanceOf[js.Any])
    
    inline def setRawErrorUndefined: Self = StObject.set(x, "rawError", js.undefined)
  }
}
