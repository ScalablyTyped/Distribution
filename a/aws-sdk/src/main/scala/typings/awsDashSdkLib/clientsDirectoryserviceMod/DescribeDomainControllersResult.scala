package typings
package awsDashSdkLib.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDomainControllersResult extends js.Object {
  /**
    * List of the DomainController objects that were retrieved.
    */
  var DomainControllers: js.UndefOr[DomainControllers] = js.undefined
  /**
    * If not null, more results are available. Pass this value for the NextToken parameter in a subsequent call to DescribeDomainControllers retrieve the next set of items.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object DescribeDomainControllersResult {
  @scala.inline
  def apply(DomainControllers: DomainControllers = null, NextToken: NextToken = null): DescribeDomainControllersResult = {
    val __obj = js.Dynamic.literal()
    if (DomainControllers != null) __obj.updateDynamic("DomainControllers")(DomainControllers)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeDomainControllersResult]
  }
}

