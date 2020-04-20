package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteGraphqlApiRequest extends js.Object {
  /**
    * The API ID.
    */
  var apiId: String = js.native
}

object DeleteGraphqlApiRequest {
  @scala.inline
  def apply(apiId: String): DeleteGraphqlApiRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGraphqlApiRequest]
  }
}

