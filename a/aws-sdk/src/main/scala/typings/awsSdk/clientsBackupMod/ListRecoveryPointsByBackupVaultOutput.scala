package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRecoveryPointsByBackupVaultOutput extends StObject {
  
  /**
    * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * An array of objects that contain detailed information about recovery points saved in a backup vault.
    */
  var RecoveryPoints: js.UndefOr[RecoveryPointByBackupVaultList] = js.undefined
}
object ListRecoveryPointsByBackupVaultOutput {
  
  inline def apply(): ListRecoveryPointsByBackupVaultOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRecoveryPointsByBackupVaultOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListRecoveryPointsByBackupVaultOutput] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRecoveryPoints(value: RecoveryPointByBackupVaultList): Self = StObject.set(x, "RecoveryPoints", value.asInstanceOf[js.Any])
    
    inline def setRecoveryPointsUndefined: Self = StObject.set(x, "RecoveryPoints", js.undefined)
    
    inline def setRecoveryPointsVarargs(value: RecoveryPointByBackupVault*): Self = StObject.set(x, "RecoveryPoints", js.Array(value*))
  }
}
