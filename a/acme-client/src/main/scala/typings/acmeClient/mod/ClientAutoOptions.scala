package typings.acmeClient.mod

import typings.acmeClient.rfc8555Mod.Challenge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientAutoOptions extends js.Object {
  var challengePriority: js.UndefOr[js.Array[String]] = js.undefined
  var csr: CsrBuffer | CsrString
  var email: js.UndefOr[String] = js.undefined
  var skipChallengeVerification: js.UndefOr[Boolean] = js.undefined
  var termsOfServiceAgreed: js.UndefOr[Boolean] = js.undefined
  def challengeCreateFn(authz: Authorization, challenge: Challenge, keyAuthorization: String): js.Promise[_]
  def challengeRemoveFn(authz: Authorization, challenge: Challenge, keyAuthorization: String): js.Promise[_]
}

object ClientAutoOptions {
  @scala.inline
  def apply(
    challengeCreateFn: (Authorization, Challenge, String) => js.Promise[_],
    challengeRemoveFn: (Authorization, Challenge, String) => js.Promise[_],
    csr: CsrBuffer | CsrString,
    challengePriority: js.Array[String] = null,
    email: String = null,
    skipChallengeVerification: js.UndefOr[Boolean] = js.undefined,
    termsOfServiceAgreed: js.UndefOr[Boolean] = js.undefined
  ): ClientAutoOptions = {
    val __obj = js.Dynamic.literal(challengeCreateFn = js.Any.fromFunction3(challengeCreateFn), challengeRemoveFn = js.Any.fromFunction3(challengeRemoveFn), csr = csr.asInstanceOf[js.Any])
    if (challengePriority != null) __obj.updateDynamic("challengePriority")(challengePriority.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (!js.isUndefined(skipChallengeVerification)) __obj.updateDynamic("skipChallengeVerification")(skipChallengeVerification.get.asInstanceOf[js.Any])
    if (!js.isUndefined(termsOfServiceAgreed)) __obj.updateDynamic("termsOfServiceAgreed")(termsOfServiceAgreed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientAutoOptions]
  }
}

