package typings
package asanaLib.asanaMod.asanaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientStatic extends js.Object {
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
  def apply(dispatcher: Dispatcher): Client = js.native
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
  def apply(dispatcher: Dispatcher, options: ClientOptions): Client = js.native
  /**
           * Creates a new client.
           * @param {Object} options Options for specifying the client, see constructor.
           */
  def create(): Client = js.native
  /**
           * Creates a new client.
           * @param {Object} options Options for specifying the client, see constructor.
           */
  def create(options: ClientOptions): Client = js.native
}

