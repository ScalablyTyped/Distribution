package typings.awsSdk.clientsMigrationhubrefactorspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LambdaEndpointInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Lambda endpoint. 
    */
  var Arn: LambdaArn
}
object LambdaEndpointInput {
  
  inline def apply(Arn: LambdaArn): LambdaEndpointInput = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaEndpointInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LambdaEndpointInput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: LambdaArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
  }
}
