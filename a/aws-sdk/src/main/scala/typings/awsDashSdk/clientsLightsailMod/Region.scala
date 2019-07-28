package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Region extends js.Object {
  /**
    * The Availability Zones. Follows the format us-east-2a (case-sensitive).
    */
  var availabilityZones: js.UndefOr[AvailabilityZoneList] = js.undefined
  /**
    * The continent code (e.g., NA, meaning North America).
    */
  var continentCode: js.UndefOr[String] = js.undefined
  /**
    * The description of the AWS Region (e.g., This region is recommended to serve users in the eastern United States and eastern Canada).
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The display name (e.g., Ohio).
    */
  var displayName: js.UndefOr[String] = js.undefined
  /**
    * The region name (e.g., us-east-2).
    */
  var name: js.UndefOr[RegionName] = js.undefined
  /**
    * The Availability Zones for databases. Follows the format us-east-2a (case-sensitive).
    */
  var relationalDatabaseAvailabilityZones: js.UndefOr[AvailabilityZoneList] = js.undefined
}

object Region {
  @scala.inline
  def apply(
    availabilityZones: AvailabilityZoneList = null,
    continentCode: String = null,
    description: String = null,
    displayName: String = null,
    name: RegionName = null,
    relationalDatabaseAvailabilityZones: AvailabilityZoneList = null
  ): Region = {
    val __obj = js.Dynamic.literal()
    if (availabilityZones != null) __obj.updateDynamic("availabilityZones")(availabilityZones)
    if (continentCode != null) __obj.updateDynamic("continentCode")(continentCode)
    if (description != null) __obj.updateDynamic("description")(description)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (relationalDatabaseAvailabilityZones != null) __obj.updateDynamic("relationalDatabaseAvailabilityZones")(relationalDatabaseAvailabilityZones)
    __obj.asInstanceOf[Region]
  }
}

