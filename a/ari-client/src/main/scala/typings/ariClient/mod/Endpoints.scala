package typings.ariClient.mod

import typings.ariClient.anon.Body
import typings.ariClient.anon.From
import typings.ariClient.anon.Tech
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Endpoints extends StObject {
  
  /**
    * Details for an endpoint.
    *
    * @param [params.tech] - Technology of the endpoint.
    * @param [params.resource] - ID of the endpoint.
    */
  def get(): js.Promise[Endpoint] = js.native
  /**
    * Details for an endpoint.
    */
  def get(callback: js.Function2[/* err */ js.Error, /* endpoint */ Endpoint, Unit]): Unit = js.native
  def get(params: typings.ariClient.anon.Resource): js.Promise[Endpoint] = js.native
  /**
    * Details for an endpoint.
    *
    * @param [params.tech] - Technology of the endpoint.
    * @param [params.resource] - ID of the endpoint.
    */
  def get(
    params: typings.ariClient.anon.Resource,
    callback: js.Function2[/* err */ js.Error, /* endpoint */ Endpoint, Unit]
  ): Unit = js.native
  
  /**
    * List all endpoints.
    */
  def list(): js.Promise[js.Array[Endpoint]] = js.native
  /**
    * List all endpoints.
    */
  def list(callback: js.Function2[/* err */ js.Error, /* endpoints */ js.Array[Endpoint], Unit]): Unit = js.native
  
  /**
    * List available endoints for a given endpoint technology.
    *
    * @param [params.tech] - Technology of the endpoints (sip,iax2,...).
    */
  def listByTech(): js.Promise[js.Array[Endpoint]] = js.native
  /**
    * List available endoints for a given endpoint technology.
    */
  def listByTech(callback: js.Function2[/* err */ js.Error, /* endpoints */ js.Array[Endpoint], Unit]): Unit = js.native
  def listByTech(params: Tech): js.Promise[js.Array[Endpoint]] = js.native
  /**
    * List available endoints for a given endpoint technology.
    *
    * @param [params.tech] - Technology of the endpoints (sip,iax2,...).
    */
  def listByTech(params: Tech, callback: js.Function2[/* err */ js.Error, /* endpoints */ js.Array[Endpoint], Unit]): Unit = js.native
  
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
  def sendMessage(params: Body, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  /**
    * Send a message to some endpoint in a technology.
    *
    * @param [params.tech] - Technology of the endpoint.
    * @param [params.resource] - ID of the endpoint.
    * @param params.from - The endpoint resource or technology specific identity to send this message from. Valid resources are sip, pjsip, and xmpp.
    * @param [params.body] - The body of the message.
    * @param [params.variables] - The "variables" key in the body object holds technology specific key/value pairs to append to the message. These can be interpreted and used by the various
    * resource types; for example, pjsip and sip resource types will add the key/value pairs as SIP headers.
    */
  def sendMessageToEndpoint(params: From): js.Promise[Unit] = js.native
  /**
    * Send a message to some endpoint in a technology.
    *
    * @param [params.tech] - Technology of the endpoint.
    * @param [params.resource] - ID of the endpoint.
    * @param params.from - The endpoint resource or technology specific identity to send this message from. Valid resources are sip, pjsip, and xmpp.
    * @param [params.body] - The body of the message.
    * @param [params.variables] - The "variables" key in the body object holds technology specific key/value pairs to append to the message. These can be interpreted and used by the various
    * resource types; for example, pjsip and sip resource types will add the key/value pairs as SIP headers.
    */
  def sendMessageToEndpoint(params: From, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
}
