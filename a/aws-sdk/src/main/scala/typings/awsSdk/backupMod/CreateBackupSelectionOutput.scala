package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBackupSelectionOutput extends StObject {
  
  /**
    * Uniquely identifies a backup plan.
    */
  var BackupPlanId: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time a backup selection is created, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CreationDate: js.UndefOr[timestamp] = js.undefined
  
  /**
    * Uniquely identifies the body of a request to assign a set of resources to a backup plan.
    */
  var SelectionId: js.UndefOr[String] = js.undefined
}
object CreateBackupSelectionOutput {
  
  @scala.inline
  def apply(): CreateBackupSelectionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBackupSelectionOutput]
  }
  
  @scala.inline
  implicit class CreateBackupSelectionOutputMutableBuilder[Self <: CreateBackupSelectionOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupPlanId(value: String): Self = StObject.set(x, "BackupPlanId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupPlanIdUndefined: Self = StObject.set(x, "BackupPlanId", js.undefined)
    
    @scala.inline
    def setCreationDate(value: timestamp): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    @scala.inline
    def setSelectionId(value: String): Self = StObject.set(x, "SelectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionIdUndefined: Self = StObject.set(x, "SelectionId", js.undefined)
  }
}
