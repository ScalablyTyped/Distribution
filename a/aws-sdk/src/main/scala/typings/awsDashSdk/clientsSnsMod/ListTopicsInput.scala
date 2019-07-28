package typings.awsDashSdk.clientsSnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTopicsInput extends js.Object {
  /**
    * Token returned by the previous ListTopics request.
    */
  var NextToken: js.UndefOr[nextToken] = js.undefined
}

object ListTopicsInput {
  @scala.inline
  def apply(NextToken: nextToken = null): ListTopicsInput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListTopicsInput]
  }
}

