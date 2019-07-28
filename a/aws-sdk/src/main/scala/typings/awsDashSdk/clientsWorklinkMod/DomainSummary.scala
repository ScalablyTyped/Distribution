package typings.awsDashSdk.clientsWorklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainSummary extends js.Object {
  /**
    * The time that the domain was created.
    */
  var CreatedTime: DateTime
  /**
    * The name to display.
    */
  var DisplayName: js.UndefOr[typings.awsDashSdk.clientsWorklinkMod.DisplayName] = js.undefined
  /**
    * The name of the domain.
    */
  var DomainName: typings.awsDashSdk.clientsWorklinkMod.DomainName
  /**
    * The status of the domain.
    */
  var DomainStatus: typings.awsDashSdk.clientsWorklinkMod.DomainStatus
}

object DomainSummary {
  @scala.inline
  def apply(
    CreatedTime: DateTime,
    DomainName: DomainName,
    DomainStatus: DomainStatus,
    DisplayName: DisplayName = null
  ): DomainSummary = {
    val __obj = js.Dynamic.literal(CreatedTime = CreatedTime, DomainName = DomainName, DomainStatus = DomainStatus.asInstanceOf[js.Any])
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName)
    __obj.asInstanceOf[DomainSummary]
  }
}

