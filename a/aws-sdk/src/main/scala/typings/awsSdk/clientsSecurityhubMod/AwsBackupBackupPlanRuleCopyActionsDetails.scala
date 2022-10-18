package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsBackupBackupPlanRuleCopyActionsDetails extends StObject {
  
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies the destination backup vault for the copied backup. 
    */
  var DestinationBackupVaultArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Defines when a protected resource is transitioned to cold storage and when it expires. Backup transitions and expires backups automatically according to the lifecycle that you define. If you do not specify a lifecycle, Backup applies the lifecycle policy of the source backup to the destination backup. Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days.
    */
  var Lifecycle: js.UndefOr[AwsBackupBackupPlanLifecycleDetails] = js.undefined
}
object AwsBackupBackupPlanRuleCopyActionsDetails {
  
  inline def apply(): AwsBackupBackupPlanRuleCopyActionsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsBackupBackupPlanRuleCopyActionsDetails]
  }
  
  extension [Self <: AwsBackupBackupPlanRuleCopyActionsDetails](x: Self) {
    
    inline def setDestinationBackupVaultArn(value: NonEmptyString): Self = StObject.set(x, "DestinationBackupVaultArn", value.asInstanceOf[js.Any])
    
    inline def setDestinationBackupVaultArnUndefined: Self = StObject.set(x, "DestinationBackupVaultArn", js.undefined)
    
    inline def setLifecycle(value: AwsBackupBackupPlanLifecycleDetails): Self = StObject.set(x, "Lifecycle", value.asInstanceOf[js.Any])
    
    inline def setLifecycleUndefined: Self = StObject.set(x, "Lifecycle", js.undefined)
  }
}
