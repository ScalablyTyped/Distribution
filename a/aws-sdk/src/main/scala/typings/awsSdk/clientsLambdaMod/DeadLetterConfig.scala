package typings.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeadLetterConfig extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of an Amazon SQS queue or Amazon SNS topic.
    */
  var TargetArn: js.UndefOr[ResourceArn] = js.undefined
}
object DeadLetterConfig {
  
  inline def apply(): DeadLetterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeadLetterConfig]
  }
  
  extension [Self <: DeadLetterConfig](x: Self) {
    
    inline def setTargetArn(value: ResourceArn): Self = StObject.set(x, "TargetArn", value.asInstanceOf[js.Any])
    
    inline def setTargetArnUndefined: Self = StObject.set(x, "TargetArn", js.undefined)
  }
}
