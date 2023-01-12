package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutResourcePolicyRequest extends StObject {
  
  /**
    * If 'TRUE', indicates that you are using both methods to grant cross-account access to Data Catalog resources:   By directly updating the resource policy with PutResourePolicy    By using the Grant permissions command on the Amazon Web Services Management Console.   Must be set to 'TRUE' if you have already used the Management Console to grant cross-account access, otherwise the call fails. Default is 'FALSE'.
    */
  var EnableHybrid: js.UndefOr[EnableHybridValues] = js.undefined
  
  /**
    * A value of MUST_EXIST is used to update a policy. A value of NOT_EXIST is used to create a new policy. If a value of NONE or a null value is used, the call does not depend on the existence of a policy.
    */
  var PolicyExistsCondition: js.UndefOr[ExistCondition] = js.undefined
  
  /**
    * The hash value returned when the previous policy was set using PutResourcePolicy. Its purpose is to prevent concurrent modifications of a policy. Do not use this parameter if no previous policy has been set.
    */
  var PolicyHashCondition: js.UndefOr[HashString] = js.undefined
  
  /**
    * Contains the policy document to set, in JSON format.
    */
  var PolicyInJson: PolicyJsonString
  
  /**
    * Do not use. For internal use only.
    */
  var ResourceArn: js.UndefOr[GlueResourceArn] = js.undefined
}
object PutResourcePolicyRequest {
  
  inline def apply(PolicyInJson: PolicyJsonString): PutResourcePolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyInJson = PolicyInJson.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutResourcePolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutResourcePolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setEnableHybrid(value: EnableHybridValues): Self = StObject.set(x, "EnableHybrid", value.asInstanceOf[js.Any])
    
    inline def setEnableHybridUndefined: Self = StObject.set(x, "EnableHybrid", js.undefined)
    
    inline def setPolicyExistsCondition(value: ExistCondition): Self = StObject.set(x, "PolicyExistsCondition", value.asInstanceOf[js.Any])
    
    inline def setPolicyExistsConditionUndefined: Self = StObject.set(x, "PolicyExistsCondition", js.undefined)
    
    inline def setPolicyHashCondition(value: HashString): Self = StObject.set(x, "PolicyHashCondition", value.asInstanceOf[js.Any])
    
    inline def setPolicyHashConditionUndefined: Self = StObject.set(x, "PolicyHashCondition", js.undefined)
    
    inline def setPolicyInJson(value: PolicyJsonString): Self = StObject.set(x, "PolicyInJson", value.asInstanceOf[js.Any])
    
    inline def setResourceArn(value: GlueResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
  }
}
