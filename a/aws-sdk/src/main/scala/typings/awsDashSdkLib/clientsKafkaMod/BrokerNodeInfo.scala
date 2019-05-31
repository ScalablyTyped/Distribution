package typings
package awsDashSdkLib.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrokerNodeInfo extends js.Object {
  /**
    * 
    The attached elastic network interface of the broker.
    
    */
  var AttachedENIId: js.UndefOr[__string] = js.undefined
  /**
    * 
    The ID of the broker.
    
    */
  var BrokerId: js.UndefOr[__double] = js.undefined
  /**
    * 
    The client subnet to which this broker node belongs.
    
    */
  var ClientSubnet: js.UndefOr[__string] = js.undefined
  /**
    * 
    The virtual private cloud (VPC) of the client.
    
    */
  var ClientVpcIpAddress: js.UndefOr[__string] = js.undefined
  /**
    * 
    Information about the version of software currently deployed on the Kafka brokers in the cluster.
    
    */
  var CurrentBrokerSoftwareInfo: js.UndefOr[BrokerSoftwareInfo] = js.undefined
  /**
    * 
    Endpoints for accessing the broker.
    
    */
  var Endpoints: js.UndefOr[__listOf__string] = js.undefined
}

object BrokerNodeInfo {
  @scala.inline
  def apply(
    AttachedENIId: __string = null,
    BrokerId: js.UndefOr[__double] = js.undefined,
    ClientSubnet: __string = null,
    ClientVpcIpAddress: __string = null,
    CurrentBrokerSoftwareInfo: BrokerSoftwareInfo = null,
    Endpoints: __listOf__string = null
  ): BrokerNodeInfo = {
    val __obj = js.Dynamic.literal()
    if (AttachedENIId != null) __obj.updateDynamic("AttachedENIId")(AttachedENIId)
    if (!js.isUndefined(BrokerId)) __obj.updateDynamic("BrokerId")(BrokerId)
    if (ClientSubnet != null) __obj.updateDynamic("ClientSubnet")(ClientSubnet)
    if (ClientVpcIpAddress != null) __obj.updateDynamic("ClientVpcIpAddress")(ClientVpcIpAddress)
    if (CurrentBrokerSoftwareInfo != null) __obj.updateDynamic("CurrentBrokerSoftwareInfo")(CurrentBrokerSoftwareInfo)
    if (Endpoints != null) __obj.updateDynamic("Endpoints")(Endpoints)
    __obj.asInstanceOf[BrokerNodeInfo]
  }
}

