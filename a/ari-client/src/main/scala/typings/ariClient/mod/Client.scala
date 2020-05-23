package typings.ariClient.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Client extends Resource {
  /* Properties */
  var applications: Applications = js.native
  var asterisk: Asterisk = js.native
  var bridges: Bridges = js.native
  var channels: Channels = js.native
  var deviceStates: DeviceStates = js.native
  var endpoints: Endpoints = js.native
  var events: Events = js.native
  var mailboxes: Mailboxes = js.native
  var playbacks: Playbacks = js.native
  var recordings: Recordings = js.native
  var sounds: Sounds = js.native
  /* Create Methods */
  def Application(): typings.ariClient.mod.Application = js.native
  def Application(id: String): typings.ariClient.mod.Application = js.native
  def Application(id: String, objValues: IndexableObject): typings.ariClient.mod.Application = js.native
  def Asterisk(): typings.ariClient.mod.Asterisk = js.native
  def Asterisk(id: String): typings.ariClient.mod.Asterisk = js.native
  def Asterisk(id: String, objValues: IndexableObject): typings.ariClient.mod.Asterisk = js.native
  def Bridge(): typings.ariClient.mod.Bridge = js.native
  def Bridge(id: String): typings.ariClient.mod.Bridge = js.native
  def Bridge(id: String, objValues: IndexableObject): typings.ariClient.mod.Bridge = js.native
  def Channel(): typings.ariClient.mod.Channel = js.native
  def Channel(id: String): typings.ariClient.mod.Channel = js.native
  def Channel(id: String, objValues: IndexableObject): typings.ariClient.mod.Channel = js.native
  def DeviceState(): typings.ariClient.mod.DeviceState = js.native
  def DeviceState(id: String): typings.ariClient.mod.DeviceState = js.native
  def DeviceState(id: String, objValues: IndexableObject): typings.ariClient.mod.DeviceState = js.native
  def Endpoint(): typings.ariClient.mod.Endpoint = js.native
  def Endpoint(id: String): typings.ariClient.mod.Endpoint = js.native
  def Endpoint(id: String, objValues: IndexableObject): typings.ariClient.mod.Endpoint = js.native
  def LiveRecording(): typings.ariClient.mod.LiveRecording = js.native
  def LiveRecording(id: String): typings.ariClient.mod.LiveRecording = js.native
  def LiveRecording(id: String, objValues: IndexableObject): typings.ariClient.mod.LiveRecording = js.native
  def Mailbox(): typings.ariClient.mod.Mailbox = js.native
  def Mailbox(id: String): typings.ariClient.mod.Mailbox = js.native
  def Mailbox(id: String, objValues: IndexableObject): typings.ariClient.mod.Mailbox = js.native
  def Playback(): typings.ariClient.mod.Playback = js.native
  def Playback(id: String): typings.ariClient.mod.Playback = js.native
  def Playback(id: String, objValues: IndexableObject): typings.ariClient.mod.Playback = js.native
  def Sound(): typings.ariClient.mod.Sound = js.native
  def Sound(id: String): typings.ariClient.mod.Sound = js.native
  def Sound(id: String, objValues: IndexableObject): typings.ariClient.mod.Sound = js.native
  def StoredRecording(): typings.ariClient.mod.StoredRecording = js.native
  def StoredRecording(id: String): typings.ariClient.mod.StoredRecording = js.native
  def StoredRecording(id: String, objValues: IndexableObject): typings.ariClient.mod.StoredRecording = js.native
  def start(apps: String): Unit = js.native
  def start(apps: String, callback: js.Function2[/* err */ Error, /* repeated */ js.Any, Unit]): Unit = js.native
  /* Start and Stop Method Overloads */
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
  def stop(): Unit = js.native
}

