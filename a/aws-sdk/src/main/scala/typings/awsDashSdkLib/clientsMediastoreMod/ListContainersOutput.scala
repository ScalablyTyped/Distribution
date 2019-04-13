package typings
package awsDashSdkLib.clientsMediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListContainersOutput extends js.Object {
  /**
    * The names of the containers.
    */
  var Containers: ContainerList
  /**
    *  NextToken is the token to use in the next call to ListContainers. This token is returned only if you included the MaxResults tag in the original command, and only if there are still containers to return. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}

object ListContainersOutput {
  @scala.inline
  def apply(Containers: ContainerList, NextToken: PaginationToken = null): ListContainersOutput = {
    val __obj = js.Dynamic.literal(Containers = Containers)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListContainersOutput]
  }
}

