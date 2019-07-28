package typings.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetInstance extends js.Object {
  /**
    *  The currency code that Amazon Web Services used to calculate the costs for this instance.
    */
  var CurrencyCode: js.UndefOr[GenericString] = js.undefined
  /**
    *  Indicates whether or not this recommendation is the defaulted Amazon Web Services recommendation.
    */
  var DefaultTargetInstance: js.UndefOr[GenericBoolean] = js.undefined
  /**
    *  Expected cost to operate this instance type on a monthly basis.
    */
  var EstimatedMonthlyCost: js.UndefOr[GenericString] = js.undefined
  /**
    *  Estimated savings resulting from modification, on a monthly basis.
    */
  var EstimatedMonthlySavings: js.UndefOr[GenericString] = js.undefined
  /**
    *  Expected utilization metrics for target instance type.
    */
  var ExpectedResourceUtilization: js.UndefOr[ResourceUtilization] = js.undefined
  /**
    *  Details on the target instance type. 
    */
  var ResourceDetails: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.ResourceDetails] = js.undefined
}

object TargetInstance {
  @scala.inline
  def apply(
    CurrencyCode: GenericString = null,
    DefaultTargetInstance: js.UndefOr[GenericBoolean] = js.undefined,
    EstimatedMonthlyCost: GenericString = null,
    EstimatedMonthlySavings: GenericString = null,
    ExpectedResourceUtilization: ResourceUtilization = null,
    ResourceDetails: ResourceDetails = null
  ): TargetInstance = {
    val __obj = js.Dynamic.literal()
    if (CurrencyCode != null) __obj.updateDynamic("CurrencyCode")(CurrencyCode)
    if (!js.isUndefined(DefaultTargetInstance)) __obj.updateDynamic("DefaultTargetInstance")(DefaultTargetInstance)
    if (EstimatedMonthlyCost != null) __obj.updateDynamic("EstimatedMonthlyCost")(EstimatedMonthlyCost)
    if (EstimatedMonthlySavings != null) __obj.updateDynamic("EstimatedMonthlySavings")(EstimatedMonthlySavings)
    if (ExpectedResourceUtilization != null) __obj.updateDynamic("ExpectedResourceUtilization")(ExpectedResourceUtilization)
    if (ResourceDetails != null) __obj.updateDynamic("ResourceDetails")(ResourceDetails)
    __obj.asInstanceOf[TargetInstance]
  }
}

