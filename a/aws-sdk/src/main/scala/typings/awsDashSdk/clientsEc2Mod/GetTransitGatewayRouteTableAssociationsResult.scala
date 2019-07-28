package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTransitGatewayRouteTableAssociationsResult extends js.Object {
  /**
    * Information about the associations.
    */
  var Associations: js.UndefOr[TransitGatewayRouteTableAssociationList] = js.undefined
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object GetTransitGatewayRouteTableAssociationsResult {
  @scala.inline
  def apply(Associations: TransitGatewayRouteTableAssociationList = null, NextToken: String = null): GetTransitGatewayRouteTableAssociationsResult = {
    val __obj = js.Dynamic.literal()
    if (Associations != null) __obj.updateDynamic("Associations")(Associations)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetTransitGatewayRouteTableAssociationsResult]
  }
}

