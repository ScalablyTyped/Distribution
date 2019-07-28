package typings.awsDashSdk.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlacklistEntry extends js.Object {
  /**
    * Additional information about the blacklisting event, as provided by the blacklist maintainer.
    */
  var Description: js.UndefOr[BlacklistingDescription] = js.undefined
  /**
    * The time when the blacklisting event occurred, shown in Unix time format.
    */
  var ListingTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The name of the blacklist that the IP address appears on.
    */
  var RblName: js.UndefOr[typings.awsDashSdk.clientsPinpointemailMod.RblName] = js.undefined
}

object BlacklistEntry {
  @scala.inline
  def apply(
    Description: BlacklistingDescription = null,
    ListingTime: Timestamp = null,
    RblName: RblName = null
  ): BlacklistEntry = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (ListingTime != null) __obj.updateDynamic("ListingTime")(ListingTime)
    if (RblName != null) __obj.updateDynamic("RblName")(RblName)
    __obj.asInstanceOf[BlacklistEntry]
  }
}

