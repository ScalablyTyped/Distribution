package typings.ariClient.mod

import typings.ariClient.anon.After
import typings.ariClient.anon.AppAppArgs
import typings.ariClient.anon.AppArgs
import typings.ariClient.anon.Caller
import typings.ariClient.anon.CallerId
import typings.ariClient.anon.ChannelIdEndpoint
import typings.ariClient.anon.ChannelIdLang
import typings.ariClient.anon.ChannelIdMohClass
import typings.ariClient.anon.ChannelIdString
import typings.ariClient.anon.ChannelIdValue
import typings.ariClient.anon.ChannelIdVariable
import typings.ariClient.anon.Connectiontype
import typings.ariClient.anon.Context
import typings.ariClient.anon.Direction
import typings.ariClient.anon.IfExists
import typings.ariClient.anon.Reason
import typings.ariClient.anon.Skipms
import typings.ariClient.anon.SnoopId
import typings.ariClient.anon.Spy
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Channels extends StObject {
  
  /**
    * Answer a channel.
    *
    * @param params.channelId - Channels id.
    */
  def answer(params: ChannelIdString): js.Promise[Unit] = js.native
  /**
    * Answer a channel.
    *
    * @param params.channelId - Channels id.
    */
  def answer(params: ChannelIdString, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  /**
    * Exit application; continue execution in the dialplan.
    *
    * @param params.channelId - Channels id.
    * @param [params.context] - The context to continue to.
    * @param [params.extension] - The extension to continue to.
    * @param [params.priority] - The priority to continue to.
    * @param [params.label] - The label to continue to - will supersede priority if both are provided.
    */
  def continueInDialplan(params: Context): js.Promise[Unit] = js.native
  /**
    * Exit application; continue execution in the dialplan.
    *
    * @param params.channelId - Channels id.
    * @param [params.context] - The context to continue to.
    * @param [params.extension] - The extension to continue to.
    * @param [params.priority] - The priority to continue to.
    * @param [params.label] - The label to continue to - will supersede priority if both are provided.
    */
  def continueInDialplan(params: Context, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  /**
    * Create channel.
    *
    * @param params.endpoint - Endpoint for channel communication.
    * @param params.app - Stasis Application to place channel into.
    * @param [params.appArgs] - The application arguments to pass to the Stasis application provided by app. Mutually exclusive with context, extension, priority, and label.
    * @param [params.channelId] - The unique id to assign the channel on creation.
    * @param [params.otherChannelId] - The unique id to assign the second channel when using local channels.
    * @param [params.originator] - Unique ID of the calling channel.
    * @param [params.formats] - The format name capability list to use if originator is not specified. Ex. "ulaw,slin16". Format names can be found with "core show codecs".
    */
  def create(params: typings.ariClient.anon.Endpoint): js.Promise[Channel] = js.native
  /**
    * Create channel.
    *
    * @param params.endpoint - Endpoint for channel communication.
    * @param params.app - Stasis Application to place channel into.
    * @param [params.appArgs] - The application arguments to pass to the Stasis application provided by app. Mutually exclusive with context, extension, priority, and label.
    * @param [params.channelId] - The unique id to assign the channel on creation.
    * @param [params.otherChannelId] - The unique id to assign the second channel when using local channels.
    * @param [params.originator] - Unique ID of the calling channel.
    * @param [params.formats] - The format name capability list to use if originator is not specified. Ex. "ulaw,slin16". Format names can be found with "core show codecs".
    */
  def create(
    params: typings.ariClient.anon.Endpoint,
    callback: js.Function2[/* err */ Error, /* channel */ Channel, Unit]
  ): Unit = js.native
  
  /**
    * Dial a created channel.
    *
    * @param params.channelId - Channels id.
    * @param [params.caller] - Channel ID of caller.
    * @param [params.timeout] - Dial timeout.
    */
  def dial(params: Caller): js.Promise[Unit] = js.native
  /**
    * Dial a created channel.
    *
    * @param params.channelId - Channels id.
    * @param [params.caller] - Channel ID of caller.
    * @param [params.timeout] - Dial timeout.
    */
  def dial(params: Caller, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  /**
    * Start an External Media session.
    * Create a channel to an External Media source/sink.
    *
    * @param [params.channelId] - The unique id to assign the channel on creation.
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
  def externalMedia(params: Connectiontype): js.Promise[Channel] = js.native
  /**
    * Start an External Media session.
    * Create a channel to an External Media source/sink.
    *
    * @param [params.channelId] - The unique id to assign the channel on creation.
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
  def externalMedia(params: Connectiontype, callback: js.Function2[/* err */ Error, /* channel */ Channel, Unit]): Unit = js.native
  
  /**
    * Channel details.
    *
    * @param params.channelId - Channels id.
    */
  def get(params: ChannelIdString): js.Promise[Channel] = js.native
  /**
    * Channel details.
    *
    * @param params.channelId - Channels id.
    */
  def get(params: ChannelIdString, callback: js.Function2[/* err */ Error, /* channel */ Channel, Unit]): Unit = js.native
  
  /**
    * Get the value of a channel variable or function.
    *
    * @param params.channelId - Channels id.
    * @param params.variable - The channel variable or function to get.
    */
  def getChannelVar(params: ChannelIdVariable): js.Promise[Variable] = js.native
  /**
    * Get the value of a channel variable or function.
    *
    * @param params.channelId - Channels id.
    * @param params.variable - The channel variable or function to get.
    */
  def getChannelVar(params: ChannelIdVariable, callback: js.Function2[/* err */ Error, /* variable */ Variable, Unit]): Unit = js.native
  
  /**
    * Delete (i.e. hangup) a channel.
    *
    * @param params.channelId - Channels id.
    * @param [params.reason] - Reason for hanging up the channel.
    */
  def hangup(params: Reason): js.Promise[Unit] = js.native
  /**
    * Delete (i.e. hangup) a channel.
    *
    * @param params.channelId - Channels id.
    * @param [params.reason] - Reason for hanging up the channel.
    */
  def hangup(params: Reason, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  /**
    * Hold a channel.
    *
    * @param params.channelId - Channels id.
    */
  def hold(params: ChannelIdString): js.Promise[Unit] = js.native
  /**
    * Hold a channel.
    *
    * @param params.channelId - Channels id.
    */
  def hold(params: ChannelIdString, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  /**
    * List all active channels in Asterisk.
    */
  def list(): js.Promise[js.Array[Channel]] = js.native
  /**
    * List all active channels in Asterisk.
    */
  def list(callback: js.Function2[/* err */ Error, /* channels */ js.Array[Channel], Unit]): Unit = js.native
  
  /**
    * Move the channel from one Stasis application to another.
    *
    * @param params.channelId - Channels id.
    * @param params.app - The channel will be passed to this Stasis application.
    * @param [params.appArgs] - The application arguments to pass to the Stasis application provided by app.
    */
  def move(params: AppAppArgs): js.Promise[Unit] = js.native
  /**
    * Move the channel from one Stasis application to another.
    *
    * @param params.channelId - Channels id.
    * @param params.app - The channel will be passed to this Stasis application.
    * @param [params.appArgs] - The application arguments to pass to the Stasis application provided by app.
    */
  def move(params: AppAppArgs, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  /**
    * Mute a channel.
    *
    * @param params.channelId - Channels id.
    * @param [params.direction] - Direction in which to mute audio.
    */
  def mute(params: Direction): js.Promise[Unit] = js.native
  /**
    * Mute a channel.
    *
    * @param params.channelId - Channels id.
    * @param [params.direction] - Direction in which to mute audio.
    */
  def mute(params: Direction, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
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
    * @param [params.channelId] - The unique id to assign the channel on creation.
    * @param [params.otherChannelId] - The unique id to assign the second channel when using local channels.
    * @param [params.originator] - The unique id of the channel which is originating this one.
    * @param [params.formats] - The format name capability list to use if originator is not specified. Ex. "ulaw,slin16". Format names can be found with "core show codecs".
    */
  def originate(params: AppArgs): js.Promise[Channel] = js.native
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
    * @param [params.channelId] - The unique id to assign the channel on creation.
    * @param [params.otherChannelId] - The unique id to assign the second channel when using local channels.
    * @param [params.originator] - The unique id of the channel which is originating this one.
    * @param [params.formats] - The format name capability list to use if originator is not specified. Ex. "ulaw,slin16". Format names can be found with "core show codecs".
    */
  def originate(params: AppArgs, callback: js.Function2[/* err */ Error, /* channel */ Channel, Unit]): Unit = js.native
  
  /**
    * Create a new channel (originate with id).
    * The new channel is created immediately and a snapshot of it returned. If a Stasis application is provided it will be automatically subscribed to the originated channel for further
    * events and updates.
    *
    * @param params.channelId - The unique id to assign the channel on creation.
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
  def originateWithId(params: CallerId): js.Promise[Channel] = js.native
  /**
    * Create a new channel (originate with id).
    * The new channel is created immediately and a snapshot of it returned. If a Stasis application is provided it will be automatically subscribed to the originated channel for further
    * events and updates.
    *
    * @param params.channelId - The unique id to assign the channel on creation.
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
  def originateWithId(params: CallerId, callback: js.Function2[/* err */ Error, /* channel */ Channel, Unit]): Unit = js.native
  
  /**
    * Start playback of media.
    * The media URI may be any of a number of URIs. Currently sound:, recording:, number:, digits:, characters:, and tone: URIs are supported. This operation creates a playback resource
    * that can be used to control the playback of media (pause, rewind, fast forward, etc.).
    *
    * @param params.channelId - Channels id.
    * @param params.media - Media URIs to play.
    * @param [params.lang] - For sounds, selects language for sound.
    * @param [params.offsetms] - Number of milliseconds to skip before playing. Only applies to the first URI if multiple media URIs are specified.
    * @param [params.skipms] - Number of milliseconds to skip for forward/reverse operations.
    * @param [params.playbackId] - Playback ID.
    */
  def play(params: Skipms): js.Promise[Playback] = js.native
  /**
    * Start playback of media.
    * The media URI may be any of a number of URIs. Currently sound:, recording:, number:, digits:, characters:, and tone: URIs are supported. This operation creates a playback resource
    * that can be used to control the playback of media (pause, rewind, fast forward, etc.).
    *
    * @param params.channelId - Channels id.
    * @param params.media - Media URIs to play.
    * @param [params.lang] - For sounds, selects language for sound.
    * @param [params.offsetms] - Number of milliseconds to skip before playing. Only applies to the first URI if multiple media URIs are specified.
    * @param [params.skipms] - Number of milliseconds to skip for forward/reverse operations.
    * @param [params.playbackId] - Playback ID.
    */
  def play(params: Skipms, callback: js.Function2[/* err */ Error, /* playback */ Playback, Unit]): Unit = js.native
  
  /**
    * Start playback of media and specify the playbackId.
    * The media URI may be any of a number of URIs. Currently sound:, recording:, number:, digits:, characters:, and tone: URIs are supported. This operation creates a playback resource
    * that can be used to control the playback of media (pause, rewind, fast forward, etc.).
    *
    * @param params.channelId - Channels id.
    * @param params.playbackId - Playback ID.
    * @param params.media - Media URIs to play.
    * @param [params.lang] - For sounds, selects language for sound.
    * @param [params.offsetms] - Number of milliseconds to skip before playing. Only applies to the first URI if multiple media URIs are specified.
    * @param [params.skipms] - Number of milliseconds to skip for forward/reverse operations.
    */
  def playWithId(params: ChannelIdLang): js.Promise[Playback] = js.native
  /**
    * Start playback of media and specify the playbackId.
    * The media URI may be any of a number of URIs. Currently sound:, recording:, number:, digits:, characters:, and tone: URIs are supported. This operation creates a playback resource
    * that can be used to control the playback of media (pause, rewind, fast forward, etc.).
    *
    * @param params.channelId - Channels id.
    * @param params.playbackId - Playback ID.
    * @param params.media - Media URIs to play.
    * @param [params.lang] - For sounds, selects language for sound.
    * @param [params.offsetms] - Number of milliseconds to skip before playing. Only applies to the first URI if multiple media URIs are specified.
    * @param [params.skipms] - Number of milliseconds to skip for forward/reverse operations.
    */
  def playWithId(params: ChannelIdLang, callback: js.Function2[/* err */ Error, /* playback */ Playback, Unit]): Unit = js.native
  
  /**
    * Start a recording.
    * Record audio from a channel. Note that this will not capture audio sent to the channel. The bridge itself has a record feature if thats what you want.
    *
    * @param params.channelId - Channels id.
    * @param params.name - Recordings filename.
    * @param params.format - Format to encode audio in.
    * @param [params.maxDurationSeconds] - Maximum duration of the recording, in seconds. 0 for no limit.
    * @param [params.maxSilenceSeconds] - Maximum duration of silence, in seconds. 0 for no limit.
    * @param [params.ifExists] - Action to take if a recording with the same name already exists.
    * @param [params.beep] - Play beep when recording begins.
    * @param [params.terminateOn] - DTMF input to terminate recording.
    */
  def record(params: IfExists): js.Promise[LiveRecording] = js.native
  /**
    * Start a recording.
    * Record audio from a channel. Note that this will not capture audio sent to the channel. The bridge itself has a record feature if thats what you want.
    *
    * @param params.channelId - Channels id.
    * @param params.name - Recordings filename.
    * @param params.format - Format to encode audio in.
    * @param [params.maxDurationSeconds] - Maximum duration of the recording, in seconds. 0 for no limit.
    * @param [params.maxSilenceSeconds] - Maximum duration of silence, in seconds. 0 for no limit.
    * @param [params.ifExists] - Action to take if a recording with the same name already exists.
    * @param [params.beep] - Play beep when recording begins.
    * @param [params.terminateOn] - DTMF input to terminate recording.
    */
  def record(params: IfExists, callback: js.Function2[/* err */ Error, /* liverecording */ LiveRecording, Unit]): Unit = js.native
  
  /**
    * Redirect the channel to a different location.
    *
    * @param params.channelId - Channels id.
    * @param params.endpoint - The endpoint to redirect the channel to.
    */
  def redirect(params: ChannelIdEndpoint): js.Promise[Unit] = js.native
  /**
    * Redirect the channel to a different location.
    *
    * @param params.channelId - Channels id.
    * @param params.endpoint - The endpoint to redirect the channel to.
    */
  def redirect(params: ChannelIdEndpoint, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  /**
    * Indicate ringing to a channel.
    *
    * @param params.channelId - Channels id.
    */
  def ring(params: ChannelIdString): js.Promise[Unit] = js.native
  /**
    * Indicate ringing to a channel.
    *
    * @param params.channelId - Channels id.
    */
  def ring(params: ChannelIdString, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  /**
    * Stop ringing indication on a channel if locally generated.
    *
    * @param params.channelId - Channels id.
    */
  def ringStop(params: ChannelIdString): js.Promise[Unit] = js.native
  /**
    * Stop ringing indication on a channel if locally generated.
    *
    * @param params.channelId - Channels id.
    */
  def ringStop(params: ChannelIdString, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  /**
    * RTP stats on a channel.
    *
    * @param params.channelId - Channels id.
    */
  def rtpstatistics(params: ChannelIdString): js.Promise[RTPstat] = js.native
  /**
    * RTP stats on a channel.
    *
    * @param params.channelId - Channels id.
    */
  def rtpstatistics(params: ChannelIdString, callback: js.Function2[/* err */ Error, /* rtpstat */ RTPstat, Unit]): Unit = js.native
  
  /**
    * Send provided DTMF to a given channel.
    *
    * @param params.channelId - Channels id.
    * @param [params.dtmf] - DTMF To send.
    * @param [params.before] - Amount of time to wait before DTMF digits (specified in milliseconds) start.
    * @param [params.between] - Amount of time in between DTMF digits (specified in milliseconds).
    * @param [params.duration] - Length of each DTMF digit (specified in milliseconds).
    * @param [params.after] - Amount of time to wait after DTMF digits (specified in milliseconds) end.
    */
  def sendDTMF(params: After): js.Promise[Unit] = js.native
  /**
    * Send provided DTMF to a given channel.
    *
    * @param params.channelId - Channels id.
    * @param [params.dtmf] - DTMF To send.
    * @param [params.before] - Amount of time to wait before DTMF digits (specified in milliseconds) start.
    * @param [params.between] - Amount of time in between DTMF digits (specified in milliseconds).
    * @param [params.duration] - Length of each DTMF digit (specified in milliseconds).
    * @param [params.after] - Amount of time to wait after DTMF digits (specified in milliseconds) end.
    */
  def sendDTMF(params: After, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  /**
    * Set the value of a channel variable or function.
    *
    * @param params.channelId - Channels id.
    * @param params.variable - The channel variable or function to set.
    * @param [params.value] - The value to set the variable to.
    */
  def setChannelVar(params: ChannelIdValue): js.Promise[Unit] = js.native
  /**
    * Set the value of a channel variable or function.
    *
    * @param params.channelId - Channels id.
    * @param params.variable - The channel variable or function to set.
    * @param [params.value] - The value to set the variable to.
    */
  def setChannelVar(params: ChannelIdValue, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  /**
    * Start snooping.
    * Snoop (spy/whisper) on a specific channel.
    *
    * @param params.channelId - Channels id.
    * @param [params.spy] - Direction of audio to spy on.
    * @param [params.whisper] - Direction of audio to whisper into.
    * @param params.app - Application the snooping channel is placed into.
    * @param [params.appArgs] - The application arguments to pass to the Stasis application.
    * @param [params.snoopId] - Unique ID to assign to snooping channel.
    */
  def snoopChannel(params: SnoopId): js.Promise[Channel] = js.native
  /**
    * Start snooping.
    * Snoop (spy/whisper) on a specific channel.
    *
    * @param params.channelId - Channels id.
    * @param [params.spy] - Direction of audio to spy on.
    * @param [params.whisper] - Direction of audio to whisper into.
    * @param params.app - Application the snooping channel is placed into.
    * @param [params.appArgs] - The application arguments to pass to the Stasis application.
    * @param [params.snoopId] - Unique ID to assign to snooping channel.
    */
  def snoopChannel(params: SnoopId, callback: js.Function2[/* err */ Error, /* channel */ Channel, Unit]): Unit = js.native
  
  /**
    * Start snooping.
    * Snoop (spy/whisper) on a specific channel.
    *
    * @param params.channelId - Channels id.
    * @param params.snoopId - Unique ID to assign to snooping channel.
    * @param [params.spy] - Direction of audio to spy on.
    * @param [params.whisper] - Direction of audio to whisper into.
    * @param params.app - Application the snooping channel is placed into.
    * @param [params.appArgs] - The application arguments to pass to the Stasis application.
    */
  def snoopChannelWithId(params: Spy): js.Promise[Channel] = js.native
  /**
    * Start snooping.
    * Snoop (spy/whisper) on a specific channel.
    *
    * @param params.channelId - Channels id.
    * @param params.snoopId - Unique ID to assign to snooping channel.
    * @param [params.spy] - Direction of audio to spy on.
    * @param [params.whisper] - Direction of audio to whisper into.
    * @param params.app - Application the snooping channel is placed into.
    * @param [params.appArgs] - The application arguments to pass to the Stasis application.
    */
  def snoopChannelWithId(params: Spy, callback: js.Function2[/* err */ Error, /* channel */ Channel, Unit]): Unit = js.native
  
  /**
    * Play music on hold to a channel.
    * Using media operations such as /play on a channel playing MOH in this manner will suspend MOH without resuming automatically. If continuing music on hold is desired, the stasis application
    * must reinitiate music on hold.
    *
    * @param params.channelId - Channels id.
    * @param [params.mohClass] - Music on hold class to use.
    */
  def startMoh(params: ChannelIdMohClass): js.Promise[Unit] = js.native
  /**
    * Play music on hold to a channel.
    * Using media operations such as /play on a channel playing MOH in this manner will suspend MOH without resuming automatically. If continuing music on hold is desired, the stasis application
    * must reinitiate music on hold.
    *
    * @param params.channelId - Channels id.
    * @param [params.mohClass] - Music on hold class to use.
    */
  def startMoh(params: ChannelIdMohClass, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  /**
    * Play silence to a channel.
    * Using media operations such as /play on a channel playing silence in this manner will suspend silence without resuming automatically.
    *
    * @param params.channelId - Channels id.
    */
  def startSilence(params: ChannelIdString): js.Promise[Unit] = js.native
  /**
    * Play silence to a channel.
    * Using media operations such as /play on a channel playing silence in this manner will suspend silence without resuming automatically.
    *
    * @param params.channelId - Channels id.
    */
  def startSilence(params: ChannelIdString, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  /**
    * Stop playing music on hold to a channel.
    *
    * @param params.channelId - Channels id.
    */
  def stopMoh(params: ChannelIdString): js.Promise[Unit] = js.native
  /**
    * Stop playing music on hold to a channel.
    *
    * @param params.channelId - Channels id.
    */
  def stopMoh(params: ChannelIdString, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  /**
    * Stop playing silence to a channel.
    *
    * @param params.channelId - Channels id.
    */
  def stopSilence(params: ChannelIdString): js.Promise[Unit] = js.native
  /**
    * Stop playing silence to a channel.
    *
    * @param params.channelId - Channels id.
    */
  def stopSilence(params: ChannelIdString, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  /**
    * Remove a channel from hold.
    *
    * @param params.channelId - Channels id.
    */
  def unhold(params: ChannelIdString): js.Promise[Unit] = js.native
  /**
    * Remove a channel from hold.
    *
    * @param params.channelId - Channels id.
    */
  def unhold(params: ChannelIdString, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  /**
    * Unmute a channel.
    *
    * @param params.channelId - Channels id.
    * @param [params.direction] - Direction in which to unmute audio.
    */
  def unmute(params: Direction): js.Promise[Unit] = js.native
  /**
    * Unmute a channel.
    *
    * @param params.channelId - Channels id.
    * @param [params.direction] - Direction in which to unmute audio.
    */
  def unmute(params: Direction, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}
