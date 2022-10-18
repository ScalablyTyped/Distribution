package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsBackupBackupPlanDetails extends StObject {
  
  /**
    * Uniquely identifies the backup plan to be associated with the selection of resources. 
    */
  var BackupPlan: js.UndefOr[AwsBackupBackupPlanBackupPlanDetails] = js.undefined
  
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies the backup plan. 
    */
  var BackupPlanArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A unique ID for the backup plan. 
    */
  var BackupPlanId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Unique, randomly generated, Unicode, UTF-8 encoded strings. Version IDs cannot be edited. 
    */
  var VersionId: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsBackupBackupPlanDetails {
  
  inline def apply(): AwsBackupBackupPlanDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsBackupBackupPlanDetails]
  }
  
  extension [Self <: AwsBackupBackupPlanDetails](x: Self) {
    
    inline def setBackupPlan(value: AwsBackupBackupPlanBackupPlanDetails): Self = StObject.set(x, "BackupPlan", value.asInstanceOf[js.Any])
    
    inline def setBackupPlanArn(value: NonEmptyString): Self = StObject.set(x, "BackupPlanArn", value.asInstanceOf[js.Any])
    
    inline def setBackupPlanArnUndefined: Self = StObject.set(x, "BackupPlanArn", js.undefined)
    
    inline def setBackupPlanId(value: NonEmptyString): Self = StObject.set(x, "BackupPlanId", value.asInstanceOf[js.Any])
    
    inline def setBackupPlanIdUndefined: Self = StObject.set(x, "BackupPlanId", js.undefined)
    
    inline def setBackupPlanUndefined: Self = StObject.set(x, "BackupPlan", js.undefined)
    
    inline def setVersionId(value: NonEmptyString): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
    
    inline def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
  }
}
