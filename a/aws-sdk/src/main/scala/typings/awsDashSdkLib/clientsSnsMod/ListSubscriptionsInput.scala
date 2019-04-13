package typings
package awsDashSdkLib.clientsSnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListSubscriptionsInput extends js.Object {
  /**
    * Token returned by the previous ListSubscriptions request.
    */
  var NextToken: js.UndefOr[nextToken] = js.undefined
}

object ListSubscriptionsInput {
  @scala.inline
  def apply(NextToken: nextToken = null): ListSubscriptionsInput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListSubscriptionsInput]
  }
}

