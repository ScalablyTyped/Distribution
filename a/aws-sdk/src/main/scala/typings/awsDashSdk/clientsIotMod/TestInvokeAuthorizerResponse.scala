package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestInvokeAuthorizerResponse extends js.Object {
  /**
    * The number of seconds after which the connection is terminated.
    */
  var disconnectAfterInSeconds: js.UndefOr[Seconds] = js.native
  /**
    * True if the token is authenticated, otherwise false.
    */
  var isAuthenticated: js.UndefOr[IsAuthenticated] = js.native
  /**
    * IAM policy documents.
    */
  var policyDocuments: js.UndefOr[PolicyDocuments] = js.native
  /**
    * The principal ID.
    */
  var principalId: js.UndefOr[PrincipalId] = js.native
  /**
    * The number of seconds after which the temporary credentials are refreshed.
    */
  var refreshAfterInSeconds: js.UndefOr[Seconds] = js.native
}

object TestInvokeAuthorizerResponse {
  @scala.inline
  def apply(
    disconnectAfterInSeconds: Int | Double = null,
    isAuthenticated: js.UndefOr[scala.Boolean] = js.undefined,
    policyDocuments: PolicyDocuments = null,
    principalId: PrincipalId = null,
    refreshAfterInSeconds: Int | Double = null
  ): TestInvokeAuthorizerResponse = {
    val __obj = js.Dynamic.literal()
    if (disconnectAfterInSeconds != null) __obj.updateDynamic("disconnectAfterInSeconds")(disconnectAfterInSeconds.asInstanceOf[js.Any])
    if (!js.isUndefined(isAuthenticated)) __obj.updateDynamic("isAuthenticated")(isAuthenticated.asInstanceOf[js.Any])
    if (policyDocuments != null) __obj.updateDynamic("policyDocuments")(policyDocuments.asInstanceOf[js.Any])
    if (principalId != null) __obj.updateDynamic("principalId")(principalId.asInstanceOf[js.Any])
    if (refreshAfterInSeconds != null) __obj.updateDynamic("refreshAfterInSeconds")(refreshAfterInSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestInvokeAuthorizerResponse]
  }
}

