package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopTriggerResponse extends StObject {
  
  /**
    * The name of the trigger that was stopped.
    */
  var Name: js.UndefOr[NameString] = js.undefined
}
object StopTriggerResponse {
  
  inline def apply(): StopTriggerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopTriggerResponse]
  }
  
  extension [Self <: StopTriggerResponse](x: Self) {
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
