package typings.awsSdk.clientsSchedulerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeadLetterConfig extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the SQS queue specified as the destination for the dead-letter queue.
    */
  var Arn: js.UndefOr[DeadLetterConfigArnString] = js.undefined
}
object DeadLetterConfig {
  
  inline def apply(): DeadLetterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeadLetterConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeadLetterConfig] (val x: Self) extends AnyVal {
    
    inline def setArn(value: DeadLetterConfigArnString): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
  }
}
