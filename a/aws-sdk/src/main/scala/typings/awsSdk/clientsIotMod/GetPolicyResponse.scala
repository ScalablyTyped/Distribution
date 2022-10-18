package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPolicyResponse extends StObject {
  
  /**
    * The date the policy was created.
    */
  var creationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The default policy version ID.
    */
  var defaultVersionId: js.UndefOr[PolicyVersionId] = js.undefined
  
  /**
    * The generation ID of the policy.
    */
  var generationId: js.UndefOr[GenerationId] = js.undefined
  
  /**
    * The date the policy was last modified.
    */
  var lastModifiedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The policy ARN.
    */
  var policyArn: js.UndefOr[PolicyArn] = js.undefined
  
  /**
    * The JSON document that describes the policy.
    */
  var policyDocument: js.UndefOr[PolicyDocument] = js.undefined
  
  /**
    * The policy name.
    */
  var policyName: js.UndefOr[PolicyName] = js.undefined
}
object GetPolicyResponse {
  
  inline def apply(): GetPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPolicyResponse]
  }
  
  extension [Self <: GetPolicyResponse](x: Self) {
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setDefaultVersionId(value: PolicyVersionId): Self = StObject.set(x, "defaultVersionId", value.asInstanceOf[js.Any])
    
    inline def setDefaultVersionIdUndefined: Self = StObject.set(x, "defaultVersionId", js.undefined)
    
    inline def setGenerationId(value: GenerationId): Self = StObject.set(x, "generationId", value.asInstanceOf[js.Any])
    
    inline def setGenerationIdUndefined: Self = StObject.set(x, "generationId", js.undefined)
    
    inline def setLastModifiedDate(value: js.Date): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateUndefined: Self = StObject.set(x, "lastModifiedDate", js.undefined)
    
    inline def setPolicyArn(value: PolicyArn): Self = StObject.set(x, "policyArn", value.asInstanceOf[js.Any])
    
    inline def setPolicyArnUndefined: Self = StObject.set(x, "policyArn", js.undefined)
    
    inline def setPolicyDocument(value: PolicyDocument): Self = StObject.set(x, "policyDocument", value.asInstanceOf[js.Any])
    
    inline def setPolicyDocumentUndefined: Self = StObject.set(x, "policyDocument", js.undefined)
    
    inline def setPolicyName(value: PolicyName): Self = StObject.set(x, "policyName", value.asInstanceOf[js.Any])
    
    inline def setPolicyNameUndefined: Self = StObject.set(x, "policyName", js.undefined)
  }
}
