package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeInfo extends StObject {
  
  /**
    * 
    The start time.
    
    */
  var AddedToClusterTime: js.UndefOr[string] = js.undefined
  
  /**
    * 
    The broker node info.
    
    */
  var BrokerNodeInfo: js.UndefOr[typings.awsSdk.clientsKafkaMod.BrokerNodeInfo] = js.undefined
  
  /**
    * 
    The instance type.
    
    */
  var InstanceType: js.UndefOr[string] = js.undefined
  
  /**
    * 
    The Amazon Resource Name (ARN) of the node.
    
    */
  var NodeARN: js.UndefOr[string] = js.undefined
  
  /**
    * 
    The node type.
    
    */
  var NodeType: js.UndefOr[typings.awsSdk.clientsKafkaMod.NodeType] = js.undefined
  
  /**
    * 
    The ZookeeperNodeInfo.
    
    */
  var ZookeeperNodeInfo: js.UndefOr[typings.awsSdk.clientsKafkaMod.ZookeeperNodeInfo] = js.undefined
}
object NodeInfo {
  
  inline def apply(): NodeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeInfo] (val x: Self) extends AnyVal {
    
    inline def setAddedToClusterTime(value: string): Self = StObject.set(x, "AddedToClusterTime", value.asInstanceOf[js.Any])
    
    inline def setAddedToClusterTimeUndefined: Self = StObject.set(x, "AddedToClusterTime", js.undefined)
    
    inline def setBrokerNodeInfo(value: BrokerNodeInfo): Self = StObject.set(x, "BrokerNodeInfo", value.asInstanceOf[js.Any])
    
    inline def setBrokerNodeInfoUndefined: Self = StObject.set(x, "BrokerNodeInfo", js.undefined)
    
    inline def setInstanceType(value: string): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setNodeARN(value: string): Self = StObject.set(x, "NodeARN", value.asInstanceOf[js.Any])
    
    inline def setNodeARNUndefined: Self = StObject.set(x, "NodeARN", js.undefined)
    
    inline def setNodeType(value: NodeType): Self = StObject.set(x, "NodeType", value.asInstanceOf[js.Any])
    
    inline def setNodeTypeUndefined: Self = StObject.set(x, "NodeType", js.undefined)
    
    inline def setZookeeperNodeInfo(value: ZookeeperNodeInfo): Self = StObject.set(x, "ZookeeperNodeInfo", value.asInstanceOf[js.Any])
    
    inline def setZookeeperNodeInfoUndefined: Self = StObject.set(x, "ZookeeperNodeInfo", js.undefined)
  }
}
