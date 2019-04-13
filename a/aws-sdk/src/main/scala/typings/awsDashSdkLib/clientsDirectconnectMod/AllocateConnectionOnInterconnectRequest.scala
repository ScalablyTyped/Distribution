package typings
package awsDashSdkLib.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllocateConnectionOnInterconnectRequest extends js.Object {
  /**
    * The bandwidth of the connection. The possible values are 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps, and 10Gbps. Note that only those AWS Direct Connect Partners who have met specific requirements are allowed to create a 1Gbps, 2Gbps, 5Gbps or 10Gbps hosted connection.
    */
  var bandwidth: Bandwidth
  /**
    * The name of the provisioned connection.
    */
  var connectionName: ConnectionName
  /**
    * The ID of the interconnect on which the connection will be provisioned.
    */
  var interconnectId: InterconnectId
  /**
    * The ID of the AWS account of the customer for whom the connection will be provisioned.
    */
  var ownerAccount: OwnerAccount
  /**
    * The dedicated VLAN provisioned to the connection.
    */
  var vlan: VLAN
}

object AllocateConnectionOnInterconnectRequest {
  @scala.inline
  def apply(
    bandwidth: Bandwidth,
    connectionName: ConnectionName,
    interconnectId: InterconnectId,
    ownerAccount: OwnerAccount,
    vlan: VLAN
  ): AllocateConnectionOnInterconnectRequest = {
    val __obj = js.Dynamic.literal(bandwidth = bandwidth, connectionName = connectionName, interconnectId = interconnectId, ownerAccount = ownerAccount, vlan = vlan)
  
    __obj.asInstanceOf[AllocateConnectionOnInterconnectRequest]
  }
}

