package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutModelPackageGroupPolicyOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the model package group.
    */
  var ModelPackageGroupArn: typings.awsSdk.clientsSagemakerMod.ModelPackageGroupArn
}
object PutModelPackageGroupPolicyOutput {
  
  inline def apply(ModelPackageGroupArn: ModelPackageGroupArn): PutModelPackageGroupPolicyOutput = {
    val __obj = js.Dynamic.literal(ModelPackageGroupArn = ModelPackageGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutModelPackageGroupPolicyOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutModelPackageGroupPolicyOutput] (val x: Self) extends AnyVal {
    
    inline def setModelPackageGroupArn(value: ModelPackageGroupArn): Self = StObject.set(x, "ModelPackageGroupArn", value.asInstanceOf[js.Any])
  }
}
