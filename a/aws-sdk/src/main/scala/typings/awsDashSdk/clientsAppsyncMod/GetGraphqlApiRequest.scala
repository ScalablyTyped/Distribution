package typings.awsDashSdk.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetGraphqlApiRequest extends js.Object {
  /**
    * The API ID for the GraphQL API.
    */
  var apiId: String
}

object GetGraphqlApiRequest {
  @scala.inline
  def apply(apiId: String): GetGraphqlApiRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId)
  
    __obj.asInstanceOf[GetGraphqlApiRequest]
  }
}

