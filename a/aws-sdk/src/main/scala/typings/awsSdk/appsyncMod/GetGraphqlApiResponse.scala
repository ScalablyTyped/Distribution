package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetGraphqlApiResponse extends js.Object {
  /**
    * The GraphqlApi object.
    */
  var graphqlApi: js.UndefOr[GraphqlApi] = js.native
}

object GetGraphqlApiResponse {
  @scala.inline
  def apply(graphqlApi: GraphqlApi = null): GetGraphqlApiResponse = {
    val __obj = js.Dynamic.literal()
    if (graphqlApi != null) __obj.updateDynamic("graphqlApi")(graphqlApi.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGraphqlApiResponse]
  }
}

