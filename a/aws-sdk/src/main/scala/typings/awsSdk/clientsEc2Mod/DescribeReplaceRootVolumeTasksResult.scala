package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeReplaceRootVolumeTasksResult extends StObject {
  
  /**
    * The token to include in another request to get the next page of items. This value is null when there are no more items to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the root volume replacement task.
    */
  var ReplaceRootVolumeTasks: js.UndefOr[typings.awsSdk.clientsEc2Mod.ReplaceRootVolumeTasks] = js.undefined
}
object DescribeReplaceRootVolumeTasksResult {
  
  inline def apply(): DescribeReplaceRootVolumeTasksResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReplaceRootVolumeTasksResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeReplaceRootVolumeTasksResult] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setReplaceRootVolumeTasks(value: ReplaceRootVolumeTasks): Self = StObject.set(x, "ReplaceRootVolumeTasks", value.asInstanceOf[js.Any])
    
    inline def setReplaceRootVolumeTasksUndefined: Self = StObject.set(x, "ReplaceRootVolumeTasks", js.undefined)
    
    inline def setReplaceRootVolumeTasksVarargs(value: ReplaceRootVolumeTask*): Self = StObject.set(x, "ReplaceRootVolumeTasks", js.Array(value*))
  }
}
