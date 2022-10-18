package typings.ariClient.mod

import typings.ariClient.anon.ApplicationName
import typings.ariClient.anon.ApplicationNameEventSource
import typings.ariClient.anon.ApplicationNameFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Applications extends StObject {
  
  /**
    * Filter application events types.
    * Allowed and/or disallowed event type filtering can be done. The body (parameter) should specify a JSON key/value object that describes the type of event filtering needed. One, or
    * both of the following keys can be designated: "allowed" - Specifies an allowed list of event types "disallowed" - Specifies a disallowed list of event types Further, each of those
    * keys value should be a JSON array that holds zero, or more JSON key/value objects. Each of these objects must contain the following key with an associated value: "type" - The
    * type name of the event to filter The value must be the string name (case sensitive) of the event type that needs filtering. For example: { "allowed": [ { "type": "StasisStart" },
    * { "type": "StasisEnd" } ] } As this specifies only an allowed list, then only those two event type messages are sent to the application. No other event messages are sent. The following
    * rules apply: * If the body is empty, both the allowed and disallowed filters are set empty. * If both list types are given then both are set to their respective values (note,
    * specifying an empty array for a given type sets that type to empty). * If only one list type is given then only that type is set. The other type is not updated. * An empty "allowed"
    * list means all events are allowed. * An empty "disallowed" list means no events are disallowed. * Disallowed events take precedence over allowed events if the event type
    * is specified in both lists.
    *
    * @param params.applicationName - Applications name.
    * @param [params.filter] - Specify which event types to allow/disallow.
    */
  def filter(params: ApplicationNameFilter): js.Promise[Application] = js.native
  /**
    * Filter application events types.
    * Allowed and/or disallowed event type filtering can be done. The body (parameter) should specify a JSON key/value object that describes the type of event filtering needed. One, or
    * both of the following keys can be designated: "allowed" - Specifies an allowed list of event types "disallowed" - Specifies a disallowed list of event types Further, each of those
    * keys value should be a JSON array that holds zero, or more JSON key/value objects. Each of these objects must contain the following key with an associated value: "type" - The
    * type name of the event to filter The value must be the string name (case sensitive) of the event type that needs filtering. For example: { "allowed": [ { "type": "StasisStart" },
    * { "type": "StasisEnd" } ] } As this specifies only an allowed list, then only those two event type messages are sent to the application. No other event messages are sent. The following
    * rules apply: * If the body is empty, both the allowed and disallowed filters are set empty. * If both list types are given then both are set to their respective values (note,
    * specifying an empty array for a given type sets that type to empty). * If only one list type is given then only that type is set. The other type is not updated. * An empty "allowed"
    * list means all events are allowed. * An empty "disallowed" list means no events are disallowed. * Disallowed events take precedence over allowed events if the event type
    * is specified in both lists.
    *
    * @param params.applicationName - Applications name.
    * @param [params.filter] - Specify which event types to allow/disallow.
    */
  def filter(
    params: ApplicationNameFilter,
    callback: js.Function2[/* err */ js.Error, /* application */ Application, Unit]
  ): Unit = js.native
  
  /**
    * Get details of an application.
    *
    * @param params.applicationName - Applications name.
    */
  def get(params: ApplicationName): js.Promise[Application] = js.native
  /**
    * Get details of an application.
    *
    * @param params.applicationName - Applications name.
    */
  def get(
    params: ApplicationName,
    callback: js.Function2[/* err */ js.Error, /* application */ Application, Unit]
  ): Unit = js.native
  
  /**
    * List all applications.
    */
  def list(): js.Promise[js.Array[Application]] = js.native
  /**
    * List all applications.
    */
  def list(callback: js.Function2[/* err */ js.Error, /* applications */ js.Array[Application], Unit]): Unit = js.native
  
  /**
    * Subscribe an application to a event source.
    * Returns the state of the application after the subscriptions have changed.
    *
    * @param params.applicationName - Applications name.
    * @param params.eventSource - URI for event source (channel:{channelId}, bridge:{bridgeId}, endpoint:{tech}[/{resource}], deviceState:{deviceName}.
    */
  def subscribe(params: ApplicationNameEventSource): js.Promise[Application] = js.native
  /**
    * Subscribe an application to a event source.
    * Returns the state of the application after the subscriptions have changed.
    *
    * @param params.applicationName - Applications name.
    * @param params.eventSource - URI for event source (channel:{channelId}, bridge:{bridgeId}, endpoint:{tech}[/{resource}], deviceState:{deviceName}.
    */
  def subscribe(
    params: ApplicationNameEventSource,
    callback: js.Function2[/* err */ js.Error, /* application */ Application, Unit]
  ): Unit = js.native
  
  /**
    * Unsubscribe an application from an event source.
    * Returns the state of the application after the subscriptions have changed.
    *
    * @param params.applicationName - Applications name.
    * @param params.eventSource - URI for event source (channel:{channelId}, bridge:{bridgeId}, endpoint:{tech}[/{resource}], deviceState:{deviceName}.
    */
  def unsubscribe(params: ApplicationNameEventSource): js.Promise[Application] = js.native
  /**
    * Unsubscribe an application from an event source.
    * Returns the state of the application after the subscriptions have changed.
    *
    * @param params.applicationName - Applications name.
    * @param params.eventSource - URI for event source (channel:{channelId}, bridge:{bridgeId}, endpoint:{tech}[/{resource}], deviceState:{deviceName}.
    */
  def unsubscribe(
    params: ApplicationNameEventSource,
    callback: js.Function2[/* err */ js.Error, /* application */ Application, Unit]
  ): Unit = js.native
}
