package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageResource extends StObject {
  
  /**
    * The unique ID of the Amazon Web Services account.
    */
  var AccountId: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.AccountId] = js.undefined
  
  /**
    * Represents the status of the EKS cluster coverage.
    */
  var CoverageStatus: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.CoverageStatus] = js.undefined
  
  /**
    * The unique ID of the GuardDuty detector associated with the resource.
    */
  var DetectorId: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.DetectorId] = js.undefined
  
  /**
    * Represents the reason why a coverage status was UNHEALTHY for the EKS cluster.
    */
  var Issue: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the resource for which the coverage statistics are retrieved.
    */
  var ResourceDetails: js.UndefOr[CoverageResourceDetails] = js.undefined
  
  /**
    * The unique ID of the resource.
    */
  var ResourceId: js.UndefOr[String] = js.undefined
  
  /**
    * The timestamp at which the coverage details for the resource were last updated. This is in UTC format.
    */
  var UpdatedAt: js.UndefOr[js.Date] = js.undefined
}
object CoverageResource {
  
  inline def apply(): CoverageResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoverageResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoverageResource] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setCoverageStatus(value: CoverageStatus): Self = StObject.set(x, "CoverageStatus", value.asInstanceOf[js.Any])
    
    inline def setCoverageStatusUndefined: Self = StObject.set(x, "CoverageStatus", js.undefined)
    
    inline def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
    
    inline def setDetectorIdUndefined: Self = StObject.set(x, "DetectorId", js.undefined)
    
    inline def setIssue(value: String): Self = StObject.set(x, "Issue", value.asInstanceOf[js.Any])
    
    inline def setIssueUndefined: Self = StObject.set(x, "Issue", js.undefined)
    
    inline def setResourceDetails(value: CoverageResourceDetails): Self = StObject.set(x, "ResourceDetails", value.asInstanceOf[js.Any])
    
    inline def setResourceDetailsUndefined: Self = StObject.set(x, "ResourceDetails", js.undefined)
    
    inline def setResourceId(value: String): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
  }
}
