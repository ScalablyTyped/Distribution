package typings.awsDashSdk.clientsCodestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListResourcesResult extends js.Object {
  /**
    * The continuation token to use when requesting the next set of results, if there are more results to be returned.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * An array of resources associated with the project. 
    */
  var resources: js.UndefOr[ResourcesResult] = js.undefined
}

object ListResourcesResult {
  @scala.inline
  def apply(nextToken: PaginationToken = null, resources: ResourcesResult = null): ListResourcesResult = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (resources != null) __obj.updateDynamic("resources")(resources)
    __obj.asInstanceOf[ListResourcesResult]
  }
}

