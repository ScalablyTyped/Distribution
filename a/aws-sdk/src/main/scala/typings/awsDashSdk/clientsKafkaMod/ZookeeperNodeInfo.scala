package typings.awsDashSdk.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZookeeperNodeInfo extends js.Object {
  /**
    * 
    The attached elastic network interface of the broker.
    
    */
  var AttachedENIId: js.UndefOr[__string] = js.native
  /**
    * 
    The virtual private cloud (VPC) IP address of the client.
    
    */
  var ClientVpcIpAddress: js.UndefOr[__string] = js.native
  /**
    * 
    Endpoints for accessing the ZooKeeper.
    
    */
  var Endpoints: js.UndefOr[__listOf__string] = js.native
  /**
    * 
    The role-specific ID for Zookeeper.
    
    */
  var ZookeeperId: js.UndefOr[__double] = js.native
  /**
    * 
    The version of Zookeeper.
    
    */
  var ZookeeperVersion: js.UndefOr[__string] = js.native
}

object ZookeeperNodeInfo {
  @scala.inline
  def apply(
    AttachedENIId: __string = null,
    ClientVpcIpAddress: __string = null,
    Endpoints: __listOf__string = null,
    ZookeeperId: Int | Double = null,
    ZookeeperVersion: __string = null
  ): ZookeeperNodeInfo = {
    val __obj = js.Dynamic.literal()
    if (AttachedENIId != null) __obj.updateDynamic("AttachedENIId")(AttachedENIId.asInstanceOf[js.Any])
    if (ClientVpcIpAddress != null) __obj.updateDynamic("ClientVpcIpAddress")(ClientVpcIpAddress.asInstanceOf[js.Any])
    if (Endpoints != null) __obj.updateDynamic("Endpoints")(Endpoints.asInstanceOf[js.Any])
    if (ZookeeperId != null) __obj.updateDynamic("ZookeeperId")(ZookeeperId.asInstanceOf[js.Any])
    if (ZookeeperVersion != null) __obj.updateDynamic("ZookeeperVersion")(ZookeeperVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZookeeperNodeInfo]
  }
}

