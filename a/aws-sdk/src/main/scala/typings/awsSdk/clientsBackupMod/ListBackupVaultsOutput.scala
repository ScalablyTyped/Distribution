package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBackupVaultsOutput extends StObject {
  
  /**
    * An array of backup vault list members containing vault metadata, including Amazon Resource Name (ARN), display name, creation date, number of saved recovery points, and encryption information if the resources saved in the backup vault are encrypted.
    */
  var BackupVaultList: js.UndefOr[typings.awsSdk.clientsBackupMod.BackupVaultList] = js.undefined
  
  /**
    * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListBackupVaultsOutput {
  
  inline def apply(): ListBackupVaultsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBackupVaultsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListBackupVaultsOutput] (val x: Self) extends AnyVal {
    
    inline def setBackupVaultList(value: BackupVaultList): Self = StObject.set(x, "BackupVaultList", value.asInstanceOf[js.Any])
    
    inline def setBackupVaultListUndefined: Self = StObject.set(x, "BackupVaultList", js.undefined)
    
    inline def setBackupVaultListVarargs(value: BackupVaultListMember*): Self = StObject.set(x, "BackupVaultList", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
