package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBackupPlanTemplatesOutput extends StObject {
  
  /**
    * An array of template list items containing metadata about your saved templates.
    */
  var BackupPlanTemplatesList: js.UndefOr[typings.awsSdk.backupMod.BackupPlanTemplatesList] = js.undefined
  
  /**
    * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListBackupPlanTemplatesOutput {
  
  inline def apply(): ListBackupPlanTemplatesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBackupPlanTemplatesOutput]
  }
  
  extension [Self <: ListBackupPlanTemplatesOutput](x: Self) {
    
    inline def setBackupPlanTemplatesList(value: BackupPlanTemplatesList): Self = StObject.set(x, "BackupPlanTemplatesList", value.asInstanceOf[js.Any])
    
    inline def setBackupPlanTemplatesListUndefined: Self = StObject.set(x, "BackupPlanTemplatesList", js.undefined)
    
    inline def setBackupPlanTemplatesListVarargs(value: BackupPlanTemplatesListMember*): Self = StObject.set(x, "BackupPlanTemplatesList", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
