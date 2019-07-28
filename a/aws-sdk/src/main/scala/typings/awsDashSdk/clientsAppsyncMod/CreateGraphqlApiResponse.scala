package typings.awsDashSdk.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateGraphqlApiResponse extends js.Object {
  /**
    * The GraphqlApi.
    */
  var graphqlApi: js.UndefOr[GraphqlApi] = js.undefined
}

object CreateGraphqlApiResponse {
  @scala.inline
  def apply(graphqlApi: GraphqlApi = null): CreateGraphqlApiResponse = {
    val __obj = js.Dynamic.literal()
    if (graphqlApi != null) __obj.updateDynamic("graphqlApi")(graphqlApi)
    __obj.asInstanceOf[CreateGraphqlApiResponse]
  }
}

