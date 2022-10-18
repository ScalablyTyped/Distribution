package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBackupSelectionsOutput extends StObject {
  
  /**
    * An array of backup selection list items containing metadata about each resource in the list.
    */
  var BackupSelectionsList: js.UndefOr[typings.awsSdk.clientsBackupMod.BackupSelectionsList] = js.undefined
  
  /**
    * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListBackupSelectionsOutput {
  
  inline def apply(): ListBackupSelectionsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBackupSelectionsOutput]
  }
  
  extension [Self <: ListBackupSelectionsOutput](x: Self) {
    
    inline def setBackupSelectionsList(value: BackupSelectionsList): Self = StObject.set(x, "BackupSelectionsList", value.asInstanceOf[js.Any])
    
    inline def setBackupSelectionsListUndefined: Self = StObject.set(x, "BackupSelectionsList", js.undefined)
    
    inline def setBackupSelectionsListVarargs(value: BackupSelectionsListMember*): Self = StObject.set(x, "BackupSelectionsList", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
