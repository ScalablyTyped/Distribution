package typings.asana.asanaMod.auth

import typings.bluebird.bluebirdMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A layer to abstract the differences between using different types of
  * authentication (Oauth vs. Basic). The Authenticator is responsible for
  * establishing credentials and applying them to outgoing requests.
  * @constructor
  */
trait Authenticator extends js.Object {
  /**
    * Establishes credentials.
    *
    * @return {Promise} Resolves when initial credentials have been
    *     completed and `authenticateRequest` calls can expect to succeed.
    * @return
    */
  def establishCredentials(): ^[Unit]
  /**
    * Attempts to refresh credentials, if possible, given the current credentials.
    *
    * @return {Promise} Resolves to `true` if credentials have been successfully
    *     established and `authenticateRequests` can expect to succeed, else
    *     resolves to `false`.
    * @return
    */
  def refreshCredentials(): ^[Boolean]
}

object Authenticator {
  @scala.inline
  def apply(establishCredentials: () => ^[Unit], refreshCredentials: () => ^[Boolean]): Authenticator = {
    val __obj = js.Dynamic.literal(establishCredentials = js.Any.fromFunction0(establishCredentials), refreshCredentials = js.Any.fromFunction0(refreshCredentials))
  
    __obj.asInstanceOf[Authenticator]
  }
}

