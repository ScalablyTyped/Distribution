package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateModelOutput extends StObject {
  
  /**
    * The ARN of the model created in SageMaker.
    */
  var ModelArn: typings.awsSdk.clientsSagemakerMod.ModelArn
}
object CreateModelOutput {
  
  inline def apply(ModelArn: ModelArn): CreateModelOutput = {
    val __obj = js.Dynamic.literal(ModelArn = ModelArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateModelOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateModelOutput] (val x: Self) extends AnyVal {
    
    inline def setModelArn(value: ModelArn): Self = StObject.set(x, "ModelArn", value.asInstanceOf[js.Any])
  }
}
