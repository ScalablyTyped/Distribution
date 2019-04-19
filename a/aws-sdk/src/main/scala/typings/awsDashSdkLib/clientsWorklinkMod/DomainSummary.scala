package typings
package awsDashSdkLib.clientsWorklinkMod

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
  var DisplayName: js.UndefOr[DisplayName] = js.undefined
  /**
    * The name of the domain.
    */
  var DomainName: awsDashSdkLib.clientsWorklinkMod.DomainName
  /**
    * The status of the domain.
    */
  var DomainStatus: awsDashSdkLib.clientsWorklinkMod.DomainStatus
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

