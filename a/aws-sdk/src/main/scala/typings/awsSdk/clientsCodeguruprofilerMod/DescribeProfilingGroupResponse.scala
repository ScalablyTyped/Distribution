package typings.awsSdk.clientsCodeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeProfilingGroupResponse extends StObject {
  
  /**
    *  The returned  ProfilingGroupDescription  object that contains information about the requested profiling group. 
    */
  var profilingGroup: ProfilingGroupDescription
}
object DescribeProfilingGroupResponse {
  
  inline def apply(profilingGroup: ProfilingGroupDescription): DescribeProfilingGroupResponse = {
    val __obj = js.Dynamic.literal(profilingGroup = profilingGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProfilingGroupResponse]
  }
  
  extension [Self <: DescribeProfilingGroupResponse](x: Self) {
    
    inline def setProfilingGroup(value: ProfilingGroupDescription): Self = StObject.set(x, "profilingGroup", value.asInstanceOf[js.Any])
  }
}
