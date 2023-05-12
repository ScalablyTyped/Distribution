package typings.awsSdk.clientsOsisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogPublishingOptions extends StObject {
  
  /**
    * The destination for OpenSearch Ingestion logs sent to Amazon CloudWatch Logs. This parameter is required if IsLoggingEnabled is set to true.
    */
  var CloudWatchLogDestination: js.UndefOr[typings.awsSdk.clientsOsisMod.CloudWatchLogDestination] = js.undefined
  
  /**
    * Whether logs should be published.
    */
  var IsLoggingEnabled: js.UndefOr[Boolean] = js.undefined
}
object LogPublishingOptions {
  
  inline def apply(): LogPublishingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogPublishingOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LogPublishingOptions] (val x: Self) extends AnyVal {
    
    inline def setCloudWatchLogDestination(value: CloudWatchLogDestination): Self = StObject.set(x, "CloudWatchLogDestination", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLogDestinationUndefined: Self = StObject.set(x, "CloudWatchLogDestination", js.undefined)
    
    inline def setIsLoggingEnabled(value: Boolean): Self = StObject.set(x, "IsLoggingEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsLoggingEnabledUndefined: Self = StObject.set(x, "IsLoggingEnabled", js.undefined)
  }
}
