package typings
package asanaLib.asanaMod.asanaNs.authNs

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
  def establishCredentials(): bluebirdLib.bluebirdMod.namespaced[scala.Unit]
  /**
    * Attempts to refresh credentials, if possible, given the current credentials.
    *
    * @return {Promise} Resolves to `true` if credentials have been successfully
    *     established and `authenticateRequests` can expect to succeed, else
    *     resolves to `false`.
    * @return
    */
  def refreshCredentials(): bluebirdLib.bluebirdMod.namespaced[scala.Boolean]
}

object Authenticator {
  @scala.inline
  def apply(
    establishCredentials: js.Function0[bluebirdLib.bluebirdMod.namespaced[scala.Unit]],
    refreshCredentials: js.Function0[bluebirdLib.bluebirdMod.namespaced[scala.Boolean]]
  ): Authenticator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("establishCredentials")(establishCredentials)
    __obj.updateDynamic("refreshCredentials")(refreshCredentials)
    __obj.asInstanceOf[Authenticator]
  }
}

