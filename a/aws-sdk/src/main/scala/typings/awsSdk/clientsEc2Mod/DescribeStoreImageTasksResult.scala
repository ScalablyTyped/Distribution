package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStoreImageTasksResult extends StObject {
  
  /**
    * The token to include in another request to get the next page of items. This value is null when there are no more items to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The information about the AMI store tasks.
    */
  var StoreImageTaskResults: js.UndefOr[StoreImageTaskResultSet] = js.undefined
}
object DescribeStoreImageTasksResult {
  
  inline def apply(): DescribeStoreImageTasksResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStoreImageTasksResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeStoreImageTasksResult] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStoreImageTaskResults(value: StoreImageTaskResultSet): Self = StObject.set(x, "StoreImageTaskResults", value.asInstanceOf[js.Any])
    
    inline def setStoreImageTaskResultsUndefined: Self = StObject.set(x, "StoreImageTaskResults", js.undefined)
    
    inline def setStoreImageTaskResultsVarargs(value: StoreImageTaskResult*): Self = StObject.set(x, "StoreImageTaskResults", js.Array(value*))
  }
}
