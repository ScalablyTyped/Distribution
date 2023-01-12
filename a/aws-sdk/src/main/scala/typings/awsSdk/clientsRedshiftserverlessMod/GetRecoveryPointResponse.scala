package typings.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRecoveryPointResponse extends StObject {
  
  /**
    * The returned recovery point object.
    */
  var recoveryPoint: js.UndefOr[RecoveryPoint] = js.undefined
}
object GetRecoveryPointResponse {
  
  inline def apply(): GetRecoveryPointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRecoveryPointResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetRecoveryPointResponse] (val x: Self) extends AnyVal {
    
    inline def setRecoveryPoint(value: RecoveryPoint): Self = StObject.set(x, "recoveryPoint", value.asInstanceOf[js.Any])
    
    inline def setRecoveryPointUndefined: Self = StObject.set(x, "recoveryPoint", js.undefined)
  }
}
