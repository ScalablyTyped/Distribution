package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeExportImageTasksResult extends StObject {
  
  /**
    * Information about the export image tasks.
    */
  var ExportImageTasks: js.UndefOr[ExportImageTaskList] = js.undefined
  
  /**
    * The token to use to get the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsEc2Mod.NextToken] = js.undefined
}
object DescribeExportImageTasksResult {
  
  inline def apply(): DescribeExportImageTasksResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeExportImageTasksResult]
  }
  
  extension [Self <: DescribeExportImageTasksResult](x: Self) {
    
    inline def setExportImageTasks(value: ExportImageTaskList): Self = StObject.set(x, "ExportImageTasks", value.asInstanceOf[js.Any])
    
    inline def setExportImageTasksUndefined: Self = StObject.set(x, "ExportImageTasks", js.undefined)
    
    inline def setExportImageTasksVarargs(value: ExportImageTask*): Self = StObject.set(x, "ExportImageTasks", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
