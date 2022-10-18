package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatchRule extends StObject {
  
  /**
    * The number of days after the release date of each patch matched by the rule that the patch is marked as approved in the patch baseline. For example, a value of 7 means that patches are approved seven days after they are released. Not supported on Debian Server or Ubuntu Server.
    */
  var ApproveAfterDays: js.UndefOr[typings.awsSdk.clientsSsmMod.ApproveAfterDays] = js.undefined
  
  /**
    * The cutoff date for auto approval of released patches. Any patches released on or before this date are installed automatically. Not supported on Debian Server or Ubuntu Server. Enter dates in the format YYYY-MM-DD. For example, 2021-12-31.
    */
  var ApproveUntilDate: js.UndefOr[PatchStringDateTime] = js.undefined
  
  /**
    * A compliance severity level for all approved patches in a patch baseline.
    */
  var ComplianceLevel: js.UndefOr[PatchComplianceLevel] = js.undefined
  
  /**
    * For managed nodes identified by the approval rule filters, enables a patch baseline to apply non-security updates available in the specified repository. The default value is false. Applies to Linux managed nodes only.
    */
  var EnableNonSecurity: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The patch filter group that defines the criteria for the rule.
    */
  var PatchFilterGroup: typings.awsSdk.clientsSsmMod.PatchFilterGroup
}
object PatchRule {
  
  inline def apply(PatchFilterGroup: PatchFilterGroup): PatchRule = {
    val __obj = js.Dynamic.literal(PatchFilterGroup = PatchFilterGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchRule]
  }
  
  extension [Self <: PatchRule](x: Self) {
    
    inline def setApproveAfterDays(value: ApproveAfterDays): Self = StObject.set(x, "ApproveAfterDays", value.asInstanceOf[js.Any])
    
    inline def setApproveAfterDaysUndefined: Self = StObject.set(x, "ApproveAfterDays", js.undefined)
    
    inline def setApproveUntilDate(value: PatchStringDateTime): Self = StObject.set(x, "ApproveUntilDate", value.asInstanceOf[js.Any])
    
    inline def setApproveUntilDateUndefined: Self = StObject.set(x, "ApproveUntilDate", js.undefined)
    
    inline def setComplianceLevel(value: PatchComplianceLevel): Self = StObject.set(x, "ComplianceLevel", value.asInstanceOf[js.Any])
    
    inline def setComplianceLevelUndefined: Self = StObject.set(x, "ComplianceLevel", js.undefined)
    
    inline def setEnableNonSecurity(value: Boolean): Self = StObject.set(x, "EnableNonSecurity", value.asInstanceOf[js.Any])
    
    inline def setEnableNonSecurityUndefined: Self = StObject.set(x, "EnableNonSecurity", js.undefined)
    
    inline def setPatchFilterGroup(value: PatchFilterGroup): Self = StObject.set(x, "PatchFilterGroup", value.asInstanceOf[js.Any])
  }
}
