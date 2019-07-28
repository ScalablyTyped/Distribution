package typings.awsDashSdk.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteGraphqlApiRequest extends js.Object {
  /**
    * The API ID.
    */
  var apiId: String
}

object DeleteGraphqlApiRequest {
  @scala.inline
  def apply(apiId: String): DeleteGraphqlApiRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId)
  
    __obj.asInstanceOf[DeleteGraphqlApiRequest]
  }
}

