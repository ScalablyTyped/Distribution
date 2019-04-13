package typings
package awsDashSdkLib.clientsCognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnprocessedIdentityId extends js.Object {
  /**
    * The error code indicating the type of error that occurred.
    */
  var ErrorCode: js.UndefOr[ErrorCode] = js.undefined
  /**
    * A unique identifier in the format REGION:GUID.
    */
  var IdentityId: js.UndefOr[IdentityId] = js.undefined
}

object UnprocessedIdentityId {
  @scala.inline
  def apply(ErrorCode: ErrorCode = null, IdentityId: IdentityId = null): UnprocessedIdentityId = {
    val __obj = js.Dynamic.literal()
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode.asInstanceOf[js.Any])
    if (IdentityId != null) __obj.updateDynamic("IdentityId")(IdentityId)
    __obj.asInstanceOf[UnprocessedIdentityId]
  }
}

