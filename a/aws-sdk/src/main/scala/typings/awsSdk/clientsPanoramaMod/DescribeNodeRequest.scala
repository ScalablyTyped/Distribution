package typings.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeNodeRequest extends StObject {
  
  /**
    * The node's ID.
    */
  var NodeId: typings.awsSdk.clientsPanoramaMod.NodeId
  
  /**
    * The account ID of the node's owner.
    */
  var OwnerAccount: js.UndefOr[PackageOwnerAccount] = js.undefined
}
object DescribeNodeRequest {
  
  inline def apply(NodeId: NodeId): DescribeNodeRequest = {
    val __obj = js.Dynamic.literal(NodeId = NodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeNodeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeNodeRequest] (val x: Self) extends AnyVal {
    
    inline def setNodeId(value: NodeId): Self = StObject.set(x, "NodeId", value.asInstanceOf[js.Any])
    
    inline def setOwnerAccount(value: PackageOwnerAccount): Self = StObject.set(x, "OwnerAccount", value.asInstanceOf[js.Any])
    
    inline def setOwnerAccountUndefined: Self = StObject.set(x, "OwnerAccount", js.undefined)
  }
}
