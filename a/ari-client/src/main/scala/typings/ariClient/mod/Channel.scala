package typings.ariClient.mod

import typings.ariClient.anon.AppArgsSnoopId
import typings.ariClient.anon.AppString
import typings.ariClient.anon.Before
import typings.ariClient.anon.DirectionString
import typings.ariClient.anon.Encapsulation
import typings.ariClient.anon.EndpointString
import typings.ariClient.anon.Extension
import typings.ariClient.anon.Format
import typings.ariClient.anon.Formats
import typings.ariClient.anon.Label
import typings.ariClient.anon.MohClassString
import typings.ariClient.anon.Offsetms
import typings.ariClient.anon.PlaybackId
import typings.ariClient.anon.ReasonString
import typings.ariClient.anon.Timeout
import typings.ariClient.anon.Value
import typings.ariClient.anon.Whisper
import typings.std.Date
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Channel extends Resource {
  /**
    * Accountcode.
    */
  var accountcode: String = js.native
  /**
    * Caller.
    */
  var caller: CallerID = js.native
  /**
    * Channel variables.
    */
  var channelvars: js.UndefOr[IndexableObject] = js.native
  /**
    * Connected.
    */
  var connected: CallerID = js.native
  /**
    * Timestamp when channel was created.
    */
  var creationtime: Date = js.native
  /**
    * Current location in the dialplan.
    */
  var dialplan: DialplanCEP = js.native
  /**
    * Unique identifier of the channel. This is the same as the Uniqueid field in AMI.
    */
  var id: String = js.native
  /**
    * The default spoken language.
    */
  var language: String = js.native
  /**
    * Name of the channel (i.e. SIP/foo-0000a7e3).
    */
  var name: String = js.native
  /**
    * State.
    */
  var state: String = js.native
  /**
    * Answer a channel.
    */
  def answer(): js.Promise[Unit] = js.native
  /**
    * Answer a channel.
    */
  def answer(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  /**
    * Exit application; continue execution in the dialplan.
    *
    * @param [params.context] - The context to continue to.
    * @param [params.extension] - The extension to continue to.
    * @param [params.priority] - The priority to continue to.
    * @param [params.label] - The label to continue to - will supersede priority if both are provided.
    */
  def continueInDialplan(): js.Promise[Unit] = js.native
  /**
    * Exit application; continue execution in the dialplan.
    */
  def continueInDialplan(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def continueInDialplan(params: Label): js.Promise[Unit] = js.native
  /**
    * Exit application; continue execution in the dialplan.
    *
    * @param [params.context] - The context to continue to.
    * @param [params.extension] - The extension to continue to.
    * @param [params.priority] - The priority to continue to.
    * @param [params.label] - The label to continue to - will supersede priority if both are provided.
    */
  def continueInDialplan(params: Label, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  /**
    * Create channel.
    *
    * @param params.endpoint - Endpoint for channel communication.
    * @param params.app - Stasis Application to place channel into.
    * @param [params.appArgs] - The application arguments to pass to the Stasis application provided by app. Mutually exclusive with context, extension, priority, and label.
    * @param [params.otherChannelId] - The unique id to assign the second channel when using local channels.
    * @param [params.originator] - Unique ID of the calling channel.
    * @param [params.formats] - The format name capability list to use if originator is not specified. Ex. "ulaw,slin16". Format names can be found with "core show codecs".
    */
  def create(params: Formats): js.Promise[Channel] = js.native
  /**
    * Create channel.
    *
    * @param params.endpoint - Endpoint for channel communication.
    * @param params.app - Stasis Application to place channel into.
    * @param [params.appArgs] - The application arguments to pass to the Stasis application provided by app. Mutually exclusive with context, extension, priority, and label.
    * @param [params.otherChannelId] - The unique id to assign the second channel when using local channels.
    * @param [params.originator] - Unique ID of the calling channel.
    * @param [params.formats] - The format name capability list to use if originator is not specified. Ex. "ulaw,slin16". Format names can be found with "core show codecs".
    */
  def create(params: Formats, callback: js.Function2[/* err */ Error, /* channel */ this.type, Unit]): Unit = js.native
  /**
    * Dial a created channel.
    *
    * @param [params.caller] - Channel ID of caller.
    * @param [params.timeout] - Dial timeout.
    */
  def dial(): js.Promise[Unit] = js.native
  /**
    * Dial a created channel.
    */
  def dial(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def dial(params: Timeout): js.Promise[Unit] = js.native
  /**
    * Dial a created channel.
    *
    * @param [params.caller] - Channel ID of caller.
    * @param [params.timeout] - Dial timeout.
    */
  def dial(params: Timeout, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  /**
    * Start an External Media session.
    * Create a channel to an External Media source/sink.
    *
    * @param params.app - Stasis Application to place channel into.
    * @param [params.variables] - The "variables" key in the body object holds variable key/value pairs to set on the channel on creation. Other keys in the body object are interpreted
    * as query parameters. Ex. { "endpoint": "SIP/Alice", "variables": { "CALLERID(name)": "Alice" } }.
    * @param params.external_host - Hostname/ip:port of external host.
    * @param [params.encapsulation] - Payload encapsulation protocol.
    * @param [params.transport] - Transport protocol.
    * @param [params.connection_type] - Connection type (client/server).
    * @param params.format - Format to encode audio in.
    * @param [params.direction] - External media direction.
    */
  def externalMedia(params: Encapsulation): js.Promise[Channel] = js.native
  /**
    * Start an External Media session.
    * Create a channel to an External Media source/sink.
    *
    * @param params.app - Stasis Application to place channel into.
    * @param [params.variables] - The "variables" key in the body object holds variable key/value pairs to set on the channel on creation. Other keys in the body object are interpreted
    * as query parameters. Ex. { "endpoint": "SIP/Alice", "variables": { "CALLERID(name)": "Alice" } }.
    * @param params.external_host - Hostname/ip:port of external host.
    * @param [params.encapsulation] - Payload encapsulation protocol.
    * @param [params.transport] - Transport protocol.
    * @param [params.connection_type] - Connection type (client/server).
    * @param params.format - Format to encode audio in.
    * @param [params.direction] - External media direction.
    */
  def externalMedia(params: Encapsulation, callback: js.Function2[/* err */ Error, /* channel */ this.type, Unit]): Unit = js.native
  /**
    * Channel details.
    */
  def get(): js.Promise[Channel] = js.native
  /**
    * Channel details.
    */
  def get(callback: js.Function2[/* err */ Error, /* channel */ this.type, Unit]): Unit = js.native
  /**
    * Get the value of a channel variable or function.
    *
    * @param params.variable - The channel variable or function to get.
    */
  def getChannelVar(params: typings.ariClient.anon.Variable): js.Promise[Variable] = js.native
  /**
    * Get the value of a channel variable or function.
    *
    * @param params.variable - The channel variable or function to get.
    */
  def getChannelVar(
    params: typings.ariClient.anon.Variable,
    callback: js.Function2[/* err */ Error, /* variable */ Variable, Unit]
  ): Unit = js.native
  /**
    * Delete (i.e. hangup) a channel.
    *
    * @param [params.reason] - Reason for hanging up the channel.
    */
  def hangup(): js.Promise[Unit] = js.native
  /**
    * Delete (i.e. hangup) a channel.
    */
  def hangup(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def hangup(params: ReasonString): js.Promise[Unit] = js.native
  /**
    * Delete (i.e. hangup) a channel.
    *
    * @param [params.reason] - Reason for hanging up the channel.
    */
  def hangup(params: ReasonString, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  /**
    * Hold a channel.
    */
  def hold(): js.Promise[Unit] = js.native
  /**
    * Hold a channel.
    */
  def hold(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  /**
    * List all active channels in Asterisk.
    */
  def list(): js.Promise[js.Array[Channel]] = js.native
  /**
    * List all active channels in Asterisk.
    */
  def list(callback: js.Function2[/* err */ Error, /* channels */ js.Array[this.type], Unit]): Unit = js.native
  /**
    * Move the channel from one Stasis application to another.
    *
    * @param params.app - The channel will be passed to this Stasis application.
    * @param [params.appArgs] - The application arguments to pass to the Stasis application provided by app.
    */
  def move(params: AppString): js.Promise[Unit] = js.native
  /**
    * Move the channel from one Stasis application to another.
    *
    * @param params.app - The channel will be passed to this Stasis application.
    * @param [params.appArgs] - The application arguments to pass to the Stasis application provided by app.
    */
  def move(params: AppString, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  /**
    * Mute a channel.
    *
    * @param [params.direction] - Direction in which to mute audio.
    */
  def mute(): js.Promise[Unit] = js.native
  /**
    * Mute a channel.
    */
  def mute(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def mute(params: DirectionString): js.Promise[Unit] = js.native
  /**
    * Mute a channel.
    *
    * @param [params.direction] - Direction in which to mute audio.
    */
  def mute(params: DirectionString, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  /**
    * Create a new channel (originate).
    * The new channel is created immediately and a snapshot of it returned. If a Stasis application is provided it will be automatically subscribed to the originated channel for further
    * events and updates.
    *
    * @param params.endpoint - Endpoint to call.
    * @param [params.extension] - The extension to dial after the endpoint answers. Mutually exclusive with app.
    * @param [params.context] - The context to dial after the endpoint answers. If omitted, uses default. Mutually exclusive with app.
    * @param [params.priority] - The priority to dial after the endpoint answers. If omitted, uses 1. Mutually exclusive with app.
    * @param [params.label] - The label to dial after the endpoint answers. Will supersede priority if provided. Mutually exclusive with app.
    * @param [params.app] - The application that is subscribed to the originated channel. When the channel is answered, it will be passed to this Stasis application. Mutually exclusive
    * with context, extension, priority, and label.
    * @param [params.appArgs] - The application arguments to pass to the Stasis application provided by app. Mutually exclusive with context, extension, priority, and label.
    * @param [params.callerId] - CallerID to use when dialing the endpoint or extension.
    * @param [params.timeout] - Timeout (in seconds) before giving up dialing, or -1 for no timeout.
    * @param [params.variables] - The "variables" key in the body object holds variable key/value pairs to set on the channel on creation. Other keys in the body object are interpreted
    * as query parameters. Ex. { "endpoint": "SIP/Alice", "variables": { "CALLERID(name)": "Alice" } }.
    * @param [params.otherChannelId] - The unique id to assign the second channel when using local channels.
    * @param [params.originator] - The unique id of the channel which is originating this one.
    * @param [params.formats] - The format name capability list to use if originator is not specified. Ex. "ulaw,slin16". Format names can be found with "core show codecs".
    */
  def originate(params: Extension): js.Promise[Channel] = js.native
  /**
    * Create a new channel (originate).
    * The new channel is created immediately and a snapshot of it returned. If a Stasis application is provided it will be automatically subscribed to the originated channel for further
    * events and updates.
    *
    * @param params.endpoint - Endpoint to call.
    * @param [params.extension] - The extension to dial after the endpoint answers. Mutually exclusive with app.
    * @param [params.context] - The context to dial after the endpoint answers. If omitted, uses default. Mutually exclusive with app.
    * @param [params.priority] - The priority to dial after the endpoint answers. If omitted, uses 1. Mutually exclusive with app.
    * @param [params.label] - The label to dial after the endpoint answers. Will supersede priority if provided. Mutually exclusive with app.
    * @param [params.app] - The application that is subscribed to the originated channel. When the channel is answered, it will be passed to this Stasis application. Mutually exclusive
    * with context, extension, priority, and label.
    * @param [params.appArgs] - The application arguments to pass to the Stasis application provided by app. Mutually exclusive with context, extension, priority, and label.
    * @param [params.callerId] - CallerID to use when dialing the endpoint or extension.
    * @param [params.timeout] - Timeout (in seconds) before giving up dialing, or -1 for no timeout.
    * @param [params.variables] - The "variables" key in the body object holds variable key/value pairs to set on the channel on creation. Other keys in the body object are interpreted
    * as query parameters. Ex. { "endpoint": "SIP/Alice", "variables": { "CALLERID(name)": "Alice" } }.
    * @param [params.otherChannelId] - The unique id to assign the second channel when using local channels.
    * @param [params.originator] - The unique id of the channel which is originating this one.
    * @param [params.formats] - The format name capability list to use if originator is not specified. Ex. "ulaw,slin16". Format names can be found with "core show codecs".
    */
  def originate(params: Extension, callback: js.Function2[/* err */ Error, /* channel */ this.type, Unit]): Unit = js.native
  /**
    * Create a new channel (originate with id).
    * The new channel is created immediately and a snapshot of it returned. If a Stasis application is provided it will be automatically subscribed to the originated channel for further
    * events and updates.
    *
    * @param params.endpoint - Endpoint to call.
    * @param [params.extension] - The extension to dial after the endpoint answers. Mutually exclusive with app.
    * @param [params.context] - The context to dial after the endpoint answers. If omitted, uses default. Mutually exclusive with app.
    * @param [params.priority] - The priority to dial after the endpoint answers. If omitted, uses 1. Mutually exclusive with app.
    * @param [params.label] - The label to dial after the endpoint answers. Will supersede priority if provided. Mutually exclusive with app.
    * @param [params.app] - The application that is subscribed to the originated channel. When the channel is answered, it will be passed to this Stasis application. Mutually exclusive
    * with context, extension, priority, and label.
    * @param [params.appArgs] - The application arguments to pass to the Stasis application provided by app. Mutually exclusive with context, extension, priority, and label.
    * @param [params.callerId] - CallerID to use when dialing the endpoint or extension.
    * @param [params.timeout] - Timeout (in seconds) before giving up dialing, or -1 for no timeout.
    * @param [params.variables] - The "variables" key in the body object holds variable key/value pairs to set on the channel on creation. Other keys in the body object are interpreted
    * as query parameters. Ex. { "endpoint": "SIP/Alice", "variables": { "CALLERID(name)": "Alice" } }.
    * @param [params.otherChannelId] - The unique id to assign the second channel when using local channels.
    * @param [params.originator] - The unique id of the channel which is originating this one.
    * @param [params.formats] - The format name capability list to use if originator is not specified. Ex. "ulaw,slin16". Format names can be found with "core show codecs".
    */
  def originateWithId(params: Extension): js.Promise[Channel] = js.native
  /**
    * Create a new channel (originate with id).
    * The new channel is created immediately and a snapshot of it returned. If a Stasis application is provided it will be automatically subscribed to the originated channel for further
    * events and updates.
    *
    * @param params.endpoint - Endpoint to call.
    * @param [params.extension] - The extension to dial after the endpoint answers. Mutually exclusive with app.
    * @param [params.context] - The context to dial after the endpoint answers. If omitted, uses default. Mutually exclusive with app.
    * @param [params.priority] - The priority to dial after the endpoint answers. If omitted, uses 1. Mutually exclusive with app.
    * @param [params.label] - The label to dial after the endpoint answers. Will supersede priority if provided. Mutually exclusive with app.
    * @param [params.app] - The application that is subscribed to the originated channel. When the channel is answered, it will be passed to this Stasis application. Mutually exclusive
    * with context, extension, priority, and label.
    * @param [params.appArgs] - The application arguments to pass to the Stasis application provided by app. Mutually exclusive with context, extension, priority, and label.
    * @param [params.callerId] - CallerID to use when dialing the endpoint or extension.
    * @param [params.timeout] - Timeout (in seconds) before giving up dialing, or -1 for no timeout.
    * @param [params.variables] - The "variables" key in the body object holds variable key/value pairs to set on the channel on creation. Other keys in the body object are interpreted
    * as query parameters. Ex. { "endpoint": "SIP/Alice", "variables": { "CALLERID(name)": "Alice" } }.
    * @param [params.otherChannelId] - The unique id to assign the second channel when using local channels.
    * @param [params.originator] - The unique id of the channel which is originating this one.
    * @param [params.formats] - The format name capability list to use if originator is not specified. Ex. "ulaw,slin16". Format names can be found with "core show codecs".
    */
  def originateWithId(params: Extension, callback: js.Function2[/* err */ Error, /* channel */ this.type, Unit]): Unit = js.native
  /**
    * Start playback of media.
    * The media URI may be any of a number of URIs. Currently sound:, recording:, number:, digits:, characters:, and tone: URIs are supported. This operation creates a playback resource
    * that can be used to control the playback of media (pause, rewind, fast forward, etc.).
    *
    * @param params.media - Media URIs to play.
    * @param [params.lang] - For sounds, selects language for sound.
    * @param [params.offsetms] - Number of milliseconds to skip before playing. Only applies to the first URI if multiple media URIs are specified.
    * @param [params.skipms] - Number of milliseconds to skip for forward/reverse operations.
    * @param [params.playbackId] - Playback ID.
    */
  def play(params: Offsetms, playback: Playback): js.Promise[Playback] = js.native
  /**
    * Start playback of media.
    * The media URI may be any of a number of URIs. Currently sound:, recording:, number:, digits:, characters:, and tone: URIs are supported. This operation creates a playback resource
    * that can be used to control the playback of media (pause, rewind, fast forward, etc.).
    *
    * @param params.media - Media URIs to play.
    * @param [params.lang] - For sounds, selects language for sound.
    * @param [params.offsetms] - Number of milliseconds to skip before playing. Only applies to the first URI if multiple media URIs are specified.
    * @param [params.skipms] - Number of milliseconds to skip for forward/reverse operations.
    * @param [params.playbackId] - Playback ID.
    */
  def play(
    params: Offsetms,
    playback: Playback,
    callback: js.Function2[/* err */ Error, /* playback */ Playback, Unit]
  ): Unit = js.native
  /**
    * Start playback of media and specify the playbackId.
    * The media URI may be any of a number of URIs. Currently sound:, recording:, number:, digits:, characters:, and tone: URIs are supported. This operation creates a playback resource
    * that can be used to control the playback of media (pause, rewind, fast forward, etc.).
    *
    * @param params.playbackId - Playback ID.
    * @param params.media - Media URIs to play.
    * @param [params.lang] - For sounds, selects language for sound.
    * @param [params.offsetms] - Number of milliseconds to skip before playing. Only applies to the first URI if multiple media URIs are specified.
    * @param [params.skipms] - Number of milliseconds to skip for forward/reverse operations.
    */
  def playWithId(params: PlaybackId): js.Promise[Playback] = js.native
  /**
    * Start playback of media and specify the playbackId.
    * The media URI may be any of a number of URIs. Currently sound:, recording:, number:, digits:, characters:, and tone: URIs are supported. This operation creates a playback resource
    * that can be used to control the playback of media (pause, rewind, fast forward, etc.).
    *
    * @param params.playbackId - Playback ID.
    * @param params.media - Media URIs to play.
    * @param [params.lang] - For sounds, selects language for sound.
    * @param [params.offsetms] - Number of milliseconds to skip before playing. Only applies to the first URI if multiple media URIs are specified.
    * @param [params.skipms] - Number of milliseconds to skip for forward/reverse operations.
    */
  def playWithId(params: PlaybackId, callback: js.Function2[/* err */ Error, /* playback */ Playback, Unit]): Unit = js.native
  /**
    * Start a recording.
    * Record audio from a channel. Note that this will not capture audio sent to the channel. The bridge itself has a record feature if thats what you want.
    *
    * @param params.name - Recordings filename.
    * @param params.format - Format to encode audio in.
    * @param [params.maxDurationSeconds] - Maximum duration of the recording, in seconds. 0 for no limit.
    * @param [params.maxSilenceSeconds] - Maximum duration of silence, in seconds. 0 for no limit.
    * @param [params.ifExists] - Action to take if a recording with the same name already exists.
    * @param [params.beep] - Play beep when recording begins.
    * @param [params.terminateOn] - DTMF input to terminate recording.
    */
  def record(params: Format, recording: LiveRecording): js.Promise[LiveRecording] = js.native
  /**
    * Start a recording.
    * Record audio from a channel. Note that this will not capture audio sent to the channel. The bridge itself has a record feature if thats what you want.
    *
    * @param params.name - Recordings filename.
    * @param params.format - Format to encode audio in.
    * @param [params.maxDurationSeconds] - Maximum duration of the recording, in seconds. 0 for no limit.
    * @param [params.maxSilenceSeconds] - Maximum duration of silence, in seconds. 0 for no limit.
    * @param [params.ifExists] - Action to take if a recording with the same name already exists.
    * @param [params.beep] - Play beep when recording begins.
    * @param [params.terminateOn] - DTMF input to terminate recording.
    */
  def record(
    params: Format,
    recording: LiveRecording,
    callback: js.Function2[/* err */ Error, /* liverecording */ LiveRecording, Unit]
  ): Unit = js.native
  /**
    * Redirect the channel to a different location.
    *
    * @param params.endpoint - The endpoint to redirect the channel to.
    */
  def redirect(params: EndpointString): js.Promise[Unit] = js.native
  /**
    * Redirect the channel to a different location.
    *
    * @param params.endpoint - The endpoint to redirect the channel to.
    */
  def redirect(params: EndpointString, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  /**
    * Indicate ringing to a channel.
    */
  def ring(): js.Promise[Unit] = js.native
  /**
    * Indicate ringing to a channel.
    */
  def ring(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  /**
    * Stop ringing indication on a channel if locally generated.
    */
  def ringStop(): js.Promise[Unit] = js.native
  /**
    * Stop ringing indication on a channel if locally generated.
    */
  def ringStop(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  /**
    * RTP stats on a channel.
    */
  def rtpstatistics(): js.Promise[RTPstat] = js.native
  /**
    * RTP stats on a channel.
    */
  def rtpstatistics(callback: js.Function2[/* err */ Error, /* rtpstat */ RTPstat, Unit]): Unit = js.native
  /**
    * Send provided DTMF to a given channel.
    *
    * @param [params.dtmf] - DTMF To send.
    * @param [params.before] - Amount of time to wait before DTMF digits (specified in milliseconds) start.
    * @param [params.between] - Amount of time in between DTMF digits (specified in milliseconds).
    * @param [params.duration] - Length of each DTMF digit (specified in milliseconds).
    * @param [params.after] - Amount of time to wait after DTMF digits (specified in milliseconds) end.
    */
  def sendDTMF(): js.Promise[Unit] = js.native
  /**
    * Send provided DTMF to a given channel.
    */
  def sendDTMF(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def sendDTMF(params: Before): js.Promise[Unit] = js.native
  /**
    * Send provided DTMF to a given channel.
    *
    * @param [params.dtmf] - DTMF To send.
    * @param [params.before] - Amount of time to wait before DTMF digits (specified in milliseconds) start.
    * @param [params.between] - Amount of time in between DTMF digits (specified in milliseconds).
    * @param [params.duration] - Length of each DTMF digit (specified in milliseconds).
    * @param [params.after] - Amount of time to wait after DTMF digits (specified in milliseconds) end.
    */
  def sendDTMF(params: Before, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  /**
    * Set the value of a channel variable or function.
    *
    * @param params.variable - The channel variable or function to set.
    * @param [params.value] - The value to set the variable to.
    */
  def setChannelVar(params: Value): js.Promise[Unit] = js.native
  /**
    * Set the value of a channel variable or function.
    *
    * @param params.variable - The channel variable or function to set.
    * @param [params.value] - The value to set the variable to.
    */
  def setChannelVar(params: Value, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  /**
    * Start snooping.
    * Snoop (spy/whisper) on a specific channel.
    *
    * @param [params.spy] - Direction of audio to spy on.
    * @param [params.whisper] - Direction of audio to whisper into.
    * @param params.app - Application the snooping channel is placed into.
    * @param [params.appArgs] - The application arguments to pass to the Stasis application.
    * @param [params.snoopId] - Unique ID to assign to snooping channel.
    */
  def snoopChannel(params: Whisper, snoopChannel: Channel): js.Promise[Channel] = js.native
  /**
    * Start snooping.
    * Snoop (spy/whisper) on a specific channel.
    *
    * @param [params.spy] - Direction of audio to spy on.
    * @param [params.whisper] - Direction of audio to whisper into.
    * @param params.app - Application the snooping channel is placed into.
    * @param [params.appArgs] - The application arguments to pass to the Stasis application.
    * @param [params.snoopId] - Unique ID to assign to snooping channel.
    */
  def snoopChannel(
    params: Whisper,
    snoopChannel: Channel,
    callback: js.Function2[/* err */ Error, /* channel */ this.type, Unit]
  ): Unit = js.native
  /**
    * Start snooping.
    * Snoop (spy/whisper) on a specific channel.
    *
    * @param params.snoopId - Unique ID to assign to snooping channel.
    * @param [params.spy] - Direction of audio to spy on.
    * @param [params.whisper] - Direction of audio to whisper into.
    * @param params.app - Application the snooping channel is placed into.
    * @param [params.appArgs] - The application arguments to pass to the Stasis application.
    */
  def snoopChannelWithId(params: AppArgsSnoopId): js.Promise[Channel] = js.native
  /**
    * Start snooping.
    * Snoop (spy/whisper) on a specific channel.
    *
    * @param params.snoopId - Unique ID to assign to snooping channel.
    * @param [params.spy] - Direction of audio to spy on.
    * @param [params.whisper] - Direction of audio to whisper into.
    * @param params.app - Application the snooping channel is placed into.
    * @param [params.appArgs] - The application arguments to pass to the Stasis application.
    */
  def snoopChannelWithId(params: AppArgsSnoopId, callback: js.Function2[/* err */ Error, /* channel */ this.type, Unit]): Unit = js.native
  /**
    * Play music on hold to a channel.
    * Using media operations such as /play on a channel playing MOH in this manner will suspend MOH without resuming automatically. If continuing music on hold is desired, the stasis application
    * must reinitiate music on hold.
    *
    * @param [params.mohClass] - Music on hold class to use.
    */
  def startMoh(): js.Promise[Unit] = js.native
  /**
    * Play music on hold to a channel.
    * Using media operations such as /play on a channel playing MOH in this manner will suspend MOH without resuming automatically. If continuing music on hold is desired, the stasis application
    * must reinitiate music on hold.
    */
  def startMoh(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def startMoh(params: MohClassString): js.Promise[Unit] = js.native
  /**
    * Play music on hold to a channel.
    * Using media operations such as /play on a channel playing MOH in this manner will suspend MOH without resuming automatically. If continuing music on hold is desired, the stasis application
    * must reinitiate music on hold.
    *
    * @param [params.mohClass] - Music on hold class to use.
    */
  def startMoh(params: MohClassString, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  /**
    * Play silence to a channel.
    * Using media operations such as /play on a channel playing silence in this manner will suspend silence without resuming automatically.
    */
  def startSilence(): js.Promise[Unit] = js.native
  /**
    * Play silence to a channel.
    * Using media operations such as /play on a channel playing silence in this manner will suspend silence without resuming automatically.
    */
  def startSilence(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  /**
    * Stop playing music on hold to a channel.
    */
  def stopMoh(): js.Promise[Unit] = js.native
  /**
    * Stop playing music on hold to a channel.
    */
  def stopMoh(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  /**
    * Stop playing silence to a channel.
    */
  def stopSilence(): js.Promise[Unit] = js.native
  /**
    * Stop playing silence to a channel.
    */
  def stopSilence(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  /**
    * Remove a channel from hold.
    */
  def unhold(): js.Promise[Unit] = js.native
  /**
    * Remove a channel from hold.
    */
  def unhold(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  /**
    * Unmute a channel.
    *
    * @param [params.direction] - Direction in which to unmute audio.
    */
  def unmute(): js.Promise[Unit] = js.native
  /**
    * Unmute a channel.
    */
  def unmute(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def unmute(params: DirectionString): js.Promise[Unit] = js.native
  /**
    * Unmute a channel.
    *
    * @param [params.direction] - Direction in which to unmute audio.
    */
  def unmute(params: DirectionString, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}

