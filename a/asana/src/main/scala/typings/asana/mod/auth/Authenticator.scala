package typings.asana.mod.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A layer to abstract the differences between using different types of
  * authentication (Oauth vs. Basic). The Authenticator is responsible for
  * establishing credentials and applying them to outgoing requests.
  */
trait Authenticator extends StObject {
  
  /**
    * Establishes credentials.
    *
    * @return {Promise} Resolves when initial credentials have been
    *     completed and `authenticateRequest` calls can expect to succeed.
    * @return
    */
  def establishCredentials(): typings.bluebird.mod.^[Unit]
  
  /**
    * Attempts to refresh credentials, if possible, given the current credentials.
    *
    * @return {Promise} Resolves to `true` if credentials have been successfully
    *     established and `authenticateRequests` can expect to succeed, else
    *     resolves to `false`.
    * @return
    */
  def refreshCredentials(): typings.bluebird.mod.^[Boolean]
}
object Authenticator {
  
  inline def apply(
    establishCredentials: () => typings.bluebird.mod.^[Unit],
    refreshCredentials: () => typings.bluebird.mod.^[Boolean]
  ): Authenticator = {
    val __obj = js.Dynamic.literal(establishCredentials = js.Any.fromFunction0(establishCredentials), refreshCredentials = js.Any.fromFunction0(refreshCredentials))
    __obj.asInstanceOf[Authenticator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Authenticator] (val x: Self) extends AnyVal {
    
    inline def setEstablishCredentials(value: () => typings.bluebird.mod.^[Unit]): Self = StObject.set(x, "establishCredentials", js.Any.fromFunction0(value))
    
    inline def setRefreshCredentials(value: () => typings.bluebird.mod.^[Boolean]): Self = StObject.set(x, "refreshCredentials", js.Any.fromFunction0(value))
  }
}
