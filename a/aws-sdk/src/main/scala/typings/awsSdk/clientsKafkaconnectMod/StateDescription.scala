package typings.awsSdk.clientsKafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StateDescription extends StObject {
  
  /**
    * A code that describes the state of a resource.
    */
  var code: js.UndefOr[string] = js.undefined
  
  /**
    * A message that describes the state of a resource.
    */
  var message: js.UndefOr[string] = js.undefined
}
object StateDescription {
  
  inline def apply(): StateDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StateDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StateDescription] (val x: Self) extends AnyVal {
    
    inline def setCode(value: string): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setMessage(value: string): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
