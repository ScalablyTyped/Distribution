package typings.awsDashSdk.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCurrentUserRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
    */
  var AuthenticationToken: AuthenticationHeaderType = js.native
}

object GetCurrentUserRequest {
  @scala.inline
  def apply(AuthenticationToken: AuthenticationHeaderType): GetCurrentUserRequest = {
    val __obj = js.Dynamic.literal(AuthenticationToken = AuthenticationToken.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetCurrentUserRequest]
  }
}

