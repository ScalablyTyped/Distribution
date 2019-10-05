package typings.ably.ablyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Types {
  import typings.ably.ablyMod.Types.ChannelEvent.ATTACHED
  import typings.ably.ablyMod.Types.ChannelEvent.ATTACHING
  import typings.ably.ablyMod.Types.ChannelEvent.DETACHED
  import typings.ably.ablyMod.Types.ChannelEvent.DETACHING
  import typings.ably.ablyMod.Types.ChannelEvent.FAILED
  import typings.ably.ablyMod.Types.ChannelEvent.INITIALIZED
  import typings.ably.ablyMod.Types.ChannelEvent.SUSPENDED
  import typings.ably.ablyMod.Types.ChannelEvent.UPDATE
  import typings.ably.ablyMod.Types.ConnectionEvent.CLOSED
  import typings.ably.ablyMod.Types.ConnectionEvent.CLOSING
  import typings.ably.ablyMod.Types.ConnectionEvent.CONNECTED
  import typings.ably.ablyMod.Types.ConnectionEvent.CONNECTING
  import typings.ably.ablyMod.Types.ConnectionEvent.DISCONNECTED
  import typings.ably.ablyMod.Types.HTTPMethods.GET
  import typings.ably.ablyMod.Types.HTTPMethods.POST
  import typings.ably.ablyMod.Types.PresenceAction.ABSENT
  import typings.ably.ablyMod.Types.PresenceAction.ENTER
  import typings.ably.ablyMod.Types.PresenceAction.LEAVE
  import typings.ably.ablyMod.Types.PresenceAction.PRESENT
  import typings.ably.ablyMod.Types.StatsIntervalGranularity.DAY
  import typings.ably.ablyMod.Types.StatsIntervalGranularity.HOUR
  import typings.ably.ablyMod.Types.StatsIntervalGranularity.MINUTE
  import typings.ably.ablyMod.Types.StatsIntervalGranularity.MONTH

  type ChannelEvent = FAILED | INITIALIZED | SUSPENDED | ATTACHED | ATTACHING | DETACHED | DETACHING | UPDATE
  type ChannelState = typings.ably.ablyMod.Types.ChannelState.FAILED | typings.ably.ablyMod.Types.ChannelState.INITIALIZED | typings.ably.ablyMod.Types.ChannelState.SUSPENDED | typings.ably.ablyMod.Types.ChannelState.ATTACHED | typings.ably.ablyMod.Types.ChannelState.ATTACHING | typings.ably.ablyMod.Types.ChannelState.DETACHED | typings.ably.ablyMod.Types.ChannelState.DETACHING
  type ConnectionEvent = typings.ably.ablyMod.Types.ConnectionEvent.INITIALIZED | CONNECTED | CONNECTING | DISCONNECTED | typings.ably.ablyMod.Types.ConnectionEvent.SUSPENDED | CLOSED | CLOSING | typings.ably.ablyMod.Types.ConnectionEvent.FAILED | typings.ably.ablyMod.Types.ConnectionEvent.UPDATE
  type ConnectionState = typings.ably.ablyMod.Types.ConnectionState.INITIALIZED | typings.ably.ablyMod.Types.ConnectionState.CONNECTED | typings.ably.ablyMod.Types.ConnectionState.CONNECTING | typings.ably.ablyMod.Types.ConnectionState.DISCONNECTED | typings.ably.ablyMod.Types.ConnectionState.SUSPENDED | typings.ably.ablyMod.Types.ConnectionState.CLOSED | typings.ably.ablyMod.Types.ConnectionState.CLOSING | typings.ably.ablyMod.Types.ConnectionState.FAILED
  type HTTPMethods = GET | POST
  type PresenceAction = ABSENT | PRESENT | ENTER | LEAVE | typings.ably.ablyMod.Types.PresenceAction.UPDATE
  type StatsIntervalGranularity = MINUTE | HOUR | DAY | MONTH
  type channelEventCallback = js.Function1[/* changeStateChange */ ChannelStateChange, Unit]
  type connectionEventCallback = js.Function1[/* connectionStateChange */ ConnectionStateChange, Unit]
  type errorCallback = js.Function1[/* error */ ErrorInfo, Unit]
  type fromEncoded[T] = js.Function2[/* JsonObject */ js.Any, /* channelOptions */ js.UndefOr[ChannelOptions], T]
  type fromEncodedArray[T] = js.Function2[
    /* JsonArray */ js.Array[js.Any], 
    /* channelOptions */ js.UndefOr[ChannelOptions], 
    js.Array[T]
  ]
  type messageCallback[T] = js.Function1[/* message */ T, Unit]
  // Common Listeners
  type paginatedResultCallback[T] = js.Function2[/* error */ ErrorInfo, /* results */ PaginatedResult[T], Unit]
  type realtimePresenceGetCallback = js.Function2[/* error */ ErrorInfo, /* messages */ js.Array[PresenceMessage], Unit]
  type standardCallback = js.Function2[/* error */ ErrorInfo, /* results */ js.Any, Unit]
  type timeCallback = js.Function2[/* error */ ErrorInfo, /* time */ Double, Unit]
  type tokenDetailsCallback = js.Function2[/* error */ ErrorInfo, /* Results */ TokenDetails, Unit]
  type tokenRequestCallback = js.Function2[/* error */ ErrorInfo, /* Results */ TokenRequest, Unit]
}
