package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFlowLogsResult extends StObject {
  
  /**
    * Information about the flow logs.
    */
  var FlowLogs: js.UndefOr[FlowLogSet] = js.undefined
  
  /**
    * The token to request the next page of items. This value is null when there are no more items to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeFlowLogsResult {
  
  inline def apply(): DescribeFlowLogsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFlowLogsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeFlowLogsResult] (val x: Self) extends AnyVal {
    
    inline def setFlowLogs(value: FlowLogSet): Self = StObject.set(x, "FlowLogs", value.asInstanceOf[js.Any])
    
    inline def setFlowLogsUndefined: Self = StObject.set(x, "FlowLogs", js.undefined)
    
    inline def setFlowLogsVarargs(value: FlowLog*): Self = StObject.set(x, "FlowLogs", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
