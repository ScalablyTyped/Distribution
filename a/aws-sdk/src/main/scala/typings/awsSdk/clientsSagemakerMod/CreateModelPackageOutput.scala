package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateModelPackageOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the new model package.
    */
  var ModelPackageArn: typings.awsSdk.clientsSagemakerMod.ModelPackageArn
}
object CreateModelPackageOutput {
  
  inline def apply(ModelPackageArn: ModelPackageArn): CreateModelPackageOutput = {
    val __obj = js.Dynamic.literal(ModelPackageArn = ModelPackageArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateModelPackageOutput]
  }
  
  extension [Self <: CreateModelPackageOutput](x: Self) {
    
    inline def setModelPackageArn(value: ModelPackageArn): Self = StObject.set(x, "ModelPackageArn", value.asInstanceOf[js.Any])
  }
}
