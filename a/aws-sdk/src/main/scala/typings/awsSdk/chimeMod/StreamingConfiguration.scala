package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamingConfiguration extends StObject {
  
  /**
    * The retention period, in hours, for the Amazon Kinesis data.
    */
  var DataRetentionInHours: typings.awsSdk.chimeMod.DataRetentionInHours
  
  /**
    * When true, media streaming to Amazon Kinesis is turned off.
    */
  var Disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The streaming notification targets.
    */
  var StreamingNotificationTargets: js.UndefOr[StreamingNotificationTargetList] = js.undefined
}
object StreamingConfiguration {
  
  inline def apply(DataRetentionInHours: DataRetentionInHours): StreamingConfiguration = {
    val __obj = js.Dynamic.literal(DataRetentionInHours = DataRetentionInHours.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamingConfiguration]
  }
  
  extension [Self <: StreamingConfiguration](x: Self) {
    
    inline def setDataRetentionInHours(value: DataRetentionInHours): Self = StObject.set(x, "DataRetentionInHours", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "Disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "Disabled", js.undefined)
    
    inline def setStreamingNotificationTargets(value: StreamingNotificationTargetList): Self = StObject.set(x, "StreamingNotificationTargets", value.asInstanceOf[js.Any])
    
    inline def setStreamingNotificationTargetsUndefined: Self = StObject.set(x, "StreamingNotificationTargets", js.undefined)
    
    inline def setStreamingNotificationTargetsVarargs(value: StreamingNotificationTarget*): Self = StObject.set(x, "StreamingNotificationTargets", js.Array(value*))
  }
}
