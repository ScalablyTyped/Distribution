package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDetectMitigationActionsTaskResponse extends StObject {
  
  /**
    *  The description of a task. 
    */
  var taskSummary: js.UndefOr[DetectMitigationActionsTaskSummary] = js.undefined
}
object DescribeDetectMitigationActionsTaskResponse {
  
  inline def apply(): DescribeDetectMitigationActionsTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDetectMitigationActionsTaskResponse]
  }
  
  extension [Self <: DescribeDetectMitigationActionsTaskResponse](x: Self) {
    
    inline def setTaskSummary(value: DetectMitigationActionsTaskSummary): Self = StObject.set(x, "taskSummary", value.asInstanceOf[js.Any])
    
    inline def setTaskSummaryUndefined: Self = StObject.set(x, "taskSummary", js.undefined)
  }
}
