package typings.awsDashSdk.clientsMediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListContainersOutput extends js.Object {
  /**
    * The names of the containers.
    */
  var Containers: ContainerList = js.native
  /**
    *  NextToken is the token to use in the next call to ListContainers. This token is returned only if you included the MaxResults tag in the original command, and only if there are still containers to return. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object ListContainersOutput {
  @scala.inline
  def apply(Containers: ContainerList, NextToken: PaginationToken = null): ListContainersOutput = {
    val __obj = js.Dynamic.literal(Containers = Containers.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListContainersOutput]
  }
}

