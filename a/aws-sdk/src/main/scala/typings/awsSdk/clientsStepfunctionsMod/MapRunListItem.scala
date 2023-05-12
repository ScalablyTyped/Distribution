package typings.awsSdk.clientsStepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapRunListItem extends StObject {
  
  /**
    * The executionArn of the execution from which the Map Run was started.
    */
  var executionArn: Arn
  
  /**
    * The Amazon Resource Name (ARN) of the Map Run.
    */
  var mapRunArn: LongArn
  
  /**
    * The date on which the Map Run started.
    */
  var startDate: js.Date
  
  /**
    * The Amazon Resource Name (ARN) of the executed state machine.
    */
  var stateMachineArn: Arn
  
  /**
    * The date on which the Map Run stopped.
    */
  var stopDate: js.UndefOr[js.Date] = js.undefined
}
object MapRunListItem {
  
  inline def apply(executionArn: Arn, mapRunArn: LongArn, startDate: js.Date, stateMachineArn: Arn): MapRunListItem = {
    val __obj = js.Dynamic.literal(executionArn = executionArn.asInstanceOf[js.Any], mapRunArn = mapRunArn.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], stateMachineArn = stateMachineArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapRunListItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MapRunListItem] (val x: Self) extends AnyVal {
    
    inline def setExecutionArn(value: Arn): Self = StObject.set(x, "executionArn", value.asInstanceOf[js.Any])
    
    inline def setMapRunArn(value: LongArn): Self = StObject.set(x, "mapRunArn", value.asInstanceOf[js.Any])
    
    inline def setStartDate(value: js.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStateMachineArn(value: Arn): Self = StObject.set(x, "stateMachineArn", value.asInstanceOf[js.Any])
    
    inline def setStopDate(value: js.Date): Self = StObject.set(x, "stopDate", value.asInstanceOf[js.Any])
    
    inline def setStopDateUndefined: Self = StObject.set(x, "stopDate", js.undefined)
  }
}
