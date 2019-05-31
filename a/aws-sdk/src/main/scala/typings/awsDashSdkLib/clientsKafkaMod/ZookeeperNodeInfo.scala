package typings
package awsDashSdkLib.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZookeeperNodeInfo extends js.Object {
  /**
    * 
    The attached elastic network interface of the broker.
    
    */
  var AttachedENIId: js.UndefOr[__string] = js.undefined
  /**
    * 
    The virtual private cloud (VPC) IP address of the client.
    
    */
  var ClientVpcIpAddress: js.UndefOr[__string] = js.undefined
  /**
    * 
    Endpoints for accessing the ZooKeeper.
    
    */
  var Endpoints: js.UndefOr[__listOf__string] = js.undefined
  /**
    * 
    The role-specific ID for Zookeeper.
    
    */
  var ZookeeperId: js.UndefOr[__double] = js.undefined
  /**
    * 
    The version of Zookeeper.
    
    */
  var ZookeeperVersion: js.UndefOr[__string] = js.undefined
}

object ZookeeperNodeInfo {
  @scala.inline
  def apply(
    AttachedENIId: __string = null,
    ClientVpcIpAddress: __string = null,
    Endpoints: __listOf__string = null,
    ZookeeperId: js.UndefOr[__double] = js.undefined,
    ZookeeperVersion: __string = null
  ): ZookeeperNodeInfo = {
    val __obj = js.Dynamic.literal()
    if (AttachedENIId != null) __obj.updateDynamic("AttachedENIId")(AttachedENIId)
    if (ClientVpcIpAddress != null) __obj.updateDynamic("ClientVpcIpAddress")(ClientVpcIpAddress)
    if (Endpoints != null) __obj.updateDynamic("Endpoints")(Endpoints)
    if (!js.isUndefined(ZookeeperId)) __obj.updateDynamic("ZookeeperId")(ZookeeperId)
    if (ZookeeperVersion != null) __obj.updateDynamic("ZookeeperVersion")(ZookeeperVersion)
    __obj.asInstanceOf[ZookeeperNodeInfo]
  }
}

