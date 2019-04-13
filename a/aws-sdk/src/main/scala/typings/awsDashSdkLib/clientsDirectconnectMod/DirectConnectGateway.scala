package typings
package awsDashSdkLib.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectConnectGateway extends js.Object {
  /**
    * The autonomous system number (ASN) for the Amazon side of the connection.
    */
  var amazonSideAsn: js.UndefOr[LongAsn] = js.undefined
  /**
    * The ID of the Direct Connect gateway.
    */
  var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.undefined
  /**
    * The name of the Direct Connect gateway.
    */
  var directConnectGatewayName: js.UndefOr[DirectConnectGatewayName] = js.undefined
  /**
    * The state of the Direct Connect gateway. The following are the possible values:    pending: The initial state after calling CreateDirectConnectGateway.    available: The Direct Connect gateway is ready for use.    deleting: The initial state after calling DeleteDirectConnectGateway.    deleted: The Direct Connect gateway is deleted and cannot pass traffic.  
    */
  var directConnectGatewayState: js.UndefOr[DirectConnectGatewayState] = js.undefined
  /**
    * The ID of the AWS account that owns the Direct Connect gateway.
    */
  var ownerAccount: js.UndefOr[OwnerAccount] = js.undefined
  /**
    * The error message if the state of an object failed to advance.
    */
  var stateChangeError: js.UndefOr[StateChangeError] = js.undefined
}

object DirectConnectGateway {
  @scala.inline
  def apply(
    amazonSideAsn: js.UndefOr[LongAsn] = js.undefined,
    directConnectGatewayId: DirectConnectGatewayId = null,
    directConnectGatewayName: DirectConnectGatewayName = null,
    directConnectGatewayState: DirectConnectGatewayState = null,
    ownerAccount: OwnerAccount = null,
    stateChangeError: StateChangeError = null
  ): DirectConnectGateway = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(amazonSideAsn)) __obj.updateDynamic("amazonSideAsn")(amazonSideAsn)
    if (directConnectGatewayId != null) __obj.updateDynamic("directConnectGatewayId")(directConnectGatewayId)
    if (directConnectGatewayName != null) __obj.updateDynamic("directConnectGatewayName")(directConnectGatewayName)
    if (directConnectGatewayState != null) __obj.updateDynamic("directConnectGatewayState")(directConnectGatewayState.asInstanceOf[js.Any])
    if (ownerAccount != null) __obj.updateDynamic("ownerAccount")(ownerAccount)
    if (stateChangeError != null) __obj.updateDynamic("stateChangeError")(stateChangeError)
    __obj.asInstanceOf[DirectConnectGateway]
  }
}

