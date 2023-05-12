package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateServicePrimaryTaskSetResponse extends StObject {
  
  /**
    * The details about the task set.
    */
  var taskSet: js.UndefOr[TaskSet] = js.undefined
}
object UpdateServicePrimaryTaskSetResponse {
  
  inline def apply(): UpdateServicePrimaryTaskSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateServicePrimaryTaskSetResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateServicePrimaryTaskSetResponse] (val x: Self) extends AnyVal {
    
    inline def setTaskSet(value: TaskSet): Self = StObject.set(x, "taskSet", value.asInstanceOf[js.Any])
    
    inline def setTaskSetUndefined: Self = StObject.set(x, "taskSet", js.undefined)
  }
}
