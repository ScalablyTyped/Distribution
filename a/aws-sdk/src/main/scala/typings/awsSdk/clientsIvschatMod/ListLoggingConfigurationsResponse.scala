package typings.awsSdk.clientsIvschatMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLoggingConfigurationsResponse extends StObject {
  
  /**
    * List of the matching logging configurations (summary information only). There is only one type of destination (cloudWatchLogs, firehose, or s3) in a destinationConfiguration.
    */
  var loggingConfigurations: LoggingConfigurationList
  
  /**
    * If there are more logging configurations than maxResults, use nextToken in the request to get the next set.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListLoggingConfigurationsResponse {
  
  inline def apply(loggingConfigurations: LoggingConfigurationList): ListLoggingConfigurationsResponse = {
    val __obj = js.Dynamic.literal(loggingConfigurations = loggingConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLoggingConfigurationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListLoggingConfigurationsResponse] (val x: Self) extends AnyVal {
    
    inline def setLoggingConfigurations(value: LoggingConfigurationList): Self = StObject.set(x, "loggingConfigurations", value.asInstanceOf[js.Any])
    
    inline def setLoggingConfigurationsVarargs(value: LoggingConfigurationSummary*): Self = StObject.set(x, "loggingConfigurations", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
