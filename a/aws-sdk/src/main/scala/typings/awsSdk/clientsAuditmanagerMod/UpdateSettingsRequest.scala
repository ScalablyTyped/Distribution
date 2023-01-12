package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSettingsRequest extends StObject {
  
  /**
    *  The default storage destination for assessment reports. 
    */
  var defaultAssessmentReportsDestination: js.UndefOr[AssessmentReportsDestination] = js.undefined
  
  /**
    *  A list of the default audit owners. 
    */
  var defaultProcessOwners: js.UndefOr[Roles] = js.undefined
  
  /**
    *  The KMS key details. 
    */
  var kmsKey: js.UndefOr[KmsKey] = js.undefined
  
  /**
    *  The Amazon Simple Notification Service (Amazon SNS) topic that Audit Manager sends notifications to. 
    */
  var snsTopic: js.UndefOr[SnsArn] = js.undefined
}
object UpdateSettingsRequest {
  
  inline def apply(): UpdateSettingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSettingsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateSettingsRequest] (val x: Self) extends AnyVal {
    
    inline def setDefaultAssessmentReportsDestination(value: AssessmentReportsDestination): Self = StObject.set(x, "defaultAssessmentReportsDestination", value.asInstanceOf[js.Any])
    
    inline def setDefaultAssessmentReportsDestinationUndefined: Self = StObject.set(x, "defaultAssessmentReportsDestination", js.undefined)
    
    inline def setDefaultProcessOwners(value: Roles): Self = StObject.set(x, "defaultProcessOwners", value.asInstanceOf[js.Any])
    
    inline def setDefaultProcessOwnersUndefined: Self = StObject.set(x, "defaultProcessOwners", js.undefined)
    
    inline def setDefaultProcessOwnersVarargs(value: Role*): Self = StObject.set(x, "defaultProcessOwners", js.Array(value*))
    
    inline def setKmsKey(value: KmsKey): Self = StObject.set(x, "kmsKey", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyUndefined: Self = StObject.set(x, "kmsKey", js.undefined)
    
    inline def setSnsTopic(value: SnsArn): Self = StObject.set(x, "snsTopic", value.asInstanceOf[js.Any])
    
    inline def setSnsTopicUndefined: Self = StObject.set(x, "snsTopic", js.undefined)
  }
}
