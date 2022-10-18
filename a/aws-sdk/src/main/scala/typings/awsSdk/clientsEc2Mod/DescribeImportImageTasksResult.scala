package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeImportImageTasksResult extends StObject {
  
  /**
    * A list of zero or more import image tasks that are currently active or were completed or canceled in the previous 7 days.
    */
  var ImportImageTasks: js.UndefOr[ImportImageTaskList] = js.undefined
  
  /**
    * The token to use to get the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeImportImageTasksResult {
  
  inline def apply(): DescribeImportImageTasksResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeImportImageTasksResult]
  }
  
  extension [Self <: DescribeImportImageTasksResult](x: Self) {
    
    inline def setImportImageTasks(value: ImportImageTaskList): Self = StObject.set(x, "ImportImageTasks", value.asInstanceOf[js.Any])
    
    inline def setImportImageTasksUndefined: Self = StObject.set(x, "ImportImageTasks", js.undefined)
    
    inline def setImportImageTasksVarargs(value: ImportImageTask*): Self = StObject.set(x, "ImportImageTasks", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
