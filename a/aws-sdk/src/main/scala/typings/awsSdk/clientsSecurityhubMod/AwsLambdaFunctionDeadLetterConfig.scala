package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsLambdaFunctionDeadLetterConfig extends StObject {
  
  /**
    * The ARN of an SQS queue or SNS topic.
    */
  var TargetArn: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsLambdaFunctionDeadLetterConfig {
  
  inline def apply(): AwsLambdaFunctionDeadLetterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsLambdaFunctionDeadLetterConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsLambdaFunctionDeadLetterConfig] (val x: Self) extends AnyVal {
    
    inline def setTargetArn(value: NonEmptyString): Self = StObject.set(x, "TargetArn", value.asInstanceOf[js.Any])
    
    inline def setTargetArnUndefined: Self = StObject.set(x, "TargetArn", js.undefined)
  }
}
