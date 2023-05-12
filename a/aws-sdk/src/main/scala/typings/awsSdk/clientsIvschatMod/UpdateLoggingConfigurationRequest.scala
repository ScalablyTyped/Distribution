package typings.awsSdk.clientsIvschatMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateLoggingConfigurationRequest extends StObject {
  
  /**
    * A complex type that contains a destination configuration for where chat content will be logged. There can be only one type of destination (cloudWatchLogs, firehose, or s3) in a destinationConfiguration.
    */
  var destinationConfiguration: js.UndefOr[DestinationConfiguration] = js.undefined
  
  /**
    * Identifier of the logging configuration to be updated.
    */
  var identifier: LoggingConfigurationIdentifier
  
  /**
    * Logging-configuration name. The value does not need to be unique.
    */
  var name: js.UndefOr[LoggingConfigurationName] = js.undefined
}
object UpdateLoggingConfigurationRequest {
  
  inline def apply(identifier: LoggingConfigurationIdentifier): UpdateLoggingConfigurationRequest = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLoggingConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateLoggingConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setDestinationConfiguration(value: DestinationConfiguration): Self = StObject.set(x, "destinationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDestinationConfigurationUndefined: Self = StObject.set(x, "destinationConfiguration", js.undefined)
    
    inline def setIdentifier(value: LoggingConfigurationIdentifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setName(value: LoggingConfigurationName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
