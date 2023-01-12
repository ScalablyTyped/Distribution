package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsLambdaTransformation extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Lambda function.
    */
  var FunctionArn: FunctionArnString
  
  /**
    * Additional JSON that provides supplemental data to the Lambda function used to transform objects.
    */
  var FunctionPayload: js.UndefOr[AwsLambdaTransformationPayload] = js.undefined
}
object AwsLambdaTransformation {
  
  inline def apply(FunctionArn: FunctionArnString): AwsLambdaTransformation = {
    val __obj = js.Dynamic.literal(FunctionArn = FunctionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsLambdaTransformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsLambdaTransformation] (val x: Self) extends AnyVal {
    
    inline def setFunctionArn(value: FunctionArnString): Self = StObject.set(x, "FunctionArn", value.asInstanceOf[js.Any])
    
    inline def setFunctionPayload(value: AwsLambdaTransformationPayload): Self = StObject.set(x, "FunctionPayload", value.asInstanceOf[js.Any])
    
    inline def setFunctionPayloadUndefined: Self = StObject.set(x, "FunctionPayload", js.undefined)
  }
}
