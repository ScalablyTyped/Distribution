package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutModelPackageGroupPolicyInput extends StObject {
  
  /**
    * The name of the model group to add a resource policy to.
    */
  var ModelPackageGroupName: EntityName
  
  /**
    * The resource policy for the model group.
    */
  var ResourcePolicy: PolicyString
}
object PutModelPackageGroupPolicyInput {
  
  inline def apply(ModelPackageGroupName: EntityName, ResourcePolicy: PolicyString): PutModelPackageGroupPolicyInput = {
    val __obj = js.Dynamic.literal(ModelPackageGroupName = ModelPackageGroupName.asInstanceOf[js.Any], ResourcePolicy = ResourcePolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutModelPackageGroupPolicyInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutModelPackageGroupPolicyInput] (val x: Self) extends AnyVal {
    
    inline def setModelPackageGroupName(value: EntityName): Self = StObject.set(x, "ModelPackageGroupName", value.asInstanceOf[js.Any])
    
    inline def setResourcePolicy(value: PolicyString): Self = StObject.set(x, "ResourcePolicy", value.asInstanceOf[js.Any])
  }
}
