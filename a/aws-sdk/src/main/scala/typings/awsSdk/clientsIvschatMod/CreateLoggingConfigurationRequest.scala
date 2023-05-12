package typings.awsSdk.clientsIvschatMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLoggingConfigurationRequest extends StObject {
  
  /**
    * A complex type that contains a destination configuration for where chat content will be logged. There can be only one type of destination (cloudWatchLogs, firehose, or s3) in a destinationConfiguration.
    */
  var destinationConfiguration: DestinationConfiguration
  
  /**
    * Logging-configuration name. The value does not need to be unique.
    */
  var name: js.UndefOr[LoggingConfigurationName] = js.undefined
  
  /**
    * Tags to attach to the resource. Array of maps, each of the form string:string (key:value). See Tagging AWS Resources for details, including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon IVS Chat has no constraints on tags beyond what is documented there.
    */
  var tags: js.UndefOr[Tags] = js.undefined
}
object CreateLoggingConfigurationRequest {
  
  inline def apply(destinationConfiguration: DestinationConfiguration): CreateLoggingConfigurationRequest = {
    val __obj = js.Dynamic.literal(destinationConfiguration = destinationConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLoggingConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateLoggingConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setDestinationConfiguration(value: DestinationConfiguration): Self = StObject.set(x, "destinationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setName(value: LoggingConfigurationName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
