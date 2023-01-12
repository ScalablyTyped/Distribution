package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatchSummary extends StObject {
  
  /**
    * The number of patches from the compliance standard that failed to install.
    */
  var FailedCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The identifier of the compliance standard that was used to determine the patch compliance status.
    */
  var Id: NonEmptyString
  
  /**
    * The number of patches from the compliance standard that were installed successfully.
    */
  var InstalledCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of installed patches that are not part of the compliance standard.
    */
  var InstalledOtherCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of patches that were applied, but that require the instance to be rebooted in order to be marked as installed.
    */
  var InstalledPendingReboot: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of patches that are installed but are also on a list of patches that the customer rejected.
    */
  var InstalledRejectedCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of patches that are part of the compliance standard but are not installed. The count includes patches that failed to install.
    */
  var MissingCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The type of patch operation performed. For Patch Manager, the values are SCAN and INSTALL. 
    */
  var Operation: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Indicates when the operation completed. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var OperationEndTime: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Indicates when the operation started. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var OperationStartTime: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The reboot option specified for the instance.
    */
  var RebootOption: js.UndefOr[NonEmptyString] = js.undefined
}
object PatchSummary {
  
  inline def apply(Id: NonEmptyString): PatchSummary = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PatchSummary] (val x: Self) extends AnyVal {
    
    inline def setFailedCount(value: Integer): Self = StObject.set(x, "FailedCount", value.asInstanceOf[js.Any])
    
    inline def setFailedCountUndefined: Self = StObject.set(x, "FailedCount", js.undefined)
    
    inline def setId(value: NonEmptyString): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setInstalledCount(value: Integer): Self = StObject.set(x, "InstalledCount", value.asInstanceOf[js.Any])
    
    inline def setInstalledCountUndefined: Self = StObject.set(x, "InstalledCount", js.undefined)
    
    inline def setInstalledOtherCount(value: Integer): Self = StObject.set(x, "InstalledOtherCount", value.asInstanceOf[js.Any])
    
    inline def setInstalledOtherCountUndefined: Self = StObject.set(x, "InstalledOtherCount", js.undefined)
    
    inline def setInstalledPendingReboot(value: Integer): Self = StObject.set(x, "InstalledPendingReboot", value.asInstanceOf[js.Any])
    
    inline def setInstalledPendingRebootUndefined: Self = StObject.set(x, "InstalledPendingReboot", js.undefined)
    
    inline def setInstalledRejectedCount(value: Integer): Self = StObject.set(x, "InstalledRejectedCount", value.asInstanceOf[js.Any])
    
    inline def setInstalledRejectedCountUndefined: Self = StObject.set(x, "InstalledRejectedCount", js.undefined)
    
    inline def setMissingCount(value: Integer): Self = StObject.set(x, "MissingCount", value.asInstanceOf[js.Any])
    
    inline def setMissingCountUndefined: Self = StObject.set(x, "MissingCount", js.undefined)
    
    inline def setOperation(value: NonEmptyString): Self = StObject.set(x, "Operation", value.asInstanceOf[js.Any])
    
    inline def setOperationEndTime(value: NonEmptyString): Self = StObject.set(x, "OperationEndTime", value.asInstanceOf[js.Any])
    
    inline def setOperationEndTimeUndefined: Self = StObject.set(x, "OperationEndTime", js.undefined)
    
    inline def setOperationStartTime(value: NonEmptyString): Self = StObject.set(x, "OperationStartTime", value.asInstanceOf[js.Any])
    
    inline def setOperationStartTimeUndefined: Self = StObject.set(x, "OperationStartTime", js.undefined)
    
    inline def setOperationUndefined: Self = StObject.set(x, "Operation", js.undefined)
    
    inline def setRebootOption(value: NonEmptyString): Self = StObject.set(x, "RebootOption", value.asInstanceOf[js.Any])
    
    inline def setRebootOptionUndefined: Self = StObject.set(x, "RebootOption", js.undefined)
  }
}
