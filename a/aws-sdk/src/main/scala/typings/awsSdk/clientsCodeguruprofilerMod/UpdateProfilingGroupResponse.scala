package typings.awsSdk.clientsCodeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateProfilingGroupResponse extends StObject {
  
  /**
    *  A  ProfilingGroupDescription  that contains information about the returned updated profiling group. 
    */
  var profilingGroup: ProfilingGroupDescription
}
object UpdateProfilingGroupResponse {
  
  inline def apply(profilingGroup: ProfilingGroupDescription): UpdateProfilingGroupResponse = {
    val __obj = js.Dynamic.literal(profilingGroup = profilingGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProfilingGroupResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateProfilingGroupResponse] (val x: Self) extends AnyVal {
    
    inline def setProfilingGroup(value: ProfilingGroupDescription): Self = StObject.set(x, "profilingGroup", value.asInstanceOf[js.Any])
  }
}
