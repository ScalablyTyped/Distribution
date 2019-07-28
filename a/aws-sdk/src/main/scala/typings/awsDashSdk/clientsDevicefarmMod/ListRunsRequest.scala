package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListRunsRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the project for which you want to list runs.
    */
  var arn: AmazonResourceName
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}

object ListRunsRequest {
  @scala.inline
  def apply(arn: AmazonResourceName, nextToken: PaginationToken = null): ListRunsRequest = {
    val __obj = js.Dynamic.literal(arn = arn)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListRunsRequest]
  }
}

