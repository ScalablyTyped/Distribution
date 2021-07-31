package typings.asana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("asana", "Client")
@js.native
class ClientCls protected ()
  extends StObject
     with Client {
  /**
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
  def this(dispatcher: Dispatcher) = this()
  def this(dispatcher: Dispatcher, options: ClientOptions) = this()
}
