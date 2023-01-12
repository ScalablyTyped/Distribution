package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTriggerResponse extends StObject {
  
  /**
    * The requested trigger definition.
    */
  var Trigger: js.UndefOr[typings.awsSdk.clientsGlueMod.Trigger] = js.undefined
}
object GetTriggerResponse {
  
  inline def apply(): GetTriggerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTriggerResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetTriggerResponse] (val x: Self) extends AnyVal {
    
    inline def setTrigger(value: Trigger): Self = StObject.set(x, "Trigger", value.asInstanceOf[js.Any])
    
    inline def setTriggerUndefined: Self = StObject.set(x, "Trigger", js.undefined)
  }
}
