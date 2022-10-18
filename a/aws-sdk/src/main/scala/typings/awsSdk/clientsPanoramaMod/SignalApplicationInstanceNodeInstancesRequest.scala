package typings.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignalApplicationInstanceNodeInstancesRequest extends StObject {
  
  /**
    * An application instance ID.
    */
  var ApplicationInstanceId: typings.awsSdk.clientsPanoramaMod.ApplicationInstanceId
  
  /**
    * A list of signals.
    */
  var NodeSignals: NodeSignalList
}
object SignalApplicationInstanceNodeInstancesRequest {
  
  inline def apply(ApplicationInstanceId: ApplicationInstanceId, NodeSignals: NodeSignalList): SignalApplicationInstanceNodeInstancesRequest = {
    val __obj = js.Dynamic.literal(ApplicationInstanceId = ApplicationInstanceId.asInstanceOf[js.Any], NodeSignals = NodeSignals.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignalApplicationInstanceNodeInstancesRequest]
  }
  
  extension [Self <: SignalApplicationInstanceNodeInstancesRequest](x: Self) {
    
    inline def setApplicationInstanceId(value: ApplicationInstanceId): Self = StObject.set(x, "ApplicationInstanceId", value.asInstanceOf[js.Any])
    
    inline def setNodeSignals(value: NodeSignalList): Self = StObject.set(x, "NodeSignals", value.asInstanceOf[js.Any])
    
    inline def setNodeSignalsVarargs(value: NodeSignal*): Self = StObject.set(x, "NodeSignals", js.Array(value*))
  }
}
