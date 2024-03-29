package typings.awsSdk.clientsIvschatMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLoggingConfigurationResponse extends StObject {
  
  /**
    * Logging-configuration ARN, from the request (if identifier was an ARN).
    */
  var arn: js.UndefOr[LoggingConfigurationArn] = js.undefined
  
  /**
    * Time when the logging configuration was created. This is an ISO 8601 timestamp; note that this is returned as a string.
    */
  var createTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A complex type that contains a destination configuration for where chat content will be logged. There is only one type of destination (cloudWatchLogs, firehose, or s3) in a destinationConfiguration.
    */
  var destinationConfiguration: js.UndefOr[DestinationConfiguration] = js.undefined
  
  /**
    * Logging-configuration ID, generated by the system. This is a relative identifier, the part of the ARN that uniquely identifies the logging configuration.
    */
  var id: js.UndefOr[LoggingConfigurationID] = js.undefined
  
  /**
    * Logging-configuration name. This value does not need to be unique.
    */
  var name: js.UndefOr[LoggingConfigurationName] = js.undefined
  
  /**
    * The state of the logging configuration. When the state is ACTIVE, the configuration is ready to log chat content.
    */
  var state: js.UndefOr[LoggingConfigurationState] = js.undefined
  
  /**
    * Tags attached to the resource. Array of maps, each of the form string:string (key:value).
    */
  var tags: js.UndefOr[Tags] = js.undefined
  
  /**
    * Time of the logging configuration’s last update. This is an ISO 8601 timestamp; note that this is returned as a string.
    */
  var updateTime: js.UndefOr[js.Date] = js.undefined
}
object GetLoggingConfigurationResponse {
  
  inline def apply(): GetLoggingConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLoggingConfigurationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetLoggingConfigurationResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: LoggingConfigurationArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDestinationConfiguration(value: DestinationConfiguration): Self = StObject.set(x, "destinationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDestinationConfigurationUndefined: Self = StObject.set(x, "destinationConfiguration", js.undefined)
    
    inline def setId(value: LoggingConfigurationID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: LoggingConfigurationName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setState(value: LoggingConfigurationState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setUpdateTime(value: js.Date): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
