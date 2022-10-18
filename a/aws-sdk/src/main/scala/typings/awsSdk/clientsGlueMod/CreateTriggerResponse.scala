package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTriggerResponse extends StObject {
  
  /**
    * The name of the trigger.
    */
  var Name: js.UndefOr[NameString] = js.undefined
}
object CreateTriggerResponse {
  
  inline def apply(): CreateTriggerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTriggerResponse]
  }
  
  extension [Self <: CreateTriggerResponse](x: Self) {
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
