package typings.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RDSInstanceDetails extends js.Object {
  /**
    * Whether the recommendation is for a current-generation instance. 
    */
  var CurrentGeneration: js.UndefOr[GenericBoolean] = js.native
  /**
    * The database edition that the recommended reservation supports.
    */
  var DatabaseEdition: js.UndefOr[GenericString] = js.native
  /**
    * The database engine that the recommended reservation supports.
    */
  var DatabaseEngine: js.UndefOr[GenericString] = js.native
  /**
    * Whether the recommendation is for a reservation in a single Availability Zone or a reservation with a backup in a second Availability Zone.
    */
  var DeploymentOption: js.UndefOr[GenericString] = js.native
  /**
    * The instance family of the recommended reservation.
    */
  var Family: js.UndefOr[GenericString] = js.native
  /**
    * The type of instance that AWS recommends.
    */
  var InstanceType: js.UndefOr[GenericString] = js.native
  /**
    * The license model that the recommended reservation supports.
    */
  var LicenseModel: js.UndefOr[GenericString] = js.native
  /**
    * The AWS Region of the recommended reservation.
    */
  var Region: js.UndefOr[GenericString] = js.native
  /**
    * Whether the recommended reservation is size flexible.
    */
  var SizeFlexEligible: js.UndefOr[GenericBoolean] = js.native
}

object RDSInstanceDetails {
  @scala.inline
  def apply(
    CurrentGeneration: js.UndefOr[Boolean] = js.undefined,
    DatabaseEdition: GenericString = null,
    DatabaseEngine: GenericString = null,
    DeploymentOption: GenericString = null,
    Family: GenericString = null,
    InstanceType: GenericString = null,
    LicenseModel: GenericString = null,
    Region: GenericString = null,
    SizeFlexEligible: js.UndefOr[Boolean] = js.undefined
  ): RDSInstanceDetails = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(CurrentGeneration)) __obj.updateDynamic("CurrentGeneration")(CurrentGeneration.asInstanceOf[js.Any])
    if (DatabaseEdition != null) __obj.updateDynamic("DatabaseEdition")(DatabaseEdition.asInstanceOf[js.Any])
    if (DatabaseEngine != null) __obj.updateDynamic("DatabaseEngine")(DatabaseEngine.asInstanceOf[js.Any])
    if (DeploymentOption != null) __obj.updateDynamic("DeploymentOption")(DeploymentOption.asInstanceOf[js.Any])
    if (Family != null) __obj.updateDynamic("Family")(Family.asInstanceOf[js.Any])
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType.asInstanceOf[js.Any])
    if (LicenseModel != null) __obj.updateDynamic("LicenseModel")(LicenseModel.asInstanceOf[js.Any])
    if (Region != null) __obj.updateDynamic("Region")(Region.asInstanceOf[js.Any])
    if (!js.isUndefined(SizeFlexEligible)) __obj.updateDynamic("SizeFlexEligible")(SizeFlexEligible.asInstanceOf[js.Any])
    __obj.asInstanceOf[RDSInstanceDetails]
  }
}

