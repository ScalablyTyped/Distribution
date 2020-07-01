package typings.ariClient.mod

import typings.ariClient.anon.Body
import typings.ariClient.anon.Variables
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Endpoint extends Resource {
  /**
    * Ids of channels associated with this endpoint.
    */
  var channel_ids: String | js.Array[String] = js.native
  /**
    * Identifier of the endpoint, specific to the given technology.
    */
  var resource: String = js.native
  /**
    * Endpoints state.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * Technology of the endpoint.
    */
  var technology: String = js.native
  /**
    * Details for an endpoint.
    */
  def get(): js.Promise[Endpoint] = js.native
  /**
    * Details for an endpoint.
    */
  def get(callback: js.Function2[/* err */ Error, /* endpoint */ this.type, Unit]): Unit = js.native
  /**
    * List all endpoints.
    */
  def list(): js.Promise[js.Array[Endpoint]] = js.native
  /**
    * List all endpoints.
    */
  def list(callback: js.Function2[/* err */ Error, /* endpoints */ js.Array[this.type], Unit]): Unit = js.native
  /**
    * List available endoints for a given endpoint technology.
    */
  def listByTech(): js.Promise[js.Array[Endpoint]] = js.native
  /**
    * List available endoints for a given endpoint technology.
    */
  def listByTech(callback: js.Function2[/* err */ Error, /* endpoints */ js.Array[this.type], Unit]): Unit = js.native
  /**
    * Send a message to some technology URI or endpoint.
    *
    * @param params.to - The endpoint resource or technology specific URI to send the message to. Valid resources are sip, pjsip, and xmpp.
    * @param params.from - The endpoint resource or technology specific identity to send this message from. Valid resources are sip, pjsip, and xmpp.
    * @param [params.body] - The body of the message.
    * @param [params.variables] - The "variables" key in the body object holds technology specific key/value pairs to append to the message. These can be interpreted and used by the various
    * resource types; for example, pjsip and sip resource types will add the key/value pairs as SIP headers.
    */
  def sendMessage(params: Body): js.Promise[Unit] = js.native
  /**
    * Send a message to some technology URI or endpoint.
    *
    * @param params.to - The endpoint resource or technology specific URI to send the message to. Valid resources are sip, pjsip, and xmpp.
    * @param params.from - The endpoint resource or technology specific identity to send this message from. Valid resources are sip, pjsip, and xmpp.
    * @param [params.body] - The body of the message.
    * @param [params.variables] - The "variables" key in the body object holds technology specific key/value pairs to append to the message. These can be interpreted and used by the various
    * resource types; for example, pjsip and sip resource types will add the key/value pairs as SIP headers.
    */
  def sendMessage(params: Body, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  /**
    * Send a message to some endpoint in a technology.
    *
    * @param params.from - The endpoint resource or technology specific identity to send this message from. Valid resources are sip, pjsip, and xmpp.
    * @param [params.body] - The body of the message.
    * @param [params.variables] - The "variables" key in the body object holds technology specific key/value pairs to append to the message. These can be interpreted and used by the various
    * resource types; for example, pjsip and sip resource types will add the key/value pairs as SIP headers.
    */
  def sendMessageToEndpoint(params: Variables): js.Promise[Unit] = js.native
  /**
    * Send a message to some endpoint in a technology.
    *
    * @param params.from - The endpoint resource or technology specific identity to send this message from. Valid resources are sip, pjsip, and xmpp.
    * @param [params.body] - The body of the message.
    * @param [params.variables] - The "variables" key in the body object holds technology specific key/value pairs to append to the message. These can be interpreted and used by the various
    * resource types; for example, pjsip and sip resource types will add the key/value pairs as SIP headers.
    */
  def sendMessageToEndpoint(params: Variables, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}

