package typings.awsSdk.clientsCodeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteProfilingGroupRequest extends StObject {
  
  /**
    * The name of the profiling group to delete.
    */
  var profilingGroupName: ProfilingGroupName
}
object DeleteProfilingGroupRequest {
  
  inline def apply(profilingGroupName: ProfilingGroupName): DeleteProfilingGroupRequest = {
    val __obj = js.Dynamic.literal(profilingGroupName = profilingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProfilingGroupRequest]
  }
  
  extension [Self <: DeleteProfilingGroupRequest](x: Self) {
    
    inline def setProfilingGroupName(value: ProfilingGroupName): Self = StObject.set(x, "profilingGroupName", value.asInstanceOf[js.Any])
  }
}
