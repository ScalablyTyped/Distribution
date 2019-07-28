package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListUniqueProblemsRequest extends js.Object {
  /**
    * The unique problems' ARNs.
    */
  var arn: AmazonResourceName
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}

object ListUniqueProblemsRequest {
  @scala.inline
  def apply(arn: AmazonResourceName, nextToken: PaginationToken = null): ListUniqueProblemsRequest = {
    val __obj = js.Dynamic.literal(arn = arn)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListUniqueProblemsRequest]
  }
}

