package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDomainControllersResult extends js.Object {
  /**
    * List of the DomainController objects that were retrieved.
    */
  var DomainControllers: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.DomainControllers] = js.native
  /**
    * If not null, more results are available. Pass this value for the NextToken parameter in a subsequent call to DescribeDomainControllers retrieve the next set of items.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.NextToken] = js.native
}

object DescribeDomainControllersResult {
  @scala.inline
  def apply(DomainControllers: DomainControllers = null, NextToken: NextToken = null): DescribeDomainControllersResult = {
    val __obj = js.Dynamic.literal()
    if (DomainControllers != null) __obj.updateDynamic("DomainControllers")(DomainControllers.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDomainControllersResult]
  }
}

