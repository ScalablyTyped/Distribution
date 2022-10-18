package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEcrRepositoryLifecyclePolicyDetails extends StObject {
  
  /**
    * The text of the lifecycle policy.
    */
  var LifecyclePolicyText: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The Amazon Web Services account identifier that is associated with the registry that contains the repository.
    */
  var RegistryId: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEcrRepositoryLifecyclePolicyDetails {
  
  inline def apply(): AwsEcrRepositoryLifecyclePolicyDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEcrRepositoryLifecyclePolicyDetails]
  }
  
  extension [Self <: AwsEcrRepositoryLifecyclePolicyDetails](x: Self) {
    
    inline def setLifecyclePolicyText(value: NonEmptyString): Self = StObject.set(x, "LifecyclePolicyText", value.asInstanceOf[js.Any])
    
    inline def setLifecyclePolicyTextUndefined: Self = StObject.set(x, "LifecyclePolicyText", js.undefined)
    
    inline def setRegistryId(value: NonEmptyString): Self = StObject.set(x, "RegistryId", value.asInstanceOf[js.Any])
    
    inline def setRegistryIdUndefined: Self = StObject.set(x, "RegistryId", js.undefined)
  }
}
