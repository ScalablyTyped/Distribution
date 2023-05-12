package typings.awsSdk.clientsIvschatMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLoggingConfigurationRequest extends StObject {
  
  /**
    * Identifier of the logging configuration to be deleted.
    */
  var identifier: LoggingConfigurationIdentifier
}
object DeleteLoggingConfigurationRequest {
  
  inline def apply(identifier: LoggingConfigurationIdentifier): DeleteLoggingConfigurationRequest = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLoggingConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteLoggingConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setIdentifier(value: LoggingConfigurationIdentifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
  }
}
