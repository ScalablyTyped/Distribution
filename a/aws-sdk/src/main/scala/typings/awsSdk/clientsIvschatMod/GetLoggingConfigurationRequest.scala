package typings.awsSdk.clientsIvschatMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLoggingConfigurationRequest extends StObject {
  
  /**
    * Identifier of the logging configuration to be retrieved.
    */
  var identifier: LoggingConfigurationIdentifier
}
object GetLoggingConfigurationRequest {
  
  inline def apply(identifier: LoggingConfigurationIdentifier): GetLoggingConfigurationRequest = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLoggingConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetLoggingConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setIdentifier(value: LoggingConfigurationIdentifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
  }
}
