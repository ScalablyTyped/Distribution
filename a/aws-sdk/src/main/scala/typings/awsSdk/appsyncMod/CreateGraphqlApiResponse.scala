package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGraphqlApiResponse extends js.Object {
  /**
    * The GraphqlApi.
    */
  var graphqlApi: js.UndefOr[GraphqlApi] = js.native
}

object CreateGraphqlApiResponse {
  @scala.inline
  def apply(graphqlApi: GraphqlApi = null): CreateGraphqlApiResponse = {
    val __obj = js.Dynamic.literal()
    if (graphqlApi != null) __obj.updateDynamic("graphqlApi")(graphqlApi.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGraphqlApiResponse]
  }
}

