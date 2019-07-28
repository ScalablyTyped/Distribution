package typings.awsDashSdk.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateGraphqlApiResponse extends js.Object {
  /**
    * The updated GraphqlApi object.
    */
  var graphqlApi: js.UndefOr[GraphqlApi] = js.undefined
}

object UpdateGraphqlApiResponse {
  @scala.inline
  def apply(graphqlApi: GraphqlApi = null): UpdateGraphqlApiResponse = {
    val __obj = js.Dynamic.literal()
    if (graphqlApi != null) __obj.updateDynamic("graphqlApi")(graphqlApi)
    __obj.asInstanceOf[UpdateGraphqlApiResponse]
  }
}

