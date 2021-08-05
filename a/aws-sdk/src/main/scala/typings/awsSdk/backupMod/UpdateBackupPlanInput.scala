package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateBackupPlanInput extends StObject {
  
  /**
    * Specifies the body of a backup plan. Includes a BackupPlanName and one or more sets of Rules.
    */
  var BackupPlan: BackupPlanInput
  
  /**
    * Uniquely identifies a backup plan.
    */
  var BackupPlanId: String
}
object UpdateBackupPlanInput {
  
  inline def apply(BackupPlan: BackupPlanInput, BackupPlanId: String): UpdateBackupPlanInput = {
    val __obj = js.Dynamic.literal(BackupPlan = BackupPlan.asInstanceOf[js.Any], BackupPlanId = BackupPlanId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBackupPlanInput]
  }
  
  extension [Self <: UpdateBackupPlanInput](x: Self) {
    
    inline def setBackupPlan(value: BackupPlanInput): Self = StObject.set(x, "BackupPlan", value.asInstanceOf[js.Any])
    
    inline def setBackupPlanId(value: String): Self = StObject.set(x, "BackupPlanId", value.asInstanceOf[js.Any])
  }
}
