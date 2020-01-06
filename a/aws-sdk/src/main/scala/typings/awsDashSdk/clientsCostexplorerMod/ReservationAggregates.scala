package typings.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReservationAggregates extends js.Object {
  /**
    * The monthly cost of your reservation, amortized over the reservation period.
    */
  var AmortizedRecurringFee: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.AmortizedRecurringFee] = js.native
  /**
    * The upfront cost of your reservation, amortized over the reservation period.
    */
  var AmortizedUpfrontFee: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.AmortizedUpfrontFee] = js.native
  /**
    * How much you saved due to purchasing and utilizing reservation. AWS calculates this by subtracting TotalAmortizedFee from OnDemandCostOfRIHoursUsed.
    */
  var NetRISavings: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.NetRISavings] = js.native
  /**
    * How much your reservation would cost if charged On-Demand rates.
    */
  var OnDemandCostOfRIHoursUsed: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.OnDemandCostOfRIHoursUsed] = js.native
  /**
    * How many reservation hours that you purchased.
    */
  var PurchasedHours: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.PurchasedHours] = js.native
  /**
    * How many Amazon EC2 reservation hours that you purchased, converted to normalized units. Normalized units are available only for Amazon EC2 usage after November 11, 2017.
    */
  var PurchasedUnits: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.PurchasedUnits] = js.native
  /**
    * The total number of reservation hours that you used.
    */
  var TotalActualHours: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.TotalActualHours] = js.native
  /**
    * The total number of Amazon EC2 reservation hours that you used, converted to normalized units. Normalized units are available only for Amazon EC2 usage after November 11, 2017.
    */
  var TotalActualUnits: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.TotalActualUnits] = js.native
  /**
    * The total cost of your reservation, amortized over the reservation period.
    */
  var TotalAmortizedFee: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.TotalAmortizedFee] = js.native
  /**
    * How much you could save if you use your entire reservation.
    */
  var TotalPotentialRISavings: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.TotalPotentialRISavings] = js.native
  /**
    * The number of reservation hours that you didn't use.
    */
  var UnusedHours: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.UnusedHours] = js.native
  /**
    * The number of Amazon EC2 reservation hours that you didn't use, converted to normalized units. Normalized units are available only for Amazon EC2 usage after November 11, 2017.
    */
  var UnusedUnits: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.UnusedUnits] = js.native
  /**
    * The percentage of reservation time that you used.
    */
  var UtilizationPercentage: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.UtilizationPercentage] = js.native
  /**
    * The percentage of Amazon EC2 reservation time that you used, converted to normalized units. Normalized units are available only for Amazon EC2 usage after November 11, 2017.
    */
  var UtilizationPercentageInUnits: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.UtilizationPercentageInUnits] = js.native
}

object ReservationAggregates {
  @scala.inline
  def apply(
    AmortizedRecurringFee: AmortizedRecurringFee = null,
    AmortizedUpfrontFee: AmortizedUpfrontFee = null,
    NetRISavings: NetRISavings = null,
    OnDemandCostOfRIHoursUsed: OnDemandCostOfRIHoursUsed = null,
    PurchasedHours: PurchasedHours = null,
    PurchasedUnits: PurchasedUnits = null,
    TotalActualHours: TotalActualHours = null,
    TotalActualUnits: TotalActualUnits = null,
    TotalAmortizedFee: TotalAmortizedFee = null,
    TotalPotentialRISavings: TotalPotentialRISavings = null,
    UnusedHours: UnusedHours = null,
    UnusedUnits: UnusedUnits = null,
    UtilizationPercentage: UtilizationPercentage = null,
    UtilizationPercentageInUnits: UtilizationPercentageInUnits = null
  ): ReservationAggregates = {
    val __obj = js.Dynamic.literal()
    if (AmortizedRecurringFee != null) __obj.updateDynamic("AmortizedRecurringFee")(AmortizedRecurringFee.asInstanceOf[js.Any])
    if (AmortizedUpfrontFee != null) __obj.updateDynamic("AmortizedUpfrontFee")(AmortizedUpfrontFee.asInstanceOf[js.Any])
    if (NetRISavings != null) __obj.updateDynamic("NetRISavings")(NetRISavings.asInstanceOf[js.Any])
    if (OnDemandCostOfRIHoursUsed != null) __obj.updateDynamic("OnDemandCostOfRIHoursUsed")(OnDemandCostOfRIHoursUsed.asInstanceOf[js.Any])
    if (PurchasedHours != null) __obj.updateDynamic("PurchasedHours")(PurchasedHours.asInstanceOf[js.Any])
    if (PurchasedUnits != null) __obj.updateDynamic("PurchasedUnits")(PurchasedUnits.asInstanceOf[js.Any])
    if (TotalActualHours != null) __obj.updateDynamic("TotalActualHours")(TotalActualHours.asInstanceOf[js.Any])
    if (TotalActualUnits != null) __obj.updateDynamic("TotalActualUnits")(TotalActualUnits.asInstanceOf[js.Any])
    if (TotalAmortizedFee != null) __obj.updateDynamic("TotalAmortizedFee")(TotalAmortizedFee.asInstanceOf[js.Any])
    if (TotalPotentialRISavings != null) __obj.updateDynamic("TotalPotentialRISavings")(TotalPotentialRISavings.asInstanceOf[js.Any])
    if (UnusedHours != null) __obj.updateDynamic("UnusedHours")(UnusedHours.asInstanceOf[js.Any])
    if (UnusedUnits != null) __obj.updateDynamic("UnusedUnits")(UnusedUnits.asInstanceOf[js.Any])
    if (UtilizationPercentage != null) __obj.updateDynamic("UtilizationPercentage")(UtilizationPercentage.asInstanceOf[js.Any])
    if (UtilizationPercentageInUnits != null) __obj.updateDynamic("UtilizationPercentageInUnits")(UtilizationPercentageInUnits.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReservationAggregates]
  }
}

