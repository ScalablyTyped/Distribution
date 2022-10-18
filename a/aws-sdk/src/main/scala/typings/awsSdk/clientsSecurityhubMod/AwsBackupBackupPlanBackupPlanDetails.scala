package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsBackupBackupPlanBackupPlanDetails extends StObject {
  
  /**
    * A list of backup options for each resource type. 
    */
  var AdvancedBackupSettings: js.UndefOr[AwsBackupBackupPlanAdvancedBackupSettingsList] = js.undefined
  
  /**
    * The display name of a backup plan. 
    */
  var BackupPlanName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * An array of BackupRule objects, each of which specifies a scheduled task that is used to back up a selection of resources. 
    */
  var BackupPlanRule: js.UndefOr[AwsBackupBackupPlanRuleList] = js.undefined
}
object AwsBackupBackupPlanBackupPlanDetails {
  
  inline def apply(): AwsBackupBackupPlanBackupPlanDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsBackupBackupPlanBackupPlanDetails]
  }
  
  extension [Self <: AwsBackupBackupPlanBackupPlanDetails](x: Self) {
    
    inline def setAdvancedBackupSettings(value: AwsBackupBackupPlanAdvancedBackupSettingsList): Self = StObject.set(x, "AdvancedBackupSettings", value.asInstanceOf[js.Any])
    
    inline def setAdvancedBackupSettingsUndefined: Self = StObject.set(x, "AdvancedBackupSettings", js.undefined)
    
    inline def setAdvancedBackupSettingsVarargs(value: AwsBackupBackupPlanAdvancedBackupSettingsDetails*): Self = StObject.set(x, "AdvancedBackupSettings", js.Array(value*))
    
    inline def setBackupPlanName(value: NonEmptyString): Self = StObject.set(x, "BackupPlanName", value.asInstanceOf[js.Any])
    
    inline def setBackupPlanNameUndefined: Self = StObject.set(x, "BackupPlanName", js.undefined)
    
    inline def setBackupPlanRule(value: AwsBackupBackupPlanRuleList): Self = StObject.set(x, "BackupPlanRule", value.asInstanceOf[js.Any])
    
    inline def setBackupPlanRuleUndefined: Self = StObject.set(x, "BackupPlanRule", js.undefined)
    
    inline def setBackupPlanRuleVarargs(value: AwsBackupBackupPlanRuleDetails*): Self = StObject.set(x, "BackupPlanRule", js.Array(value*))
  }
}
