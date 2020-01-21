package typings.ably.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Types {
  type ChannelEvent = typings.ably.mod.Types.ChannelEvent.FAILED | typings.ably.mod.Types.ChannelEvent.INITIALIZED | typings.ably.mod.Types.ChannelEvent.SUSPENDED | typings.ably.mod.Types.ChannelEvent.ATTACHED | typings.ably.mod.Types.ChannelEvent.ATTACHING | typings.ably.mod.Types.ChannelEvent.DETACHED | typings.ably.mod.Types.ChannelEvent.DETACHING | typings.ably.mod.Types.ChannelEvent.UPDATE
  type ChannelState = typings.ably.mod.Types.ChannelState.FAILED | typings.ably.mod.Types.ChannelState.INITIALIZED | typings.ably.mod.Types.ChannelState.SUSPENDED | typings.ably.mod.Types.ChannelState.ATTACHED | typings.ably.mod.Types.ChannelState.ATTACHING | typings.ably.mod.Types.ChannelState.DETACHED | typings.ably.mod.Types.ChannelState.DETACHING
  type ConnectionEvent = typings.ably.mod.Types.ConnectionEvent.INITIALIZED | typings.ably.mod.Types.ConnectionEvent.CONNECTED | typings.ably.mod.Types.ConnectionEvent.CONNECTING | typings.ably.mod.Types.ConnectionEvent.DISCONNECTED | typings.ably.mod.Types.ConnectionEvent.SUSPENDED | typings.ably.mod.Types.ConnectionEvent.CLOSED | typings.ably.mod.Types.ConnectionEvent.CLOSING | typings.ably.mod.Types.ConnectionEvent.FAILED | typings.ably.mod.Types.ConnectionEvent.UPDATE
  type ConnectionState = typings.ably.mod.Types.ConnectionState.INITIALIZED | typings.ably.mod.Types.ConnectionState.CONNECTED | typings.ably.mod.Types.ConnectionState.CONNECTING | typings.ably.mod.Types.ConnectionState.DISCONNECTED | typings.ably.mod.Types.ConnectionState.SUSPENDED | typings.ably.mod.Types.ConnectionState.CLOSED | typings.ably.mod.Types.ConnectionState.CLOSING | typings.ably.mod.Types.ConnectionState.FAILED
  type HTTPMethods = typings.ably.mod.Types.HTTPMethods.GET | typings.ably.mod.Types.HTTPMethods.POST
  type PresenceAction = typings.ably.mod.Types.PresenceAction.ABSENT | typings.ably.mod.Types.PresenceAction.PRESENT | typings.ably.mod.Types.PresenceAction.ENTER | typings.ably.mod.Types.PresenceAction.LEAVE | typings.ably.mod.Types.PresenceAction.UPDATE
  type StatsIntervalGranularity = typings.ably.mod.Types.StatsIntervalGranularity.MINUTE | typings.ably.mod.Types.StatsIntervalGranularity.HOUR | typings.ably.mod.Types.StatsIntervalGranularity.DAY | typings.ably.mod.Types.StatsIntervalGranularity.MONTH
  type channelEventCallback = js.Function1[/* changeStateChange */ typings.ably.mod.Types.ChannelStateChange, scala.Unit]
  type connectionEventCallback = js.Function1[
    /* connectionStateChange */ typings.ably.mod.Types.ConnectionStateChange, 
    scala.Unit
  ]
  type errorCallback = js.Function1[/* error */ typings.ably.mod.Types.ErrorInfo, scala.Unit]
  type fromEncoded[T] = js.Function2[
    /* JsonObject */ js.Any, 
    /* channelOptions */ js.UndefOr[typings.ably.mod.Types.ChannelOptions], 
    T
  ]
  type fromEncodedArray[T] = js.Function2[
    /* JsonArray */ js.Array[js.Any], 
    /* channelOptions */ js.UndefOr[typings.ably.mod.Types.ChannelOptions], 
    js.Array[T]
  ]
  type messageCallback[T] = js.Function1[/* message */ T, scala.Unit]
  // Common Listeners
  type paginatedResultCallback[T] = js.Function2[
    /* error */ typings.ably.mod.Types.ErrorInfo, 
    /* results */ typings.ably.mod.Types.PaginatedResult[T], 
    scala.Unit
  ]
  type realtimePresenceGetCallback = js.Function2[
    /* error */ typings.ably.mod.Types.ErrorInfo, 
    /* messages */ js.Array[typings.ably.mod.Types.PresenceMessage], 
    scala.Unit
  ]
  type standardCallback = js.Function2[/* error */ typings.ably.mod.Types.ErrorInfo, /* results */ js.Any, scala.Unit]
  type timeCallback = js.Function2[/* error */ typings.ably.mod.Types.ErrorInfo, /* time */ scala.Double, scala.Unit]
  type tokenDetailsCallback = js.Function2[
    /* error */ typings.ably.mod.Types.ErrorInfo, 
    /* Results */ typings.ably.mod.Types.TokenDetails, 
    scala.Unit
  ]
  type tokenRequestCallback = js.Function2[
    /* error */ typings.ably.mod.Types.ErrorInfo, 
    /* Results */ typings.ably.mod.Types.TokenRequest, 
    scala.Unit
  ]
}
