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
    cpuCount: js.UndefOr[integer] = js.undefined,
    diskSizeInGb: js.UndefOr[integer] = js.undefined,
    isActive: js.UndefOr[Boolean] = js.undefined,
    isEncrypted: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    price: js.UndefOr[float] = js.undefined,
    ramSizeInGb: js.UndefOr[float] = js.undefined,
    transferPerMonthInGb: js.UndefOr[integer] = js.undefined
  ): RelationalDatabaseBundle = {
    val __obj = js.Dynamic.literal()
    if (bundleId != null) __obj.updateDynamic("bundleId")(bundleId)
    if (!js.isUndefined(cpuCount)) __obj.updateDynamic("cpuCount")(cpuCount)
    if (!js.isUndefined(diskSizeInGb)) __obj.updateDynamic("diskSizeInGb")(diskSizeInGb)
    if (!js.isUndefined(isActive)) __obj.updateDynamic("isActive")(isActive)
    if (!js.isUndefined(isEncrypted)) __obj.updateDynamic("isEncrypted")(isEncrypted)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(price)) __obj.updateDynamic("price")(price)
    if (!js.isUndefined(ramSizeInGb)) __obj.updateDynamic("ramSizeInGb")(ramSizeInGb)
    if (!js.isUndefined(transferPerMonthInGb)) __obj.updateDynamic("transferPerMonthInGb")(transferPerMonthInGb)
    __obj.asInstanceOf[RelationalDatabaseBundle]
  }
}

