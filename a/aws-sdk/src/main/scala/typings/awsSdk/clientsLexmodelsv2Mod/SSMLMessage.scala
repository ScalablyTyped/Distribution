package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SSMLMessage extends StObject {
  
  /**
    * The SSML text that defines the prompt.
    */
  var value: SSMLMessageValue
}
object SSMLMessage {
  
  inline def apply(value: SSMLMessageValue): SSMLMessage = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SSMLMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SSMLMessage] (val x: Self) extends AnyVal {
    
    inline def setValue(value: SSMLMessageValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
