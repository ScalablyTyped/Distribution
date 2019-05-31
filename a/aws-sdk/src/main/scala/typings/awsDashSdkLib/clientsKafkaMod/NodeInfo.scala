package typings
package awsDashSdkLib.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeInfo extends js.Object {
  /**
    * 
    The start time.
    
    */
  var AddedToClusterTime: js.UndefOr[__string] = js.undefined
  /**
    * 
    The broker node info.
    
    */
  var BrokerNodeInfo: js.UndefOr[BrokerNodeInfo] = js.undefined
  /**
    * 
    The instance type.
    
    */
  var InstanceType: js.UndefOr[__string] = js.undefined
  /**
    * 
    The Amazon Resource Name (ARN) of the node.
    
    */
  var NodeARN: js.UndefOr[__string] = js.undefined
  /**
    * 
    The node type.
    
    */
  var NodeType: js.UndefOr[NodeType] = js.undefined
  /**
    * 
    The ZookeeperNodeInfo.
    
    */
  var ZookeeperNodeInfo: js.UndefOr[ZookeeperNodeInfo] = js.undefined
}

object NodeInfo {
  @scala.inline
  def apply(
    AddedToClusterTime: __string = null,
    BrokerNodeInfo: BrokerNodeInfo = null,
    InstanceType: __string = null,
    NodeARN: __string = null,
    NodeType: NodeType = null,
    ZookeeperNodeInfo: ZookeeperNodeInfo = null
  ): NodeInfo = {
    val __obj = js.Dynamic.literal()
    if (AddedToClusterTime != null) __obj.updateDynamic("AddedToClusterTime")(AddedToClusterTime)
    if (BrokerNodeInfo != null) __obj.updateDynamic("BrokerNodeInfo")(BrokerNodeInfo)
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType)
    if (NodeARN != null) __obj.updateDynamic("NodeARN")(NodeARN)
    if (NodeType != null) __obj.updateDynamic("NodeType")(NodeType.asInstanceOf[js.Any])
    if (ZookeeperNodeInfo != null) __obj.updateDynamic("ZookeeperNodeInfo")(ZookeeperNodeInfo)
    __obj.asInstanceOf[NodeInfo]
  }
}

