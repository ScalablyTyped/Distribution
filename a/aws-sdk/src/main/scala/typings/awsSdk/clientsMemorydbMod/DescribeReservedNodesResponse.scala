package typings.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeReservedNodesResponse extends StObject {
  
  /**
    * An optional marker returned from a prior request. Use this marker for pagination of results from this operation. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Returns information about reserved nodes for this account, or about a specified reserved node.
    */
  var ReservedNodes: js.UndefOr[ReservedNodeList] = js.undefined
}
object DescribeReservedNodesResponse {
  
  inline def apply(): DescribeReservedNodesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReservedNodesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeReservedNodesResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setReservedNodes(value: ReservedNodeList): Self = StObject.set(x, "ReservedNodes", value.asInstanceOf[js.Any])
    
    inline def setReservedNodesUndefined: Self = StObject.set(x, "ReservedNodes", js.undefined)
    
    inline def setReservedNodesVarargs(value: ReservedNode*): Self = StObject.set(x, "ReservedNodes", js.Array(value*))
  }
}
