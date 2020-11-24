package typings.asana.mod.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A layer to abstract the differences between using different types of
  * authentication (Oauth vs. Basic). The Authenticator is responsible for
  * establishing credentials and applying them to outgoing requests.
  * @constructor
  */
@js.native
trait Authenticator extends js.Object {
  
  /**
    * Establishes credentials.
    *
    * @return {Promise} Resolves when initial credentials have been
    *     completed and `authenticateRequest` calls can expect to succeed.
    * @return
    */
  def establishCredentials(): typings.bluebird.mod.^[Unit] = js.native
  
  /**
    * Attempts to refresh credentials, if possible, given the current credentials.
    *
    * @return {Promise} Resolves to `true` if credentials have been successfully
    *     established and `authenticateRequests` can expect to succeed, else
    *     resolves to `false`.
    * @return
    */
  def refreshCredentials(): typings.bluebird.mod.^[Boolean] = js.native
}
object Authenticator {
  
  @scala.inline
  def apply(
    establishCredentials: () => typings.bluebird.mod.^[Unit],
    refreshCredentials: () => typings.bluebird.mod.^[Boolean]
  ): Authenticator = {
    val __obj = js.Dynamic.literal(establishCredentials = js.Any.fromFunction0(establishCredentials), refreshCredentials = js.Any.fromFunction0(refreshCredentials))
    __obj.asInstanceOf[Authenticator]
  }
  
  @scala.inline
  implicit class AuthenticatorOps[Self <: Authenticator] (val x: Self) extends AnyVal {
    
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
    def setEstablishCredentials(value: () => typings.bluebird.mod.^[Unit]): Self = this.set("establishCredentials", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRefreshCredentials(value: () => typings.bluebird.mod.^[Boolean]): Self = this.set("refreshCredentials", js.Any.fromFunction0(value))
  }
}
