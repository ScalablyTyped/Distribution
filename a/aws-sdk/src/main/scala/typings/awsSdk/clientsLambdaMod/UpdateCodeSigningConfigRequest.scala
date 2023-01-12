package typings.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCodeSigningConfigRequest extends StObject {
  
  /**
    * Signing profiles for this code signing configuration.
    */
  var AllowedPublishers: js.UndefOr[typings.awsSdk.clientsLambdaMod.AllowedPublishers] = js.undefined
  
  /**
    * The The Amazon Resource Name (ARN) of the code signing configuration.
    */
  var CodeSigningConfigArn: typings.awsSdk.clientsLambdaMod.CodeSigningConfigArn
  
  /**
    * The code signing policy.
    */
  var CodeSigningPolicies: js.UndefOr[typings.awsSdk.clientsLambdaMod.CodeSigningPolicies] = js.undefined
  
  /**
    * Descriptive name for this code signing configuration.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsLambdaMod.Description] = js.undefined
}
object UpdateCodeSigningConfigRequest {
  
  inline def apply(CodeSigningConfigArn: CodeSigningConfigArn): UpdateCodeSigningConfigRequest = {
    val __obj = js.Dynamic.literal(CodeSigningConfigArn = CodeSigningConfigArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCodeSigningConfigRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateCodeSigningConfigRequest] (val x: Self) extends AnyVal {
    
    inline def setAllowedPublishers(value: AllowedPublishers): Self = StObject.set(x, "AllowedPublishers", value.asInstanceOf[js.Any])
    
    inline def setAllowedPublishersUndefined: Self = StObject.set(x, "AllowedPublishers", js.undefined)
    
    inline def setCodeSigningConfigArn(value: CodeSigningConfigArn): Self = StObject.set(x, "CodeSigningConfigArn", value.asInstanceOf[js.Any])
    
    inline def setCodeSigningPolicies(value: CodeSigningPolicies): Self = StObject.set(x, "CodeSigningPolicies", value.asInstanceOf[js.Any])
    
    inline def setCodeSigningPoliciesUndefined: Self = StObject.set(x, "CodeSigningPolicies", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
  }
}
