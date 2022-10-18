package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateModelPackageGroupOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the model group.
    */
  var ModelPackageGroupArn: typings.awsSdk.clientsSagemakerMod.ModelPackageGroupArn
}
object CreateModelPackageGroupOutput {
  
  inline def apply(ModelPackageGroupArn: ModelPackageGroupArn): CreateModelPackageGroupOutput = {
    val __obj = js.Dynamic.literal(ModelPackageGroupArn = ModelPackageGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateModelPackageGroupOutput]
  }
  
  extension [Self <: CreateModelPackageGroupOutput](x: Self) {
    
    inline def setModelPackageGroupArn(value: ModelPackageGroupArn): Self = StObject.set(x, "ModelPackageGroupArn", value.asInstanceOf[js.Any])
  }
}
