package typings.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComputeResourceUpdate extends StObject {
  
  /**
    * The desired number of Amazon EC2 vCPUS in the compute environment.
    */
  var desiredvCpus: js.UndefOr[Integer] = js.undefined
  
  /**
    * The maximum number of Amazon EC2 vCPUs that an environment can reach.
    */
  var maxvCpus: js.UndefOr[Integer] = js.undefined
  
  /**
    * The minimum number of Amazon EC2 vCPUs that an environment should maintain.
    */
  var minvCpus: js.UndefOr[Integer] = js.undefined
}
object ComputeResourceUpdate {
  
  inline def apply(): ComputeResourceUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComputeResourceUpdate]
  }
  
  extension [Self <: ComputeResourceUpdate](x: Self) {
    
    inline def setDesiredvCpus(value: Integer): Self = StObject.set(x, "desiredvCpus", value.asInstanceOf[js.Any])
    
    inline def setDesiredvCpusUndefined: Self = StObject.set(x, "desiredvCpus", js.undefined)
    
    inline def setMaxvCpus(value: Integer): Self = StObject.set(x, "maxvCpus", value.asInstanceOf[js.Any])
    
    inline def setMaxvCpusUndefined: Self = StObject.set(x, "maxvCpus", js.undefined)
    
    inline def setMinvCpus(value: Integer): Self = StObject.set(x, "minvCpus", value.asInstanceOf[js.Any])
    
    inline def setMinvCpusUndefined: Self = StObject.set(x, "minvCpus", js.undefined)
  }
}
