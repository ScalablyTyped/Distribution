package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestInvokeAuthorizerResponse extends js.Object {
  /**
    * The number of seconds after which the connection is terminated.
    */
  var disconnectAfterInSeconds: js.UndefOr[Seconds] = js.undefined
  /**
    * True if the token is authenticated, otherwise false.
    */
  var isAuthenticated: js.UndefOr[IsAuthenticated] = js.undefined
  /**
    * IAM policy documents.
    */
  var policyDocuments: js.UndefOr[PolicyDocuments] = js.undefined
  /**
    * The principal ID.
    */
  var principalId: js.UndefOr[PrincipalId] = js.undefined
  /**
    * The number of seconds after which the temporary credentials are refreshed.
    */
  var refreshAfterInSeconds: js.UndefOr[Seconds] = js.undefined
}

object TestInvokeAuthorizerResponse {
  @scala.inline
  def apply(
    disconnectAfterInSeconds: js.UndefOr[Seconds] = js.undefined,
    isAuthenticated: js.UndefOr[IsAuthenticated] = js.undefined,
    policyDocuments: PolicyDocuments = null,
    principalId: PrincipalId = null,
    refreshAfterInSeconds: js.UndefOr[Seconds] = js.undefined
  ): TestInvokeAuthorizerResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disconnectAfterInSeconds)) __obj.updateDynamic("disconnectAfterInSeconds")(disconnectAfterInSeconds)
    if (!js.isUndefined(isAuthenticated)) __obj.updateDynamic("isAuthenticated")(isAuthenticated)
    if (policyDocuments != null) __obj.updateDynamic("policyDocuments")(policyDocuments)
    if (principalId != null) __obj.updateDynamic("principalId")(principalId)
    if (!js.isUndefined(refreshAfterInSeconds)) __obj.updateDynamic("refreshAfterInSeconds")(refreshAfterInSeconds)
    __obj.asInstanceOf[TestInvokeAuthorizerResponse]
  }
}

