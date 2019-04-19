package typings
package awsDashSdkLib.clientsWorklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDomainResponse extends js.Object {
  /**
    * The time that the domain was added.
    */
  var CreatedTime: js.UndefOr[DateTime] = js.undefined
  /**
    * The name to display.
    */
  var DisplayName: js.UndefOr[DisplayName] = js.undefined
  /**
    * The current state for the domain.
    */
  var DomainStatus: js.UndefOr[DomainStatus] = js.undefined
}

object DescribeDomainResponse {
  @scala.inline
  def apply(CreatedTime: DateTime = null, DisplayName: DisplayName = null, DomainStatus: DomainStatus = null): DescribeDomainResponse = {
    val __obj = js.Dynamic.literal()
    if (CreatedTime != null) __obj.updateDynamic("CreatedTime")(CreatedTime)
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName)
    if (DomainStatus != null) __obj.updateDynamic("DomainStatus")(DomainStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDomainResponse]
  }
}

