package typings.ariClient.mod

import typings.ariClient.anon.`0`
import typings.ariClient.anon.`1`
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Application
  extends StObject
     with Resource {
  
  /**
    * Ids for bridges subscribed to.
    */
  var bridge_ids: String | js.Array[String] = js.native
  
  /**
    * Ids for channels subscribed to.
    */
  var channel_ids: String | js.Array[String] = js.native
  
  /**
    * Names of the devices subscribed to.
    */
  var device_names: String | js.Array[String] = js.native
  
  /**
    * {tech}/{resource} for endpoints subscribed to.
    */
  var endpoint_ids: String | js.Array[String] = js.native
  
  /**
    * Event types sent to the application.
    */
  var events_allowed: IndexableObject | js.Array[IndexableObject] = js.native
  
  /**
    * Event types not sent to the application.
    */
  var events_disallowed: IndexableObject | js.Array[IndexableObject] = js.native
  
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
    * @param [params.filter] - Specify which event types to allow/disallow.
    */
  def filter(): js.Promise[Application] = js.native
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
    */
  def filter(callback: js.Function2[/* err */ Error, /* application */ this.type, Unit]): Unit = js.native
  def filter(params: `1`): js.Promise[Application] = js.native
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
    * @param [params.filter] - Specify which event types to allow/disallow.
    */
  def filter(params: `1`, callback: js.Function2[/* err */ Error, /* application */ this.type, Unit]): Unit = js.native
  
  /**
    * Get details of an application.
    */
  def get(): js.Promise[Application] = js.native
  /**
    * Get details of an application.
    */
  def get(callback: js.Function2[/* err */ Error, /* application */ this.type, Unit]): Unit = js.native
  
  /**
    * List all applications.
    */
  def list(): js.Promise[js.Array[Application]] = js.native
  /**
    * List all applications.
    */
  def list(callback: js.Function2[/* err */ Error, /* applications */ js.Array[this.type], Unit]): Unit = js.native
  
  /**
    * Name of this application.
    */
  var name: String = js.native
  
  /**
    * Subscribe an application to a event source.
    * Returns the state of the application after the subscriptions have changed.
    *
    * @param params.eventSource - URI for event source (channel:{channelId}, bridge:{bridgeId}, endpoint:{tech}[/{resource}], deviceState:{deviceName}.
    */
  def subscribe(params: `0`): js.Promise[Application] = js.native
  /**
    * Subscribe an application to a event source.
    * Returns the state of the application after the subscriptions have changed.
    *
    * @param params.eventSource - URI for event source (channel:{channelId}, bridge:{bridgeId}, endpoint:{tech}[/{resource}], deviceState:{deviceName}.
    */
  def subscribe(params: `0`, callback: js.Function2[/* err */ Error, /* application */ this.type, Unit]): Unit = js.native
  
  /**
    * Unsubscribe an application from an event source.
    * Returns the state of the application after the subscriptions have changed.
    *
    * @param params.eventSource - URI for event source (channel:{channelId}, bridge:{bridgeId}, endpoint:{tech}[/{resource}], deviceState:{deviceName}.
    */
  def unsubscribe(params: `0`): js.Promise[Application] = js.native
  /**
    * Unsubscribe an application from an event source.
    * Returns the state of the application after the subscriptions have changed.
    *
    * @param params.eventSource - URI for event source (channel:{channelId}, bridge:{bridgeId}, endpoint:{tech}[/{resource}], deviceState:{deviceName}.
    */
  def unsubscribe(params: `0`, callback: js.Function2[/* err */ Error, /* application */ this.type, Unit]): Unit = js.native
}
