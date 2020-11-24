package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthCallbacks extends AuthBase {
  
  def authorize(): Unit = js.native
  def authorize(
    tokenParams: js.UndefOr[scala.Nothing],
    authOptions: js.UndefOr[scala.Nothing],
    callback: tokenDetailsCallback
  ): Unit = js.native
  def authorize(tokenParams: js.UndefOr[scala.Nothing], authOptions: AuthOptions): Unit = js.native
  def authorize(tokenParams: js.UndefOr[scala.Nothing], authOptions: AuthOptions, callback: tokenDetailsCallback): Unit = js.native
  def authorize(tokenParams: js.UndefOr[scala.Nothing], authOptions: tokenDetailsCallback): Unit = js.native
  def authorize(
    tokenParams: js.UndefOr[scala.Nothing],
    authOptions: tokenDetailsCallback,
    callback: tokenDetailsCallback
  ): Unit = js.native
  def authorize(tokenParams: TokenParams): Unit = js.native
  def authorize(tokenParams: TokenParams, authOptions: js.UndefOr[scala.Nothing], callback: tokenDetailsCallback): Unit = js.native
  def authorize(tokenParams: TokenParams, authOptions: AuthOptions): Unit = js.native
  def authorize(tokenParams: TokenParams, authOptions: AuthOptions, callback: tokenDetailsCallback): Unit = js.native
  def authorize(tokenParams: TokenParams, authOptions: tokenDetailsCallback): Unit = js.native
  def authorize(tokenParams: TokenParams, authOptions: tokenDetailsCallback, callback: tokenDetailsCallback): Unit = js.native
  def authorize(tokenParams: tokenDetailsCallback): Unit = js.native
  def authorize(
    tokenParams: tokenDetailsCallback,
    authOptions: js.UndefOr[scala.Nothing],
    callback: tokenDetailsCallback
  ): Unit = js.native
  def authorize(tokenParams: tokenDetailsCallback, authOptions: AuthOptions): Unit = js.native
  def authorize(tokenParams: tokenDetailsCallback, authOptions: AuthOptions, callback: tokenDetailsCallback): Unit = js.native
  def authorize(tokenParams: tokenDetailsCallback, authOptions: tokenDetailsCallback): Unit = js.native
  def authorize(
    tokenParams: tokenDetailsCallback,
    authOptions: tokenDetailsCallback,
    callback: tokenDetailsCallback
  ): Unit = js.native
  
  def createTokenRequest(): Unit = js.native
  def createTokenRequest(
    tokenParams: js.UndefOr[scala.Nothing],
    authOptions: js.UndefOr[scala.Nothing],
    callback: tokenRequestCallback
  ): Unit = js.native
  def createTokenRequest(tokenParams: js.UndefOr[scala.Nothing], authOptions: AuthOptions): Unit = js.native
  def createTokenRequest(tokenParams: js.UndefOr[scala.Nothing], authOptions: AuthOptions, callback: tokenRequestCallback): Unit = js.native
  def createTokenRequest(tokenParams: js.UndefOr[scala.Nothing], authOptions: tokenRequestCallback): Unit = js.native
  def createTokenRequest(
    tokenParams: js.UndefOr[scala.Nothing],
    authOptions: tokenRequestCallback,
    callback: tokenRequestCallback
  ): Unit = js.native
  def createTokenRequest(tokenParams: TokenParams): Unit = js.native
  def createTokenRequest(tokenParams: TokenParams, authOptions: js.UndefOr[scala.Nothing], callback: tokenRequestCallback): Unit = js.native
  def createTokenRequest(tokenParams: TokenParams, authOptions: AuthOptions): Unit = js.native
  def createTokenRequest(tokenParams: TokenParams, authOptions: AuthOptions, callback: tokenRequestCallback): Unit = js.native
  def createTokenRequest(tokenParams: TokenParams, authOptions: tokenRequestCallback): Unit = js.native
  def createTokenRequest(tokenParams: TokenParams, authOptions: tokenRequestCallback, callback: tokenRequestCallback): Unit = js.native
  def createTokenRequest(tokenParams: tokenRequestCallback): Unit = js.native
  def createTokenRequest(
    tokenParams: tokenRequestCallback,
    authOptions: js.UndefOr[scala.Nothing],
    callback: tokenRequestCallback
  ): Unit = js.native
  def createTokenRequest(tokenParams: tokenRequestCallback, authOptions: AuthOptions): Unit = js.native
  def createTokenRequest(tokenParams: tokenRequestCallback, authOptions: AuthOptions, callback: tokenRequestCallback): Unit = js.native
  def createTokenRequest(tokenParams: tokenRequestCallback, authOptions: tokenRequestCallback): Unit = js.native
  def createTokenRequest(
    tokenParams: tokenRequestCallback,
    authOptions: tokenRequestCallback,
    callback: tokenRequestCallback
  ): Unit = js.native
  
  def requestToken(): Unit = js.native
  def requestToken(
    TokenParams: js.UndefOr[scala.Nothing],
    authOptions: js.UndefOr[scala.Nothing],
    callback: tokenDetailsCallback
  ): Unit = js.native
  def requestToken(TokenParams: js.UndefOr[scala.Nothing], authOptions: AuthOptions): Unit = js.native
  def requestToken(TokenParams: js.UndefOr[scala.Nothing], authOptions: AuthOptions, callback: tokenDetailsCallback): Unit = js.native
  def requestToken(TokenParams: js.UndefOr[scala.Nothing], authOptions: tokenDetailsCallback): Unit = js.native
  def requestToken(
    TokenParams: js.UndefOr[scala.Nothing],
    authOptions: tokenDetailsCallback,
    callback: tokenDetailsCallback
  ): Unit = js.native
  def requestToken(TokenParams: TokenParams): Unit = js.native
  def requestToken(TokenParams: TokenParams, authOptions: js.UndefOr[scala.Nothing], callback: tokenDetailsCallback): Unit = js.native
  def requestToken(TokenParams: TokenParams, authOptions: AuthOptions): Unit = js.native
  def requestToken(TokenParams: TokenParams, authOptions: AuthOptions, callback: tokenDetailsCallback): Unit = js.native
  def requestToken(TokenParams: TokenParams, authOptions: tokenDetailsCallback): Unit = js.native
  def requestToken(TokenParams: TokenParams, authOptions: tokenDetailsCallback, callback: tokenDetailsCallback): Unit = js.native
  def requestToken(TokenParams: tokenDetailsCallback): Unit = js.native
  def requestToken(
    TokenParams: tokenDetailsCallback,
    authOptions: js.UndefOr[scala.Nothing],
    callback: tokenDetailsCallback
  ): Unit = js.native
  def requestToken(TokenParams: tokenDetailsCallback, authOptions: AuthOptions): Unit = js.native
  def requestToken(TokenParams: tokenDetailsCallback, authOptions: AuthOptions, callback: tokenDetailsCallback): Unit = js.native
  def requestToken(TokenParams: tokenDetailsCallback, authOptions: tokenDetailsCallback): Unit = js.native
  def requestToken(
    TokenParams: tokenDetailsCallback,
    authOptions: tokenDetailsCallback,
    callback: tokenDetailsCallback
  ): Unit = js.native
}
