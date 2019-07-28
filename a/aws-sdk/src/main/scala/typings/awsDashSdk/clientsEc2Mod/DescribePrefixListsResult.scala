package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribePrefixListsResult extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * All available prefix lists.
    */
  var PrefixLists: js.UndefOr[PrefixListSet] = js.undefined
}

object DescribePrefixListsResult {
  @scala.inline
  def apply(NextToken: String = null, PrefixLists: PrefixListSet = null): DescribePrefixListsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (PrefixLists != null) __obj.updateDynamic("PrefixLists")(PrefixLists)
    __obj.asInstanceOf[DescribePrefixListsResult]
  }
}

