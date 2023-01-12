package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LambdaFunction extends StObject {
  
  /**
    * The ARN of the Lambda function.
    */
  var arn: LambdaArn
}
object LambdaFunction {
  
  inline def apply(arn: LambdaArn): LambdaFunction = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaFunction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LambdaFunction] (val x: Self) extends AnyVal {
    
    inline def setArn(value: LambdaArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
