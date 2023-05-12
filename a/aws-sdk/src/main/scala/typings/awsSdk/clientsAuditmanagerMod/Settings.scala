package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Settings extends StObject {
  
  /**
    *  The default storage destination for assessment reports. 
    */
  var defaultAssessmentReportsDestination: js.UndefOr[AssessmentReportsDestination] = js.undefined
  
  /**
    *  The designated default audit owners. 
    */
  var defaultProcessOwners: js.UndefOr[Roles] = js.undefined
  
  /**
    * The deregistration policy for your Audit Manager data. You can use this attribute to determine how your data is handled when you deregister Audit Manager.
    */
  var deregistrationPolicy: js.UndefOr[DeregistrationPolicy] = js.undefined
  
  /**
    * The current evidence finder status and event data store details.
    */
  var evidenceFinderEnablement: js.UndefOr[EvidenceFinderEnablement] = js.undefined
  
  /**
    *  Specifies whether Organizations is enabled. 
    */
  var isAwsOrgEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  The KMS key details. 
    */
  var kmsKey: js.UndefOr[KmsKey] = js.undefined
  
  /**
    *  The designated Amazon Simple Notification Service (Amazon SNS) topic. 
    */
  var snsTopic: js.UndefOr[SNSTopic] = js.undefined
}
object Settings {
  
  inline def apply(): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
    
    inline def setDefaultAssessmentReportsDestination(value: AssessmentReportsDestination): Self = StObject.set(x, "defaultAssessmentReportsDestination", value.asInstanceOf[js.Any])
    
    inline def setDefaultAssessmentReportsDestinationUndefined: Self = StObject.set(x, "defaultAssessmentReportsDestination", js.undefined)
    
    inline def setDefaultProcessOwners(value: Roles): Self = StObject.set(x, "defaultProcessOwners", value.asInstanceOf[js.Any])
    
    inline def setDefaultProcessOwnersUndefined: Self = StObject.set(x, "defaultProcessOwners", js.undefined)
    
    inline def setDefaultProcessOwnersVarargs(value: Role*): Self = StObject.set(x, "defaultProcessOwners", js.Array(value*))
    
    inline def setDeregistrationPolicy(value: DeregistrationPolicy): Self = StObject.set(x, "deregistrationPolicy", value.asInstanceOf[js.Any])
    
    inline def setDeregistrationPolicyUndefined: Self = StObject.set(x, "deregistrationPolicy", js.undefined)
    
    inline def setEvidenceFinderEnablement(value: EvidenceFinderEnablement): Self = StObject.set(x, "evidenceFinderEnablement", value.asInstanceOf[js.Any])
    
    inline def setEvidenceFinderEnablementUndefined: Self = StObject.set(x, "evidenceFinderEnablement", js.undefined)
    
    inline def setIsAwsOrgEnabled(value: Boolean): Self = StObject.set(x, "isAwsOrgEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsAwsOrgEnabledUndefined: Self = StObject.set(x, "isAwsOrgEnabled", js.undefined)
    
    inline def setKmsKey(value: KmsKey): Self = StObject.set(x, "kmsKey", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyUndefined: Self = StObject.set(x, "kmsKey", js.undefined)
    
    inline def setSnsTopic(value: SNSTopic): Self = StObject.set(x, "snsTopic", value.asInstanceOf[js.Any])
    
    inline def setSnsTopicUndefined: Self = StObject.set(x, "snsTopic", js.undefined)
  }
}
