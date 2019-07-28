package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthResult extends js.Object {
  /**
    * The policies and statements that allowed the specified action.
    */
  var allowed: js.UndefOr[Allowed] = js.undefined
  /**
    * The final authorization decision of this scenario. Multiple statements are taken into account when determining the authorization decision. An explicit deny statement can override multiple allow statements.
    */
  var authDecision: js.UndefOr[AuthDecision] = js.undefined
  /**
    * Authorization information.
    */
  var authInfo: js.UndefOr[AuthInfo] = js.undefined
  /**
    * The policies and statements that denied the specified action.
    */
  var denied: js.UndefOr[Denied] = js.undefined
  /**
    * Contains any missing context values found while evaluating policy.
    */
  var missingContextValues: js.UndefOr[MissingContextValues] = js.undefined
}

object AuthResult {
  @scala.inline
  def apply(
    allowed: Allowed = null,
    authDecision: AuthDecision = null,
    authInfo: AuthInfo = null,
    denied: Denied = null,
    missingContextValues: MissingContextValues = null
  ): AuthResult = {
    val __obj = js.Dynamic.literal()
    if (allowed != null) __obj.updateDynamic("allowed")(allowed)
    if (authDecision != null) __obj.updateDynamic("authDecision")(authDecision.asInstanceOf[js.Any])
    if (authInfo != null) __obj.updateDynamic("authInfo")(authInfo)
    if (denied != null) __obj.updateDynamic("denied")(denied)
    if (missingContextValues != null) __obj.updateDynamic("missingContextValues")(missingContextValues)
    __obj.asInstanceOf[AuthResult]
  }
}

