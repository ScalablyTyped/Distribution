package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssessmentFrameworkShareRequest extends StObject {
  
  /**
    *  An optional comment from the sender about the share request. 
    */
  var comment: js.UndefOr[ShareRequestComment] = js.undefined
  
  /**
    * The compliance type that the shared custom framework supports, such as CIS or HIPAA.
    */
  var complianceType: js.UndefOr[ComplianceType] = js.undefined
  
  /**
    *  The time when the share request was created. 
    */
  var creationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The number of custom controls that are part of the shared custom framework.
    */
  var customControlsCount: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    *  The Amazon Web Services account of the recipient. 
    */
  var destinationAccount: js.UndefOr[AccountId] = js.undefined
  
  /**
    *  The Amazon Web Services Region of the recipient. 
    */
  var destinationRegion: js.UndefOr[Region] = js.undefined
  
  /**
    *  The time when the share request expires. 
    */
  var expirationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the shared custom framework.
    */
  var frameworkDescription: js.UndefOr[FrameworkDescription] = js.undefined
  
  /**
    * The unique identifier for the shared custom framework. 
    */
  var frameworkId: js.UndefOr[UUID] = js.undefined
  
  /**
    *  The name of the custom framework that the share request is for. 
    */
  var frameworkName: js.UndefOr[FrameworkName] = js.undefined
  
  /**
    *  The unique identifier for the share request. 
    */
  var id: js.UndefOr[UUID] = js.undefined
  
  /**
    *  Specifies when the share request was last updated. 
    */
  var lastUpdated: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The Amazon Web Services account of the sender. 
    */
  var sourceAccount: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The number of standard controls that are part of the shared custom framework. 
    */
  var standardControlsCount: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    *  The status of the share request. 
    */
  var status: js.UndefOr[ShareRequestStatus] = js.undefined
}
object AssessmentFrameworkShareRequest {
  
  inline def apply(): AssessmentFrameworkShareRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssessmentFrameworkShareRequest]
  }
  
  extension [Self <: AssessmentFrameworkShareRequest](x: Self) {
    
    inline def setComment(value: ShareRequestComment): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setComplianceType(value: ComplianceType): Self = StObject.set(x, "complianceType", value.asInstanceOf[js.Any])
    
    inline def setComplianceTypeUndefined: Self = StObject.set(x, "complianceType", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setCustomControlsCount(value: NullableInteger): Self = StObject.set(x, "customControlsCount", value.asInstanceOf[js.Any])
    
    inline def setCustomControlsCountUndefined: Self = StObject.set(x, "customControlsCount", js.undefined)
    
    inline def setDestinationAccount(value: AccountId): Self = StObject.set(x, "destinationAccount", value.asInstanceOf[js.Any])
    
    inline def setDestinationAccountUndefined: Self = StObject.set(x, "destinationAccount", js.undefined)
    
    inline def setDestinationRegion(value: Region): Self = StObject.set(x, "destinationRegion", value.asInstanceOf[js.Any])
    
    inline def setDestinationRegionUndefined: Self = StObject.set(x, "destinationRegion", js.undefined)
    
    inline def setExpirationTime(value: js.Date): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
    
    inline def setExpirationTimeUndefined: Self = StObject.set(x, "expirationTime", js.undefined)
    
    inline def setFrameworkDescription(value: FrameworkDescription): Self = StObject.set(x, "frameworkDescription", value.asInstanceOf[js.Any])
    
    inline def setFrameworkDescriptionUndefined: Self = StObject.set(x, "frameworkDescription", js.undefined)
    
    inline def setFrameworkId(value: UUID): Self = StObject.set(x, "frameworkId", value.asInstanceOf[js.Any])
    
    inline def setFrameworkIdUndefined: Self = StObject.set(x, "frameworkId", js.undefined)
    
    inline def setFrameworkName(value: FrameworkName): Self = StObject.set(x, "frameworkName", value.asInstanceOf[js.Any])
    
    inline def setFrameworkNameUndefined: Self = StObject.set(x, "frameworkName", js.undefined)
    
    inline def setId(value: UUID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLastUpdated(value: js.Date): Self = StObject.set(x, "lastUpdated", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedUndefined: Self = StObject.set(x, "lastUpdated", js.undefined)
    
    inline def setSourceAccount(value: AccountId): Self = StObject.set(x, "sourceAccount", value.asInstanceOf[js.Any])
    
    inline def setSourceAccountUndefined: Self = StObject.set(x, "sourceAccount", js.undefined)
    
    inline def setStandardControlsCount(value: NullableInteger): Self = StObject.set(x, "standardControlsCount", value.asInstanceOf[js.Any])
    
    inline def setStandardControlsCountUndefined: Self = StObject.set(x, "standardControlsCount", js.undefined)
    
    inline def setStatus(value: ShareRequestStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
