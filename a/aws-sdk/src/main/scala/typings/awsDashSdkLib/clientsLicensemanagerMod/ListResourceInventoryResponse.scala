package typings
package awsDashSdkLib.clientsLicensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListResourceInventoryResponse extends js.Object {
  /**
    * Token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * The detailed list of resources.
    */
  var ResourceInventoryList: js.UndefOr[ResourceInventoryList] = js.undefined
}

object ListResourceInventoryResponse {
  @scala.inline
  def apply(NextToken: String = null, ResourceInventoryList: ResourceInventoryList = null): ListResourceInventoryResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (ResourceInventoryList != null) __obj.updateDynamic("ResourceInventoryList")(ResourceInventoryList)
    __obj.asInstanceOf[ListResourceInventoryResponse]
  }
}

