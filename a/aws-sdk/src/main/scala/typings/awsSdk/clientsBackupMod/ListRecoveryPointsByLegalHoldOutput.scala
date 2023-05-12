package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRecoveryPointsByLegalHoldOutput extends StObject {
  
  /**
    * This return is the next item following a partial list of returned resources.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * This is a list of the recovery points returned by ListRecoveryPointsByLegalHold.
    */
  var RecoveryPoints: js.UndefOr[RecoveryPointsList] = js.undefined
}
object ListRecoveryPointsByLegalHoldOutput {
  
  inline def apply(): ListRecoveryPointsByLegalHoldOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRecoveryPointsByLegalHoldOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListRecoveryPointsByLegalHoldOutput] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRecoveryPoints(value: RecoveryPointsList): Self = StObject.set(x, "RecoveryPoints", value.asInstanceOf[js.Any])
    
    inline def setRecoveryPointsUndefined: Self = StObject.set(x, "RecoveryPoints", js.undefined)
    
    inline def setRecoveryPointsVarargs(value: RecoveryPointMember*): Self = StObject.set(x, "RecoveryPoints", js.Array(value*))
  }
}
