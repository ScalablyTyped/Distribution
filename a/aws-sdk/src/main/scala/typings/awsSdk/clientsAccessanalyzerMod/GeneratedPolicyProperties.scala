package typings.awsSdk.clientsAccessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeneratedPolicyProperties extends StObject {
  
  /**
    * Lists details about the Trail used to generated policy.
    */
  var cloudTrailProperties: js.UndefOr[CloudTrailProperties] = js.undefined
  
  /**
    * This value is set to true if the generated policy contains all possible actions for a service that IAM Access Analyzer identified from the CloudTrail trail that you specified, and false otherwise.
    */
  var isComplete: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ARN of the IAM entity (user or role) for which you are generating a policy.
    */
  var principalArn: PrincipalArn
}
object GeneratedPolicyProperties {
  
  inline def apply(principalArn: PrincipalArn): GeneratedPolicyProperties = {
    val __obj = js.Dynamic.literal(principalArn = principalArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneratedPolicyProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeneratedPolicyProperties] (val x: Self) extends AnyVal {
    
    inline def setCloudTrailProperties(value: CloudTrailProperties): Self = StObject.set(x, "cloudTrailProperties", value.asInstanceOf[js.Any])
    
    inline def setCloudTrailPropertiesUndefined: Self = StObject.set(x, "cloudTrailProperties", js.undefined)
    
    inline def setIsComplete(value: Boolean): Self = StObject.set(x, "isComplete", value.asInstanceOf[js.Any])
    
    inline def setIsCompleteUndefined: Self = StObject.set(x, "isComplete", js.undefined)
    
    inline def setPrincipalArn(value: PrincipalArn): Self = StObject.set(x, "principalArn", value.asInstanceOf[js.Any])
  }
}
