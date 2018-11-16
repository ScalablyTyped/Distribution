package typings
package ablyLib.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Classes
@js.native
trait Auth extends js.Object {
  var clientId: java.lang.String = js.native
  def authorize(): scala.Unit = js.native
  def authorize(tokenParams: TokenParams): scala.Unit = js.native
  def authorize(tokenParams: TokenParams, authOptions: AuthOptions): scala.Unit = js.native
  def authorize(tokenParams: TokenParams, authOptions: AuthOptions, callback: tokenDetailsCallback): scala.Unit = js.native
  def authorize(tokenParams: TokenParams, authOptions: tokenDetailsCallback): scala.Unit = js.native
  def authorize(tokenParams: TokenParams, authOptions: tokenDetailsCallback, callback: tokenDetailsCallback): scala.Unit = js.native
  def authorize(tokenParams: tokenDetailsCallback): scala.Unit = js.native
  def authorize(tokenParams: tokenDetailsCallback, authOptions: AuthOptions): scala.Unit = js.native
  def authorize(tokenParams: tokenDetailsCallback, authOptions: AuthOptions, callback: tokenDetailsCallback): scala.Unit = js.native
  def authorize(tokenParams: tokenDetailsCallback, authOptions: tokenDetailsCallback): scala.Unit = js.native
  def authorize(
    tokenParams: tokenDetailsCallback,
    authOptions: tokenDetailsCallback,
    callback: tokenDetailsCallback
  ): scala.Unit = js.native
  def createTokenRequest(): scala.Unit = js.native
  def createTokenRequest(tokenParams: TokenParams): scala.Unit = js.native
  def createTokenRequest(tokenParams: TokenParams, authOptions: AuthOptions): scala.Unit = js.native
  def createTokenRequest(tokenParams: TokenParams, authOptions: AuthOptions, callback: tokenRequestCallback): scala.Unit = js.native
  def createTokenRequest(tokenParams: TokenParams, authOptions: tokenRequestCallback): scala.Unit = js.native
  def createTokenRequest(tokenParams: TokenParams, authOptions: tokenRequestCallback, callback: tokenRequestCallback): scala.Unit = js.native
  def createTokenRequest(tokenParams: tokenRequestCallback): scala.Unit = js.native
  def createTokenRequest(tokenParams: tokenRequestCallback, authOptions: AuthOptions): scala.Unit = js.native
  def createTokenRequest(tokenParams: tokenRequestCallback, authOptions: AuthOptions, callback: tokenRequestCallback): scala.Unit = js.native
  def createTokenRequest(tokenParams: tokenRequestCallback, authOptions: tokenRequestCallback): scala.Unit = js.native
  def createTokenRequest(
    tokenParams: tokenRequestCallback,
    authOptions: tokenRequestCallback,
    callback: tokenRequestCallback
  ): scala.Unit = js.native
  def requestToken(): scala.Unit = js.native
  def requestToken(TokenParams: TokenParams): scala.Unit = js.native
  def requestToken(TokenParams: TokenParams, authOptions: AuthOptions): scala.Unit = js.native
  def requestToken(TokenParams: TokenParams, authOptions: AuthOptions, callback: tokenDetailsCallback): scala.Unit = js.native
  def requestToken(TokenParams: TokenParams, authOptions: tokenDetailsCallback): scala.Unit = js.native
  def requestToken(TokenParams: TokenParams, authOptions: tokenDetailsCallback, callback: tokenDetailsCallback): scala.Unit = js.native
  def requestToken(TokenParams: tokenDetailsCallback): scala.Unit = js.native
  def requestToken(TokenParams: tokenDetailsCallback, authOptions: AuthOptions): scala.Unit = js.native
  def requestToken(TokenParams: tokenDetailsCallback, authOptions: AuthOptions, callback: tokenDetailsCallback): scala.Unit = js.native
  def requestToken(TokenParams: tokenDetailsCallback, authOptions: tokenDetailsCallback): scala.Unit = js.native
  def requestToken(
    TokenParams: tokenDetailsCallback,
    authOptions: tokenDetailsCallback,
    callback: tokenDetailsCallback
  ): scala.Unit = js.native
}

