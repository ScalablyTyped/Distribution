package typings
package awsDashSdkLib.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllocateHostedConnectionRequest extends js.Object {
  /**
    * The bandwidth of the connection. The possible values are 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps, and 10Gbps. Note that only those AWS Direct Connect Partners who have met specific requirements are allowed to create a 1Gbps, 2Gbps, 5Gbps or 10Gbps hosted connection. 
    */
  var bandwidth: Bandwidth
  /**
    * The ID of the interconnect or LAG.
    */
  var connectionId: ConnectionId
  /**
    * The name of the hosted connection.
    */
  var connectionName: ConnectionName
  /**
    * The ID of the AWS account ID of the customer for the connection.
    */
  var ownerAccount: OwnerAccount
  /**
    * The dedicated VLAN provisioned to the hosted connection.
    */
  var vlan: VLAN
}

object AllocateHostedConnectionRequest {
  @scala.inline
  def apply(
    bandwidth: Bandwidth,
    connectionId: ConnectionId,
    connectionName: ConnectionName,
    ownerAccount: OwnerAccount,
    vlan: VLAN
  ): AllocateHostedConnectionRequest = {
    val __obj = js.Dynamic.literal(bandwidth = bandwidth, connectionId = connectionId, connectionName = connectionName, ownerAccount = ownerAccount, vlan = vlan)
  
    __obj.asInstanceOf[AllocateHostedConnectionRequest]
  }
}

