package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteModelPackageGroupPolicyInput extends StObject {
  
  /**
    * The name of the model group for which to delete the policy.
    */
  var ModelPackageGroupName: EntityName
}
object DeleteModelPackageGroupPolicyInput {
  
  inline def apply(ModelPackageGroupName: EntityName): DeleteModelPackageGroupPolicyInput = {
    val __obj = js.Dynamic.literal(ModelPackageGroupName = ModelPackageGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteModelPackageGroupPolicyInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteModelPackageGroupPolicyInput] (val x: Self) extends AnyVal {
    
    inline def setModelPackageGroupName(value: EntityName): Self = StObject.set(x, "ModelPackageGroupName", value.asInstanceOf[js.Any])
  }
}
