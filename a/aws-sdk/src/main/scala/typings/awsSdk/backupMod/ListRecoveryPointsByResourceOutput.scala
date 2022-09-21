package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRecoveryPointsByResourceOutput extends StObject {
  
  /**
    * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * An array of objects that contain detailed information about recovery points of the specified resource type.  Only Amazon EFS and Amazon EC2 recovery points return BackupVaultName. 
    */
  var RecoveryPoints: js.UndefOr[RecoveryPointByResourceList] = js.undefined
}
object ListRecoveryPointsByResourceOutput {
  
  inline def apply(): ListRecoveryPointsByResourceOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRecoveryPointsByResourceOutput]
  }
  
  extension [Self <: ListRecoveryPointsByResourceOutput](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRecoveryPoints(value: RecoveryPointByResourceList): Self = StObject.set(x, "RecoveryPoints", value.asInstanceOf[js.Any])
    
    inline def setRecoveryPointsUndefined: Self = StObject.set(x, "RecoveryPoints", js.undefined)
    
    inline def setRecoveryPointsVarargs(value: RecoveryPointByResource*): Self = StObject.set(x, "RecoveryPoints", js.Array(value*))
  }
}
