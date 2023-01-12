package typings.awsSdk.clientsIvsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecordingConfigurationSummary extends StObject {
  
  /**
    * Recording-configuration ARN.
    */
  var arn: RecordingConfigurationArn
  
  /**
    * A complex type that contains information about where recorded video will be stored.
    */
  var destinationConfiguration: DestinationConfiguration
  
  /**
    * Recording-configuration name. The value does not need to be unique.
    */
  var name: js.UndefOr[RecordingConfigurationName] = js.undefined
  
  /**
    * Indicates the current state of the recording configuration. When the state is ACTIVE, the configuration is ready for recording a channel stream.
    */
  var state: RecordingConfigurationState
  
  /**
    * Array of 1-50 maps, each of the form string:string (key:value). See Tagging Amazon Web Services Resources for more information, including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon IVS has no service-specific constraints beyond what is documented there.
    */
  var tags: js.UndefOr[Tags] = js.undefined
}
object RecordingConfigurationSummary {
  
  inline def apply(
    arn: RecordingConfigurationArn,
    destinationConfiguration: DestinationConfiguration,
    state: RecordingConfigurationState
  ): RecordingConfigurationSummary = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], destinationConfiguration = destinationConfiguration.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordingConfigurationSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecordingConfigurationSummary] (val x: Self) extends AnyVal {
    
    inline def setArn(value: RecordingConfigurationArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setDestinationConfiguration(value: DestinationConfiguration): Self = StObject.set(x, "destinationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setName(value: RecordingConfigurationName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setState(value: RecordingConfigurationState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
