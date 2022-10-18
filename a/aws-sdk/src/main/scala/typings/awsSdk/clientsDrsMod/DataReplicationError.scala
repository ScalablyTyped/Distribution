package typings.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataReplicationError extends StObject {
  
  /**
    * Error in data replication.
    */
  var error: js.UndefOr[DataReplicationErrorString] = js.undefined
  
  /**
    * Error in data replication.
    */
  var rawError: js.UndefOr[LargeBoundedString] = js.undefined
}
object DataReplicationError {
  
  inline def apply(): DataReplicationError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataReplicationError]
  }
  
  extension [Self <: DataReplicationError](x: Self) {
    
    inline def setError(value: DataReplicationErrorString): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setRawError(value: LargeBoundedString): Self = StObject.set(x, "rawError", value.asInstanceOf[js.Any])
    
    inline def setRawErrorUndefined: Self = StObject.set(x, "rawError", js.undefined)
  }
}
