package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamingConfiguration extends StObject {
  
  /**
    * The amount of time, in hours, to the Kinesis data.
    */
  var DataRetentionInHours: typings.awsSdk.clientsChimesdkvoiceMod.DataRetentionInHours
  
  /**
    * When true, streaming to Kinesis is off.
    */
  var Disabled: Boolean
  
  /**
    * The call analytics configuration.
    */
  var MediaInsightsConfiguration: js.UndefOr[typings.awsSdk.clientsChimesdkvoiceMod.MediaInsightsConfiguration] = js.undefined
  
  /**
    * The streaming notification targets.
    */
  var StreamingNotificationTargets: js.UndefOr[StreamingNotificationTargetList] = js.undefined
}
object StreamingConfiguration {
  
  inline def apply(DataRetentionInHours: DataRetentionInHours, Disabled: Boolean): StreamingConfiguration = {
    val __obj = js.Dynamic.literal(DataRetentionInHours = DataRetentionInHours.asInstanceOf[js.Any], Disabled = Disabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamingConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StreamingConfiguration] (val x: Self) extends AnyVal {
    
    inline def setDataRetentionInHours(value: DataRetentionInHours): Self = StObject.set(x, "DataRetentionInHours", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "Disabled", value.asInstanceOf[js.Any])
    
    inline def setMediaInsightsConfiguration(value: MediaInsightsConfiguration): Self = StObject.set(x, "MediaInsightsConfiguration", value.asInstanceOf[js.Any])
    
    inline def setMediaInsightsConfigurationUndefined: Self = StObject.set(x, "MediaInsightsConfiguration", js.undefined)
    
    inline def setStreamingNotificationTargets(value: StreamingNotificationTargetList): Self = StObject.set(x, "StreamingNotificationTargets", value.asInstanceOf[js.Any])
    
    inline def setStreamingNotificationTargetsUndefined: Self = StObject.set(x, "StreamingNotificationTargets", js.undefined)
    
    inline def setStreamingNotificationTargetsVarargs(value: StreamingNotificationTarget*): Self = StObject.set(x, "StreamingNotificationTargets", js.Array(value*))
  }
}
