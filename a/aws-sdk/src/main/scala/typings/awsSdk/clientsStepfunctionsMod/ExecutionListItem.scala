package typings.awsSdk.clientsStepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecutionListItem extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that identifies the execution.
    */
  var executionArn: Arn
  
  /**
    * The total number of items processed in a child workflow execution. This field is returned only if mapRunArn was specified in the ListExecutions API action. If stateMachineArn was specified in ListExecutions, the itemCount field isn't returned.
    */
  var itemCount: js.UndefOr[UnsignedInteger] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of a Map Run. This field is returned only if mapRunArn was specified in the ListExecutions API action. If stateMachineArn was specified in ListExecutions, the mapRunArn isn't returned.
    */
  var mapRunArn: js.UndefOr[LongArn] = js.undefined
  
  /**
    * The name of the execution. A name must not contain:   white space   brackets &lt; &gt; { } [ ]    wildcard characters ? *    special characters " # % \ ^ | ~ ` $ &amp; , ; : /    control characters (U+0000-001F, U+007F-009F)   To enable logging with CloudWatch Logs, the name should only contain 0-9, A-Z, a-z, - and _.
    */
  var name: Name
  
  /**
    * The date the execution started.
    */
  var startDate: js.Date
  
  /**
    * The Amazon Resource Name (ARN) of the executed state machine.
    */
  var stateMachineArn: Arn
  
  /**
    * The current status of the execution.
    */
  var status: ExecutionStatus
  
  /**
    * If the execution already ended, the date the execution stopped.
    */
  var stopDate: js.UndefOr[js.Date] = js.undefined
}
object ExecutionListItem {
  
  inline def apply(executionArn: Arn, name: Name, startDate: js.Date, stateMachineArn: Arn, status: ExecutionStatus): ExecutionListItem = {
    val __obj = js.Dynamic.literal(executionArn = executionArn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], stateMachineArn = stateMachineArn.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionListItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExecutionListItem] (val x: Self) extends AnyVal {
    
    inline def setExecutionArn(value: Arn): Self = StObject.set(x, "executionArn", value.asInstanceOf[js.Any])
    
    inline def setItemCount(value: UnsignedInteger): Self = StObject.set(x, "itemCount", value.asInstanceOf[js.Any])
    
    inline def setItemCountUndefined: Self = StObject.set(x, "itemCount", js.undefined)
    
    inline def setMapRunArn(value: LongArn): Self = StObject.set(x, "mapRunArn", value.asInstanceOf[js.Any])
    
    inline def setMapRunArnUndefined: Self = StObject.set(x, "mapRunArn", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStartDate(value: js.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStateMachineArn(value: Arn): Self = StObject.set(x, "stateMachineArn", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ExecutionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStopDate(value: js.Date): Self = StObject.set(x, "stopDate", value.asInstanceOf[js.Any])
    
    inline def setStopDateUndefined: Self = StObject.set(x, "stopDate", js.undefined)
  }
}
