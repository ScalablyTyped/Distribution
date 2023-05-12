package typings.awsCrt.distNativeEventstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisconnectionEvent extends StObject {
  
  /**
    * Native error code.  Convert to a descriptive string with error_code_to_string()
    */
  var errorCode: Double
}
object DisconnectionEvent {
  
  inline def apply(errorCode: Double): DisconnectionEvent = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisconnectionEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisconnectionEvent] (val x: Self) extends AnyVal {
    
    inline def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
  }
}
