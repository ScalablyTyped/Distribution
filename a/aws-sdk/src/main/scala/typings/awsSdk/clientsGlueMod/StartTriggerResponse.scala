package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartTriggerResponse extends StObject {
  
  /**
    * The name of the trigger that was started.
    */
  var Name: js.UndefOr[NameString] = js.undefined
}
object StartTriggerResponse {
  
  inline def apply(): StartTriggerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartTriggerResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartTriggerResponse] (val x: Self) extends AnyVal {
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
