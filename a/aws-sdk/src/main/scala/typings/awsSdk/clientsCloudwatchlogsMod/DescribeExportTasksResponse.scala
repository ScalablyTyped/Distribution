package typings.awsSdk.clientsCloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeExportTasksResponse extends StObject {
  
  /**
    * The export tasks.
    */
  var exportTasks: js.UndefOr[ExportTasks] = js.undefined
  
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object DescribeExportTasksResponse {
  
  inline def apply(): DescribeExportTasksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeExportTasksResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeExportTasksResponse] (val x: Self) extends AnyVal {
    
    inline def setExportTasks(value: ExportTasks): Self = StObject.set(x, "exportTasks", value.asInstanceOf[js.Any])
    
    inline def setExportTasksUndefined: Self = StObject.set(x, "exportTasks", js.undefined)
    
    inline def setExportTasksVarargs(value: ExportTask*): Self = StObject.set(x, "exportTasks", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
