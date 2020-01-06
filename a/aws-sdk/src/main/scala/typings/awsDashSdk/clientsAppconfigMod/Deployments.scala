package typings.awsDashSdk.clientsAppconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deployments extends js.Object {
  /**
    * The elements from this collection.
    */
  var Items: js.UndefOr[DeploymentList] = js.native
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsAppconfigMod.NextToken] = js.native
}

object Deployments {
  @scala.inline
  def apply(Items: DeploymentList = null, NextToken: NextToken = null): Deployments = {
    val __obj = js.Dynamic.literal()
    if (Items != null) __obj.updateDynamic("Items")(Items.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deployments]
  }
}

