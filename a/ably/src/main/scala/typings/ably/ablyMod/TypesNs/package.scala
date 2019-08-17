package typings.ably.ablyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object TypesNs {
  import typings.ably.ablyMod.TypesNs.ChannelEventNs.ATTACHED
  import typings.ably.ablyMod.TypesNs.ChannelEventNs.ATTACHING
  import typings.ably.ablyMod.TypesNs.ChannelEventNs.DETACHED
  import typings.ably.ablyMod.TypesNs.ChannelEventNs.DETACHING
  import typings.ably.ablyMod.TypesNs.ChannelEventNs.FAILED
  import typings.ably.ablyMod.TypesNs.ChannelEventNs.INITIALIZED
  import typings.ably.ablyMod.TypesNs.ChannelEventNs.SUSPENDED
  import typings.ably.ablyMod.TypesNs.ChannelEventNs.UPDATE
  import typings.ably.ablyMod.TypesNs.ConnectionEventNs.CLOSED
  import typings.ably.ablyMod.TypesNs.ConnectionEventNs.CLOSING
  import typings.ably.ablyMod.TypesNs.ConnectionEventNs.CONNECTED
  import typings.ably.ablyMod.TypesNs.ConnectionEventNs.CONNECTING
  import typings.ably.ablyMod.TypesNs.ConnectionEventNs.DISCONNECTED
  import typings.ably.ablyMod.TypesNs.HTTPMethodsNs.GET
  import typings.ably.ablyMod.TypesNs.HTTPMethodsNs.POST
  import typings.ably.ablyMod.TypesNs.PresenceActionNs.ABSENT
  import typings.ably.ablyMod.TypesNs.PresenceActionNs.ENTER
  import typings.ably.ablyMod.TypesNs.PresenceActionNs.LEAVE
  import typings.ably.ablyMod.TypesNs.PresenceActionNs.PRESENT
  import typings.ably.ablyMod.TypesNs.StatsIntervalGranularityNs.DAY
  import typings.ably.ablyMod.TypesNs.StatsIntervalGranularityNs.HOUR
  import typings.ably.ablyMod.TypesNs.StatsIntervalGranularityNs.MINUTE
  import typings.ably.ablyMod.TypesNs.StatsIntervalGranularityNs.MONTH

  type ChannelEvent = FAILED | INITIALIZED | SUSPENDED | ATTACHED | ATTACHING | DETACHED | DETACHING | UPDATE
  type ChannelState = typings.ably.ablyMod.TypesNs.ChannelStateNs.FAILED | typings.ably.ablyMod.TypesNs.ChannelStateNs.INITIALIZED | typings.ably.ablyMod.TypesNs.ChannelStateNs.SUSPENDED | typings.ably.ablyMod.TypesNs.ChannelStateNs.ATTACHED | typings.ably.ablyMod.TypesNs.ChannelStateNs.ATTACHING | typings.ably.ablyMod.TypesNs.ChannelStateNs.DETACHED | typings.ably.ablyMod.TypesNs.ChannelStateNs.DETACHING
  type ConnectionEvent = typings.ably.ablyMod.TypesNs.ConnectionEventNs.INITIALIZED | CONNECTED | CONNECTING | DISCONNECTED | typings.ably.ablyMod.TypesNs.ConnectionEventNs.SUSPENDED | CLOSED | CLOSING | typings.ably.ablyMod.TypesNs.ConnectionEventNs.FAILED | typings.ably.ablyMod.TypesNs.ConnectionEventNs.UPDATE
  type ConnectionState = typings.ably.ablyMod.TypesNs.ConnectionStateNs.INITIALIZED | typings.ably.ablyMod.TypesNs.ConnectionStateNs.CONNECTED | typings.ably.ablyMod.TypesNs.ConnectionStateNs.CONNECTING | typings.ably.ablyMod.TypesNs.ConnectionStateNs.DISCONNECTED | typings.ably.ablyMod.TypesNs.ConnectionStateNs.SUSPENDED | typings.ably.ablyMod.TypesNs.ConnectionStateNs.CLOSED | typings.ably.ablyMod.TypesNs.ConnectionStateNs.CLOSING | typings.ably.ablyMod.TypesNs.ConnectionStateNs.FAILED
  type HTTPMethods = GET | POST
  type PresenceAction = ABSENT | PRESENT | ENTER | LEAVE | typings.ably.ablyMod.TypesNs.PresenceActionNs.UPDATE
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
