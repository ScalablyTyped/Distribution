package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutLoggingOptionsRequest extends StObject {
  
  /**
    * The logging options to set.
    */
  var loggingOptions: LoggingOptions
}
object PutLoggingOptionsRequest {
  
  inline def apply(loggingOptions: LoggingOptions): PutLoggingOptionsRequest = {
    val __obj = js.Dynamic.literal(loggingOptions = loggingOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutLoggingOptionsRequest]
  }
  
  extension [Self <: PutLoggingOptionsRequest](x: Self) {
    
    inline def setLoggingOptions(value: LoggingOptions): Self = StObject.set(x, "loggingOptions", value.asInstanceOf[js.Any])
  }
}
