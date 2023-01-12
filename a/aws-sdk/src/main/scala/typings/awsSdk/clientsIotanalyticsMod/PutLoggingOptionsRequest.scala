package typings.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutLoggingOptionsRequest extends StObject {
  
  /**
    * The new values of the IoT Analytics logging options.
    */
  var loggingOptions: LoggingOptions
}
object PutLoggingOptionsRequest {
  
  inline def apply(loggingOptions: LoggingOptions): PutLoggingOptionsRequest = {
    val __obj = js.Dynamic.literal(loggingOptions = loggingOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutLoggingOptionsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutLoggingOptionsRequest] (val x: Self) extends AnyVal {
    
    inline def setLoggingOptions(value: LoggingOptions): Self = StObject.set(x, "loggingOptions", value.asInstanceOf[js.Any])
  }
}
