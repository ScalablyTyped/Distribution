package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTriggerResponse extends StObject {
  
  /**
    * The resulting trigger definition.
    */
  var Trigger: js.UndefOr[typings.awsSdk.clientsGlueMod.Trigger] = js.undefined
}
object UpdateTriggerResponse {
  
  inline def apply(): UpdateTriggerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTriggerResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateTriggerResponse] (val x: Self) extends AnyVal {
    
    inline def setTrigger(value: Trigger): Self = StObject.set(x, "Trigger", value.asInstanceOf[js.Any])
    
    inline def setTriggerUndefined: Self = StObject.set(x, "Trigger", js.undefined)
  }
}
