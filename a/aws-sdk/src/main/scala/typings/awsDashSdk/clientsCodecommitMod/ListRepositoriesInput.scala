package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRepositoriesInput extends js.Object {
  /**
    * An enumeration token that allows the operation to batch the results of the operation. Batch sizes are 1,000 for list repository operations. When the client sends the token back to AWS CodeCommit, another page of 1,000 records is retrieved.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The order in which to sort the results of a list repositories operation.
    */
  var order: js.UndefOr[OrderEnum] = js.native
  /**
    * The criteria used to sort the results of a list repositories operation.
    */
  var sortBy: js.UndefOr[SortByEnum] = js.native
}

object ListRepositoriesInput {
  @scala.inline
  def apply(nextToken: NextToken = null, order: OrderEnum = null, sortBy: SortByEnum = null): ListRepositoriesInput = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (sortBy != null) __obj.updateDynamic("sortBy")(sortBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRepositoriesInput]
  }
}

