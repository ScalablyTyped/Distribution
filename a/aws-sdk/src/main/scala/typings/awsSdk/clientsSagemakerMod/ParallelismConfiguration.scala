package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParallelismConfiguration extends StObject {
  
  /**
    * The max number of steps that can be executed in parallel. 
    */
  var MaxParallelExecutionSteps: typings.awsSdk.clientsSagemakerMod.MaxParallelExecutionSteps
}
object ParallelismConfiguration {
  
  inline def apply(MaxParallelExecutionSteps: MaxParallelExecutionSteps): ParallelismConfiguration = {
    val __obj = js.Dynamic.literal(MaxParallelExecutionSteps = MaxParallelExecutionSteps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParallelismConfiguration]
  }
  
  extension [Self <: ParallelismConfiguration](x: Self) {
    
    inline def setMaxParallelExecutionSteps(value: MaxParallelExecutionSteps): Self = StObject.set(x, "MaxParallelExecutionSteps", value.asInstanceOf[js.Any])
  }
}
