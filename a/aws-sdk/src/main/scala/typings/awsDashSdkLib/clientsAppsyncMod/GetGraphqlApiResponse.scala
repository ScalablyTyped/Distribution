package typings
package awsDashSdkLib.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetGraphqlApiResponse extends js.Object {
  /**
    * The GraphqlApi object.
    */
  var graphqlApi: js.UndefOr[GraphqlApi] = js.undefined
}

object GetGraphqlApiResponse {
  @scala.inline
  def apply(graphqlApi: GraphqlApi = null): GetGraphqlApiResponse = {
    val __obj = js.Dynamic.literal()
    if (graphqlApi != null) __obj.updateDynamic("graphqlApi")(graphqlApi)
    __obj.asInstanceOf[GetGraphqlApiResponse]
  }
}

