package typings.awsSdk.clientsSsmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutomationExecution extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the automation process.
    */
  var ssmExecutionArn: js.UndefOr[Arn] = js.undefined
}
object AutomationExecution {
  
  inline def apply(): AutomationExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutomationExecution]
  }
  
  extension [Self <: AutomationExecution](x: Self) {
    
    inline def setSsmExecutionArn(value: Arn): Self = StObject.set(x, "ssmExecutionArn", value.asInstanceOf[js.Any])
    
    inline def setSsmExecutionArnUndefined: Self = StObject.set(x, "ssmExecutionArn", js.undefined)
  }
}
