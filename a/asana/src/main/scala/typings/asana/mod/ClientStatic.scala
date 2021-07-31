package typings.asana.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientStatic
  extends StObject
     with /**
  * Constructs a Client with instances of all the resources using the dispatcher.
  * It also keeps a reference to the dispatcher so that way the end user can have
  * access to it.
  * @class
  * @classdesc A wrapper for the Asana API which is authenticated for one user
  * @param {Dispatcher} dispatcher The request dispatcher to use
  * @param {Object} options        Options to configure the client
  * @param {String} [clientId]     ID of the client, required for Oauth
  * @param {String} [clientSecret] Secret key, for some Oauth flows
  * @param {String} [redirectUri]  Default redirect URI for this client
  * @param {String} [asanaBaseUrl] Base URL for Asana, for debugging
  */
Instantiable1[/* dispatcher */ Dispatcher, Client]
     with Instantiable2[/* dispatcher */ Dispatcher, /* options */ ClientOptions, Client] {
  
  /**
    * Creates a new client.
    * @param {Object} options Options for specifying the client, see constructor.
    */
  def create(): Client = js.native
  def create(options: ClientOptions): Client = js.native
}
