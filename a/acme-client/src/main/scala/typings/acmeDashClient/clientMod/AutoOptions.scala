package typings.acmeDashClient.clientMod

import typings.acmeDashClient.cryptoForgeMod.Csr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoOptions extends js.Object {
  var challengeCreateFn: js.UndefOr[
    js.Function3[
      /* authz */ Authorization, 
      /* challenge */ Challenge, 
      /* keyAuthorization */ ChallengeKey, 
      js.Promise[_]
    ]
  ] = js.undefined
  var challengePriority: js.UndefOr[js.Array[String]] = js.undefined
  var challengeRemoveFn: js.UndefOr[
    js.Function3[
      /* authz */ Authorization, 
      /* challenge */ Challenge, 
      /* keyAuthorization */ ChallengeKey, 
      js.Promise[_]
    ]
  ] = js.undefined
  var csr: js.UndefOr[Csr | String] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  var termsOfServiceAgreed: js.UndefOr[Boolean] = js.undefined
}

object AutoOptions {
  @scala.inline
  def apply(
    challengeCreateFn: (/* authz */ Authorization, /* challenge */ Challenge, /* keyAuthorization */ ChallengeKey) => js.Promise[_] = null,
    challengePriority: js.Array[String] = null,
    challengeRemoveFn: (/* authz */ Authorization, /* challenge */ Challenge, /* keyAuthorization */ ChallengeKey) => js.Promise[_] = null,
    csr: Csr | String = null,
    email: String = null,
    termsOfServiceAgreed: js.UndefOr[Boolean] = js.undefined
  ): AutoOptions = {
    val __obj = js.Dynamic.literal()
    if (challengeCreateFn != null) __obj.updateDynamic("challengeCreateFn")(js.Any.fromFunction3(challengeCreateFn))
    if (challengePriority != null) __obj.updateDynamic("challengePriority")(challengePriority)
    if (challengeRemoveFn != null) __obj.updateDynamic("challengeRemoveFn")(js.Any.fromFunction3(challengeRemoveFn))
    if (csr != null) __obj.updateDynamic("csr")(csr.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email)
    if (!js.isUndefined(termsOfServiceAgreed)) __obj.updateDynamic("termsOfServiceAgreed")(termsOfServiceAgreed)
    __obj.asInstanceOf[AutoOptions]
  }
}

