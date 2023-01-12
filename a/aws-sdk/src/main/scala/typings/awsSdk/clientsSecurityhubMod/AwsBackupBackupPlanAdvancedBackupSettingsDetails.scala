package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsBackupBackupPlanAdvancedBackupSettingsDetails extends StObject {
  
  /**
    * Specifies the backup option for a selected resource. This option is only available for Windows Volume Shadow Copy Service (VSS) backup jobs. Valid values are as follows:   Set to WindowsVSS: enabled to enable the WindowsVSS backup option and create a Windows VSS backup.   Set to WindowsVSS: disabled to create a regular backup. The WindowsVSS option is not enabled by default.  
    */
  var BackupOptions: js.UndefOr[FieldMap] = js.undefined
  
  /**
    * The name of a resource type. The only supported resource type is Amazon EC2 instances with Windows VSS. The only valid value is EC2.
    */
  var ResourceType: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsBackupBackupPlanAdvancedBackupSettingsDetails {
  
  inline def apply(): AwsBackupBackupPlanAdvancedBackupSettingsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsBackupBackupPlanAdvancedBackupSettingsDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsBackupBackupPlanAdvancedBackupSettingsDetails] (val x: Self) extends AnyVal {
    
    inline def setBackupOptions(value: FieldMap): Self = StObject.set(x, "BackupOptions", value.asInstanceOf[js.Any])
    
    inline def setBackupOptionsUndefined: Self = StObject.set(x, "BackupOptions", js.undefined)
    
    inline def setResourceType(value: NonEmptyString): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
  }
}
