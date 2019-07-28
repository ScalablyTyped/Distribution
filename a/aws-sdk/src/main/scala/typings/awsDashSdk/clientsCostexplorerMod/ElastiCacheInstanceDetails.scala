package typings.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElastiCacheInstanceDetails extends js.Object {
  /**
    * Whether the recommendation is for a current generation instance.
    */
  var CurrentGeneration: js.UndefOr[GenericBoolean] = js.undefined
  /**
    * The instance family of the recommended reservation.
    */
  var Family: js.UndefOr[GenericString] = js.undefined
  /**
    * The type of node that AWS recommends.
    */
  var NodeType: js.UndefOr[GenericString] = js.undefined
  /**
    * The description of the recommended reservation.
    */
  var ProductDescription: js.UndefOr[GenericString] = js.undefined
  /**
    * The AWS Region of the recommended reservation.
    */
  var Region: js.UndefOr[GenericString] = js.undefined
  /**
    * Whether the recommended reservation is size flexible.
    */
  var SizeFlexEligible: js.UndefOr[GenericBoolean] = js.undefined
}

object ElastiCacheInstanceDetails {
  @scala.inline
  def apply(
    CurrentGeneration: js.UndefOr[GenericBoolean] = js.undefined,
    Family: GenericString = null,
    NodeType: GenericString = null,
    ProductDescription: GenericString = null,
    Region: GenericString = null,
    SizeFlexEligible: js.UndefOr[GenericBoolean] = js.undefined
  ): ElastiCacheInstanceDetails = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(CurrentGeneration)) __obj.updateDynamic("CurrentGeneration")(CurrentGeneration)
    if (Family != null) __obj.updateDynamic("Family")(Family)
    if (NodeType != null) __obj.updateDynamic("NodeType")(NodeType)
    if (ProductDescription != null) __obj.updateDynamic("ProductDescription")(ProductDescription)
    if (Region != null) __obj.updateDynamic("Region")(Region)
    if (!js.isUndefined(SizeFlexEligible)) __obj.updateDynamic("SizeFlexEligible")(SizeFlexEligible)
    __obj.asInstanceOf[ElastiCacheInstanceDetails]
  }
}

