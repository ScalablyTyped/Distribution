package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTrustsResult extends js.Object {
  /**
    * If not null, more results are available. Pass this value for the NextToken parameter in a subsequent call to DescribeTrusts to retrieve the next set of items.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.NextToken] = js.undefined
  /**
    * The list of Trust objects that were retrieved. It is possible that this list contains less than the number of items specified in the Limit member of the request. This occurs if there are less than the requested number of items left to retrieve, or if the limitations of the operation have been exceeded.
    */
  var Trusts: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.Trusts] = js.undefined
}

object DescribeTrustsResult {
  @scala.inline
  def apply(NextToken: NextToken = null, Trusts: Trusts = null): DescribeTrustsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Trusts != null) __obj.updateDynamic("Trusts")(Trusts)
    __obj.asInstanceOf[DescribeTrustsResult]
  }
}

