package typings.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComputeResourceUpdate extends StObject {
  
  /**
    * The desired number of Amazon EC2 vCPUS in the compute environment.
    */
  var desiredvCpus: js.UndefOr[Integer] = js.native
  
  /**
    * The maximum number of Amazon EC2 vCPUs that an environment can reach.
    */
  var maxvCpus: js.UndefOr[Integer] = js.native
  
  /**
    * The minimum number of Amazon EC2 vCPUs that an environment should maintain.
    */
  var minvCpus: js.UndefOr[Integer] = js.native
}
object ComputeResourceUpdate {
  
  @scala.inline
  def apply(): ComputeResourceUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComputeResourceUpdate]
  }
  
  @scala.inline
  implicit class ComputeResourceUpdateMutableBuilder[Self <: ComputeResourceUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDesiredvCpus(value: Integer): Self = StObject.set(x, "desiredvCpus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredvCpusUndefined: Self = StObject.set(x, "desiredvCpus", js.undefined)
    
    @scala.inline
    def setMaxvCpus(value: Integer): Self = StObject.set(x, "maxvCpus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxvCpusUndefined: Self = StObject.set(x, "maxvCpus", js.undefined)
    
    @scala.inline
    def setMinvCpus(value: Integer): Self = StObject.set(x, "minvCpus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinvCpusUndefined: Self = StObject.set(x, "minvCpus", js.undefined)
  }
}
