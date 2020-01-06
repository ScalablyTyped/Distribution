package typings.awsDashSdk.clientsMediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListContainersInput extends js.Object {
  /**
    * Enter the maximum number of containers in the response. Use from 1 to 255 characters. 
    */
  var MaxResults: js.UndefOr[ContainerListLimit] = js.native
  /**
    * Only if you used MaxResults in the first command, enter the token (which was included in the previous response) to obtain the next set of containers. This token is included in a response only if there actually are more containers to list.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object ListContainersInput {
  @scala.inline
  def apply(MaxResults: Int | Double = null, NextToken: PaginationToken = null): ListContainersInput = {
    val __obj = js.Dynamic.literal()
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListContainersInput]
  }
}

