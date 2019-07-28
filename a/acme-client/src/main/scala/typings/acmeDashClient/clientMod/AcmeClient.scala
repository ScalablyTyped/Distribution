package typings.acmeDashClient.clientMod

import typings.acmeDashClient.cryptoForgeMod.Csr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcmeClient extends js.Object {
  def auto(opts: AutoOptions): js.Promise[CertificateChain] = js.native
  def completeChallenge(challenge: Challenge): js.Promise[_] = js.native
  def createAccount(data: CreateAccountRequest): js.Promise[Account] = js.native
  def createOrder(data: CreateOrderRequest): js.Promise[Order] = js.native
  def deactivateAuthorization(authz: Authorization): js.Promise[_] = js.native
  def finalizeOrder(order: Order, csr: String): js.Promise[_] = js.native
  def finalizeOrder(order: Order, csr: Csr): js.Promise[_] = js.native
  def getAccountUrl(): String = js.native
  def getAuthorizations(order: Order): js.Promise[js.Array[Authorization]] = js.native
  def getCertificate(order: Order): js.Promise[CertificateChain] = js.native
  def getChallengeKeyAuthorization(challenge: Challenge): js.Promise[ChallengeKey] = js.native
  def getTermsOfServiceUrl(): js.Promise[String] = js.native
  def revokeCertificate(cert: Certificate, data: RevokeRequest): js.Promise[_] = js.native
  def updateAccount(data: UpdateAccountRequest): js.Promise[Account] = js.native
  def updateAccountKey(newAccountKey: AccountKey, data: js.Any): js.Promise[_] = js.native
  def verifyChallenge(authz: Authorization, challenge: Challenge): js.Promise[_] = js.native
  def waitForValidStatus[T /* <: HasStatus */](item: T): js.Promise[T] = js.native
}

