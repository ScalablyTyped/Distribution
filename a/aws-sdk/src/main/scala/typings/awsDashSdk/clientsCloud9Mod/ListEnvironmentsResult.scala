package typings.awsDashSdk.clientsCloud9Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEnvironmentsResult extends js.Object {
  /**
    * The list of environment identifiers.
    */
  var environmentIds: js.UndefOr[EnvironmentIdList] = js.native
  /**
    * If there are more than 25 items in the list, only the first 25 items are returned, along with a unique string called a next token. To get the next batch of items in the list, call this operation again, adding the next token to the call.
    */
  var nextToken: js.UndefOr[String] = js.native
}

object ListEnvironmentsResult {
  @scala.inline
  def apply(environmentIds: EnvironmentIdList = null, nextToken: String = null): ListEnvironmentsResult = {
    val __obj = js.Dynamic.literal()
    if (environmentIds != null) __obj.updateDynamic("environmentIds")(environmentIds.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEnvironmentsResult]
  }
}

