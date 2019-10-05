package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperatingSystem extends js.Object {
  /**
    * Supported configuration manager name and versions for an AWS OpsWorks Stacks operating system.
    */
  var ConfigurationManagers: js.UndefOr[OperatingSystemConfigurationManagers] = js.undefined
  /**
    * The ID of a supported operating system, such as Amazon Linux 2018.03.
    */
  var Id: js.UndefOr[String] = js.undefined
  /**
    * The name of the operating system, such as Amazon Linux 2018.03.
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * A short name for the operating system manufacturer.
    */
  var ReportedName: js.UndefOr[String] = js.undefined
  /**
    * The version of the operating system, including the release and edition, if applicable.
    */
  var ReportedVersion: js.UndefOr[String] = js.undefined
  /**
    * Indicates that an operating system is not supported for new instances.
    */
  var Supported: js.UndefOr[Boolean] = js.undefined
  /**
    * The type of a supported operating system, either Linux or Windows.
    */
  var Type: js.UndefOr[String] = js.undefined
}

object OperatingSystem {
  @scala.inline
  def apply(
    ConfigurationManagers: OperatingSystemConfigurationManagers = null,
    Id: String = null,
    Name: String = null,
    ReportedName: String = null,
    ReportedVersion: String = null,
    Supported: js.UndefOr[scala.Boolean] = js.undefined,
    Type: String = null
  ): OperatingSystem = {
    val __obj = js.Dynamic.literal()
    if (ConfigurationManagers != null) __obj.updateDynamic("ConfigurationManagers")(ConfigurationManagers)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (ReportedName != null) __obj.updateDynamic("ReportedName")(ReportedName)
    if (ReportedVersion != null) __obj.updateDynamic("ReportedVersion")(ReportedVersion)
    if (!js.isUndefined(Supported)) __obj.updateDynamic("Supported")(Supported)
    if (Type != null) __obj.updateDynamic("Type")(Type)
    __obj.asInstanceOf[OperatingSystem]
  }
}

