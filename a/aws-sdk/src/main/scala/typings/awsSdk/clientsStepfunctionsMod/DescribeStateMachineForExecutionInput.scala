package typings.awsSdk.clientsStepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStateMachineForExecutionInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the execution you want state machine information for.
    */
  var executionArn: Arn
}
object DescribeStateMachineForExecutionInput {
  
  inline def apply(executionArn: Arn): DescribeStateMachineForExecutionInput = {
    val __obj = js.Dynamic.literal(executionArn = executionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStateMachineForExecutionInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeStateMachineForExecutionInput] (val x: Self) extends AnyVal {
    
    inline def setExecutionArn(value: Arn): Self = StObject.set(x, "executionArn", value.asInstanceOf[js.Any])
  }
}
