package typings
package awsDashSdkLib.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EC2InstanceDetails extends js.Object {
  /**
    * The Availability Zone of the recommended reservation.
    */
  var AvailabilityZone: js.UndefOr[GenericString] = js.undefined
  /**
    * Whether the recommendation is for a current-generation instance. 
    */
  var CurrentGeneration: js.UndefOr[GenericBoolean] = js.undefined
  /**
    * The instance family of the recommended reservation.
    */
  var Family: js.UndefOr[GenericString] = js.undefined
  /**
    * The type of instance that AWS recommends.
    */
  var InstanceType: js.UndefOr[GenericString] = js.undefined
  /**
    * The platform of the recommended reservation. The platform is the specific combination of operating system, license model, and software on an instance.
    */
  var Platform: js.UndefOr[GenericString] = js.undefined
  /**
    * The AWS Region of the recommended reservation.
    */
  var Region: js.UndefOr[GenericString] = js.undefined
  /**
    * Whether the recommended reservation is size flexible.
    */
  var SizeFlexEligible: js.UndefOr[GenericBoolean] = js.undefined
  /**
    * Whether the recommended reservation is dedicated or shared.
    */
  var Tenancy: js.UndefOr[GenericString] = js.undefined
}

object EC2InstanceDetails {
  @scala.inline
  def apply(
    AvailabilityZone: GenericString = null,
    CurrentGeneration: js.UndefOr[GenericBoolean] = js.undefined,
    Family: GenericString = null,
    InstanceType: GenericString = null,
    Platform: GenericString = null,
    Region: GenericString = null,
    SizeFlexEligible: js.UndefOr[GenericBoolean] = js.undefined,
    Tenancy: GenericString = null
  ): EC2InstanceDetails = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone)
    if (!js.isUndefined(CurrentGeneration)) __obj.updateDynamic("CurrentGeneration")(CurrentGeneration)
    if (Family != null) __obj.updateDynamic("Family")(Family)
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType)
    if (Platform != null) __obj.updateDynamic("Platform")(Platform)
    if (Region != null) __obj.updateDynamic("Region")(Region)
    if (!js.isUndefined(SizeFlexEligible)) __obj.updateDynamic("SizeFlexEligible")(SizeFlexEligible)
    if (Tenancy != null) __obj.updateDynamic("Tenancy")(Tenancy)
    __obj.asInstanceOf[EC2InstanceDetails]
  }
}

