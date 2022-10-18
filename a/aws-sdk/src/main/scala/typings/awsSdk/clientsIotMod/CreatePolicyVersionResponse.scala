package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePolicyVersionResponse extends StObject {
  
  /**
    * Specifies whether the policy version is the default.
    */
  var isDefaultVersion: js.UndefOr[IsDefaultVersion] = js.undefined
  
  /**
    * The policy ARN.
    */
  var policyArn: js.UndefOr[PolicyArn] = js.undefined
  
  /**
    * The JSON document that describes the policy.
    */
  var policyDocument: js.UndefOr[PolicyDocument] = js.undefined
  
  /**
    * The policy version ID.
    */
  var policyVersionId: js.UndefOr[PolicyVersionId] = js.undefined
}
object CreatePolicyVersionResponse {
  
  inline def apply(): CreatePolicyVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePolicyVersionResponse]
  }
  
  extension [Self <: CreatePolicyVersionResponse](x: Self) {
    
    inline def setIsDefaultVersion(value: IsDefaultVersion): Self = StObject.set(x, "isDefaultVersion", value.asInstanceOf[js.Any])
    
    inline def setIsDefaultVersionUndefined: Self = StObject.set(x, "isDefaultVersion", js.undefined)
    
    inline def setPolicyArn(value: PolicyArn): Self = StObject.set(x, "policyArn", value.asInstanceOf[js.Any])
    
    inline def setPolicyArnUndefined: Self = StObject.set(x, "policyArn", js.undefined)
    
    inline def setPolicyDocument(value: PolicyDocument): Self = StObject.set(x, "policyDocument", value.asInstanceOf[js.Any])
    
    inline def setPolicyDocumentUndefined: Self = StObject.set(x, "policyDocument", js.undefined)
    
    inline def setPolicyVersionId(value: PolicyVersionId): Self = StObject.set(x, "policyVersionId", value.asInstanceOf[js.Any])
    
    inline def setPolicyVersionIdUndefined: Self = StObject.set(x, "policyVersionId", js.undefined)
  }
}
