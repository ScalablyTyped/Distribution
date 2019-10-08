package typings.awsDashSdk.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  /**
    * The available port speeds for the location.
    */
  var availablePortSpeeds: js.UndefOr[AvailablePortSpeeds] = js.undefined
  /**
    * The name of the service provider for the location.
    */
  var availableProviders: js.UndefOr[ProviderList] = js.undefined
  /**
    * The code for the location.
    */
  var locationCode: js.UndefOr[LocationCode] = js.undefined
  /**
    * The name of the location. This includes the name of the colocation partner and the physical site of the building.
    */
  var locationName: js.UndefOr[LocationName] = js.undefined
  /**
    * The AWS Region for the location.
    */
  var region: js.UndefOr[Region] = js.undefined
}

object Location {
  @scala.inline
  def apply(
    availablePortSpeeds: AvailablePortSpeeds = null,
    availableProviders: ProviderList = null,
    locationCode: LocationCode = null,
    locationName: LocationName = null,
    region: Region = null
  ): Location = {
    val __obj = js.Dynamic.literal()
    if (availablePortSpeeds != null) __obj.updateDynamic("availablePortSpeeds")(availablePortSpeeds)
    if (availableProviders != null) __obj.updateDynamic("availableProviders")(availableProviders)
    if (locationCode != null) __obj.updateDynamic("locationCode")(locationCode)
    if (locationName != null) __obj.updateDynamic("locationName")(locationName)
    if (region != null) __obj.updateDynamic("region")(region)
    __obj.asInstanceOf[Location]
  }
}

