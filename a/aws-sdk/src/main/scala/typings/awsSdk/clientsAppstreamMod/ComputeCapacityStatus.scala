package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComputeCapacityStatus extends StObject {
  
  /**
    * The number of currently available instances that can be used to stream sessions.
    */
  var Available: js.UndefOr[Integer] = js.undefined
  
  /**
    * The desired number of streaming instances.
    */
  var Desired: Integer
  
  /**
    * The number of instances in use for streaming.
    */
  var InUse: js.UndefOr[Integer] = js.undefined
  
  /**
    * The total number of simultaneous streaming instances that are running.
    */
  var Running: js.UndefOr[Integer] = js.undefined
}
object ComputeCapacityStatus {
  
  inline def apply(Desired: Integer): ComputeCapacityStatus = {
    val __obj = js.Dynamic.literal(Desired = Desired.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputeCapacityStatus]
  }
  
  extension [Self <: ComputeCapacityStatus](x: Self) {
    
    inline def setAvailable(value: Integer): Self = StObject.set(x, "Available", value.asInstanceOf[js.Any])
    
    inline def setAvailableUndefined: Self = StObject.set(x, "Available", js.undefined)
    
    inline def setDesired(value: Integer): Self = StObject.set(x, "Desired", value.asInstanceOf[js.Any])
    
    inline def setInUse(value: Integer): Self = StObject.set(x, "InUse", value.asInstanceOf[js.Any])
    
    inline def setInUseUndefined: Self = StObject.set(x, "InUse", js.undefined)
    
    inline def setRunning(value: Integer): Self = StObject.set(x, "Running", value.asInstanceOf[js.Any])
    
    inline def setRunningUndefined: Self = StObject.set(x, "Running", js.undefined)
  }
}
