package typings.acmeClient.mod

import typings.acmeClient.rfc8555Mod.Challenge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientAutoOptions extends js.Object {
  
  def challengeCreateFn(authz: Authorization, challenge: Challenge, keyAuthorization: String): js.Promise[_] = js.native
  
  var challengePriority: js.UndefOr[js.Array[String]] = js.native
  
  def challengeRemoveFn(authz: Authorization, challenge: Challenge, keyAuthorization: String): js.Promise[_] = js.native
  
  var csr: CsrBuffer | CsrString = js.native
  
  var email: js.UndefOr[String] = js.native
  
  var preferredChain: js.UndefOr[String] = js.native
  
  var skipChallengeVerification: js.UndefOr[Boolean] = js.native
  
  var termsOfServiceAgreed: js.UndefOr[Boolean] = js.native
}
object ClientAutoOptions {
  
  @scala.inline
  def apply(
    challengeCreateFn: (Authorization, Challenge, String) => js.Promise[_],
    challengeRemoveFn: (Authorization, Challenge, String) => js.Promise[_],
    csr: CsrBuffer | CsrString
  ): ClientAutoOptions = {
    val __obj = js.Dynamic.literal(challengeCreateFn = js.Any.fromFunction3(challengeCreateFn), challengeRemoveFn = js.Any.fromFunction3(challengeRemoveFn), csr = csr.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientAutoOptions]
  }
  
  @scala.inline
  implicit class ClientAutoOptionsOps[Self <: ClientAutoOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChallengeCreateFn(value: (Authorization, Challenge, String) => js.Promise[_]): Self = this.set("challengeCreateFn", js.Any.fromFunction3(value))
    
    @scala.inline
    def setChallengeRemoveFn(value: (Authorization, Challenge, String) => js.Promise[_]): Self = this.set("challengeRemoveFn", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCsr(value: CsrBuffer | CsrString): Self = this.set("csr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChallengePriorityVarargs(value: String*): Self = this.set("challengePriority", js.Array(value :_*))
    
    @scala.inline
    def setChallengePriority(value: js.Array[String]): Self = this.set("challengePriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChallengePriority: Self = this.set("challengePriority", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setPreferredChain(value: String): Self = this.set("preferredChain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferredChain: Self = this.set("preferredChain", js.undefined)
    
    @scala.inline
    def setSkipChallengeVerification(value: Boolean): Self = this.set("skipChallengeVerification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipChallengeVerification: Self = this.set("skipChallengeVerification", js.undefined)
    
    @scala.inline
    def setTermsOfServiceAgreed(value: Boolean): Self = this.set("termsOfServiceAgreed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTermsOfServiceAgreed: Self = this.set("termsOfServiceAgreed", js.undefined)
  }
}
