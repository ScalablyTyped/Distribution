package typings.awsSdk.clientsKinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnhancedMonitoringOutput extends StObject {
  
  /**
    * Represents the current state of the metrics that are in the enhanced state before the operation.
    */
  var CurrentShardLevelMetrics: js.UndefOr[MetricsNameList] = js.undefined
  
  /**
    * Represents the list of all the metrics that would be in the enhanced state after the operation.
    */
  var DesiredShardLevelMetrics: js.UndefOr[MetricsNameList] = js.undefined
  
  /**
    * The ARN of the stream.
    */
  var StreamARN: js.UndefOr[typings.awsSdk.clientsKinesisMod.StreamARN] = js.undefined
  
  /**
    * The name of the Kinesis data stream.
    */
  var StreamName: js.UndefOr[typings.awsSdk.clientsKinesisMod.StreamName] = js.undefined
}
object EnhancedMonitoringOutput {
  
  inline def apply(): EnhancedMonitoringOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnhancedMonitoringOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnhancedMonitoringOutput] (val x: Self) extends AnyVal {
    
    inline def setCurrentShardLevelMetrics(value: MetricsNameList): Self = StObject.set(x, "CurrentShardLevelMetrics", value.asInstanceOf[js.Any])
    
    inline def setCurrentShardLevelMetricsUndefined: Self = StObject.set(x, "CurrentShardLevelMetrics", js.undefined)
    
    inline def setCurrentShardLevelMetricsVarargs(value: MetricsName*): Self = StObject.set(x, "CurrentShardLevelMetrics", js.Array(value*))
    
    inline def setDesiredShardLevelMetrics(value: MetricsNameList): Self = StObject.set(x, "DesiredShardLevelMetrics", value.asInstanceOf[js.Any])
    
    inline def setDesiredShardLevelMetricsUndefined: Self = StObject.set(x, "DesiredShardLevelMetrics", js.undefined)
    
    inline def setDesiredShardLevelMetricsVarargs(value: MetricsName*): Self = StObject.set(x, "DesiredShardLevelMetrics", js.Array(value*))
    
    inline def setStreamARN(value: StreamARN): Self = StObject.set(x, "StreamARN", value.asInstanceOf[js.Any])
    
    inline def setStreamARNUndefined: Self = StObject.set(x, "StreamARN", js.undefined)
    
    inline def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
    
    inline def setStreamNameUndefined: Self = StObject.set(x, "StreamName", js.undefined)
  }
}
