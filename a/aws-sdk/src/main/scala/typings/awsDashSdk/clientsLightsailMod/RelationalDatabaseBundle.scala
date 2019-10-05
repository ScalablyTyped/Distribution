package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelationalDatabaseBundle extends js.Object {
  /**
    * The ID for the database bundle.
    */
  var bundleId: js.UndefOr[String] = js.undefined
  /**
    * The number of virtual CPUs (vCPUs) for the database bundle.
    */
  var cpuCount: js.UndefOr[integer] = js.undefined
  /**
    * The size of the disk for the database bundle.
    */
  var diskSizeInGb: js.UndefOr[integer] = js.undefined
  /**
    * A Boolean value indicating whether the database bundle is active.
    */
  var isActive: js.UndefOr[Boolean] = js.undefined
  /**
    * A Boolean value indicating whether the database bundle is encrypted.
    */
  var isEncrypted: js.UndefOr[Boolean] = js.undefined
  /**
    * The name for the database bundle.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The cost of the database bundle in US currency.
    */
  var price: js.UndefOr[float] = js.undefined
  /**
    * The amount of RAM in GB (for example, 2.0) for the database bundle.
    */
  var ramSizeInGb: js.UndefOr[float] = js.undefined
  /**
    * The data transfer rate per month in GB for the database bundle.
    */
  var transferPerMonthInGb: js.UndefOr[integer] = js.undefined
}

object RelationalDatabaseBundle {
  @scala.inline
  def apply(
    bundleId: String = null,
    cpuCount: Int | Double = null,
    diskSizeInGb: Int | Double = null,
    isActive: js.UndefOr[Boolean] = js.undefined,
    isEncrypted: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    price: Int | Double = null,
    ramSizeInGb: Int | Double = null,
    transferPerMonthInGb: Int | Double = null
  ): RelationalDatabaseBundle = {
    val __obj = js.Dynamic.literal()
    if (bundleId != null) __obj.updateDynamic("bundleId")(bundleId)
    if (cpuCount != null) __obj.updateDynamic("cpuCount")(cpuCount.asInstanceOf[js.Any])
    if (diskSizeInGb != null) __obj.updateDynamic("diskSizeInGb")(diskSizeInGb.asInstanceOf[js.Any])
    if (!js.isUndefined(isActive)) __obj.updateDynamic("isActive")(isActive)
    if (!js.isUndefined(isEncrypted)) __obj.updateDynamic("isEncrypted")(isEncrypted)
    if (name != null) __obj.updateDynamic("name")(name)
    if (price != null) __obj.updateDynamic("price")(price.asInstanceOf[js.Any])
    if (ramSizeInGb != null) __obj.updateDynamic("ramSizeInGb")(ramSizeInGb.asInstanceOf[js.Any])
    if (transferPerMonthInGb != null) __obj.updateDynamic("transferPerMonthInGb")(transferPerMonthInGb.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationalDatabaseBundle]
  }
}

