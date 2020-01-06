package typings.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurrentInstance extends js.Object {
  /**
    *  The currency code that Amazon Web Services used to calculate the costs for this instance.
    */
  var CurrencyCode: js.UndefOr[GenericString] = js.native
  /**
    *  Current On Demand cost of operating this instance on a monthly basis.
    */
  var MonthlyCost: js.UndefOr[GenericString] = js.native
  /**
    *  Number of hours during the lookback period billed at On Demand rates.
    */
  var OnDemandHoursInLookbackPeriod: js.UndefOr[GenericString] = js.native
  /**
    *  Number of hours during the lookback period covered by reservations.
    */
  var ReservationCoveredHoursInLookbackPeriod: js.UndefOr[GenericString] = js.native
  /**
    *  Details about the resource and utilization.
    */
  var ResourceDetails: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.ResourceDetails] = js.native
  /**
    * Resource ID of the current instance.
    */
  var ResourceId: js.UndefOr[GenericString] = js.native
  /**
    *  Utilization information of the current instance during the lookback period.
    */
  var ResourceUtilization: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.ResourceUtilization] = js.native
  /**
    * Number of hours during the lookback period covered by Savings Plans.
    */
  var SavingsPlansCoveredHoursInLookbackPeriod: js.UndefOr[GenericString] = js.native
  /**
    * Cost allocation resource tags applied to the instance.
    */
  var Tags: js.UndefOr[TagValuesList] = js.native
  /**
    *  The total number of hours the instance ran during the lookback period.
    */
  var TotalRunningHoursInLookbackPeriod: js.UndefOr[GenericString] = js.native
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
    SavingsPlansCoveredHoursInLookbackPeriod: GenericString = null,
    Tags: TagValuesList = null,
    TotalRunningHoursInLookbackPeriod: GenericString = null
  ): CurrentInstance = {
    val __obj = js.Dynamic.literal()
    if (CurrencyCode != null) __obj.updateDynamic("CurrencyCode")(CurrencyCode.asInstanceOf[js.Any])
    if (MonthlyCost != null) __obj.updateDynamic("MonthlyCost")(MonthlyCost.asInstanceOf[js.Any])
    if (OnDemandHoursInLookbackPeriod != null) __obj.updateDynamic("OnDemandHoursInLookbackPeriod")(OnDemandHoursInLookbackPeriod.asInstanceOf[js.Any])
    if (ReservationCoveredHoursInLookbackPeriod != null) __obj.updateDynamic("ReservationCoveredHoursInLookbackPeriod")(ReservationCoveredHoursInLookbackPeriod.asInstanceOf[js.Any])
    if (ResourceDetails != null) __obj.updateDynamic("ResourceDetails")(ResourceDetails.asInstanceOf[js.Any])
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId.asInstanceOf[js.Any])
    if (ResourceUtilization != null) __obj.updateDynamic("ResourceUtilization")(ResourceUtilization.asInstanceOf[js.Any])
    if (SavingsPlansCoveredHoursInLookbackPeriod != null) __obj.updateDynamic("SavingsPlansCoveredHoursInLookbackPeriod")(SavingsPlansCoveredHoursInLookbackPeriod.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (TotalRunningHoursInLookbackPeriod != null) __obj.updateDynamic("TotalRunningHoursInLookbackPeriod")(TotalRunningHoursInLookbackPeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentInstance]
  }
}

