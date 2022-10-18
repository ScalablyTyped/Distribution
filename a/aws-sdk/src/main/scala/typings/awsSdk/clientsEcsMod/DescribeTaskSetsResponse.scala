package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTaskSetsResponse extends StObject {
  
  /**
    * Any failures associated with the call.
    */
  var failures: js.UndefOr[Failures] = js.undefined
  
  /**
    * The list of task sets described.
    */
  var taskSets: js.UndefOr[TaskSets] = js.undefined
}
object DescribeTaskSetsResponse {
  
  inline def apply(): DescribeTaskSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTaskSetsResponse]
  }
  
  extension [Self <: DescribeTaskSetsResponse](x: Self) {
    
    inline def setFailures(value: Failures): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
    
    inline def setFailuresUndefined: Self = StObject.set(x, "failures", js.undefined)
    
    inline def setFailuresVarargs(value: Failure*): Self = StObject.set(x, "failures", js.Array(value*))
    
    inline def setTaskSets(value: TaskSets): Self = StObject.set(x, "taskSets", value.asInstanceOf[js.Any])
    
    inline def setTaskSetsUndefined: Self = StObject.set(x, "taskSets", js.undefined)
    
    inline def setTaskSetsVarargs(value: TaskSet*): Self = StObject.set(x, "taskSets", js.Array(value*))
  }
}
