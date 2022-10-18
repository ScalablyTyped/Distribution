package typings.awsSdk.clientsAmpMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLoggingConfigurationResponse extends StObject {
  
  /**
    * Metadata object containing information about the logging configuration of a workspace.
    */
  var loggingConfiguration: LoggingConfigurationMetadata
}
object DescribeLoggingConfigurationResponse {
  
  inline def apply(loggingConfiguration: LoggingConfigurationMetadata): DescribeLoggingConfigurationResponse = {
    val __obj = js.Dynamic.literal(loggingConfiguration = loggingConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLoggingConfigurationResponse]
  }
  
  extension [Self <: DescribeLoggingConfigurationResponse](x: Self) {
    
    inline def setLoggingConfiguration(value: LoggingConfigurationMetadata): Self = StObject.set(x, "loggingConfiguration", value.asInstanceOf[js.Any])
  }
}
