package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeImportSnapshotTasksResult extends StObject {
  
  /**
    * A list of zero or more import snapshot tasks that are currently active or were completed or canceled in the previous 7 days.
    */
  var ImportSnapshotTasks: js.UndefOr[ImportSnapshotTaskList] = js.undefined
  
  /**
    * The token to use to get the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeImportSnapshotTasksResult {
  
  inline def apply(): DescribeImportSnapshotTasksResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeImportSnapshotTasksResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeImportSnapshotTasksResult] (val x: Self) extends AnyVal {
    
    inline def setImportSnapshotTasks(value: ImportSnapshotTaskList): Self = StObject.set(x, "ImportSnapshotTasks", value.asInstanceOf[js.Any])
    
    inline def setImportSnapshotTasksUndefined: Self = StObject.set(x, "ImportSnapshotTasks", js.undefined)
    
    inline def setImportSnapshotTasksVarargs(value: ImportSnapshotTask*): Self = StObject.set(x, "ImportSnapshotTasks", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
