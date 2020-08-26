package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthPromise extends AuthBase {
  def authorize(): js.Promise[TokenDetails] = js.native
  def authorize(tokenParams: js.UndefOr[scala.Nothing], authOptions: AuthOptions): js.Promise[TokenDetails] = js.native
  def authorize(tokenParams: TokenParams): js.Promise[TokenDetails] = js.native
  def authorize(tokenParams: TokenParams, authOptions: AuthOptions): js.Promise[TokenDetails] = js.native
  def createTokenRequest(): js.Promise[TokenRequest] = js.native
  def createTokenRequest(tokenParams: js.UndefOr[scala.Nothing], authOptions: AuthOptions): js.Promise[TokenRequest] = js.native
  def createTokenRequest(tokenParams: TokenParams): js.Promise[TokenRequest] = js.native
  def createTokenRequest(tokenParams: TokenParams, authOptions: AuthOptions): js.Promise[TokenRequest] = js.native
  def requestToken(): js.Promise[TokenDetails] = js.native
  def requestToken(TokenParams: js.UndefOr[scala.Nothing], authOptions: AuthOptions): js.Promise[TokenDetails] = js.native
  def requestToken(TokenParams: TokenParams): js.Promise[TokenDetails] = js.native
  def requestToken(TokenParams: TokenParams, authOptions: AuthOptions): js.Promise[TokenDetails] = js.native
}

