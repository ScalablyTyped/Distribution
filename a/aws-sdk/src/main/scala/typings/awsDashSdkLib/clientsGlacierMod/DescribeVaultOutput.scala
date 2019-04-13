package typings
package awsDashSdkLib.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeVaultOutput extends js.Object {
  /**
    * The Universal Coordinated Time (UTC) date when the vault was created. This value should be a string in the ISO 8601 date format, for example 2012-03-20T17:03:43.221Z.
    */
  var CreationDate: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The Universal Coordinated Time (UTC) date when Amazon Glacier completed the last vault inventory. This value should be a string in the ISO 8601 date format, for example 2012-03-20T17:03:43.221Z.
    */
  var LastInventoryDate: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The number of archives in the vault as of the last inventory date. This field will return null if an inventory has not yet run on the vault, for example if you just created the vault.
    */
  var NumberOfArchives: js.UndefOr[long] = js.undefined
  /**
    * Total size, in bytes, of the archives in the vault as of the last inventory date. This field will return null if an inventory has not yet run on the vault, for example if you just created the vault.
    */
  var SizeInBytes: js.UndefOr[long] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the vault.
    */
  var VaultARN: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the vault.
    */
  var VaultName: js.UndefOr[java.lang.String] = js.undefined
}

object DescribeVaultOutput {
  @scala.inline
  def apply(
    CreationDate: java.lang.String = null,
    LastInventoryDate: java.lang.String = null,
    NumberOfArchives: js.UndefOr[long] = js.undefined,
    SizeInBytes: js.UndefOr[long] = js.undefined,
    VaultARN: java.lang.String = null,
    VaultName: java.lang.String = null
  ): DescribeVaultOutput = {
    val __obj = js.Dynamic.literal()
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate)
    if (LastInventoryDate != null) __obj.updateDynamic("LastInventoryDate")(LastInventoryDate)
    if (!js.isUndefined(NumberOfArchives)) __obj.updateDynamic("NumberOfArchives")(NumberOfArchives)
    if (!js.isUndefined(SizeInBytes)) __obj.updateDynamic("SizeInBytes")(SizeInBytes)
    if (VaultARN != null) __obj.updateDynamic("VaultARN")(VaultARN)
    if (VaultName != null) __obj.updateDynamic("VaultName")(VaultName)
    __obj.asInstanceOf[DescribeVaultOutput]
  }
}

