package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Service extends StObject {
  
  /**
    * Information about the activity that is described in a finding.
    */
  var Action: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.Action] = js.undefined
  
  /**
    * Contains additional information about the generated finding.
    */
  var AdditionalInfo: js.UndefOr[ServiceAdditionalInfo] = js.undefined
  
  /**
    * Indicates whether this finding is archived.
    */
  var Archived: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The total count of the occurrences of this finding type.
    */
  var Count: js.UndefOr[Integer] = js.undefined
  
  /**
    * The detector ID for the GuardDuty service.
    */
  var DetectorId: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.DetectorId] = js.undefined
  
  /**
    * Returns details from the malware scan that created a finding.
    */
  var EbsVolumeScanDetails: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.EbsVolumeScanDetails] = js.undefined
  
  /**
    * The first-seen timestamp of the activity that prompted GuardDuty to generate this finding.
    */
  var EventFirstSeen: js.UndefOr[String] = js.undefined
  
  /**
    * The last-seen timestamp of the activity that prompted GuardDuty to generate this finding.
    */
  var EventLastSeen: js.UndefOr[String] = js.undefined
  
  /**
    * An evidence object associated with the service.
    */
  var Evidence: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.Evidence] = js.undefined
  
  /**
    * The name of the feature that generated a finding.
    */
  var FeatureName: js.UndefOr[String] = js.undefined
  
  /**
    * The resource role information for this finding.
    */
  var ResourceRole: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the Amazon Web Services service (GuardDuty) that generated a finding.
    */
  var ServiceName: js.UndefOr[String] = js.undefined
  
  /**
    * Feedback that was submitted about the finding.
    */
  var UserFeedback: js.UndefOr[String] = js.undefined
}
object Service {
  
  inline def apply(): Service = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Service]
  }
  
  extension [Self <: Service](x: Self) {
    
    inline def setAction(value: Action): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
    
    inline def setAdditionalInfo(value: ServiceAdditionalInfo): Self = StObject.set(x, "AdditionalInfo", value.asInstanceOf[js.Any])
    
    inline def setAdditionalInfoUndefined: Self = StObject.set(x, "AdditionalInfo", js.undefined)
    
    inline def setArchived(value: Boolean): Self = StObject.set(x, "Archived", value.asInstanceOf[js.Any])
    
    inline def setArchivedUndefined: Self = StObject.set(x, "Archived", js.undefined)
    
    inline def setCount(value: Integer): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
    
    inline def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
    
    inline def setDetectorIdUndefined: Self = StObject.set(x, "DetectorId", js.undefined)
    
    inline def setEbsVolumeScanDetails(value: EbsVolumeScanDetails): Self = StObject.set(x, "EbsVolumeScanDetails", value.asInstanceOf[js.Any])
    
    inline def setEbsVolumeScanDetailsUndefined: Self = StObject.set(x, "EbsVolumeScanDetails", js.undefined)
    
    inline def setEventFirstSeen(value: String): Self = StObject.set(x, "EventFirstSeen", value.asInstanceOf[js.Any])
    
    inline def setEventFirstSeenUndefined: Self = StObject.set(x, "EventFirstSeen", js.undefined)
    
    inline def setEventLastSeen(value: String): Self = StObject.set(x, "EventLastSeen", value.asInstanceOf[js.Any])
    
    inline def setEventLastSeenUndefined: Self = StObject.set(x, "EventLastSeen", js.undefined)
    
    inline def setEvidence(value: Evidence): Self = StObject.set(x, "Evidence", value.asInstanceOf[js.Any])
    
    inline def setEvidenceUndefined: Self = StObject.set(x, "Evidence", js.undefined)
    
    inline def setFeatureName(value: String): Self = StObject.set(x, "FeatureName", value.asInstanceOf[js.Any])
    
    inline def setFeatureNameUndefined: Self = StObject.set(x, "FeatureName", js.undefined)
    
    inline def setResourceRole(value: String): Self = StObject.set(x, "ResourceRole", value.asInstanceOf[js.Any])
    
    inline def setResourceRoleUndefined: Self = StObject.set(x, "ResourceRole", js.undefined)
    
    inline def setServiceName(value: String): Self = StObject.set(x, "ServiceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "ServiceName", js.undefined)
    
    inline def setUserFeedback(value: String): Self = StObject.set(x, "UserFeedback", value.asInstanceOf[js.Any])
    
    inline def setUserFeedbackUndefined: Self = StObject.set(x, "UserFeedback", js.undefined)
  }
}
