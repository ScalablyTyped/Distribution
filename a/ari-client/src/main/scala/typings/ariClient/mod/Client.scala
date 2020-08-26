package typings.ariClient.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Client extends Resource {
  /**
    *  Available Applications resources.
    */
  var applications: Applications = js.native
  /**
    *  Available Asterisk resource.
    */
  var asterisk: Asterisk = js.native
  /**
    *  Available Bridges resources.
    */
  var bridges: Bridges = js.native
  /**
    *  Available Channels resources.
    */
  var channels: Channels = js.native
  /**
    *  Available DeviceStates resources.
    */
  var deviceStates: DeviceStates = js.native
  /**
    *  Available Endpoints resources.
    */
  var endpoints: Endpoints = js.native
  /**
    *  Available Events resources.
    */
  var events: Events = js.native
  /**
    *  Available Mailboxes resources.
    */
  var mailboxes: Mailboxes = js.native
  /**
    *  Available Playbacks resources.
    */
  var playbacks: Playbacks = js.native
  /**
    *  Available Recordings resources.
    */
  var recordings: Recordings = js.native
  /**
    *  Available Sounds resources.
    */
  var sounds: Sounds = js.native
  /**
    *  Creates a new Application instance.
    */
  def Application(): typings.ariClient.mod.Application = js.native
  def Application(id: js.UndefOr[scala.Nothing], objValues: IndexableObject): typings.ariClient.mod.Application = js.native
  def Application(id: String): typings.ariClient.mod.Application = js.native
  def Application(id: String, objValues: IndexableObject): typings.ariClient.mod.Application = js.native
  /**
    *  Creates a new Asterisk instance.
    */
  def Asterisk(): typings.ariClient.mod.Asterisk = js.native
  def Asterisk(id: js.UndefOr[scala.Nothing], objValues: IndexableObject): typings.ariClient.mod.Asterisk = js.native
  def Asterisk(id: String): typings.ariClient.mod.Asterisk = js.native
  def Asterisk(id: String, objValues: IndexableObject): typings.ariClient.mod.Asterisk = js.native
  /**
    *  Creates a new Bridge instance.
    */
  def Bridge(): typings.ariClient.mod.Bridge = js.native
  def Bridge(id: js.UndefOr[scala.Nothing], objValues: IndexableObject): typings.ariClient.mod.Bridge = js.native
  def Bridge(id: String): typings.ariClient.mod.Bridge = js.native
  def Bridge(id: String, objValues: IndexableObject): typings.ariClient.mod.Bridge = js.native
  /**
    *  Creates a new Channel instance.
    */
  def Channel(): typings.ariClient.mod.Channel = js.native
  def Channel(id: js.UndefOr[scala.Nothing], objValues: IndexableObject): typings.ariClient.mod.Channel = js.native
  def Channel(id: String): typings.ariClient.mod.Channel = js.native
  def Channel(id: String, objValues: IndexableObject): typings.ariClient.mod.Channel = js.native
  /**
    *  Creates a new DeviceState instance.
    */
  def DeviceState(): typings.ariClient.mod.DeviceState = js.native
  def DeviceState(id: js.UndefOr[scala.Nothing], objValues: IndexableObject): typings.ariClient.mod.DeviceState = js.native
  def DeviceState(id: String): typings.ariClient.mod.DeviceState = js.native
  def DeviceState(id: String, objValues: IndexableObject): typings.ariClient.mod.DeviceState = js.native
  /**
    *  Creates a new Endpoint instance.
    */
  def Endpoint(): typings.ariClient.mod.Endpoint = js.native
  def Endpoint(id: js.UndefOr[scala.Nothing], objValues: IndexableObject): typings.ariClient.mod.Endpoint = js.native
  def Endpoint(id: String): typings.ariClient.mod.Endpoint = js.native
  def Endpoint(id: String, objValues: IndexableObject): typings.ariClient.mod.Endpoint = js.native
  /**
    *  Creates a new LiveRecording instance.
    */
  def LiveRecording(): typings.ariClient.mod.LiveRecording = js.native
  def LiveRecording(id: js.UndefOr[scala.Nothing], objValues: IndexableObject): typings.ariClient.mod.LiveRecording = js.native
  def LiveRecording(id: String): typings.ariClient.mod.LiveRecording = js.native
  def LiveRecording(id: String, objValues: IndexableObject): typings.ariClient.mod.LiveRecording = js.native
  /**
    *  Creates a new Mailbox instance.
    */
  def Mailbox(): typings.ariClient.mod.Mailbox = js.native
  def Mailbox(id: js.UndefOr[scala.Nothing], objValues: IndexableObject): typings.ariClient.mod.Mailbox = js.native
  def Mailbox(id: String): typings.ariClient.mod.Mailbox = js.native
  def Mailbox(id: String, objValues: IndexableObject): typings.ariClient.mod.Mailbox = js.native
  /**
    *  Creates a new Playback instance.
    */
  def Playback(): typings.ariClient.mod.Playback = js.native
  def Playback(id: js.UndefOr[scala.Nothing], objValues: IndexableObject): typings.ariClient.mod.Playback = js.native
  def Playback(id: String): typings.ariClient.mod.Playback = js.native
  def Playback(id: String, objValues: IndexableObject): typings.ariClient.mod.Playback = js.native
  /**
    *  Creates a new Sound instance.
    */
  def Sound(): typings.ariClient.mod.Sound = js.native
  def Sound(id: js.UndefOr[scala.Nothing], objValues: IndexableObject): typings.ariClient.mod.Sound = js.native
  def Sound(id: String): typings.ariClient.mod.Sound = js.native
  def Sound(id: String, objValues: IndexableObject): typings.ariClient.mod.Sound = js.native
  /**
    *  Creates a new StoredRecording instance.
    */
  def StoredRecording(): typings.ariClient.mod.StoredRecording = js.native
  def StoredRecording(id: js.UndefOr[scala.Nothing], objValues: IndexableObject): typings.ariClient.mod.StoredRecording = js.native
  def StoredRecording(id: String): typings.ariClient.mod.StoredRecording = js.native
  def StoredRecording(id: String, objValues: IndexableObject): typings.ariClient.mod.StoredRecording = js.native
  /**
    *  Pings the WebSocket.
    */
  def ping(): Unit = js.native
  /**
    *  Creates the WebSocket connection, subscribing to the given apps.
    *
    *  @param apps - Name or array of names of the applications to be started.
    *  @param [callback] - The callback to be called after applications have started.
    */
  def start(apps: String): Unit = js.native
  def start(apps: String, callback: js.Function2[/* err */ Error, /* repeated */ js.Any, Unit]): Unit = js.native
  /**
    *  Creates the WebSocket connection, subscribing to the given apps.
    *
    *  @param apps - Name or array of names of the applications to be started.
    *  @param subscribeAll - Subscribe to all Asterisk events (true/false).
    *  @param [callback] - The callback to be called after applications have started.
    */
  def start(apps: String, subscribeAll: Boolean): Unit = js.native
  def start(
    apps: String,
    subscribeAll: Boolean,
    callback: js.Function2[/* err */ Error, /* repeated */ js.Any, Unit]
  ): Unit = js.native
  def start(apps: js.Array[String]): Unit = js.native
  def start(apps: js.Array[String], callback: js.Function2[/* err */ Error, /* repeated */ js.Any, Unit]): Unit = js.native
  def start(apps: js.Array[String], subscribeAll: Boolean): Unit = js.native
  def start(
    apps: js.Array[String],
    subscribeAll: Boolean,
    callback: js.Function2[/* err */ Error, /* repeated */ js.Any, Unit]
  ): Unit = js.native
  /**
    *  Closes the WebSocket connection.
    */
  def stop(): Unit = js.native
}

