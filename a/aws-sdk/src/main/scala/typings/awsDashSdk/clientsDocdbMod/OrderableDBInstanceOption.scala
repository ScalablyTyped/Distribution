package typings.awsDashSdk.clientsDocdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderableDBInstanceOption extends js.Object {
  /**
    * A list of Availability Zones for a DB instance.
    */
  var AvailabilityZones: js.UndefOr[AvailabilityZoneList] = js.undefined
  /**
    * The DB instance class for a DB instance.
    */
  var DBInstanceClass: js.UndefOr[String] = js.undefined
  /**
    * The engine type of a DB instance.
    */
  var Engine: js.UndefOr[String] = js.undefined
  /**
    * The engine version of a DB instance.
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  /**
    * The license model for a DB instance.
    */
  var LicenseModel: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether a DB instance is in a virtual private cloud (VPC).
    */
  var Vpc: js.UndefOr[Boolean] = js.undefined
}

object OrderableDBInstanceOption {
  @scala.inline
  def apply(
    AvailabilityZones: AvailabilityZoneList = null,
    DBInstanceClass: String = null,
    Engine: String = null,
    EngineVersion: String = null,
    LicenseModel: String = null,
    Vpc: js.UndefOr[scala.Boolean] = js.undefined
  ): OrderableDBInstanceOption = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZones != null) __obj.updateDynamic("AvailabilityZones")(AvailabilityZones)
    if (DBInstanceClass != null) __obj.updateDynamic("DBInstanceClass")(DBInstanceClass)
    if (Engine != null) __obj.updateDynamic("Engine")(Engine)
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion)
    if (LicenseModel != null) __obj.updateDynamic("LicenseModel")(LicenseModel)
    if (!js.isUndefined(Vpc)) __obj.updateDynamic("Vpc")(Vpc)
    __obj.asInstanceOf[OrderableDBInstanceOption]
  }
}

