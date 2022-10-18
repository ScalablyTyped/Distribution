package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetModelPackageGroupPolicyOutput extends StObject {
  
  /**
    * The resource policy for the model group.
    */
  var ResourcePolicy: PolicyString
}
object GetModelPackageGroupPolicyOutput {
  
  inline def apply(ResourcePolicy: PolicyString): GetModelPackageGroupPolicyOutput = {
    val __obj = js.Dynamic.literal(ResourcePolicy = ResourcePolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetModelPackageGroupPolicyOutput]
  }
  
  extension [Self <: GetModelPackageGroupPolicyOutput](x: Self) {
    
    inline def setResourcePolicy(value: PolicyString): Self = StObject.set(x, "ResourcePolicy", value.asInstanceOf[js.Any])
  }
}
