package typings.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ESInstanceDetails extends js.Object {
  /**
    * Whether the recommendation is for a current-generation instance.
    */
  var CurrentGeneration: js.UndefOr[GenericBoolean] = js.undefined
  /**
    * The class of instance that AWS recommends.
    */
  var InstanceClass: js.UndefOr[GenericString] = js.undefined
  /**
    * The size of instance that AWS recommends.
    */
  var InstanceSize: js.UndefOr[GenericString] = js.undefined
  /**
    * The AWS Region of the recommended reservation.
    */
  var Region: js.UndefOr[GenericString] = js.undefined
  /**
    * Whether the recommended reservation is size flexible.
    */
  var SizeFlexEligible: js.UndefOr[GenericBoolean] = js.undefined
}

object ESInstanceDetails {
  @scala.inline
  def apply(
    CurrentGeneration: js.UndefOr[GenericBoolean] = js.undefined,
    InstanceClass: GenericString = null,
    InstanceSize: GenericString = null,
    Region: GenericString = null,
    SizeFlexEligible: js.UndefOr[GenericBoolean] = js.undefined
  ): ESInstanceDetails = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(CurrentGeneration)) __obj.updateDynamic("CurrentGeneration")(CurrentGeneration)
    if (InstanceClass != null) __obj.updateDynamic("InstanceClass")(InstanceClass)
    if (InstanceSize != null) __obj.updateDynamic("InstanceSize")(InstanceSize)
    if (Region != null) __obj.updateDynamic("Region")(Region)
    if (!js.isUndefined(SizeFlexEligible)) __obj.updateDynamic("SizeFlexEligible")(SizeFlexEligible)
    __obj.asInstanceOf[ESInstanceDetails]
  }
}

