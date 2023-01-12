package typings.awsSdk.clientsEmrcontainersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVirtualClusterResponse extends StObject {
  
  /**
    * This output displays information about the specified virtual cluster.
    */
  var virtualCluster: js.UndefOr[VirtualCluster] = js.undefined
}
object DescribeVirtualClusterResponse {
  
  inline def apply(): DescribeVirtualClusterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVirtualClusterResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeVirtualClusterResponse] (val x: Self) extends AnyVal {
    
    inline def setVirtualCluster(value: VirtualCluster): Self = StObject.set(x, "virtualCluster", value.asInstanceOf[js.Any])
    
    inline def setVirtualClusterUndefined: Self = StObject.set(x, "virtualCluster", js.undefined)
  }
}
