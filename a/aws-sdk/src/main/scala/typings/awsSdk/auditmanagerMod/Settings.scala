package typings.awsSdk.auditmanagerMod

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
  
  extension [Self <: Settings](x: Self) {
    
    inline def setDefaultAssessmentReportsDestination(value: AssessmentReportsDestination): Self = StObject.set(x, "defaultAssessmentReportsDestination", value.asInstanceOf[js.Any])
    
    inline def setDefaultAssessmentReportsDestinationUndefined: Self = StObject.set(x, "defaultAssessmentReportsDestination", js.undefined)
    
    inline def setDefaultProcessOwners(value: Roles): Self = StObject.set(x, "defaultProcessOwners", value.asInstanceOf[js.Any])
    
    inline def setDefaultProcessOwnersUndefined: Self = StObject.set(x, "defaultProcessOwners", js.undefined)
    
    inline def setDefaultProcessOwnersVarargs(value: Role*): Self = StObject.set(x, "defaultProcessOwners", js.Array(value*))
    
    inline def setIsAwsOrgEnabled(value: Boolean): Self = StObject.set(x, "isAwsOrgEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsAwsOrgEnabledUndefined: Self = StObject.set(x, "isAwsOrgEnabled", js.undefined)
    
    inline def setKmsKey(value: KmsKey): Self = StObject.set(x, "kmsKey", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyUndefined: Self = StObject.set(x, "kmsKey", js.undefined)
    
    inline def setSnsTopic(value: SNSTopic): Self = StObject.set(x, "snsTopic", value.asInstanceOf[js.Any])
    
    inline def setSnsTopicUndefined: Self = StObject.set(x, "snsTopic", js.undefined)
  }
}
