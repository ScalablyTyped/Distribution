package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComputeCapacityStatus extends StObject {
  
  /**
    * The number of currently available instances that can be used to stream sessions.
    */
  var Available: js.UndefOr[Integer] = js.native
  
  /**
    * The desired number of streaming instances.
    */
  var Desired: Integer = js.native
  
  /**
    * The number of instances in use for streaming.
    */
  var InUse: js.UndefOr[Integer] = js.native
  
  /**
    * The total number of simultaneous streaming instances that are running.
    */
  var Running: js.UndefOr[Integer] = js.native
}
object ComputeCapacityStatus {
  
  @scala.inline
  def apply(Desired: Integer): ComputeCapacityStatus = {
    val __obj = js.Dynamic.literal(Desired = Desired.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputeCapacityStatus]
  }
  
  @scala.inline
  implicit class ComputeCapacityStatusMutableBuilder[Self <: ComputeCapacityStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailable(value: Integer): Self = StObject.set(x, "Available", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailableUndefined: Self = StObject.set(x, "Available", js.undefined)
    
    @scala.inline
    def setDesired(value: Integer): Self = StObject.set(x, "Desired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInUse(value: Integer): Self = StObject.set(x, "InUse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInUseUndefined: Self = StObject.set(x, "InUse", js.undefined)
    
    @scala.inline
    def setRunning(value: Integer): Self = StObject.set(x, "Running", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunningUndefined: Self = StObject.set(x, "Running", js.undefined)
  }
}
