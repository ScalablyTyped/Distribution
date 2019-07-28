package typings.awsDashSdk.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkFabricAttributes extends js.Object {
  /**
    * The edition of Amazon Managed Blockchain that Hyperledger Fabric uses. For more information, see Amazon Managed Blockchain Pricing.
    */
  var Edition: js.UndefOr[typings.awsDashSdk.clientsManagedblockchainMod.Edition] = js.undefined
  /**
    * The endpoint of the ordering service for the network.
    */
  var OrderingServiceEndpoint: js.UndefOr[String] = js.undefined
}

object NetworkFabricAttributes {
  @scala.inline
  def apply(Edition: Edition = null, OrderingServiceEndpoint: String = null): NetworkFabricAttributes = {
    val __obj = js.Dynamic.literal()
    if (Edition != null) __obj.updateDynamic("Edition")(Edition.asInstanceOf[js.Any])
    if (OrderingServiceEndpoint != null) __obj.updateDynamic("OrderingServiceEndpoint")(OrderingServiceEndpoint)
    __obj.asInstanceOf[NetworkFabricAttributes]
  }
}

