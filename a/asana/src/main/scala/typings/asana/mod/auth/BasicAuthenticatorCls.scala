package typings.asana.mod.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("asana", "auth.BasicAuthenticator")
@js.native
open class BasicAuthenticatorCls protected ()
  extends StObject
     with BasicAuthenticator {
  /**
    * @param apiKey
    */
  def this(apiKey: String) = this()
  
  /**
    * @param {Object} request The request to modify, for the `request` library.
    * @return {Object} The `request` parameter, modified to include authentication
    *     information using the stored credentials.
    * @param request
    * @return
    */
  /* CompleteClass */
  override def authenticateRequest(request: BasicAuthenticatorRequest): BasicAuthenticatorRequest = js.native
  
  /**
    * Establishes credentials.
    *
    * @return {Promise} Resolves when initial credentials have been
    *     completed and `authenticateRequest` calls can expect to succeed.
    * @return
    */
  /* CompleteClass */
  override def establishCredentials(): typings.bluebird.mod.^[Unit] = js.native
  
  /**
    * Attempts to refresh credentials, if possible, given the current credentials.
    *
    * @return {Promise} Resolves to `true` if credentials have been successfully
    *     established and `authenticateRequests` can expect to succeed, else
    *     resolves to `false`.
    * @return
    */
  /* CompleteClass */
  override def refreshCredentials(): typings.bluebird.mod.^[Boolean] = js.native
}
