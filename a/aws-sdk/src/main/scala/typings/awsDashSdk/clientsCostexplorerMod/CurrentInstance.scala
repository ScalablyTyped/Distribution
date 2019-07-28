package typings.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrentInstance extends js.Object {
  /**
    *  The currency code that Amazon Web Services used to calculate the costs for this instance.
    */
  var CurrencyCode: js.UndefOr[GenericString] = js.undefined
  /**
    *  Current On Demand cost of operating this instance on a monthly basis.
    */
  var MonthlyCost: js.UndefOr[GenericString] = js.undefined
  /**
    *  Number of hours during the lookback period billed at On Demand rates.
    */
  var OnDemandHoursInLookbackPeriod: js.UndefOr[GenericString] = js.undefined
  /**
    *  Number of hours during the lookback period covered by reservations.
    */
  var ReservationCoveredHoursInLookbackPeriod: js.UndefOr[GenericString] = js.undefined
  /**
    *  Details about the resource and utilization.
    */
  var ResourceDetails: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.ResourceDetails] = js.undefined
  /**
    * Resource ID of the current instance.
    */
  var ResourceId: js.UndefOr[GenericString] = js.undefined
  /**
    *  Utilization information of the current instance during the lookback period.
    */
  var ResourceUtilization: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.ResourceUtilization] = js.undefined
  /**
    * Cost allocation resource tags applied to the instance.
    */
  var Tags: js.UndefOr[TagValuesList] = js.undefined
  /**
    *  The total number of hours the instance ran during the lookback period.
    */
  var TotalRunningHoursInLookbackPeriod: js.UndefOr[GenericString] = js.undefined
}

object CurrentInstance {
  @scala.inline
  def apply(
    CurrencyCode: GenericString = null,
    MonthlyCost: GenericString = null,
    OnDemandHoursInLookbackPeriod: GenericString = null,
    ReservationCoveredHoursInLookbackPeriod: GenericString = null,
    ResourceDetails: ResourceDetails = null,
    ResourceId: GenericString = null,
    ResourceUtilization: ResourceUtilization = null,
    Tags: TagValuesList = null,
    TotalRunningHoursInLookbackPeriod: GenericString = null
  ): CurrentInstance = {
    val __obj = js.Dynamic.literal()
    if (CurrencyCode != null) __obj.updateDynamic("CurrencyCode")(CurrencyCode)
    if (MonthlyCost != null) __obj.updateDynamic("MonthlyCost")(MonthlyCost)
    if (OnDemandHoursInLookbackPeriod != null) __obj.updateDynamic("OnDemandHoursInLookbackPeriod")(OnDemandHoursInLookbackPeriod)
    if (ReservationCoveredHoursInLookbackPeriod != null) __obj.updateDynamic("ReservationCoveredHoursInLookbackPeriod")(ReservationCoveredHoursInLookbackPeriod)
    if (ResourceDetails != null) __obj.updateDynamic("ResourceDetails")(ResourceDetails)
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId)
    if (ResourceUtilization != null) __obj.updateDynamic("ResourceUtilization")(ResourceUtilization)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (TotalRunningHoursInLookbackPeriod != null) __obj.updateDynamic("TotalRunningHoursInLookbackPeriod")(TotalRunningHoursInLookbackPeriod)
    __obj.asInstanceOf[CurrentInstance]
  }
}

