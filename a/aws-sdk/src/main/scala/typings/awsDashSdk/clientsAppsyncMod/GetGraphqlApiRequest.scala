package typings.awsDashSdk.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetGraphqlApiRequest extends js.Object {
  /**
    * The API ID for the GraphQL API.
    */
  var apiId: String = js.native
}

object GetGraphqlApiRequest {
  @scala.inline
  def apply(apiId: String): GetGraphqlApiRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetGraphqlApiRequest]
  }
}

