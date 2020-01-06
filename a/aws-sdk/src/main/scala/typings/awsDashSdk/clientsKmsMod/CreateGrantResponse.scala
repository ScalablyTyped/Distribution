package typings.awsDashSdk.clientsKmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGrantResponse extends js.Object {
  /**
    * The unique identifier for the grant. You can use the GrantId in a subsequent RetireGrant or RevokeGrant operation.
    */
  var GrantId: js.UndefOr[GrantIdType] = js.native
  /**
    * The grant token. For more information, see Grant Tokens in the AWS Key Management Service Developer Guide.
    */
  var GrantToken: js.UndefOr[GrantTokenType] = js.native
}

object CreateGrantResponse {
  @scala.inline
  def apply(GrantId: GrantIdType = null, GrantToken: GrantTokenType = null): CreateGrantResponse = {
    val __obj = js.Dynamic.literal()
    if (GrantId != null) __obj.updateDynamic("GrantId")(GrantId.asInstanceOf[js.Any])
    if (GrantToken != null) __obj.updateDynamic("GrantToken")(GrantToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGrantResponse]
  }
}

