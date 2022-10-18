package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelImportTaskResult extends StObject {
  
  /**
    * The ID of the task being canceled.
    */
  var ImportTaskId: js.UndefOr[String] = js.undefined
  
  /**
    * The current state of the task being canceled.
    */
  var PreviousState: js.UndefOr[String] = js.undefined
  
  /**
    * The current state of the task being canceled.
    */
  var State: js.UndefOr[String] = js.undefined
}
object CancelImportTaskResult {
  
  inline def apply(): CancelImportTaskResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelImportTaskResult]
  }
  
  extension [Self <: CancelImportTaskResult](x: Self) {
    
    inline def setImportTaskId(value: String): Self = StObject.set(x, "ImportTaskId", value.asInstanceOf[js.Any])
    
    inline def setImportTaskIdUndefined: Self = StObject.set(x, "ImportTaskId", js.undefined)
    
    inline def setPreviousState(value: String): Self = StObject.set(x, "PreviousState", value.asInstanceOf[js.Any])
    
    inline def setPreviousStateUndefined: Self = StObject.set(x, "PreviousState", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
