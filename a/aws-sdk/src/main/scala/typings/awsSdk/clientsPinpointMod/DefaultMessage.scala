package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultMessage extends StObject {
  
  /**
    * The default body of the message.
    */
  var Body: js.UndefOr[string] = js.undefined
  
  /**
    * The default message variables to use in the message. You can override these default variables with individual address variables.
    */
  var Substitutions: js.UndefOr[MapOfListOfString] = js.undefined
}
object DefaultMessage {
  
  inline def apply(): DefaultMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultMessage]
  }
  
  extension [Self <: DefaultMessage](x: Self) {
    
    inline def setBody(value: string): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
    
    inline def setSubstitutions(value: MapOfListOfString): Self = StObject.set(x, "Substitutions", value.asInstanceOf[js.Any])
    
    inline def setSubstitutionsUndefined: Self = StObject.set(x, "Substitutions", js.undefined)
  }
}
